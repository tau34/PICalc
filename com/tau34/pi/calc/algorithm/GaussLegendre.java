package com.tau34.pi.calc.algorithm;

import com.tau34.pi.Main;
import com.tau34.pi.calc.Divide;
import com.tau34.pi.calc.Multiply;
import com.tau34.pi.calc.Sqrt;

import java.math.BigDecimal;
import java.math.RoundingMode;

public class GaussLegendre {
    public static BigDecimal Calc() {
        BigDecimal a = new BigDecimal(1);
        BigDecimal b = Divide.Calc(Sqrt.Calc(new BigDecimal(2)), new BigDecimal(2));
        BigDecimal t = new BigDecimal("0.25");
        BigDecimal p = new BigDecimal(1);
        BigDecimal r = new BigDecimal(0);
        BigDecimal rn = new BigDecimal(3);
        for (int i = 0; r.compareTo(rn) != 0; ++i) {
            r = rn;
            BigDecimal an = Divide.Calc(a.add(b), new BigDecimal(2));
            BigDecimal bn = Sqrt.Calc(Multiply.Calc(a, b));
            BigDecimal tn = t.subtract(Multiply.Calc(Multiply.Calc(a.subtract(an), a.subtract(an)), p));
            BigDecimal pn = p.multiply(new BigDecimal(2));
            rn = Divide.Calc(Multiply.Calc(a.add(b), a.add(b)), t.multiply(new BigDecimal(4)));
            a = an;
            b = bn;
            t = tn;
            p = pn;
        }
        return rn;
    }
}
