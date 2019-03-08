package com.logging;

import lombok.extern.slf4j.Slf4j;
import org.slf4j.MDC;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@Slf4j
public class Restcontroller {

    @GetMapping(value = "/log")
    public String loggingTest(){

        MDC.put("sessionId", "my-session-id");
        log.info("Before making call");
        String output = "test success";
        log.info("After making call");
        return output;

    }
}
