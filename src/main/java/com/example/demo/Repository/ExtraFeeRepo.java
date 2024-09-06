package com.example.demo.Repository;

import com.example.demo.Entities.ExtraFee;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ExtraFeeRepo extends JpaRepository<ExtraFee, Long> {
    // Các phương thức tùy chỉnh nếu cần
}
