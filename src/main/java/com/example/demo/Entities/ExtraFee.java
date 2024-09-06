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
@Table(name = "extra_fee")
public class ExtraFee {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "apartment_id", nullable = false)
    private Apartment apartment;  // Căn hộ liên quan

    @Column(nullable = false)
    private String chargeDescription; // Mô tả khoản phí (ví dụ: Phí dọn dẹp)

    @Column(nullable = false)
    private float amount;             // Số tiền của khoản phí

    @Column(nullable = false)
    private LocalDate chargeDate;          // Ngày phát sinh khoản phí
}
