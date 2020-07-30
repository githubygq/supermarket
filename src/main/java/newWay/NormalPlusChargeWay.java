package newWay;

import java.util.List;

public class NormalPlusChargeWay extends ChargeWay{
    @Override
    boolean isInScope(List<Goods> goods) {
        return (getTotal(goods)>1000)&&(!super.isContionsPromotion(goods));
    }

    @Override
    int getCount(List<Goods> goods) {
        int result = getTotal(goods);
        result=1000+(result-1000)/20;
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
