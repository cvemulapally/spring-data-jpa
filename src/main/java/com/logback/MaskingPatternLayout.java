package com.logback;

import ch.qos.logback.classic.PatternLayout;
import ch.qos.logback.classic.spi.ILoggingEvent;
import lombok.Data;
import org.apache.commons.lang3.StringUtils;

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
                int startIndex = message.indexOf(pattern.pattern()) + pattern.pattern().length();
                String substring = message.substring(startIndex);
                String valueToMask = StringUtils.substringBefore(substring, ",");
                Pattern compile = Pattern.compile(valueToMask);
                Matcher matcher = compile.matcher(message);

                if (matcher.find()) {
                    message = matcher.replaceAll(mask);
                }
            }
        } else {

        }
        return message;
    }

}
