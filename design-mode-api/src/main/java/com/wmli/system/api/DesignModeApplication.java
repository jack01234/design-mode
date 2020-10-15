package com.wmli.system.api;

import com.wmli.system.api.kafka.ConsumerUtil;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * 启动类
 *
 * @author: yingmuhuadao
 * @date: Created in 10:58 2018/11/30
 */
@RestController
@SpringBootApplication
public class DesignModeApplication {
    public static void main(String[] args) {
        SpringApplication.run(DesignModeApplication.class,args);

        ConsumerUtil consumerUtil = new ConsumerUtil();
        consumerUtil.consumer();
    }

    @GetMapping("/test")
    public List<Map<String,Object>> init(){
        Map<String,Object> m = new HashMap<>(3);
        m.put("id",1);
        m.put("setup","Did you hear about the two silk worms in a race?");
        m.put("punchline","It ended in a tie");

        Map<String,Object> m2 = new HashMap<>(3);
        m2.put("id",2);
        m2.put("setup","What happens to a frog\\'s car when it breaks down?");
        m2.put("punchline","It gets toad away");

        return Arrays.asList(m,m2);
    }
}
