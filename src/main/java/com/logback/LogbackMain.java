package com.logback;

import lombok.extern.slf4j.Slf4j;
import lombok.var;
import org.springframework.util.StringUtils;

@Slf4j
public class LogbackMain {

    public static void main(String[] args){
//        String logMessage = "username : kumar password: pass";
//        String phrase = "{“name”:”kumar”,“city”:”ballwin”,“recepient”:{“address”:”line1”,“accountUri”:”pan:1234567891234567, exp:12/31,cvc:123”},“sender”:{“address”:”line1”,“accountUri”:”pan:1234567891234568, exp:12/32, cvc:123”}}";
        String logMessage = "{“name”:”kumar”,“city”:”ballwin”,“recepient”:{“address”:”line1”,“accountUri”:”pan:1234567891234567, exp:12/31,cvc:123”},“sender”:{“address”:”line1”,“accountUri”:”pan:1234567891234568, exp:12/32, cvc:123”}}";
//        String word = "pan:";
//        int startIndex = phrase.indexOf(word) + word.length();
//        String number = phrase.substring(phrase.indexOf(word) + word.length());
//        String[] strings = StringUtils.delimitedListToStringArray(phrase, ",");
//        String substringBetween = org.apache.commons.lang3.StringUtils.substringBetween(phrase, word);
//        String substringAfter = org.apache.commons.lang3.StringUtils.substringAfter(number, ",");
//        String substringBefore = org.apache.commons.lang3.StringUtils.substringBefore(number, ",");
//        System.out.println(number);
        log.info("Log message : "+logMessage);

    }
}
