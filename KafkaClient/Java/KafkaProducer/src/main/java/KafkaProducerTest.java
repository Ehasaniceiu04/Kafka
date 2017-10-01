import org.apache.kafka.clients.producer.KafkaProducer;
import org.apache.kafka.clients.producer.Producer;
import org.apache.kafka.clients.producer.ProducerRecord;
import org.apache.kafka.common.serialization.StringSerializer;

import java.util.Properties;
import org.apache.kafka.common.serialization.StringSerializer;


public class KafkaProducerTest {
    public static void main(String[] args) {
        Properties properties=new Properties();
        properties.setProperty("bootstrap.servers","127.0.0.1:9092");
        properties.setProperty("key.serializer", StringSerializer.class.getName());
        properties.setProperty("value.serializer",StringSerializer.class.getName());
        properties.setProperty("acks","1");
        properties.setProperty("retries","3");
        properties.setProperty("linger.ms","1");

        Producer<String,String> producer=new KafkaProducer<String, String>(properties);

       for(int i=0;i<1000;i++) {
           ProducerRecord<String, String> producerRecord = new ProducerRecord<String, String>("test", "3", "Message has index "+Integer.toString(i));
           producer.send(producerRecord);
       }
        producer.close();
    }
}
