package com.wmli.system.api.kafka;

import com.fasterxml.jackson.databind.util.JSONPObject;
import lombok.extern.slf4j.Slf4j;
import org.apache.kafka.clients.consumer.ConsumerConfig;
import org.apache.kafka.clients.consumer.ConsumerRecords;
import org.apache.kafka.clients.consumer.KafkaConsumer;
import org.apache.log4j.Level;
import org.apache.log4j.Logger;

import java.time.Duration;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/**
 * kafka消费者
 *
 * @author yingmuhuadao
 * @version 1.0.0
 * @date 2020/10/13 13:36
 */
@Slf4j
public class ConsumerUtil {
    public void consumer(){
        Map<String,String> config = new HashMap<>(4);
        config.put("bootstrap.servers","10.0.21.77:9092");
        config.put("group.id","wmli");
        config.put("key.deserializer", "org.apache.kafka.common.serialization.StringDeserializer");
        config.put("value.deserializer", "org.apache.kafka.common.serialization.StringDeserializer");
        config.put(ConsumerConfig.ENABLE_AUTO_COMMIT_CONFIG,"false");

        KafkaConsumer consumer = new KafkaConsumer(config);

        consumer.subscribe(Arrays.asList("test"));
        while (true) {
            ConsumerRecords record = consumer.poll(Duration.ofSeconds(1000));

            Iterator iterator = record.iterator();

            while (iterator.hasNext()){
                Object next = iterator.next();
                log.info(">>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>"+ next);

                consumer.commitAsync();
            }
//            consumer.committed()
        }
    }
}
