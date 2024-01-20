package com.yourpackage.entities;

import javax.persistence.*;
import java.util.Date;
import java.util.Set;

@Entity
public class Portfolio {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long portfolioID;

    @OneToOne
    @JoinColumn(name = "clientID")
    private Client client;

    private Date creationDate;

    @OneToMany(mappedBy = "portfolio")
    private Set<Security> securities;

    public Portfolio() {
        // Default constructor
    }

    // Getters and Setters
    public Long getPortfolioID() {
        return portfolioID;
    }

    public Client getClient() {
        return client;
    }

    public void setClient(Client client) {
        this.client = client;
    }

    public Date getCreationDate() {
        return creationDate;
    }

    public void setCreationDate(Date creationDate) {
        this.creationDate = creationDate;
    }

    public Set<Security> getSecurities() {
        return securities;
    }

    public void setSecurities(Set<Security> securities) {
        this.securities = securities;
    }
}

