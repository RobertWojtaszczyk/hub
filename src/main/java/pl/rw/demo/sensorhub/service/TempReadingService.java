package pl.rw.demo.sensorhub.service;

import io.vavr.collection.List;
import pl.rw.demo.sensorhub.domain.TempReading;
import pl.rw.demo.sensorhub.domain.TempReadingEntity;

public class TempReadingService {

    private List<TempReadingEntity> tempReadings = List.empty();

    public int addTempReading(final TempReading tempReading) {
        tempReadings = tempReadings.prepend(new TempReadingEntity(tempReadings.size(), tempReading.temp));
        return tempReadings.size();
    }

    public List<TempReading> getTempReadings() {
        return this.tempReadings.map(TempReadingEntity::toTempReading);
    }
}
