package pl.rw.demo.sensorhub;

import java.time.Instant;

public class TempReadingEntity {
    public final long id;
    public final String temp;
    public final Instant timeStamp = Instant.now();

    public TempReadingEntity(long id, String temp) {
        this.id = id;
        this.temp = temp;
    }

    public TempReading toTempReading() {
        return new TempReading(this.temp, timeStamp.toString());
    }
}
