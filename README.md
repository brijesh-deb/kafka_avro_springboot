# kafka_avro_springboot
Sample of Kafka with Avro and Springboot
## Producer
- Avro schema for User(user.avsc) is under resources/avro
- To generate corresponding Java file (User.java) use command: 
  - *mvn generate-sources*
## Consumer
- Once avro message is pushed into the topic, the message shows up in Eclipse console
## Run the sample
- Run Producer and Consumer as separate applications
- First run Producer and push message to kafka using PostMan: localhost:9000/kafka/publish7
- Then run Consumer, the message will show up in console.
