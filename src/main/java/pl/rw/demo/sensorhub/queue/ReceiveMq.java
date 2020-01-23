package pl.rw.demo.sensorhub.queue;

import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.amqp.rabbit.core.RabbitTemplate;
import org.springframework.stereotype.Component;

@Component
public class ReceiveMq {

    private RabbitTemplate rabbitTemplate;

    public ReceiveMq(RabbitTemplate rabbitTemplate) {
        this.rabbitTemplate = rabbitTemplate;
    }

    @RabbitListener(queues = "sensor")
    public void readTemperature(String temp) {
        // Object sensor = rabbitTemplate.receiveAndConvert("sensor");
        System.out.println(temp.toString());
    }
}
