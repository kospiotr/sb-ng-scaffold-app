package pl.xperios.app.querydsl.q;

import javax.annotation.Generated;

/**
 * City is a Querydsl bean type
 */
@Generated("com.querydsl.codegen.BeanSerializer")
public class City {

    private String city;

    private Short cityId;

    private Short countryId;

    private java.time.LocalDateTime lastUpdate;

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public Short getCityId() {
        return cityId;
    }

    public void setCityId(Short cityId) {
        this.cityId = cityId;
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

