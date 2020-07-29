import java.math.BigDecimal;
import java.util.List;

public class Calculator {

    public int calculate(List<Goods> goods, List<ChargeWay> chargeWays){
        int result = 0;
        for (Goods g:goods) {
            for (ChargeWay chargeWay:chargeWays){
                result+=chargeWay.chargeCount(g);
            }
        }
        return result;
    }
}
