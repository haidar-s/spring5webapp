package de.cognizant.bookingtool.domain;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.JoinTable;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.Table;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;

import java.time.Instant;
import java.util.LinkedHashSet;
import java.util.Set;

@Entity
@Table(name = "activities")
public class Activity {
    @Id
    @Column(name = "ID", nullable = false)
    private Long id;

    @Size(max = 30)
    @NotNull
    @Column(name = "NAME", nullable = false, length = 30)
    private String name;

    @Size(max = 256)
    @Column(name = "DESCRIPTION", length = 256)
    private String description;

    @NotNull
    @Column(name = "CREATION_DATE", nullable = false)
    private Instant creationDate;

    @NotNull
    @Column(name = "LAST_CHANGE_DATE", nullable = false)
    private Instant lastChangeDate;

    @ManyToMany
    @JoinTable(name = "projects_activities",
            joinColumns = @JoinColumn(name = "ACTIVITIES_ID"),
            inverseJoinColumns = @JoinColumn(name = "PROJECTS_ID"))
    private Set<Project> projects = new LinkedHashSet<>();

    public Set<Project> getProjects() {
        return projects;
    }

    public void setProjects(Set<Project> projects) {
        this.projects = projects;
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

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
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