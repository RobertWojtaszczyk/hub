package pl.rw.demo.sensorhub;

public class TempReadingEntity {
    public final long id;
    public final String temp;

    public TempReadingEntity(long id, String temp) {
        this.id = id;
        this.temp = temp;
    }

    public TempReading toTempReading() {
        return new TempReading(this.temp);
    }
}
