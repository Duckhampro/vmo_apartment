package com.example.demo.Repository;

import com.example.demo.Entities.Apartment;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ApartmentRepo extends JpaRepository<Apartment, Long> {


// Các phương thức tùy chỉnh nếu cần
}
