package com.example.demo.Service;

import com.example.demo.Entities.Utility;
import com.example.demo.Repository.UtilityRepo;
import com.example.demo.Service.Interface.Utility_Interface;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UtilityService implements Utility_Interface {

    @Autowired
    private UtilityRepo utilityRepository;

    @Override
    public List<Utility> getAllUtilities() {
        return utilityRepository.findAll();
    }

    @Override
    public Utility getUtilityById(Long id) {
        return utilityRepository.findById(id).orElse(null);
    }

    @Override
    public Utility createUtility(Utility utility) {
        return utilityRepository.save(utility);
    }

    @Override
    public Utility updateUtility(Long id, Utility utility) {
        if (utilityRepository.existsById(id)) {
            utility.setId(id);
            return utilityRepository.save(utility);
        }
        return null;
    }

    @Override
    public void deleteUtility(Long id) {
        utilityRepository.deleteById(id);
    }
}
