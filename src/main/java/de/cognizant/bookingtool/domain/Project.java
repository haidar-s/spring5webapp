package de.cognizant.bookingtool.domain;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.JoinTable;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;

import java.time.Instant;
import java.util.LinkedHashSet;
import java.util.Set;

@Entity
@Table(name = "projects")
public class Project {
    @Id
    @Column(name = "ID", nullable = false)
    private Long id;

    @Size(max = 100)
    @NotNull
    @Column(name = "NAME", nullable = false, length = 100)
    private String name;

    @NotNull
    @Column(name = "OWNER", nullable = false)
    private Integer owner;

    @NotNull
    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "PROJECTS_STATUS_ID", nullable = false)
    private ProjectsStatus projectsStatus;

    @NotNull
    @Column(name = "CREATION_DATE", nullable = false)
    private Instant creationDate;

    @NotNull
    @Column(name = "LAST_CHANGE_DATE", nullable = false)
    private Instant lastChangeDate;

    @ManyToMany
    @JoinTable(name = "projects_activities",
            joinColumns = @JoinColumn(name = "PROJECTS_ID"),
            inverseJoinColumns = @JoinColumn(name = "ACTIVITIES_ID"))
    private Set<Activity> activities = new LinkedHashSet<>();

    @ManyToMany
    @JoinTable(name = "projects_users",
            joinColumns = @JoinColumn(name = "PROJECTS_ID"),
            inverseJoinColumns = @JoinColumn(name = "USERS_EMP_ID"))
    private Set<User> users = new LinkedHashSet<>();

    public Set<User> getUsers() {
        return users;
    }

    public void setUsers(Set<User> users) {
        this.users = users;
    }

    public Set<Activity> getActivities() {
        return activities;
    }

    public void setActivities(Set<Activity> activities) {
        this.activities = activities;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getOwner() {
        return owner;
    }

    public void setOwner(Integer owner) {
        this.owner = owner;
    }

    public ProjectsStatus getProjectsStatus() {
        return projectsStatus;
    }

    public void setProjectsStatus(ProjectsStatus projectsStatus) {
        this.projectsStatus = projectsStatus;
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