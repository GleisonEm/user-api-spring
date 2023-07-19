package com.example.userapi.entity;

import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Entity;

@Entity
public class Driver {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;
    private String name;
    private String email;
    private String cpf;
    private String photo;
    private String dateBirth;
    private Integer cityId;
    private String password;
    private String photoCnh;
    private String cnh;
    private String renavam;
    private String residentialCertificate;
    private Float walletValue;
    private Integer driverStatusId;
    private String time;

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getCpf() {
        return cpf;
    }

    public String getPhoto() {
        return photo;
    }

    public void setPhoto(String photo) {
        this.photo = photo;
    }

    public String getDateBirth() {
        return dateBirth;
    }

    public void setDateBirth(String dateBirth) {
        this.dateBirth = dateBirth;
    }

    public Integer getCityId() {
        return cityId;
    }

    public void setCityId(Integer cityId) {
        this.cityId = cityId;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getPassword() {
        return password;
    }

    public String getPhotoCnh() {
        return photoCnh;
    }

    public void setPhotoCnh(String photoCnh) {
        this.photoCnh = photoCnh;
    }

    public String getCnh() {
        return cnh;
    }

    public void setCnh(String cnh) {
        this.cnh = cnh;
    }

    public String getRenavam() {
        return renavam;
    }

    public void setRenavam(String renavam) {
        this.renavam = renavam;
    }

    public String getResidentialCertificate() {
        return residentialCertificate;
    }

    public void setResidentialCertificate(String residentialCertificate) {
        this.residentialCertificate = residentialCertificate;
    }

    public void setWalletValue(Float walletValue) {
        this.walletValue = walletValue;
    }

    public Float getWalletValue() {
        return walletValue;
    }

    public void setDriverStatusId(Integer driverStatusId) {
        this.driverStatusId = driverStatusId;
    }

    public Integer getDriverStatusId() {
        return driverStatusId;
    }

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}
