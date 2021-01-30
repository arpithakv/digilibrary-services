package com.samarthanam.digitallibrary.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.time.LocalDateTime;

@Entity
@Table(name = "book")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Book {

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "author_id")
    private Author author;

    @Id
    @Column(name = "isbn")
    private Integer isbn;

    @Column(name = "category_id")
    private Integer categoryId;

    @Column(name = "book_status_id")
    private Integer bookStatusId;

    @Column(name = "book_type_code")
    private Integer bookTypeCode;

    @Column(name = "title")
    private String title;

    @Column(name = "year")
    private String year;

    @Column(name = "country_of_origin")
    private String countryOfOrigin;

    @Column(name = "edition_version")
    private String editionVersion;

    @Column(name = "update_ts")
    private LocalDateTime updatedTimestamp;

    @Column(name = "create_ts")
    private LocalDateTime createdTimestamp;

}