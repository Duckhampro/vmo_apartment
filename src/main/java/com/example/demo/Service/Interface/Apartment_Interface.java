package com.example.demo.Service.Interface;

import com.example.demo.Entities.Apartment;
import java.util.List;

public interface Apartment_Interface {
    List<Apartment> getAllApartments();
    Apartment getApartmentById(Long id);
    Apartment createApartment(Apartment apartment);
    Apartment updateApartment(Long id, Apartment apartment);
    void deleteApartment(Long id);
}