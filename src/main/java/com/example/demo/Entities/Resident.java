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
public class Resident {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @Column(nullable = false)
    private String name;              // Tên của cư dân

    @Column(nullable = false, unique = true)
    private String email;             // Địa chỉ email của cư dân

    @Column(nullable = false, unique = true)
    private String phone;             // Số điện thoại của cư dân

    @Column(nullable = false, unique = true)
    private String idCard;            // Số CMND/CCCD của cư dân

    @Column(nullable = false)
    private int birthYear;            // Năm sinh của cư dân

    @Column(nullable = false)
    private String gender;            // Giới tính của cư dân (Male, Female, Other)

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "apartment_id")
    private Apartment apartment;  // Căn hộ mà cư dân đang ở

    private LocalDate movedInDate;         // Ngày cư dân chuyển vào
    private LocalDate movedOutDate;        // Ngày cư dân chuyển ra (nếu có)

    public enum Gender {
        MALE, FEMALE
    }
}
