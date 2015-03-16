package no.hinesna.yrtest.model;

import org.simpleframework.xml.ElementList;
import org.simpleframework.xml.Root;

import java.util.List;

/**
 * Created by christerhansen on 16.03.15.
 */
@Root(strict=false)
public class Forecast {
    @ElementList(name="tabular")
    List<Time> timeList;

    public List<Time> getTimeList() {
        return timeList;
    }

    public void setTimeList(List<Time> timeList) {
        this.timeList = timeList;
    }
}
