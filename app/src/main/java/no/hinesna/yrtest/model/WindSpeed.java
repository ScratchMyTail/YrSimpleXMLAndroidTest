package no.hinesna.yrtest.model;

import org.simpleframework.xml.Attribute;

/**
 * Created by christerhansen on 16.03.15.
 */
public class WindSpeed {
    @Attribute
    double mps;

    @Attribute
    String name;

    public double getMps() {
        return mps;
    }

    public void setMps(double mps) {
        this.mps = mps;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
