package com.acme.catchup.platform.news.interfaces.rest.transform;

import com.acme.catchup.platform.news.domain.model.commands.CreateFavoriteSourceCommand;
import com.acme.catchup.platform.news.interfaces.rest.resources.CreateFavoriteSourceResource;

/**
 * Assembler class to convert a CreateFavoriteSourceResource to a CreateFavoriteSourceCommand.
 * @summary
 * This class is used to convert the incoming request to a command that can be executed by the application.
 * @since 1.0
 */
public class CreateFavoriteSourceCommandFromResourceAssembler {
    /**
     * Converts a CreateFavoriteSourceResource to a CreateFavoriteSourceCommand.
     *
     * @param resource The resource to convert.
     * @return The converted command.
     * @see CreateFavoriteSourceResource
     * @see CreateFavoriteSourceCommand
     */
    public static CreateFavoriteSourceCommand toCommandFromResource(CreateFavoriteSourceResource resource) {
        return new CreateFavoriteSourceCommand(resource.newsApiKey(), resource.sourceId());
    }
}
