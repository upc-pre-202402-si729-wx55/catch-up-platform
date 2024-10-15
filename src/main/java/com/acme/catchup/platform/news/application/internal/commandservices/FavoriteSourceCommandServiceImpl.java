package com.acme.catchup.platform.news.application.internal.commandservices;

import com.acme.catchup.platform.news.domain.model.aggregates.FavoriteSource;
import com.acme.catchup.platform.news.domain.model.commands.CreateFavoriteSourceCommand;
import com.acme.catchup.platform.news.domain.services.FavoriteSourceCommandService;
import com.acme.catchup.platform.news.infrastructure.persistence.jpa.repositories.FavoriteSourceRepository;
import org.springframework.stereotype.Service;

import java.util.Optional;

/**
 * Implementation of the FavoriteSourceCommandService interface.
 * @summary
 * This class is responsible for handling the CreateFavoriteSourceCommand command.
 *
 */
@Service
public class FavoriteSourceCommandServiceImpl
implements FavoriteSourceCommandService {
    private final FavoriteSourceRepository favoriteSourceRepository;

    public FavoriteSourceCommandServiceImpl(FavoriteSourceRepository favoriteSourceRepository) {
        this.favoriteSourceRepository = favoriteSourceRepository;
    }

    /** inheritedDoc */
    @Override
    public Optional<FavoriteSource> handle(CreateFavoriteSourceCommand command) {
        if(favoriteSourceRepository.existsByNewsApiKeyAndSourceId(
                command.newsApiKey(), command.sourceId()))
            throw new IllegalArgumentException("Favorite source with same source ID already exists for this News API Key");
        var favoriteSource = new FavoriteSource(command);
        var createdFavoriteSource = favoriteSourceRepository.save(favoriteSource);
        return Optional.of(createdFavoriteSource);
    }
}
