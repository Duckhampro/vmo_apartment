package com.example.demo.Repository;

import com.example.demo.Entities.History;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface HistoryRepo extends JpaRepository<History, Long> {
    // Các phương thức tùy chỉnh nếu cần
}