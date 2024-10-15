package flower.store;

import java.util.ArrayList;
import java.util.List;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter @Setter @AllArgsConstructor @NoArgsConstructor
public class Store {
    private List<Flower> flowers;

    public List<Flower> search(Flower searchFlower) {
        List<Flower> avaliable = new ArrayList<>();
        for (Flower flower: flowers) {
            if (flower.matches(searchFlower)) {
                avaliable.add(flower);
            }
        }
        return avaliable;
    }
}
