package com.projeto.minhasviagem.minhasviagem.models;

import java.io.Serializable;
import java.time.LocalDate;
import java.util.UUID;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "TB_USERS")
public class UserModel implements Serializable {

    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private UUID idUser;
    private String firstName;
    private String lastName;
    private String userName;
    private String cpf;
    private LocalDate dateBirth;

    public UUID getIdUser() {
        return this.idUser;
    }

    public String getFirstName() {
        return this.firstName;
    }

    public void setFirstName(String value) {
        this.firstName = value;
    }

    public String getLastName() {
        return this.lastName;
    }

    public void setLastName(String value) {
        this.lastName = value;
    }

    public String getUserName() {
        return this.userName;
    }

    public void setUserName(String value) {
        this.userName = value;
    }

    public String getCpf() {
        return this.cpf;
    }

    public void setCpf(String value) {
        this.cpf = value;
    }

    public LocalDate getDateBirth() {
        return this.dateBirth;
    }

    public void setDateBirth(LocalDate value) {
        this.dateBirth = value;
    }
}
