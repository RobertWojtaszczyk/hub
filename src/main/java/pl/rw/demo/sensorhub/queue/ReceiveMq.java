package pl.rw.demo.sensorhub.queue;

import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.stereotype.Component;
import pl.rw.demo.sensorhub.domain.NewTempReading;

@Component
public class ReceiveMq {

    //private RabbitTemplate rabbitTemplate;

    /*public ReceiveMq(RabbitTemplate rabbitTemplate) {
        this.rabbitTemplate = rabbitTemplate;
    }*/

    @RabbitListener(queues = "sensor")
    public void readTemperature(NewTempReading temp) {
        // Object sensor = rabbitTemplate.receiveAndConvert("sensor");
        System.out.println(temp.toString());
    }
}
