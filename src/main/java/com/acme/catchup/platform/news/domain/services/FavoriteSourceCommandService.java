package com.acme.catchup.platform.news.domain.services;

import com.acme.catchup.platform.news.domain.model.aggregates.FavoriteSource;
import com.acme.catchup.platform.news.domain.model.commands.CreateFavoriteSourceCommand;

import java.util.Optional;

/**
 * Service to handle commands related to favorite sources.
 * @summary
 * This service is responsible for handling commands related to favorite sources.
 */
public interface FavoriteSourceCommandService {
    /**
     * Handle the command to create a favorite source.
     *
     * @param command the command to create a favorite source
     * @return the created favorite source
     * @throws IllegalArgumentException if the command is invalid
     * @see CreateFavoriteSourceCommand
     */
    Optional<FavoriteSource> handle(CreateFavoriteSourceCommand command);
}
