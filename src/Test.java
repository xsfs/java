import java.math.BigDecimal;
import java.util.Objects;

public class Test {

    private static void asd(BigDecimal num){
        if(Objects.isNull(num)){
            System.out.println("1212");
        }else {
            System.out.println("23");
        }
    }
    public static void main(String[] args) {
        asd(new BigDecimal(12));

    }
}
