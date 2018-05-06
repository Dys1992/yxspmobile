package com.yxsp.mobile.entity;


public class MobileEntity {
    private long id;
    private String Mname;
    private String Mversion;
    private boolean Mibkn;
    private boolean Mibrw;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getMname() {
        return Mname;
    }

    public void setMname(String mname) {
        Mname = mname;
    }

    public String getMversion() {
        return Mversion;
    }

    public void setMversion(String mversion) {
        Mversion = mversion;
    }

    public boolean isMibkn() {
        return Mibkn;
    }

    public void setMibkn(boolean mibkn) {
        Mibkn = mibkn;
    }

    public boolean isMibrw() {
        return Mibrw;
    }

    public void setMibrw(boolean mibrw) {
        Mibrw = mibrw;
    }
}

