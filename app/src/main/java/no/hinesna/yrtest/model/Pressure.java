package no.hinesna.yrtest.model;

import org.simpleframework.xml.Attribute;

/**
 * Created by christerhansen on 16.03.15.
 */
public class Pressure {
    @Attribute
    String unit;

    @Attribute
    double value;

    public String getUnit() {
        return unit;
    }

    public void setUnit(String unit) {
        this.unit = unit;
    }

    public double getValue() {
        return value;
    }

    public void setValue(double value) {
        this.value = value;
    }
}
