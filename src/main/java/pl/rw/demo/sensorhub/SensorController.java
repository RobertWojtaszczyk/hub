package pl.rw.demo.sensorhub;

import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/demo")
public class SensorController {

    private TempReadingService tempReadingService = new TempReadingService();

    @PostMapping(path = "/temp", produces = MediaType.APPLICATION_JSON_VALUE, consumes = MediaType.APPLICATION_JSON_VALUE)
    public int newTemperatureReading(@RequestBody TempReading tempReading) {
        return this.tempReadingService.addTempReading(tempReading);
    }

    @GetMapping(path = "/temp", produces = MediaType.APPLICATION_JSON_VALUE)
    public List<TempReading> getTempReadings() {
        return this.tempReadingService.getTempReadings().toJavaList();
    }
}
