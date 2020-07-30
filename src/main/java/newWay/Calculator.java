package newWay;

import java.util.List;

public class Calculator {
    public int calculate(List<Goods> goods, List<ChargeWay> chargeWays){
        int result=0;
        for (ChargeWay chargeWay:chargeWays){
            result+=chargeWay.chargeCount(goods);
        }
        return result;
    }
}
