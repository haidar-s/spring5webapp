package de.cognizant.bookingtool.domain;

import jakarta.persistence.EmbeddedId;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.MapsId;
import jakarta.persistence.Table;

@Entity
@Table(name = "projects_activities")
public class ProjectsActivity {
    @EmbeddedId
    private ProjectsActivityId id;

    @MapsId("projectsId")
    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "PROJECTS_ID", nullable = false)
    private Project projects;

    @MapsId("activitiesId")
    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "ACTIVITIES_ID", nullable = false)
    private Activity activities;

    public ProjectsActivityId getId() {
        return id;
    }

    public void setId(ProjectsActivityId id) {
        this.id = id;
    }

    public Project getProjects() {
        return projects;
    }

    public void setProjects(Project projects) {
        this.projects = projects;
    }

    public Activity getActivities() {
        return activities;
    }

    public void setActivities(Activity activities) {
        this.activities = activities;
    }

}