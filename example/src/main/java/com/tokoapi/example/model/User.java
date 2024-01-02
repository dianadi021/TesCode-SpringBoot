package com.tokoapi.example.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;

@Data
@Entity
@Table(name = "users")
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "userId")
    private Long _id;

    @Column(name = "fullName")
    private String _fullName;

    @Column(name = "email")
    private String _email;

    @Column(name = "password")
    private String _password;

    @Column(name = "companyName")
    private String _companyName;

    public User(Long id, String fullName, String email, String password, String companyName) {
        this._id = id;
        this._fullName = fullName;
        this._email = email;
        this._password = password;
        this._companyName = companyName;
    }
}
