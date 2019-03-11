package com.logback;

import org.apache.commons.lang3.StringUtils;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class TestMain {

    public static void main(String[] args){

        String patterns = "pan:|cvc:|exp:";
        String string = "{“name”:”kumar”,“city”:”ballwin”,“recepient”:{“address”:”line1”,“accountUri”:”pan:1234567891234567, exp:12/31,cvc:123”},“sender”:{“address”:”line1”,“accountUri”:”pan:1234567891234568, exp:12/32, cvc:123”}}";
        String[] split = patterns.split("\\|");
        for (int i = 0; i < split.length; i++) {

            Pattern pattern = Pattern.compile(split[i]);
            int startIndex = string.indexOf(pattern.pattern()) + pattern.pattern().length();
            String substring = string.substring(startIndex);
            String valueToMask = StringUtils.substringBefore(substring, ",");
            Matcher matcher = pattern.matcher(valueToMask);
            matcher.replaceAll("*****");
            System.out.println(string);
        }

    }
}
