package pl.rw.demo.sensorhub;

import io.vavr.collection.List;

public class TempReadingService {

    private List<TempReadingEntity> tempReadings = List.empty();

    public int addTempReading(final NewTempReading newTempReading) {
        tempReadings = tempReadings.prepend(new TempReadingEntity(tempReadings.size(), newTempReading.temp));
        return tempReadings.size();
    }

    public List<TempReading> getTempReadings() {
        return this.tempReadings.map(TempReadingEntity::toTempReading);
    }
}
