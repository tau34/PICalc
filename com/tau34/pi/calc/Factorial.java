package com.tau34.pi.calc;

import java.math.BigDecimal;
import java.math.BigInteger;

public class Factorial {
    public static BigDecimal Calc(int n) {
        BigInteger[] list = new BigInteger[n - 1];
        for (int i = 2; i <= n; ++i) {
            list[i - 2] = new BigInteger(String.valueOf(i));
        }
        return new BigDecimal(multiply(list));
    }

    private static BigInteger multiply(BigInteger[] k) {
        if (k.length == 1) {
            return k[0];
        } else if (k.length == 2) {
            return k[0].multiply(k[1]);
        }

        BigInteger[] k1 = new BigInteger[(int) Math.ceil(k.length / 2d)];
        BigInteger[] k2 = new BigInteger[(int) Math.floor(k.length / 2d)];
        boolean d = true;
        int i1 = 0;
        int i2 = 0;

        for (int i = 0; i < k.length; ++i) {
            if (d) {
                k1[i1] = k[i];
                i1++;
            } else {
                k2[i2] = k[i];
                i2++;
            }
            d = !d;
        }

        return multiply(new BigInteger[]{
                multiply(k1),
                multiply(k2)
        });
    }
}
