package de.cognizant.bookingtool.domain;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;

import java.math.BigDecimal;
import java.time.Instant;

@Entity
@Table(name = "booking_entries")
public class BookingEntry {
    @Id
    @Column(name = "ID", nullable = false)
    private Integer id;

    @NotNull
    @Column(name = "PROJECTS_ID", nullable = false)
    private Long projectsId;

    @NotNull
    @Column(name = "USER_ID", nullable = false)
    private Long userId;

    @NotNull
    @Column(name = "ACTIVITIES_ID", nullable = false)
    private Integer activitiesId;

    @NotNull
    @Column(name = "BOOKING_DATE", nullable = false)
    private Instant bookingDate;

    @NotNull
    @Column(name = "HOURS", nullable = false, precision = 4, scale = 2)
    private BigDecimal hours;

    @NotNull
    @Column(name = "BOOKING_STATUS_ID", nullable = false)
    private Integer bookingStatusId;

    @Size(max = 20)
    @Column(name = "STORY_REF", length = 20)
    private String storyRef;

    @Size(max = 256)
    @Column(name = "COMMENT", length = 256)
    private String comment;

    @Size(max = 100)
    @Column(name = "APPROVER_COMMENT", length = 100)
    private String approverComment;

    @NotNull
    @Column(name = "CREATION_DATE", nullable = false)
    private Instant creationDate;

    @NotNull
    @Column(name = "LAST_CHANGE_DATE", nullable = false)
    private Instant lastChangeDate;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Long getProjectsId() {
        return projectsId;
    }

    public void setProjectsId(Long projectsId) {
        this.projectsId = projectsId;
    }

    public Long getUserId() {
        return userId;
    }

    public void setUserId(Long userId) {
        this.userId = userId;
    }

    public Integer getActivitiesId() {
        return activitiesId;
    }

    public void setActivitiesId(Integer activitiesId) {
        this.activitiesId = activitiesId;
    }

    public Instant getBookingDate() {
        return bookingDate;
    }

    public void setBookingDate(Instant bookingDate) {
        this.bookingDate = bookingDate;
    }

    public BigDecimal getHours() {
        return hours;
    }

    public void setHours(BigDecimal hours) {
        this.hours = hours;
    }

    public Integer getBookingStatusId() {
        return bookingStatusId;
    }

    public void setBookingStatusId(Integer bookingStatusId) {
        this.bookingStatusId = bookingStatusId;
    }

    public String getStoryRef() {
        return storyRef;
    }

    public void setStoryRef(String storyRef) {
        this.storyRef = storyRef;
    }

    public String getComment() {
        return comment;
    }

    public void setComment(String comment) {
        this.comment = comment;
    }

    public String getApproverComment() {
        return approverComment;
    }

    public void setApproverComment(String approverComment) {
        this.approverComment = approverComment;
    }

    public Instant getCreationDate() {
        return creationDate;
    }

    public void setCreationDate(Instant creationDate) {
        this.creationDate = creationDate;
    }

    public Instant getLastChangeDate() {
        return lastChangeDate;
    }

    public void setLastChangeDate(Instant lastChangeDate) {
        this.lastChangeDate = lastChangeDate;
    }

}