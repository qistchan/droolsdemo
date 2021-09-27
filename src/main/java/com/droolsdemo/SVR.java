package com.droolsdemo;

import java.util.Map;

public class SVR {
    private final Map<String, String> optionList;
    private String svrID;
    private String svrVer;

    public SVR(String svrID, String svrVer, Map<String, String> optionList) {
        this.svrID = svrID;
        this.svrVer = svrVer;
        this.optionList = optionList;
    }

    public String getOption(String optionName) {
        return this.optionList.getOrDefault(optionName, "NULL");
    }

    public String getSvrID() {return this.svrID;}
    public String getSvrVer() {return this.svrVer;}
}
