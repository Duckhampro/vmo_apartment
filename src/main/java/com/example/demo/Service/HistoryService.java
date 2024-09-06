package com.example.demo.Service;

import com.example.demo.Entities.History;
import com.example.demo.Repository.HistoryRepo;
import com.example.demo.Service.Interface.History_Interface;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class HistoryService implements History_Interface {

    @Autowired
    private HistoryRepo apartmentHistoryRepository;

    @Override
    public List<History> getAllApartmentHistories() {
        return apartmentHistoryRepository.findAll();
    }

    @Override
    public History getApartmentHistoryById(Long id) {
        return apartmentHistoryRepository.findById(id).orElse(null);
    }

    @Override
    public History createApartmentHistory(History apartmentHistory) {
        return apartmentHistoryRepository.save(apartmentHistory);
    }

    @Override
    public History updateApartmentHistory(Long id, History apartmentHistory) {
        if (apartmentHistoryRepository.existsById(id)) {
            apartmentHistory.setId(id);
            return apartmentHistoryRepository.save(apartmentHistory);
        }
        return null;
    }

    @Override
    public void deleteApartmentHistory(Long id) {
        apartmentHistoryRepository.deleteById(id);
    }
}