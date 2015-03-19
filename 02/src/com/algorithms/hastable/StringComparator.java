package com.algorithms.hastable;

import org.apache.commons.lang3.StringUtils;

/**
 * Created by sharmi on 3/18/15.
 */
public class StringComparator implements java.util.Comparator<String> {

    @Override
    public int compare(String o1, String o2) {
        return (o1.compareTo(o2));
    }
}
