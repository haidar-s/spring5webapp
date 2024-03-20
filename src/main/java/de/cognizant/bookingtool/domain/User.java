package de.cognizant.bookingtool.domain;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.JoinTable;
import jakarta.persistence.Lob;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;

import java.time.Instant;
import java.util.LinkedHashSet;
import java.util.Set;

@Entity
@Table(name = "users")
public class User {
    @Id
    @Column(name = "EMP_ID", nullable = false)
    private Long id;

    @Size(max = 255)
    @NotNull
    @Column(name = "EMAIL", nullable = false)
    private String email;

    @NotNull
    @Lob
    @Column(name = "PASSWORD_HASH", nullable = false)
    private String passwordHash;

    @NotNull
    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "USER_ROLES_ID", nullable = false)
    private UserRole userRoles;

    @Size(max = 100)
    @NotNull
    @Column(name = "FIRSTNAME", nullable = false, length = 100)
    private String firstname;

    @Size(max = 100)
    @NotNull
    @Column(name = "LASTNAME", nullable = false, length = 100)
    private String lastname;

    @NotNull
    @Column(name = "ACTIVE", nullable = false)
    private Boolean active = false;

    @NotNull
    @Column(name = "CREATION_DATE", nullable = false)
    private Instant creationDate;

    @NotNull
    @Column(name = "LAST_CHANGE_DATE", nullable = false)
    private Instant lastChangeDate;

    @ManyToMany
    @JoinTable(name = "projects_users",
            joinColumns = @JoinColumn(name = "USERS_EMP_ID"),
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

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPasswordHash() {
        return passwordHash;
    }

    public void setPasswordHash(String passwordHash) {
        this.passwordHash = passwordHash;
    }

    public UserRole getUserRoles() {
        return userRoles;
    }

    public void setUserRoles(UserRole userRoles) {
        this.userRoles = userRoles;
    }

    public String getFirstname() {
        return firstname;
    }

    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public Boolean getActive() {
        return active;
    }

    public void setActive(Boolean active) {
        this.active = active;
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