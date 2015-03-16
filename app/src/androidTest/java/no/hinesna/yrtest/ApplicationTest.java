package no.hinesna.yrtest;

import android.app.Application;
import android.test.ApplicationTestCase;
import android.util.Log;

import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.http.converter.xml.SimpleXmlHttpMessageConverter;
import org.springframework.web.client.RestTemplate;

import no.hinesna.yrtest.model.WeatherData;

/**
 * <a href="http://d.android.com/tools/testing/testing_android.html">Testing Fundamentals</a>
 */
public class ApplicationTest extends ApplicationTestCase<Application> {
    public ApplicationTest() {
        super(Application.class);
    }

    public void testYr(){
        final String url = "http://www.yr.no/sted/Norge/Nordland/Rana/Mo/varsel.xml";

        RestTemplate restTemplate = new RestTemplate();
        restTemplate.getMessageConverters().add(new SimpleXmlHttpMessageConverter());

        ResponseEntity<WeatherData> responseEntity = restTemplate.exchange(url, HttpMethod.GET, null, WeatherData.class);

        WeatherData weatherData = responseEntity.getBody();

        Log.d("ApplicationTestDebug", responseEntity.getBody().getForecast().getTimeList().get(0).getTemperature().getValue()+" C");
        Log.d("ApplicationTestDebug", responseEntity.getBody().getForecast().getTimeList().get(0).getSymbol().getName());
    }
}


















