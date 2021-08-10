# kafka_avro_springboot
Sample of Kafka with Avro and Springboot
## Producer
- Avro schema for User(user.avsc) is under resources/avro
- To generate corresponding Java file (User.java) use command: 
  - *mvn generate-sources*
## Consumer
- Once avro message is pushed into the topic, the message shows up in Eclipse console
