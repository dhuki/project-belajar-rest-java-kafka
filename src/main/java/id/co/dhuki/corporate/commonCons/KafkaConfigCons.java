package id.co.dhuki.corporate.commonCons;

public class KafkaConfigCons {

    // Consumer config
    public static final String BOOTSTRAP_SERVER_CONFIG = "bootstrap.servers";
    public static final String BOOTSTRAP_ADDRESS = "localhost:9092";

    public static final String GROUP_ID_CONFIG = "group.id";
    public static final String GROUP_ID_ADDRESS = "group-id";

    public static final String KEY_DESERIALIZER_CONFIG = "key.deserializer";
    public static final String KEY_DESERIALIZER_ADDRESS = "org.apache.kafka.common.serialization.StringDeserializer";

    public static final String VALUE_DESERIALIZER_CONFIG = "value.deserializer";
    public static final String VALUE_DESERIALIZER_ADDRESS = "org.apache.kafka.common.serialization.StringDeserializer";

}
