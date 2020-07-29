import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class CalculatorTest {

    List<ChargeWay> chargeWays = Arrays.asList(new PromotionChargeWay());
    @Test
    public void should_return_100count_when_calculate_given_goods_price_100() {
        //given
        Goods wl = new Goods( 100,GoodsType.WASHINGLIQUID);
        List<Goods> goods = new ArrayList<>();
        goods.add(wl);
        Calculator calculator = new Calculator();

        //when
        int count = calculator.calculate(goods,chargeWays);

        //then
        assertThat(count, is(100));
    }

    @Test
    public void should_return_100count_when_calculate_given_goods_promotion_apple_watermelon_and_notpromotion_washingliquid() {
        //given

        Goods apple = new Goods( 10,GoodsType.APPLE);
        Goods watermelon = new Goods( 30,GoodsType.WATERMELON);
        Goods washingliquid = new Goods( 20,GoodsType.WASHINGLIQUID);
        List<Goods> goods = new ArrayList<>();
        goods.add(apple);
        goods.add(watermelon);
        goods.add(washingliquid);
        Calculator calculator = new Calculator();

        //when
        int count = calculator.calculate(goods,chargeWays);

        //then
        assertThat(count, is(100));
    }


}
