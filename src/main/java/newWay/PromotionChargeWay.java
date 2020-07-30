package newWay;

import java.util.List;

public class PromotionChargeWay extends ChargeWay {
    @Override
    boolean isInScope(List<Goods> goods) {
        return super.isContionsPromotion(goods);
    }

    @Override
    int getCount(List<Goods> goods) {
        int result=0;
        for (Goods good:goods) {
            if(super.isPromotion(good)){
                result+=good.getPrice()*2;
            }else {
                result+=good.getPrice();
            }
        }
        return result;
    }
}
