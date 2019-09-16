package BigDecimal;

import java.math.BigDecimal;

public class BigDecimalTest {
    public static void main(String[] args) {
        System.out.println(0.05);
        System.out.println(0.06-0.05-0.01);
        BigDecimal num1=new BigDecimal(0.1);
        BigDecimal num2=new BigDecimal(0.1);
        System.out.println(num2.compareTo(num1));
        BigDecimal num3=new BigDecimal(-12);
        System.out.println(num3.abs());
    }
}
