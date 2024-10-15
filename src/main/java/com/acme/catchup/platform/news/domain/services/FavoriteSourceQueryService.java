package com.acme.catchup.platform.news.domain.services;

import com.acme.catchup.platform.news.domain.model.aggregates.FavoriteSource;
import com.acme.catchup.platform.news.domain.model.queries.GetAllFavoriteSourcesByNewsApiKeyQuery;
import com.acme.catchup.platform.news.domain.model.queries.GetFavoriteSourceByIdQuery;
import com.acme.catchup.platform.news.domain.model.queries.GetFavoriteSourceByNewsApiKeyAndSourceIdQuery;

import java.util.List;
import java.util.Optional;

/**
 * Service to handle queries related to favorite sources.
 * @summary
 * This service is responsible for handling queries related to favorite sources.
 */
public interface FavoriteSourceQueryService {
    /**
     * Handle the query to get all favorite sources by news API key.
     *
     * @param query the query to get all favorite sources by news API key
     * @return the list of favorite sources
     * @throws IllegalArgumentException if the query is invalid
     * @see GetAllFavoriteSourcesByNewsApiKeyQuery
     */
    List<FavoriteSource> handle(GetAllFavoriteSourcesByNewsApiKeyQuery query);

    /**
     * Handle the query to get a favorite source by ID.
     *
     * @param query the query to get a favorite source by ID
     * @return the favorite source
     * @throws IllegalArgumentException if the query is invalid
     * @see GetFavoriteSourceByIdQuery
     */
    Optional<FavoriteSource> handle(GetFavoriteSourceByIdQuery query);

    /**
     * Handle the query to get a favorite source by news API key and source ID.
     *
     * @param query the query to get a favorite source by news API key and source ID
     * @return the favorite source
     * @throws IllegalArgumentException if the query is invalid
     * @see GetFavoriteSourceByNewsApiKeyAndSourceIdQuery
     */
    Optional<FavoriteSource> handle(GetFavoriteSourceByNewsApiKeyAndSourceIdQuery query);
}
