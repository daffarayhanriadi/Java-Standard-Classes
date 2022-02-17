package daffa.belajarjava.application;

import java.math.BigDecimal;
import java.math.BigInteger;

public class BigNumberApp {
    public static void main(String[] args) {

        // Numerik biasa (tidak memiliki koma)
        BigInteger a = new BigInteger("1000000000000000000") ;
        BigInteger b = new BigInteger("1000000000000000000") ;

        BigInteger c = a.add(b);
        System.out.println(c);

        // Decimal (memiliki koma)
        BigDecimal d = new BigDecimal("10.00000");
        BigDecimal e = new BigDecimal("1000.000");

        BigDecimal f = d.add(e);
        System.out.println(f);


    }
}
