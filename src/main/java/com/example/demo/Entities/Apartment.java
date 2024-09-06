package com.example.demo.Entities;


import jakarta.persistence.*;
import lombok.*;

@Entity
@Getter
@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class Apartment {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @Column(nullable = false)
    private String apartmentNumber;  // Số căn hộ (ví dụ A101, B202)

    @Column(nullable = false)
    private float area;              // Diện tích của căn hộ (m²)

    @Column(nullable = false)
    private int numRooms;            // Số phòng trong căn hộ
}
