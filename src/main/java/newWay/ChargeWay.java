package newWay;

import java.util.List;

public abstract class ChargeWay {
    abstract boolean isInScope(List<Goods> goods);
    abstract int getCount(List<Goods> goods);

     boolean isContionsPromotion(List<Goods> goods){
        for (Goods good:goods){
            if(isPromotion(good)){
                return true;
            }
        }
        return false;
    }
    boolean isAllPromotion(List<Goods> goods){
         boolean flag=true;
         for (Goods good:goods){
            if(!isPromotion(good)){
                flag=false;
            }
        }
        return flag;
    }
    boolean isPromotion(Goods goods){
        for (GoodsPromotion promotionGoods:GoodsPromotion.values()) {
            if((goods.getGoodsType().toString()).equals(promotionGoods.toString())){
                return true;
            }
        }
        return false;
    }

    int chargeCount(List<Goods> goods) {
        if (isInScope(goods)) {
            return getCount(goods);
        }
        return 0;
        //return goods.getPrice();
    }
}
