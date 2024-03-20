package de.cognizant.bookingtool.domain;

import jakarta.persistence.EmbeddedId;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.MapsId;
import jakarta.persistence.Table;

@Entity
@Table(name = "projects_users")
public class ProjectsUser {
    @EmbeddedId
    private ProjectsUserId id;

    @MapsId("projectsId")
    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "PROJECTS_ID", nullable = false)
    private Project projects;

    @MapsId("usersEmpId")
    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "USERS_EMP_ID", nullable = false)
    private User usersEmp;

    public ProjectsUserId getId() {
        return id;
    }

    public void setId(ProjectsUserId id) {
        this.id = id;
    }

    public Project getProjects() {
        return projects;
    }

    public void setProjects(Project projects) {
        this.projects = projects;
    }

    public User getUsersEmp() {
        return usersEmp;
    }

    public void setUsersEmp(User usersEmp) {
        this.usersEmp = usersEmp;
    }

}