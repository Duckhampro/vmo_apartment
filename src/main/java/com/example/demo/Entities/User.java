package com.example.demo.Entities;

import jakarta.persistence.*;
import lombok.*;



@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Table(name = "users")
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false, unique = true)
    private String username;

    @Column(nullable = false)
    private String password;

    @Column(nullable = false)
    private String email;

    private String phoneNumber;

    @Column(nullable = false)
    private String role;  // e.g., ADMIN, USER

    @Column(nullable = false)
    private boolean active = true;

    public enum Role {
        ADMIN, USER
    }
}
