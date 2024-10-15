package com.acme.catchup.platform.news.domain.model.queries;

/**
 * Query to get favorite source by id.
 * @param id The id of the favorite source.
 */
public record GetFavoriteSourceByIdQuery(Long id) {
    public GetFavoriteSourceByIdQuery {
        if (id == null || id <= 0)
            throw new IllegalArgumentException("id cannot be null or empty");
    }
}
