package com.furukawalatam.pos.gcs.exportador.tecnicos.model;

import java.util.Objects;

public class Technician {
    private String name;
    private String phone;
    private String region;

    public Technician(String name, String phone, String region) {
        this.name = name;
        this.phone = phone;
        this.region = region;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getRegion() {
        return region;
    }

    public void setRegion(String region) {
        this.region = region;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Technician that = (Technician) o;
        return Objects.equals(name, that.name) && Objects.equals(phone, that.phone) && Objects.equals(region, that.region);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, phone, region);
    }
}
