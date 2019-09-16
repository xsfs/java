package BigDecimal;

import java.math.BigDecimal;

public class Initialize {
    //新建时注意以String格式输入，否则仍然存在精度问题
    public static void main(String[] args) {
        double num=12345678.901;
        BigDecimal num1=new BigDecimal(num);
        BigDecimal num2=new BigDecimal(num+"");
        BigDecimal num3=new BigDecimal(String.valueOf(num));
        BigDecimal num4=new BigDecimal(Double.toString(num));
        System.out.println(num1);
        System.out.println(num2);
        System.out.println(num3);
        System.out.println(num4);
    }
}
