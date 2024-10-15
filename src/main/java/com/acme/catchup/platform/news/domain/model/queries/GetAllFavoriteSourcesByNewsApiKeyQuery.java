package com.acme.catchup.platform.news.domain.model.queries;


/**
 * Query to get all favorite sources by news API key.
 * @param newsApiKey The news API key.
 */
public record GetAllFavoriteSourcesByNewsApiKeyQuery(String newsApiKey) {
    public GetAllFavoriteSourcesByNewsApiKeyQuery {
        if (newsApiKey == null || newsApiKey.isBlank())
            throw new IllegalArgumentException("newsApiKey cannot be null or empty");
    }
}
