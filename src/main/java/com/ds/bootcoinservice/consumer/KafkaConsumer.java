package com.ds.bootcoinservice.consumer;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Component;

@Component
public class KafkaConsumer {

  private static final Logger log = LoggerFactory.getLogger(KafkaConsumer.class);


  @KafkaListener(topics = "bootcoin-request", groupId = "group_id")
  public void consume(String message){
    log.info("Consuming message ", message);
  }

}
