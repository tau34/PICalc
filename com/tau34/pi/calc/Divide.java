package com.tau34.pi.calc;

import com.tau34.pi.Main;

import java.math.BigDecimal;
import java.math.RoundingMode;

public class Divide {
    public static BigDecimal Calc(BigDecimal m, BigDecimal n) {
        return m.divide(n, Main.digit, RoundingMode.HALF_UP);
    }
}
