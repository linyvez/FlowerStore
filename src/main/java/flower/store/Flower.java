package flower.store;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Setter @Getter @AllArgsConstructor @NoArgsConstructor
public class Flower {
    private double sepalLength;
    private FlowerColor color;
    private double price;
    private FlowerType flowerType;

    public Flower(Flower flower) {
        flowerType = flower.flowerType;
        sepalLength = flower.sepalLength;
        price = flower.price;
        color = flower.color;
    }

    public String getColor() {
        return color.toString();
    }

    public boolean matches(Flower other) {
        if (flowerType != other.flowerType ||
        sepalLength != other.sepalLength ||
        price != other.price ||
        color != other.color) {
            return false;
        }
        return true;
    }
}
