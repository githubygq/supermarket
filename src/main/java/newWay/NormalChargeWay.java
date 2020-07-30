package newWay;

import java.util.List;

public class NormalChargeWay extends ChargeWay {
    @Override
    boolean isInScope(List<Goods> goods) {
        return !super.isContionsPromotion(goods);
    }

    @Override
    int getCount(List<Goods> goods) {
        int result=0;
        for (Goods good:goods) {
            result+=good.getPrice();
        }
        return result;
    }
}
