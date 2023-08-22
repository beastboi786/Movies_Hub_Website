package com.company.samplerestapi.Model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "users")
public class Student {

    @Id
    @Column(name = "Username")
    private String Username;
    @Column(name = "email")
    private String email;

    @Column(name = "Contact")
    private String Contact;

    @Column(name = "Password")
    private String Password;

    public Student() {
    }

    public Student(String Username,  String email, String Contact, String Password) {
        this.Username = Username;
        this.email = email;
        this.Contact = Contact;
        this.Password = Password;

    }

    public String getUsername() {
        return Username;
    }

    public void setUsername(String Username) {
        this.Username = Username;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getContact() {
        return Contact;
    }

    public void setContact(String contact) {
        Contact = contact;
    }

    public String getPassword() {
        return Password;
    }

    public void setPassword(String password) {
        Password = password;
    }
}
