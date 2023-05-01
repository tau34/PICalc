package com.tau34.pi.calc;

import com.tau34.pi.Main;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.math.RoundingMode;

public class Sqrt {
    public static BigDecimal Calc(BigDecimal n) {
        return Square(n, new BigDecimal(1), new BigDecimal(1), Main.logDigit * 4);
    }

    private static BigDecimal Square(BigDecimal j, BigDecimal k, BigDecimal l, int residue) {
        if (residue == 0) {
            return k.divide(l, Main.digit, RoundingMode.HALF_UP);
        } else {
            BigDecimal m = Multiply.Calc(k, k).add(Multiply.Calc(Multiply.Calc(l, l), j));
            BigDecimal n = Multiply.Calc(Multiply.Calc(k, l), new BigDecimal(2));
            return Square(j, m, n, residue - 1);
        }
    }
}
