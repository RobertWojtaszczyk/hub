package pl.rw.demo.sensorhub.queue;

import org.apache.kafka.clients.consumer.ConsumerRecord;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Component;
import pl.rw.demo.sensorhub.domain.NewTempReading;
import pl.rw.demo.sensorhub.domain.TempReading;

@Component
public class ReceiveKafka {

    @KafkaListener(topics="sensors.temperature.topic2")
    public void handle(TempReading temp, ConsumerRecord<String, TempReading> record) {
        System.out.println("Message form Kafka: " + temp.toString());
        System.out.println("From partition: " + record.partition() + " ; Timestamp: " + record.timestamp());
    }

}
