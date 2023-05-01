package com.tau34.pi.calc;

import com.tau34.pi.Main;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.math.RoundingMode;

public class Multiply {
    public static BigDecimal Calc(BigDecimal m, BigDecimal n) {
        BigDecimal k = m.multiply(n);
        return k.setScale(Main.digit, RoundingMode.HALF_UP);
    }
}
