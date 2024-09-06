package com.example.demo.Controller;

import com.example.demo.Entities.Resident;
import com.example.demo.Service.Interface.Resident_Interface;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/api/residents")
public class ResidentController {

    @Autowired
    private Resident_Interface residentService;

    @GetMapping
    public ResponseEntity<List<Resident>> getAllResidents() {
        List<Resident> residents = residentService.getAllResidents();
        return new ResponseEntity<>(residents, HttpStatus.OK);
    }

    @GetMapping("/{id}")
    public ResponseEntity<Resident> getResidentById(@PathVariable Long id) {
        Resident resident = residentService.getResidentById(id);
        if (resident != null) {
            return new ResponseEntity<>(resident, HttpStatus.OK);
        }
        return new ResponseEntity<>(HttpStatus.NOT_FOUND);
    }

    @PostMapping
    public ResponseEntity<Resident> createResident(@RequestBody Resident resident) {
        Resident createdResident = residentService.createResident(resident);
        return new ResponseEntity<>(createdResident, HttpStatus.CREATED);
    }

    @PutMapping("/{id}")
    public ResponseEntity<Resident> updateResident(@PathVariable Long id, @RequestBody Resident resident) {
        Resident updatedResident = residentService.updateResident(id, resident);
        if (updatedResident != null) {
            return new ResponseEntity<>(updatedResident, HttpStatus.OK);
        }
        return new ResponseEntity<>(HttpStatus.NOT_FOUND);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteResident(@PathVariable Long id) {
        residentService.deleteResident(id);
        return new ResponseEntity<>(HttpStatus.NO_CONTENT);
    }
}