package com.logback;

import ch.qos.logback.classic.PatternLayout;
import ch.qos.logback.classic.spi.ILoggingEvent;
import lombok.Data;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

@Data
public class MaskingPatternLayout extends PatternLayout {

    private String patternsProperty;
    private String mask;

    @Override
    public String doLayout(ILoggingEvent event){

        String message = super.doLayout(event);

        if(patternsProperty != null){
            String[] patterns = patternsProperty.split("\\|");
            for (int i = 0; i < patterns.length; i++) {
                Pattern pattern = Pattern.compile(patterns[i]);

                Matcher matcher = pattern.matcher(message);
                if (matcher.find()) {
                    message = matcher.replaceAll(mask);
                }
            }
        } else {

        }
        return message;
    }


}
