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
}
