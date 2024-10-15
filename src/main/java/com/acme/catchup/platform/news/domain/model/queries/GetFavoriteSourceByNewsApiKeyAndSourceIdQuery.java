package com.acme.catchup.platform.news.domain.model.queries;

/**
 * Query to get favorite source by news API key and source id.
 * @param newsApiKey The news API key.
 * @param sourceId The source id.
 */
public record GetFavoriteSourceByNewsApiKeyAndSourceIdQuery(String newsApiKey, String sourceId) {
    public GetFavoriteSourceByNewsApiKeyAndSourceIdQuery {
        if (newsApiKey == null || newsApiKey.isBlank())
            throw new IllegalArgumentException("newsApiKey cannot be null or empty");
        if (sourceId == null || sourceId.isBlank())
            throw new IllegalArgumentException("sourceId cannot be null or empty");
    }
}
