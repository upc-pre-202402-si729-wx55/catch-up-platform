package com.acme.catchup.platform.news.interfaces.rest.resources;

/**
 * Favorite source resource.
 * @summary
 * This class represents a favorite source resource. It is used to expose the favorite source information to the client.
 */
public record FavoriteSourceResource(Long id, String newsApiKey, String sourceId) { }
