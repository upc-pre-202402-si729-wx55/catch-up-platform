package com.acme.catchup.platform.news.interfaces.rest.transform;

import com.acme.catchup.platform.news.domain.model.aggregates.FavoriteSource;
import com.acme.catchup.platform.news.interfaces.rest.resources.FavoriteSourceResource;

public class FavoriteSourceResourceFromEntityAssembler {
    /**
     * Converts a FavoriteSource entity to a FavoriteSourceResource.
     *
     * @param entity The FavoriteSource entity.
     * @return The FavoriteSourceResource.
     * @see FavoriteSource
     * @see FavoriteSourceResource
     */
    public static FavoriteSourceResource toResourceFromEntity(FavoriteSource entity) {
        return new FavoriteSourceResource(entity.getId(), entity.getNewsApiKey(), entity.getSourceId());
    }
}
