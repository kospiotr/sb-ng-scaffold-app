package pl.xperios.app.querydsl.q;

import javax.annotation.Generated;

/**
 * FilmCategory is a Querydsl bean type
 */
@Generated("com.querydsl.codegen.BeanSerializer")
public class FilmCategory {

    private Byte categoryId;

    private Short filmId;

    private java.time.LocalDateTime lastUpdate;

    public Byte getCategoryId() {
        return categoryId;
    }

    public void setCategoryId(Byte categoryId) {
        this.categoryId = categoryId;
    }

    public Short getFilmId() {
        return filmId;
    }

    public void setFilmId(Short filmId) {
        this.filmId = filmId;
    }

    public java.time.LocalDateTime getLastUpdate() {
        return lastUpdate;
    }

    public void setLastUpdate(java.time.LocalDateTime lastUpdate) {
        this.lastUpdate = lastUpdate;
    }

}

