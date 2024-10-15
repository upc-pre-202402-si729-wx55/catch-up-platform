package com.acme.catchup.platform.news.infrastructure.persistence.jpa.repositories;

import com.acme.catchup.platform.news.domain.model.aggregates.FavoriteSource;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

/**
 * The favorite source repository.
 * @summary
 * This interface is a Spring Data JPA repository that provides methods to interact with the favorite source entities in the database.
 * @since 1.0
 */
@Repository
public interface FavoriteSourceRepository extends JpaRepository<FavoriteSource, Long> {
    /**
     * Find all favorite sources by news API key.
     *
     * @param newsApiKey the news API key
     * @return the list of favorite sources
     */
    List<FavoriteSource> findAllByNewsApiKey(String newsApiKey);

    /**
     * Check if a favorite source exists by news API key and source ID.
     *
     * @param newsApiKey the news API key
     * @param sourceId the source ID
     * @return true if the favorite source exists, false otherwise
     */
    boolean existsByNewsApiKeyAndSourceId(String newsApiKey, String sourceId);

    /**
     * Find a favorite source by news API key and source ID.
     *
     * @param newsApiKey the news API key
     * @param sourceId the source ID
     * @return the favorite source
     */
    Optional<FavoriteSource> findByNewsApiKeyAndSourceId(String newsApiKey, String sourceId);
}
