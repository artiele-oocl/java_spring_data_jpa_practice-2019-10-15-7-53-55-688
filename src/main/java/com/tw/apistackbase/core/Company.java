package com.tw.apistackbase.core;

import javax.persistence.*;

@Entity
public class Company {
    @GeneratedValue
    @Id
    private Long id;

    private String name;

    @OneToOne(cascade = CascadeType.ALL)
    private CompanyProfile profile;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Company() {
    }

    public Company(String name) {
        this.name = name;
    }

    public CompanyProfile getProfile() {
        return profile;
    }

    public void setProfile(CompanyProfile profile) {
        this.profile = profile;
    }
}
