package com.example.demo.Service.Interface;

import com.example.demo.Entities.MonthlyFee;
import java.util.List;

public interface MonthlyFee_Interface {
    List<MonthlyFee> getAllMonthlyFees();
    MonthlyFee getMonthlyFeeById(Long id);
    MonthlyFee createMonthlyFee(MonthlyFee monthlyFee);
    MonthlyFee updateMonthlyFee(Long id, MonthlyFee monthlyFee);
    void deleteMonthlyFee(Long id);
}
