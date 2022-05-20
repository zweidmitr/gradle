package com.zwei.util;

public class StringUtils {
    public static final String EMPTY = "";

    public static String trim(String value) {
        return value == null ? EMPTY : value.trim();
    }
}
