package com.example.demo.Service;

import com.example.demo.Entities.Resident;
import com.example.demo.Repository.ResidentRepo;
import com.example.demo.Service.Interface.Resident_Interface;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ResidentService implements Resident_Interface {

    @Autowired
    private ResidentRepo residentRepository;

    @Override
    public List<Resident> getAllResidents() {
        return residentRepository.findAll();
    }

    @Override
    public Resident getResidentById(Long id) {
        return residentRepository.findById(id).orElse(null);
    }

    @Override
    public Resident createResident(Resident resident) {
        return residentRepository.save(resident);
    }

    @Override
    public Resident updateResident(Long id, Resident resident) {
        if (residentRepository.existsById(id)) {
            resident.setId(id);
            return residentRepository.save(resident);
        }
        return null;
    }

    @Override
    public void deleteResident(Long id) {
        residentRepository.deleteById(id);
    }
}