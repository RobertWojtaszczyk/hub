package pl.rw.demo.sensorhub.controller;

import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;
import pl.rw.demo.sensorhub.domain.NewTempReading;
import pl.rw.demo.sensorhub.domain.TempReading;
import pl.rw.demo.sensorhub.service.TempReadingService;

import java.util.List;

@RestController
@RequestMapping("/demo")
public class SensorController {

    private TempReadingService tempReadingService = new TempReadingService();

    @PostMapping(path = "/temp", produces = MediaType.APPLICATION_JSON_VALUE, consumes = MediaType.APPLICATION_JSON_VALUE)
    public int newTemperatureReading(@RequestBody NewTempReading newTempReading) {
        return this.tempReadingService.addTempReading(newTempReading);
    }

    @GetMapping(path = "/temp", produces = MediaType.APPLICATION_JSON_VALUE)
    public List<TempReading> getTempReadings() {
        return this.tempReadingService.getTempReadings().toJavaList();
    }
}
