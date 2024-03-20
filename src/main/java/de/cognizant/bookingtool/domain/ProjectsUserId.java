package de.cognizant.bookingtool.domain;

import jakarta.persistence.Column;
import jakarta.persistence.Embeddable;
import jakarta.validation.constraints.NotNull;
import org.hibernate.Hibernate;

import java.io.Serializable;
import java.util.Objects;

@Embeddable
public class ProjectsUserId implements Serializable {
    private static final long serialVersionUID = -3531411846144906435L;
    @NotNull
    @Column(name = "PROJECTS_ID", nullable = false)
    private Long projectsId;

    @NotNull
    @Column(name = "USERS_EMP_ID", nullable = false)
    private Long usersEmpId;

    public Long getProjectsId() {
        return projectsId;
    }

    public void setProjectsId(Long projectsId) {
        this.projectsId = projectsId;
    }

    public Long getUsersEmpId() {
        return usersEmpId;
    }

    public void setUsersEmpId(Long usersEmpId) {
        this.usersEmpId = usersEmpId;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || Hibernate.getClass(this) != Hibernate.getClass(o)) return false;
        ProjectsUserId entity = (ProjectsUserId) o;
        return Objects.equals(this.projectsId, entity.projectsId) &&
                Objects.equals(this.usersEmpId, entity.usersEmpId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(projectsId, usersEmpId);
    }

}