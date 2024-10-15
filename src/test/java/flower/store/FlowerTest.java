package flower.store;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.Random;

import org.junit.jupiter.api.Assertions;

public class FlowerTest {
    private static final Random RANDOM_GENERATOR = new Random();
    private static final int MAX_PRICE = 100;
    private Flower flower;

    @BeforeEach
    public void init() {
        flower = new Flower();
    }

    @Test
    public void testPrice() {
        int price = RANDOM_GENERATOR.nextInt(MAX_PRICE);
        flower.setPrice(price);
        Assertions.assertEquals(price, flower.getPrice());
    }

    @Test
    public void testColor() {
        FlowerColor color = FlowerColor.RED;
        flower.setColor(color);
        Assertions.assertEquals("#FF0000", flower.getColor());
    }

    @Test
    public void testMatches() {
        Flower other = new Flower(50, FlowerColor.BLUE, 100, FlowerType.CHAMOMILE);
        Flower flower = new Flower(50, FlowerColor.BLUE, 100, FlowerType.CHAMOMILE);
        Flower another = new Flower();
        Assertions.assertTrue(flower.matches(other));
        Assertions.assertFalse(flower.matches(another));
    }

    @Test
    public void testType() {
        FlowerType type = FlowerType.CHAMOMILE;
        flower.setFlowerType(type);
        Assertions.assertEquals(FlowerType.CHAMOMILE, flower.getFlowerType());
    }

    @Test
    public void testCopy() {
        flower.setFlowerType(FlowerType.ROSE);
        flower.setColor(FlowerColor.RED);
        flower.setPrice(100);
        flower.setSepalLength(50);
        Flower testFlower = new Flower(flower);
        Assertions.assertTrue(flower.matches(testFlower));
    }
}
