package pl.rw.demo.sensorhub.conf;

import org.springframework.amqp.support.converter.Jackson2JsonMessageConverter;
import org.springframework.amqp.support.converter.MessageConverter;
import org.springframework.amqp.support.converter.SerializerMessageConverter;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class RabbitMqSimpleConfig {

    // from JsonObj
    @Bean
    public MessageConverter messageConverter() {
        return new Jackson2JsonMessageConverter();
    }

    // from SerializedObj
    /*@Bean
    public MessageConverter messageConverter() {
        return new SerializerMessageConverter();
    }*/
    /*
    * In the code snippet you have registered jsonMessageConverter and at the same time
    * you are making your Person.java serializable. You should either use
    * serialization or the json approach. Moreover the problem lies
    * in the package structure of Person.java. I encountered the same problem,
    * resolved it by taking same package structure for the object being transferred
    * in producer and consumer. The reason behind this is that while serialization,
    * java takes class name , package structure and other information into account,
    * so at the consumer side we need to have the same package structure.
    * I encountered the same problem while using jsonMessageConverter.
    * So from my viewpoint the solution to this problem is to package
    * your message objects into a jar and add that jar as a dependency
    * in your producer and consumer project.
    * */
}
