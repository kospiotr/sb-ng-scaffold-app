package pl.xperios.app.querydsl.q;

import javax.annotation.Generated;

/**
 * Inventory is a Querydsl bean type
 */
@Generated("com.querydsl.codegen.BeanSerializer")
public class Inventory {

    private Short filmId;

    private Integer inventoryId;

    private java.time.LocalDateTime lastUpdate;

    private Byte storeId;

    public Short getFilmId() {
        return filmId;
    }

    public void setFilmId(Short filmId) {
        this.filmId = filmId;
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

    public Byte getStoreId() {
        return storeId;
    }

    public void setStoreId(Byte storeId) {
        this.storeId = storeId;
    }

}

