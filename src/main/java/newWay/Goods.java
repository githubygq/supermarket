package newWay;

public class Goods {
    int price;
    GoodsType goodsType;

    public Goods(int price, GoodsType goodsType) {
        this.price = price;
        this.goodsType = goodsType;
    }

    public int getPrice() {
        return price;
    }

    public GoodsType getGoodsType() {
        return goodsType;
    }
}
