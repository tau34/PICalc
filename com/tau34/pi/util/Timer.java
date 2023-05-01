package com.tau34.pi.util;

public class Timer {
    private static long startTime;

    public static void start() {
        startTime = System.currentTimeMillis();
    }

    public static long end() {
        long endTime = System.currentTimeMillis();
        return endTime - startTime;
    }
}