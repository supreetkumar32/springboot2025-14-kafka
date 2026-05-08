package com.enduser.enduser;

import org.springframework.context.annotation.Configuration;
import org.springframework.kafka.annotation.KafkaListener;

@Configuration
public class KafkaConfig {

    @KafkaListener(topics = AppConstants.LOCATION_UPODATE_TOPIC,groupId=AppConstants.GROUP_ID)
    public void updatedLoaction(String value){
        System.out.println(value);

    }
}
