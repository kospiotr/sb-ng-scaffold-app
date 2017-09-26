package pl.xperios.app.querydsl.q;

import javax.annotation.Generated;

/**
 * Rental is a Querydsl bean type
 */
@Generated("com.querydsl.codegen.BeanSerializer")
public class Rental {

    private Short customerId;

    private Integer inventoryId;

    private java.time.LocalDateTime lastUpdate;

    private java.time.LocalDateTime rentalDate;

    private Integer rentalId;

    private java.time.LocalDateTime returnDate;

    private Byte staffId;

    public Short getCustomerId() {
        return customerId;
    }

    public void setCustomerId(Short customerId) {
        this.customerId = customerId;
    }

    public Integer getInventoryId() {
        return inventoryId;
    }

    public void setInventoryId(Integer inventoryId) {
        this.inventoryId = inventoryId;
    }

    public java.time.LocalDateTime getLastUpdate() {
        return lastUpdate;
    }

    public void setLastUpdate(java.time.LocalDateTime lastUpdate) {
        this.lastUpdate = lastUpdate;
    }

    public java.time.LocalDateTime getRentalDate() {
        return rentalDate;
    }

    public void setRentalDate(java.time.LocalDateTime rentalDate) {
        this.rentalDate = rentalDate;
    }

    public Integer getRentalId() {
        return rentalId;
    }

    public void setRentalId(Integer rentalId) {
        this.rentalId = rentalId;
    }

    public java.time.LocalDateTime getReturnDate() {
        return returnDate;
    }

    public void setReturnDate(java.time.LocalDateTime returnDate) {
        this.returnDate = returnDate;
    }

    public Byte getStaffId() {
        return staffId;
    }

    public void setStaffId(Byte staffId) {
        this.staffId = staffId;
    }

}

