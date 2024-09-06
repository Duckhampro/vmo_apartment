package com.example.demo.DTO;

import java.time.LocalDate;

public class HistoryDTO {

    private Long id;
    private Long residentId;
    private Long oldApartmentId;
    private Long newApartmentId;
    private LocalDate changeDate;

    // Getters and Setters

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getResidentId() {
        return residentId;
    }

    public void setResidentId(Long residentId) {
        this.residentId = residentId;
    }

    public Long getOldApartmentId() {
        return oldApartmentId;
    }

    public void setOldApartmentId(Long oldApartmentId) {
        this.oldApartmentId = oldApartmentId;
    }

    public Long getNewApartmentId() {
        return newApartmentId;
    }

    public void setNewApartmentId(Long newApartmentId) {
        this.newApartmentId = newApartmentId;
    }

    public LocalDate getChangeDate() {
        return changeDate;
    }

    public void setChangeDate(LocalDate changeDate) {
        this.changeDate = changeDate;
    }
}
