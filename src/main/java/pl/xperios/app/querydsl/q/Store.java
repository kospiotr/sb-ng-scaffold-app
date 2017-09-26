package pl.xperios.app.querydsl.q;

import javax.annotation.Generated;

/**
 * Store is a Querydsl bean type
 */
@Generated("com.querydsl.codegen.BeanSerializer")
public class Store {

    private Short addressId;

    private java.time.LocalDateTime lastUpdate;

    private Byte managerStaffId;

    private Byte storeId;

    public Short getAddressId() {
        return addressId;
    }

    public void setAddressId(Short addressId) {
        this.addressId = addressId;
    }

    public java.time.LocalDateTime getLastUpdate() {
        return lastUpdate;
    }

    public void setLastUpdate(java.time.LocalDateTime lastUpdate) {
        this.lastUpdate = lastUpdate;
    }

    public Byte getManagerStaffId() {
        return managerStaffId;
    }

    public void setManagerStaffId(Byte managerStaffId) {
        this.managerStaffId = managerStaffId;
    }

    public Byte getStoreId() {
        return storeId;
    }

    public void setStoreId(Byte storeId) {
        this.storeId = storeId;
    }

}

