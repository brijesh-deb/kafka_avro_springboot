# kafka_avro_springboot
Sample of Kafka with Avro and Springboot
## Producer
- Avro schema for User(user.avsc) is under resources/avro
- To generate corresponding Java file (User.java) use command: 
  - *mvn generate-sources*
## Consumer
- Once avro message is pushed into the topic, the message shows up in Eclipse console
## Run the sample
- Run kafka, this sample is tested with Confluent Kafka 6.2.0: 
    - *export CONFLUENT_HOME=[folder where confluent-6.2.0 is unzipped]
    - *export PATH=$CONFLUENT_HOME/bin:$PATH*
    - *confluent local services start*
- Run Producer and Consumer as separate SpringBoot applications
- First run Producer and push message to kafka using PostMan: localhost:9000/kafka/publish7
- Then run Consumer, the message will show up in console.
