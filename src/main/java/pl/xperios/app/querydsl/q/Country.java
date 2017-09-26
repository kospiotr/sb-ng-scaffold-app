package pl.xperios.app.querydsl.q;

import javax.annotation.Generated;

/**
 * Country is a Querydsl bean type
 */
@Generated("com.querydsl.codegen.BeanSerializer")
public class Country {

    private String country;

    private Short countryId;

    private java.time.LocalDateTime lastUpdate;

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public Short getCountryId() {
        return countryId;
    }

    public void setCountryId(Short countryId) {
        this.countryId = countryId;
    }

    public java.time.LocalDateTime getLastUpdate() {
        return lastUpdate;
    }

    public void setLastUpdate(java.time.LocalDateTime lastUpdate) {
        this.lastUpdate = lastUpdate;
    }

}

