package de.cognizant.bookingtool.domain;

import jakarta.persistence.Column;
import jakarta.persistence.Embeddable;
import jakarta.validation.constraints.NotNull;
import org.hibernate.Hibernate;

import java.io.Serializable;
import java.util.Objects;

@Embeddable
public class ProjectsActivityId implements Serializable {
    private static final long serialVersionUID = 6971059644883451856L;
    @NotNull
    @Column(name = "PROJECTS_ID", nullable = false)
    private Long projectsId;

    @NotNull
    @Column(name = "ACTIVITIES_ID", nullable = false)
    private Long activitiesId;

    public Long getProjectsId() {
        return projectsId;
    }

    public void setProjectsId(Long projectsId) {
        this.projectsId = projectsId;
    }

    public Long getActivitiesId() {
        return activitiesId;
    }

    public void setActivitiesId(Long activitiesId) {
        this.activitiesId = activitiesId;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || Hibernate.getClass(this) != Hibernate.getClass(o)) return false;
        ProjectsActivityId entity = (ProjectsActivityId) o;
        return Objects.equals(this.projectsId, entity.projectsId) &&
                Objects.equals(this.activitiesId, entity.activitiesId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(projectsId, activitiesId);
    }

}