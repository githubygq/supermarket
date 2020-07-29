import java.math.BigDecimal;

public class Goods {
    private int price;
    private GoodsType goodsType;

    public Goods(int price,GoodsType goodsType) {
        this.price = price;
        this.goodsType = goodsType;
    }

    public int  getPrice() {
        return price;
    }

    public GoodsType getGoodsType() {
        return goodsType;
    }
}
