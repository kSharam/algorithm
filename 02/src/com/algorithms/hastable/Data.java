package com.algorithms.hastable;

/**
 * Created by sharmi on 3/15/15.
 */
public class Data {

    public Data(String key, int count) {
        this.key = key;
        this.count = count;
    }

    private String key;
    private int count;

    public String getKey() {
        return key;
    }

    public int getCount() {
        return count;
    }
}
