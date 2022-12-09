package com.example.publisher.config;

import org.apache.kafka.clients.admin.NewTopic;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.kafka.config.TopicBuilder;

import static com.example.publisher.utils.Constants.TOPIC_1;
import static com.example.publisher.utils.Constants.TOPIC_2;

@Configuration
public class AppConfig {

    @Bean
    public NewTopic topic1() {
        return TopicBuilder.name(TOPIC_1).build();
    }

    @Bean
    public NewTopic topic2() {
        return TopicBuilder.name(TOPIC_2).build();
    }



//    // +++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++
//    // Json Producer
//    // +++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++
//    @Bean
//    public <T> ProducerFactory<String, T> producerFactory() {
//        Map<String, Object> configProps = new HashMap<>();
//
//        configProps.put(ProducerConfig.BOOTSTRAP_SERVERS_CONFIG, "localhost:9092");
//        configProps.put(ProducerConfig.ACKS_CONFIG, "all");
//        configProps.put(ProducerConfig.RETRIES_CONFIG, 3);
//        configProps.put(ProducerConfig.KEY_SERIALIZER_CLASS_CONFIG, StringSerializer.class);
//        configProps.put(ProducerConfig.VALUE_SERIALIZER_CLASS_CONFIG, JsonSerializer.class);
////        configProps.put(JsonDeserializer.TYPE_MAPPINGS, "user:com.example.consumertwo.User");
//
//
//        // **___ configure the following three settings for SSL Encryption ___**
//        //configProps.put(CommonClientConfigs.SECURITY_PROTOCOL_CONFIG, "SSL");
//        //configProps.put(SslConfigs.SSL_TRUSTSTORE_LOCATION_CONFIG, "/var/private/ssl/kafka.client.truststore.jks");
//        //configProps.put(SslConfigs.SSL_TRUSTSTORE_PASSWORD_CONFIG, "test1234");
//
//        // **___configure the following three settings for SSL Authentication ___**
//        //configProps.put(SslConfigs.SSL_KEYSTORE_LOCATION_CONFIG, "/var/private/ssl/kafka.client.keystore.jks");
//        //configProps.put(SslConfigs.SSL_KEYSTORE_PASSWORD_CONFIG, "test1234");
//        //configProps.put(SslConfigs.SSL_KEY_PASSWORD_CONFIG, "test1234");
//
//        return new DefaultKafkaProducerFactory<>(configProps);
//    }
//
//
//    @Primary
//    @Bean
//    public <T> KafkaTemplate<String, T> kafkaTemplate() {
//        return new KafkaTemplate<>(producerFactory());
//    }
//
//
//
//
//    // +++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++
//    // String Producer
//    // +++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++
//    @Bean
//    public ProducerFactory<String, String> producerStringFactory() {
//        Map<String, Object> configProps = new HashMap<>();
//
//        configProps.put(ProducerConfig.BOOTSTRAP_SERVERS_CONFIG, "localhost:9092");
//        configProps.put(ProducerConfig.ACKS_CONFIG, "all");
//        configProps.put(ProducerConfig.RETRIES_CONFIG, 3);
//        configProps.put(ProducerConfig.KEY_SERIALIZER_CLASS_CONFIG, StringSerializer.class);
//        configProps.put(ProducerConfig.VALUE_SERIALIZER_CLASS_CONFIG, StringSerializer.class);
//
//        // **___ configure the following three settings for SSL Encryption ___**
//        //configProps.put(CommonClientConfigs.SECURITY_PROTOCOL_CONFIG, "SSL");
//        //configProps.put(SslConfigs.SSL_TRUSTSTORE_LOCATION_CONFIG, "/var/private/ssl/kafka.client.truststore.jks");
//        //configProps.put(SslConfigs.SSL_TRUSTSTORE_PASSWORD_CONFIG, "test1234");
//
//        // **___configure the following three settings for SSL Authentication ___**
//        //configProps.put(SslConfigs.SSL_KEYSTORE_LOCATION_CONFIG, "/var/private/ssl/kafka.client.keystore.jks");
//        //configProps.put(SslConfigs.SSL_KEYSTORE_PASSWORD_CONFIG, "test1234");
//        //configProps.put(SslConfigs.SSL_KEY_PASSWORD_CONFIG, "test1234");
//
//        return new DefaultKafkaProducerFactory<>(configProps);
//    }
//
//
//    @Bean
//    public KafkaTemplate<String, String> kafkaStringTemplate() {
//        return new KafkaTemplate<>(producerStringFactory());
//    }
}
