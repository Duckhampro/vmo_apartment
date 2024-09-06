package com.example.demo.Service;

import com.example.demo.Entities.Apartment;
import com.example.demo.Repository.ApartmentRepo;
import com.example.demo.Service.Interface.Apartment_Interface;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ApartmentService implements Apartment_Interface {

    @Autowired
    private ApartmentRepo apartmentRepository;

    @Override
    public List<Apartment> getAllApartments() {
        return apartmentRepository.findAll();
    }

    @Override
    public Apartment getApartmentById(Long id) {
        return apartmentRepository.findById(id).orElse(null);
    }

    @Override
    public Apartment createApartment(Apartment apartment) {
        return apartmentRepository.save(apartment);
    }

    @Override
    public Apartment updateApartment(Long id, Apartment apartment) {
        if (apartmentRepository.existsById(id)) {
            apartment.setId(id);
            return apartmentRepository.save(apartment);
        }
        return null;
    }

    @Override
    public void deleteApartment(Long id) {
        apartmentRepository.deleteById(id);
    }
}
