package de.cognizant.bookingtool.domain;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;

@Entity
@Table(name = "booking_status")
public class BookingStatus {
    @Id
    @Column(name = "ID", nullable = false)
    private Integer id;

    @Size(max = 30)
    @NotNull
    @Column(name = "NAME", nullable = false, length = 30)
    private String name;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

}