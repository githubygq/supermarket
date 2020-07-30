package newWay;

import java.util.List;

public class PromotionPlusChargeWay extends ChargeWay {
    @Override
    boolean isInScope(List<Goods> goods) {
        return (getTotal(goods)>1000)&&(super.isAllPromotion(goods));
    }

    @Override
    int getCount(List<Goods> goods) {
        int result=0;
        int price=0;
        for (Goods good:goods) {
            if(price>=1000){
                result+=good.getPrice();
            }else {
                if(price+good.getPrice()>1000){
                    result+=(1000-price)*2+(good.getPrice()+price-1000);
                }else {
                    result+=good.getPrice()*2;
                }
            }
            price+=good.getPrice();
        }
        return result;
    }

    int getTotal(List<Goods> goods){
        int result=0;
        for (Goods good:goods) {
            result+=good.getPrice();
        }
        return result;
    }


}
