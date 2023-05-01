package com.tau34.pi;

import com.tau34.pi.calc.algorithm.GaussLegendre;
import com.tau34.pi.util.Timer;

public class Main {
    public static int digit = 100000 + 5;
    public static int logDigit = 6;
    public static void main(String[] args) {
        Timer.start();
        System.out.println(GaussLegendre.Calc());
        System.out.println(Timer.end() + "ms");
    }
}
