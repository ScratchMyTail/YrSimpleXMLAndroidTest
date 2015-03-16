package no.hinesna.yrtest.model;

import org.simpleframework.xml.Element;
import org.simpleframework.xml.Root;

/**
 * Created by christerhansen on 16.03.15.
 */
@Root(strict=false)
public class Location {
    @Element
    private String name;

    public String getName() {
        return name;
    }
}
