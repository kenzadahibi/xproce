package com.xproce.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter@Data
public class Customer {
    @Id@GeneratedValue
    private int id;
    private String email;
    private String pwd;
    private String role;
}
