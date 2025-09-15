package com.example.demo.entity;
import jakarta.persistence.*;
import lombok.Data;
@Entity
@Table(name = "client")
@Data
public class UserEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", nullable = false)
    private Long id;
    @Column(name = "name", nullable = false)
    private String name;
}
