package no.hinesna.yrtest.model;

import org.simpleframework.xml.Element;
import org.simpleframework.xml.Root;

/**
 * Created by christerhansen on 16.03.15.
 */
@Root(name="meta")
public class Meta {
    @Element
    private String lastupdate;

    @Element
    private String nextupdate;

    public String getLastupdate() {
        return lastupdate;
    }

    public void setLastupdate(String lastupdate) {
        this.lastupdate = lastupdate;
    }

    public String getNextupdate() {
        return nextupdate;
    }

    public void setNextupdate(String nextupdate) {
        this.nextupdate = nextupdate;
    }
}
