package pl.xperios.app.querydsl.q;

import javax.annotation.Generated;

/**
 * Actor is a Querydsl bean type
 */
@Generated("com.querydsl.codegen.BeanSerializer")
public class Actor {

    private Short actorId;

    private String firstName;

    private String lastName;

    private java.time.LocalDateTime lastUpdate;

    public Short getActorId() {
        return actorId;
    }

    public void setActorId(Short actorId) {
        this.actorId = actorId;
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

}

