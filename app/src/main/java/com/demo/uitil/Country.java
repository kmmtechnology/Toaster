package com.demo.uitil;

/**
 * Created by DELL on 02-Feb-16.
 */
public class Country {
    private String name;
    private int flagId;

    public String getName() {
        return name;
    }

    public Country(int flagId, String name) {
        this.flagId = flagId;
        this.name = name;
    }

    public void setName(String name) {
        this.name = name;

    }

    public int getFlagId() {
        return flagId;
    }

        public void setFlagId(int flagId) {
        this.flagId = flagId;
    }
}
