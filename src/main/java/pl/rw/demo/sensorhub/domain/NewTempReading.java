package pl.rw.demo.sensorhub.domain;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;

public class NewTempReading {
    public final String temp;
    public final String timestamp;

    @JsonCreator
    public NewTempReading(@JsonProperty("temp") String temp, @JsonProperty("timestamp") String timestamp) {
        this.temp = temp;
        this.timestamp = timestamp;
    }

    public String getTemp() {
        return temp;
    }

    public String getTimestamp() {
        return timestamp;
    }

    @Override
    public String toString() {
        return "NewTempReading{" +
                "temp='" + temp + '\'' +
                ", timestamp='" + timestamp + '\'' +
                '}';
    }
}
