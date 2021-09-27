package com.droolsdemo;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ECADBOM {
    private String bomUID;
    private String bomUsage;

    public ECADBOM(String bomUID, String bomUsage){
        this.bomUID = bomUID;
        this.bomUsage = bomUsage;
    }

    public String getBomUID() {
        return bomUID;
    }

    public void setBomUID(String bomUID) {
        this.bomUID = bomUID;
    }

    public String getBomUsage() {
        return bomUsage;
    }

    public void setBomUsage(String bomUsage) {
        this.bomUsage = bomUsage;
    }

    public String getFormatUsage() {

        String bomUsageTemp = bomUsage
                .replaceAll("[a-zA-Z0-9\\-]+:","")
                .replaceAll("and","&&")
                .replaceAll("or","||")
                .replaceAll("(?=[^!])=","==");
        Pattern pattern = Pattern.compile("([a-zA-Z0-9][a-zA-Z0-9\\-\\s]+)(?=[=|!])");
        Matcher matcher = pattern.matcher(bomUsageTemp);
        StringBuffer result = new StringBuffer();
        while (matcher.find()) {
            matcher.appendReplacement(result, "svr.getOption(\""+matcher.group(1).trim()+"\")");
        }
        matcher.appendTail(result);
        return result.toString();
    }
}
