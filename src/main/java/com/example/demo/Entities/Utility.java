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
public class Utility {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "apartment_id", nullable = false)
    private Apartment apartment;  // Căn hộ liên quan

    @Column(nullable = false)
    private float electricityUsage;   // Lượng điện sử dụng (kWh)

    @Column(nullable = false)
    private float waterUsage;         // Lượng nước sử dụng (m³)

    @Column(nullable = false)
    private float totalAmount;        // Tổng số tiền phải trả

    @Column(nullable = false)
    private LocalDate paymentDate;         // Ngày thanh toán

    @Column(nullable = false)
    private String paymentStatus;     // Trạng thái thanh toán (Paid, Unpaid)

    public enum PaymentStatus {
        PAID, UNPAID
    }
}