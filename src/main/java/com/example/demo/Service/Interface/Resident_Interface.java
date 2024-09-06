package com.example.demo.Service.Interface;

import com.example.demo.Entities.Resident;
import java.util.List;

public interface Resident_Interface {
    List<Resident> getAllResidents();
    Resident getResidentById(Long id);
    Resident createResident(Resident resident);
    Resident updateResident(Long id, Resident resident);
    void deleteResident(Long id);
}