package com.logback;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class LogbackMain {

    public static void main(String[] args){
        String logMessage = "username : kumar password: pass";
        log.info("Log message : "+logMessage);

    }
}
