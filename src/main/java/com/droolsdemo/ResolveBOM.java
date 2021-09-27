package com.droolsdemo;

public class ResolveBOM {
    private boolean result = false;
    private SVR svr;

    public ResolveBOM(SVR svr) {
        this.svr = svr;
    }

    public void setResult() {
        this.result = true;
    }

    public boolean getResult() {
       return this.result;
    }

    public SVR getSvr() {return this.svr;}


}
