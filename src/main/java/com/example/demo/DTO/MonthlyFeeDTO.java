package com.example.demo.DTO;

import java.time.LocalDate;

public class MonthlyFeeDTO {

    private Long id;
    private Long apartmentId;
    private Long residentId;
    private LocalDate feeMonth;
    private boolean emailSent;

    // Getters and Setters

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getApartmentId() {
        return apartmentId;
    }

    public void setApartmentId(Long apartmentId) {
        this.apartmentId = apartmentId;
    }

    public Long getResidentId() {
        return residentId;
    }

    public void setResidentId(Long residentId) {
        this.residentId = residentId;
    }

    public LocalDate getFeeMonth() {
        return feeMonth;
    }

    public void setFeeMonth(LocalDate feeMonth) {
        this.feeMonth = feeMonth;
    }

    public boolean isEmailSent() {
        return emailSent;
    }

    public void setEmailSent(boolean emailSent) {
        this.emailSent = emailSent;
    }
}
