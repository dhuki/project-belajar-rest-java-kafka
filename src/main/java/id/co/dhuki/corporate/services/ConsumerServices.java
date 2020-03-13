package id.co.dhuki.corporate.services;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.messaging.handler.annotation.Payload;
import org.springframework.stereotype.Service;

@Service
public class ConsumerServices {

    private static final Logger LOG = LoggerFactory.getLogger(ConsumerServices.class);

    @KafkaListener(topics = "hello-cruel-world", groupId = "group-id")
    public void listen(String message) {
        LOG.info("Received Message : " + message);
    }

}
