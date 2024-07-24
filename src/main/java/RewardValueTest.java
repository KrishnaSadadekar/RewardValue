import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class RewardValueTest {

    @Test
    public void testCashConstructor() {
        RewardValue rewardValue = new RewardValue(100.0);
        assertEquals(100.0, rewardValue.getCashValue(), 0.001);
        assertEquals(100.0 / 0.0035, rewardValue.getMilesValue(), 0.001);
    }

    @Test
    public void testMilesConstructor() {
        RewardValue rewardValue = new RewardValue(1000);
        assertEquals(1000 * 0.0035, rewardValue.getCashValue(), 0.001);
        assertEquals(1000, rewardValue.getMilesValue(), 0.001);
    }

    @Test
    public void testGetCashValue() {
        RewardValue rewardValue = new RewardValue(500.0);
        assertEquals(500.0, rewardValue.getCashValue(), 0.001);
    }

    @Test
    public void testGetMilesValue() {
        RewardValue rewardValue = new RewardValue(2000);
        assertEquals(2000, rewardValue.getMilesValue(), 0.001);
    }

    @Test
    public void testZeroCashValue() {
        RewardValue rewardValue = new RewardValue(0.0);
        assertEquals(0.0, rewardValue.getCashValue(), 0.001);
        assertEquals(0.0, rewardValue.getMilesValue(), 0.001);
    }

    @Test
    public void testZeroMilesValue() {
        RewardValue rewardValue = new RewardValue(0);
        assertEquals(0.0, rewardValue.getCashValue(), 0.001);
        assertEquals(0.0, rewardValue.getMilesValue(), 0.001);
    }

    @Test
    public void testNegativeCashValue() {
        RewardValue rewardValue = new RewardValue(-100.0);
        assertEquals(-100.0, rewardValue.getCashValue(), 0.001);
        assertEquals(-100.0 / 0.0035, rewardValue.getMilesValue(), 0.001);
    }

    @Test
    public void testNegativeMilesValue() {
        RewardValue rewardValue = new RewardValue(-1000);
        assertEquals(-1000 * 0.0035, rewardValue.getCashValue(), 0.001);
        assertEquals(-1000, rewardValue.getMilesValue(), 0.001);
    }

}
