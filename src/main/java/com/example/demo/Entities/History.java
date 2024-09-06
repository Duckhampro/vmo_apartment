package com.example.demo.Entities;

import jakarta.persistence.*;
import lombok.*;

import java.time.LocalDate;

@Entity
@Getter
@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class History {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "resident_id", nullable = false)
    private Resident resident;  // Cư dân liên quan

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "old_apartment_id")
    private Apartment oldApartment;  // Căn hộ cũ

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "new_apartment_id")
    private Apartment newApartment;  // Căn hộ mới

    @Column(nullable = false)
    private LocalDate changeDate;            // Ngày thay đổi căn hộ
}
