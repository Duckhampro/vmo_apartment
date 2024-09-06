package com.example.demo.Repository;

import com.example.demo.Entities.MonthlyFee;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface MonthlyFeeRepo extends JpaRepository<MonthlyFee, Long> {
    // Các phương thức tùy chỉnh nếu cần
}