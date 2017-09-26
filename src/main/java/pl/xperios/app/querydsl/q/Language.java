package pl.xperios.app.querydsl.q;

import javax.annotation.Generated;

/**
 * Language is a Querydsl bean type
 */
@Generated("com.querydsl.codegen.BeanSerializer")
public class Language {

    private Byte languageId;

    private java.time.LocalDateTime lastUpdate;

    private String name;

    public Byte getLanguageId() {
        return languageId;
    }

    public void setLanguageId(Byte languageId) {
        this.languageId = languageId;
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

