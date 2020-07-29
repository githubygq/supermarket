public class PromotionChargeWay extends ChargeWay {

    private final int DISCOUNT = 2;

    @Override
    boolean isInScope(Goods goods) {
        for (PromotionGoods promotionGoods:PromotionGoods.values()) {
            if((goods.getGoodsType().toString()).equals(promotionGoods.toString())){
                return true;
            }
        }
        return false;
    }

    @Override
    int getDefaultCount(Goods goods) {
        return goods.getPrice()*DISCOUNT;
    }
}
