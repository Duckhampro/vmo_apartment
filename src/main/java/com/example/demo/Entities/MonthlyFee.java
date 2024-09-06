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
public class MonthlyFee {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "apartment_id", nullable = false)
    private Apartment apartment;  // Căn hộ liên quan

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "resident_id", nullable = false)
    private Resident resident;    // Cư dân liên quan

    @Column(nullable = false)
    private LocalDate feeMonth;            // Tháng mà cư dân phải trả phí

    @Column(nullable = false)
    private boolean emailSent;        // Cờ chỉ định xem email thông báo phí đã được gửi chưa
}