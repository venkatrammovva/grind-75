package sol_004_buy_and_sell_stock;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BuyAndSellStockTest {

    BuyAndSellStock buyAndSellStock = new BuyAndSellStock();

    @Test
    public void test1() {
        Assertions.assertEquals(5, buyAndSellStock.maxProfit(new int[]{7,1,5,3,6,4}));
        Assertions.assertEquals(0, buyAndSellStock.maxProfit(new int[]{7,6,4,3,1}));
    }

}