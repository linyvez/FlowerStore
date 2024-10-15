package flower.store;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import org.junit.jupiter.api.Assertions;

public class FlowerStoreTest {
    private Store store;

    @BeforeEach
    public void init() {
        store = new Store();
    }

    @Test
    public void testSearch() {
        Flower flower1 = new Flower(100, FlowerColor.BLUE, 50, FlowerType.TULIP);
        Flower flower2 = new Flower();
        List<Flower> allFlowers = new ArrayList<>();
        allFlowers.add(flower1);
        allFlowers.add(flower1);
        allFlowers.add(flower2);
        store.setFlowers(allFlowers);
        List<Flower> avaliable = new ArrayList<>();
        avaliable.add(flower1);
        avaliable.add(flower1);
        Assertions.assertEquals(avaliable, store.search(flower1));
    }

}
