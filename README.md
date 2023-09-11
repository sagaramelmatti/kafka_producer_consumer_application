# kafka_producer_consumer_application

To Run the application follow below steps :  

1) Start Zookeper in windows:

   .\bin\windows\zookeeper-server-start.bat .\config\zookeeper.properties

2) Start Kafka in windows:

   .\bin\windows\kafka-server-start.bat .\config\server.properties

3) Create topic manually :

   .\bin\windows\kafka-topics.bat --bootstrap-server localhost:9092 --create --topic test --partitions 3 --replication-factor 1

4) Check Topic list :

   .\bin\windows\kafka-topics.bat --bootstrap-server localhost:9092 --list

5) Run Spring boot Producer Application
  
6) Run Spring boot Consumer  Application

7) Call Api using message in URL:

   http://localhost:9000/kafka/send/Hello World
   
9) Check message at consumer

    ![image](https://github.com/sagaramelmatti/kafka_producer_consumer_application/assets/20917824/1fa77258-d0d2-439f-83f9-6997b4d042b7)
