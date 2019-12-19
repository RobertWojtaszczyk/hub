package pl.rw.demo.sensorhub.domain;

public class TempReading {
    public final String temp;
    public final String timestamp;

    public TempReading(String temp, String timestamp) {
        this.temp = temp;
        this.timestamp = timestamp;
    }

    @Override
    public String toString() {
        return "TempReading{" +
                "temp='" + temp + '\'' +
                ", timestamp='" + timestamp + '\'' +
                '}';
    }
}
