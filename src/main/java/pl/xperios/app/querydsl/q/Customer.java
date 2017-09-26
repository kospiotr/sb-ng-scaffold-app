package pl.xperios.app.querydsl.q;

import javax.annotation.Generated;

/**
 * Customer is a Querydsl bean type
 */
@Generated("com.querydsl.codegen.BeanSerializer")
public class Customer {

    private Boolean active;

    private Short addressId;

    private java.time.LocalDateTime createDate;

    private Short customerId;

    private String email;

    private String firstName;

    private String lastName;

    private java.time.LocalDateTime lastUpdate;

    private Byte storeId;

    public Boolean getActive() {
        return active;
    }

    public void setActive(Boolean active) {
        this.active = active;
    }

    public Short getAddressId() {
        return addressId;
    }

    public void setAddressId(Short addressId) {
        this.addressId = addressId;
    }

    public java.time.LocalDateTime getCreateDate() {
        return createDate;
    }

    public void setCreateDate(java.time.LocalDateTime createDate) {
        this.createDate = createDate;
    }

    public Short getCustomerId() {
        return customerId;
    }

    public void setCustomerId(Short customerId) {
        this.customerId = customerId;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public java.time.LocalDateTime getLastUpdate() {
        return lastUpdate;
    }

    public void setLastUpdate(java.time.LocalDateTime lastUpdate) {
        this.lastUpdate = lastUpdate;
    }

    public Byte getStoreId() {
        return storeId;
    }

    public void setStoreId(Byte storeId) {
        this.storeId = storeId;
    }

}

