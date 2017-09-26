package pl.xperios.app.querydsl.q;

import javax.annotation.Generated;

/**
 * FilmActor is a Querydsl bean type
 */
@Generated("com.querydsl.codegen.BeanSerializer")
public class FilmActor {

    private Short actorId;

    private Short filmId;

    private java.time.LocalDateTime lastUpdate;

    public Short getActorId() {
        return actorId;
    }

    public void setActorId(Short actorId) {
        this.actorId = actorId;
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

