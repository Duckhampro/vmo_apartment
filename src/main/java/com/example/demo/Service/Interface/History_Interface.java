package com.example.demo.Service.Interface;

import com.example.demo.Entities.History;
import java.util.List;

public interface History_Interface {
    List<History> getAllApartmentHistories();
    History getApartmentHistoryById(Long id);
    History createApartmentHistory(History apartmentHistory);
    History updateApartmentHistory(Long id, History apartmentHistory);
    void deleteApartmentHistory(Long id);
}