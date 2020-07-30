package newWay;

import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class CalculatorTest {
    @Test
    public void should_return_110count_when_calculate_given_goods_price_110(){
        //given
        List<ChargeWay> chargeWays = Arrays.asList(new NormalChargeWay());
        Goods washingliquid = new Goods( 110,GoodsType.WASHINGLIQUID);
        List<Goods> goods = new ArrayList<>();
        goods.add(washingliquid);
        Calculator calculator = new Calculator();
        //when
        int count = calculator.calculate(goods,chargeWays);
        //then
        assertThat(count, is(110));
    }

    @Test
    public void should_return_100count_when_calculate_given_goods_apple10_watermelon30_washingliquid20(){
        //given
        List<ChargeWay> chargeWays = Arrays.asList(new PromotionChargeWay());
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

    @Test
    public void should_return_1067count_when_calculate_given_fridge2350() {
        //given
        List<ChargeWay> chargeWays = Arrays.asList(new NormalPlusChargeWay());
        Goods fridge = new Goods( 2350,GoodsType.FRIDGE);
        List<Goods> goods = new ArrayList<>();
        goods.add(fridge);
        Calculator calculator = new Calculator();
        //when
        int count = calculator.calculate(goods,chargeWays);
        //then
        assertThat(count, is(1067));
    }

    @Test
    public void should_return_3000count_when_calculate_given_tv2000() {
        //given
        List<ChargeWay> chargeWays = Arrays.asList(new PromotionPlusChargeWay());
        Goods tv = new Goods( 2000,GoodsType.TV);
        List<Goods> goods = new ArrayList<>();
        goods.add(tv);
        Calculator calculator = new Calculator();
        //when
        int count = calculator.calculate(goods,chargeWays);
        //then
        assertThat(count, is(3000));
    }

    @Test
    public void should_return_1890count_when_calculate_given_tv800_2350() {
        //given
        List<ChargeWay> chargeWays = Arrays.asList(new MixChargeWay());
        Goods tv = new Goods( 800,GoodsType.TV);
        Goods washingmachine = new Goods( 2000,GoodsType.WASHINGMACHINE);
        List<Goods> goods = new ArrayList<>();
        goods.add(tv);
        goods.add(washingmachine);
        Calculator calculator = new Calculator();
        //when
        int count = calculator.calculate(goods,chargeWays);
        //then
        assertThat(count, is(1890));
    }

}
