package com.yourpackage.entities;

import javax.persistence.*;
import java.util.Set;

@Entity
public class FinancialAdvisor {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long advisorID;

    private String name;
    private String email;
    private String phone;

    @OneToMany(mappedBy = "financialAdvisor")
    private Set<Client> clients;

    public FinancialAdvisor() {
        // Default constructor
    }

    // Getters and Setters
    public Long getAdvisorID() {
        return advisorID;
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

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public Set<Client> getClients() {
        return clients;
    }

    public void setClients(Set<Client> clients) {
        this.clients = clients;
    }
}
