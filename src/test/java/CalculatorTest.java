import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class CalculatorTest {
    @Test
    public void should_return_100count_when_calculate_given_goods_price_100() {
        //given
        Goods goods = new Goods( 100);
        Calculator calculator = new Calculator();

        //when
        int count = calculator.calculate(goods);

        //then
        assertThat(count, is(100));
    }
}
