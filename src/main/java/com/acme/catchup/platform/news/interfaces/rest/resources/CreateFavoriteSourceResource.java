package com.acme.catchup.platform.news.interfaces.rest.resources;

/**
 * Resource class for creating a favorite news source.
 * @summary
 * It contains the news API key and the source ID.
 * @since 1.0
 */
public record CreateFavoriteSourceResource(String newsApiKey, String sourceId) {
    public CreateFavoriteSourceResource {
        if (newsApiKey == null || newsApiKey.isBlank())
            throw new IllegalArgumentException("newsApiKey cannot be null or empty");
        if (sourceId == null || sourceId.isBlank())
            throw new IllegalArgumentException("sourceId cannot be null or empty");
    }
}
