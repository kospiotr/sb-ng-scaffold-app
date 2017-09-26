package pl.xperios.app.querydsl.q;

import javax.annotation.Generated;

/**
 * Category is a Querydsl bean type
 */
@Generated("com.querydsl.codegen.BeanSerializer")
public class Category {

    private Byte categoryId;

    private java.time.LocalDateTime lastUpdate;

    private String name;

    public Byte getCategoryId() {
        return categoryId;
    }

    public void setCategoryId(Byte categoryId) {
        this.categoryId = categoryId;
    }

    public java.time.LocalDateTime getLastUpdate() {
        return lastUpdate;
    }

    public void setLastUpdate(java.time.LocalDateTime lastUpdate) {
        this.lastUpdate = lastUpdate;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

}

