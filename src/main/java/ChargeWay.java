public abstract class ChargeWay {

    abstract boolean isInScope(Goods goods);
    abstract int getDefaultCount(Goods goods);

    int chargeCount(Goods goods) {
        if (isInScope(goods)) {
            return getDefaultCount(goods);
        }
        return goods.getPrice();
    }
}
