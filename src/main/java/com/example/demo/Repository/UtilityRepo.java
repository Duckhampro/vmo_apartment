package com.example.demo.Repository;

import com.example.demo.Entities.Utility;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UtilityRepo extends JpaRepository<Utility, Long> {
    // Các phương thức tùy chỉnh nếu cần
}
