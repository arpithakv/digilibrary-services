package com.samarthanam.digitallibrary.entity;

import lombok.Data;

import javax.persistence.*;
import java.time.LocalDateTime;
import java.time.LocalTime;

@Entity
@Table(name = "user_activity_history")
@Data
public class UserActivityHistory {

    @Id
    @Column(name = "user_activity_history_id")
    @SequenceGenerator(name = "seq", sequenceName = "user_activity_history_id_seq", allocationSize=1)
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "seq")
    private Integer userActivityHistoryId;

    @Column(name = "user_id")
    private Integer userId;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "isbn")
    private Book book;

    @Column(name = "current_page")
    private Integer currentPage;

    @Column(name = "audio_time")
    private LocalTime audioTime;

    @Column(name = "crte_ts")
    private LocalDateTime createdTimestamp;

    @Column(name = "updt_ts")
    private LocalDateTime updatedTimestamp;
}