package pl.rw.demo.sensorhub;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;

public class TempReading {
    public final String temp;

    @JsonCreator
    public TempReading(@JsonProperty("temp") String temp) {
        this.temp = temp;
    }

    @Override
    public String toString() {
        return "TempReading{" +
                "temp='" + temp + '\'' +
                '}';
    }
}
