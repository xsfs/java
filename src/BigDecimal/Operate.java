package BigDecimal;

import java.math.BigDecimal;

public class Operate {
    public static void main(String[] args) {
        double x=12345678.901;
        double y=98765432.109;
        BigDecimal x1=new BigDecimal(x+"");
        BigDecimal y1=new BigDecimal(y+"");
        BigDecimal xAddy=x1.add(y1);
        BigDecimal xSuby=x1.subtract(y1);
        BigDecimal xMulty=x1.multiply(y1);
        //ROUND_HALF_UP 四舍五入
        BigDecimal xDivy=x1.divide(y1,BigDecimal.ROUND_HALF_UP);

        System.out.println(xAddy.doubleValue());
        System.out.println(xSuby.doubleValue());
        System.out.println(xMulty.doubleValue());
        System.out.println(xDivy.doubleValue());
    }
}
