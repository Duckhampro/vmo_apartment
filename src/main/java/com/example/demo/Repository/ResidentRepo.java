package com.example.demo.Repository;

import com.example.demo.Entities.Resident;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ResidentRepo extends JpaRepository<Resident, Long> {
    // Các phương thức tùy chỉnh nếu cần
}