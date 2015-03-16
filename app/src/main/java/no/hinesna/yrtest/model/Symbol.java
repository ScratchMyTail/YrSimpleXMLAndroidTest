package no.hinesna.yrtest.model;

import org.simpleframework.xml.Attribute;
import org.simpleframework.xml.Root;

/**
 * Created by christerhansen on 16.03.15.
 */
@Root(strict=false)
public class Symbol {
    @Attribute
    int number;

    @Attribute
    String name;

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
