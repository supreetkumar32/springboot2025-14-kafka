using kafka for deliveryboy and enduser
download kafka version 3.9.2

extract it and put it in C

Edit config file:
In C:\kafka\config\kraft\server.properties
change logs.dirs= C:\kakfa\logs

also in reconfig-server.properties
change logs.dirs= C:\kakfa\logs

run command to generate UUID
C:\kafka\bin\windows>kafka-storage.bat random-uuid

C:\kafka\bin\windows>kafka-storage.bat format -t yKBamh9sTOS9tLbww4yy-Q -c C:\kafka\config\kraft\server.properties

C:\kafka\bin\windows>kafka-server-start.bat C:\kafka\config\kraft\server.properties

in the new terminal
C:\kafka\bin\windows>kafka-topics.bat --create --topic test --bootstrap-server localhost:9092 --partitions 1 --replication-factor 1

C:\kafka\bin\windows>kafka-console-producer.bat --topic test --bootstrap-server localhost:9092

in another new terminal

C:\kafka\bin\windows>kafka-console-consumer.bat --topic test --from-beginning --bootstrap-server localhost:9092