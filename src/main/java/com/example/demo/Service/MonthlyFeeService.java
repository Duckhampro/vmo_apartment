package com.example.demo.Service;

import com.example.demo.Entities.MonthlyFee;
import com.example.demo.Repository.MonthlyFeeRepo;
import com.example.demo.Service.Interface.MonthlyFee_Interface;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MonthlyFeeService implements MonthlyFee_Interface {

    @Autowired
    private MonthlyFeeRepo monthlyFeeRepository;

    @Override
    public List<MonthlyFee> getAllMonthlyFees() {
        return monthlyFeeRepository.findAll();
    }

    @Override
    public MonthlyFee getMonthlyFeeById(Long id) {
        return monthlyFeeRepository.findById(id).orElse(null);
    }

    @Override
    public MonthlyFee createMonthlyFee(MonthlyFee monthlyFee) {
        return monthlyFeeRepository.save(monthlyFee);
    }

    @Override
    public MonthlyFee updateMonthlyFee(Long id, MonthlyFee monthlyFee) {
        if (monthlyFeeRepository.existsById(id)) {
            monthlyFee.setId(id);
            return monthlyFeeRepository.save(monthlyFee);
        }
        return null;
    }

    @Override
    public void deleteMonthlyFee(Long id) {
        monthlyFeeRepository.deleteById(id);
    }
}
