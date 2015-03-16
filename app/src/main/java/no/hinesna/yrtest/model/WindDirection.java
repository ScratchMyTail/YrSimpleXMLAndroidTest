package no.hinesna.yrtest.model;

import org.simpleframework.xml.Attribute;

/**
 * Created by christerhansen on 16.03.15.
 */
public class WindDirection {
    @Attribute
    double deg;

    @Attribute
    String code;

    @Attribute
    String name;

    public double getDeg() {
        return deg;
    }

    public void setDeg(double deg) {
        this.deg = deg;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
