package newWay;

import java.util.ArrayList;
import java.util.List;

public class MixChargeWay extends ChargeWay {
    @Override
    boolean isInScope(List<Goods> goods) {
        return super.isContionsPromotion(goods)&&(getTotal(goods)>1000&&(!isAllPromotion(goods)));
    }

    @Override
    int getCount(List<Goods> goods) {
        int price=0;
        int result=0;
        List<Goods> promotion=new ArrayList<>();
        List<Goods> normal=new ArrayList<>();
        for (Goods good:goods) {
            if(super.isPromotion(good)){
                promotion.add(good);
            }else {
                normal.add(good);
            }
        }
        for (Goods good:promotion) {
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
        for (Goods good:normal) {
            if(price>=1000){
                result+=good.getPrice()/20;
            }else {
                if(price+good.getPrice()>1000){
                    result+=(1000-price)+(good.getPrice()+price-1000)/20;
                }else {
                    result+=good.getPrice();
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
