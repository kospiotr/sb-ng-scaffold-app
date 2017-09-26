package pl.xperios.app.querydsl.q;

import javax.annotation.Generated;

/**
 * Film is a Querydsl bean type
 */
@Generated("com.querydsl.codegen.BeanSerializer")
public class Film {

    private String description;

    private Short filmId;

    private Byte languageId;

    private java.time.LocalDateTime lastUpdate;

    private Short length;

    private Byte originalLanguageId;

    private String rating;

    private java.time.LocalDate releaseYear;

    private Byte rentalDuration;

    private java.math.BigDecimal rentalRate;

    private java.math.BigDecimal replacementCost;

    private String specialFeatures;

    private String title;

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Short getFilmId() {
        return filmId;
    }

    public void setFilmId(Short filmId) {
        this.filmId = filmId;
    }

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

    public Short getLength() {
        return length;
    }

    public void setLength(Short length) {
        this.length = length;
    }

    public Byte getOriginalLanguageId() {
        return originalLanguageId;
    }

    public void setOriginalLanguageId(Byte originalLanguageId) {
        this.originalLanguageId = originalLanguageId;
    }

    public String getRating() {
        return rating;
    }

    public void setRating(String rating) {
        this.rating = rating;
    }

    public java.time.LocalDate getReleaseYear() {
        return releaseYear;
    }

    public void setReleaseYear(java.time.LocalDate releaseYear) {
        this.releaseYear = releaseYear;
    }

    public Byte getRentalDuration() {
        return rentalDuration;
    }

    public void setRentalDuration(Byte rentalDuration) {
        this.rentalDuration = rentalDuration;
    }

    public java.math.BigDecimal getRentalRate() {
        return rentalRate;
    }

    public void setRentalRate(java.math.BigDecimal rentalRate) {
        this.rentalRate = rentalRate;
    }

    public java.math.BigDecimal getReplacementCost() {
        return replacementCost;
    }

    public void setReplacementCost(java.math.BigDecimal replacementCost) {
        this.replacementCost = replacementCost;
    }

    public String getSpecialFeatures() {
        return specialFeatures;
    }

    public void setSpecialFeatures(String specialFeatures) {
        this.specialFeatures = specialFeatures;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

}

