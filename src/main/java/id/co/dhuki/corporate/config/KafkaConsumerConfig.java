package id.co.dhuki.corporate.config;

import id.co.dhuki.corporate.commonCons.KafkaConfigCons;
import org.apache.kafka.common.serialization.StringDeserializer;
import org.apache.kafka.common.serialization.StringSerializer;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.kafka.annotation.EnableKafka;
import org.springframework.kafka.config.ConcurrentKafkaListenerContainerFactory;
import org.springframework.kafka.core.ConsumerFactory;
import org.springframework.kafka.core.DefaultKafkaConsumerFactory;

import java.util.HashMap;
import java.util.Map;

@EnableKafka
@Configuration
public class KafkaConsumerConfig {

    @Bean
    public ConsumerFactory<String, String> consumerFactory() {
        Map<String, Object> props = new HashMap<String, Object>();

        props.put(KafkaConfigCons.BOOTSTRAP_SERVER_CONFIG, KafkaConfigCons.BOOTSTRAP_ADDRESS);
        props.put(KafkaConfigCons.GROUP_ID_CONFIG, KafkaConfigCons.GROUP_ID_ADDRESS);
        props.put(KafkaConfigCons.KEY_DESERIALIZER_CONFIG, KafkaConfigCons.KEY_DESERIALIZER_ADDRESS);
        props.put(KafkaConfigCons.VALUE_DESERIALIZER_CONFIG, KafkaConfigCons.VALUE_DESERIALIZER_ADDRESS);

        return new DefaultKafkaConsumerFactory<String, String>(props);
    }

    @Bean
    public ConcurrentKafkaListenerContainerFactory<String, String> kafkaListenerContainerFactory() {
        ConcurrentKafkaListenerContainerFactory<String, String> factory = new ConcurrentKafkaListenerContainerFactory<String, String>();
        factory.setConsumerFactory(consumerFactory());

        return factory;
    }
}
