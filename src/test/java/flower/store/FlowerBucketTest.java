package flower.store;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Assertions;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class FlowerBucketTest {
    private static final Random RANDOM_GENERATOR = new Random();
    private static final int MAX_QUANTITY = 1000;
    private static final int MAX_PRICE = 100;

    private FlowerBucket flowerBucket;

    @BeforeEach
    public void init() {
        flowerBucket = new FlowerBucket();
    }

    @Test
    public void testPrice() {
        int price = RANDOM_GENERATOR.nextInt(MAX_PRICE);
        int quantity = RANDOM_GENERATOR.nextInt(MAX_QUANTITY);
        Flower flower = new Flower();
        flower.setPrice(price);
        FlowerPack flowerPack = new FlowerPack(flower, quantity);
        flowerBucket.add(flowerPack);
        Assertions.assertEquals(price * quantity, flowerBucket.getPrice());
    }

    @Test
    public void testFlowerPacks() {
    List<FlowerPack> expectedFlowerPacks = new ArrayList<>();
    FlowerPack pack1 = new FlowerPack(new Flower(), 10);
    FlowerPack pack2 = new FlowerPack(new Flower(), 5);
    expectedFlowerPacks.add(pack1);
    expectedFlowerPacks.add(pack2);
    flowerBucket.setFlowerPacks(expectedFlowerPacks);
    List<FlowerPack> actualFlowerPacks = flowerBucket.getFlowerPacks();
    Assertions.assertEquals(expectedFlowerPacks, actualFlowerPacks);
    }
}
