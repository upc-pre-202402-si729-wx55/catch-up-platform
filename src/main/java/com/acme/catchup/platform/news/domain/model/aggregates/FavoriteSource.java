package com.acme.catchup.platform.news.domain.model.aggregates;

import com.acme.catchup.platform.news.domain.model.commands.CreateFavoriteSourceCommand;
import jakarta.persistence.*;
import lombok.Getter;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.LastModifiedDate;
import org.springframework.data.domain.AbstractAggregateRoot;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;

import java.util.Date;

/**
 * Favorite news source.
 * @summary
 * This class represents a favorite news source.
 * It contains the news API key and the source ID.
 */
@EntityListeners(AuditingEntityListener.class)
@Entity
public class FavoriteSource  extends AbstractAggregateRoot<FavoriteSource> {
    @Getter
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    private Long id;

    @Getter
    @Column(nullable = false)
    private String newsApiKey;

    @Getter
    @Column(nullable = false)
    private String sourceId;

    @CreatedDate
    @Column(nullable = false, updatable = false)
    private Date createdAt;

    @LastModifiedDate
    @Column(nullable = false)
    private Date updatedAt;

    protected FavoriteSource() {}

    /**
     * Create a new favorite source.
     * @param command The command to create a favorite source.
     * @see CreateFavoriteSourceCommand
     * @since 1.0
     */
    public FavoriteSource(CreateFavoriteSourceCommand command) {
        this.newsApiKey = command.newsApiKey();
        this.sourceId = command.sourceId();
    }

}
