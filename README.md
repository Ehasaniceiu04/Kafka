# Kafka
Apache Kafka Installation and administration

<b>Download Apache kafka from the following link</b> <br/>
https://www.apache.org/dyn/closer.cgi?path=/kafka/0.11.0.1/kafka_2.11-0.11.0.1.tgz

Or <b>From Linux terminal, you can download the following command</b> <br/>
wget http://www-eu.apache.org/dist/kafka/0.11.0.1/kafka_2.11-0.11.0.1.tgz

<b> Unzip the downloaded file </b> <br/>
tar -xzf kafka_2.11-0.11.0.1.tgz

<b>and enter into the unzip folder </b>  <br/>
cd kafka_2.11-0.11.0.1

<b> Run zookeeper </b> <br/>
  bin/zookeeper-server-start.sh config/zookeeper.properties
  
  <b> Run Kafka server </b> <br/>
  bin/kafka-server-start.sh config/server.properties
  
  <b> Create Topics </b> <br/>
 bin/kafka-topics.sh --create --zookeeper localhost:2181 --replication-factor 1 --partitions 1 --topic test
 
 <b> Published messages </b> <br/>
 bin/kafka-console-producer.sh --broker-list localhost:9092 --topic test
 
 <b> Run consumer </b> <br/>
bin/kafka-console-consumer.sh --bootstrap-server localhost:9092 --topic test --from-beginning
 
 
 
 
 
  
  


