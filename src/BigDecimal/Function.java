package BigDecimal;

import java.math.BigDecimal;

public class Function {
    private static BigDecimal num1=new BigDecimal(123.231231+"");
    private static BigDecimal num2=new BigDecimal(234.21231+"");
    private static BigDecimal num3=new BigDecimal(12+"");
    private static BigDecimal num4=new BigDecimal(5+"");

    public static void main(String[] args) {
        //保留小数位数，舍入方式同divide
        BigDecimal setScale=num1.setScale(4,BigDecimal.ROUND_HALF_UP);
        System.out.println(setScale.doubleValue());

        //取余，%
        BigDecimal remainder=num3.remainder(num4);
        System.out.println(remainder.doubleValue());

        //求相反数，-xxx
        BigDecimal negate=num1.negate();
        System.out.println(negate.doubleValue());

        //比较
        /**
         * 将此 BigDecimal 与指定的 BigDecimal 比较
         * 根据此方法,值相等但具有不同标度的两个 BigDecimal 对象（如，2.0 和 2.00）被认为是相等的;
         * 相对六个 boolean 比较运算符 (<, ==, >, >=, !=, <=) 中每一个运算符的各个方法,优先提供此方法;
         * 建议使用以下语句执行上述比较：(x.compareTo(y) <op> 0), 其中 <op> 是六个比较运算符之一;
         *
         * 指定者：接口 Comparable<BigDecimal> 中的 compareTo
         * 返回：当此 BigDecimal 在数字上小于、等于或大于 val 时，返回 -1、0 或 1
         */
        if(num1.compareTo(num2)<0){
            System.out.println("小于");
        }
    }
}
