package stringformat;

public class Test {
    public static void main(String[] args) {
        double l = 99.45;
        System.out.printf("%+f\n",l);
        System.out.printf("%-3d\n",10);
        System.out.printf("%,f\n",99999.22);
        System.out.printf("%f和%<3.2f",l);
    }
}
