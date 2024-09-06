package com.example.demo.Controller;

import com.example.demo.Entities.Apartment;
import com.example.demo.Service.Interface.Apartment_Interface;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/api/apartments")
public class ApartmentController {

    @Autowired
    private Apartment_Interface apartmentService;

    @GetMapping
    public ResponseEntity<List<Apartment>> getAllApartments() {
        List<Apartment> apartments = apartmentService.getAllApartments();
        return new ResponseEntity<>(apartments, HttpStatus.OK);
    }

    @GetMapping("/{id}")
    public ResponseEntity<Apartment> getApartmentById(@PathVariable Long id) {
        Apartment apartment = apartmentService.getApartmentById(id);
        if (apartment != null) {
            return new ResponseEntity<>(apartment, HttpStatus.OK);
        }
        return new ResponseEntity<>(HttpStatus.NOT_FOUND);
    }

    @PostMapping
    public ResponseEntity<Apartment> createApartment(@RequestBody Apartment apartment) {
        Apartment createdApartment = apartmentService.createApartment(apartment);
        return new ResponseEntity<>(createdApartment, HttpStatus.CREATED);
    }

    @PutMapping("/{id}")
    public ResponseEntity<Apartment> updateApartment(@PathVariable Long id, @RequestBody Apartment apartment) {
        Apartment updatedApartment = apartmentService.updateApartment(id, apartment);
        if (updatedApartment != null) {
            return new ResponseEntity<>(updatedApartment, HttpStatus.OK);
        }
        return new ResponseEntity<>(HttpStatus.NOT_FOUND);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteApartment(@PathVariable Long id) {
        apartmentService.deleteApartment(id);
        return new ResponseEntity<>(HttpStatus.NO_CONTENT);
    }
}
