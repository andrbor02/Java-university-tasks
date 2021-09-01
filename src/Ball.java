public class Ball {
    private double radius;
    private double weight;
    String typ = "default";
    private enum type{
        FOOTBALL,
        BASKETBALL,
        VOLLEYBALL
    }

    public Ball() {
        weight = 0;
        radius = 0;
    }

    public Ball(double radius) {
        weight = 0;
        this.radius = radius;
    }

    public Ball(int weight) {
        this.weight = weight;
        radius = 0;
    }

    public Ball(double radius, int weight) {
        this.radius = radius;
        this.weight = weight;
    }

    public void whatType() {
        if (weight > 330 && weight < 567 && radius > 93 && radius < 120) {
            this.typ = String.valueOf(type.BASKETBALL);
        }

        if (weight > 410 && weight < 450 && radius > 108 && radius < 111) {
            this.typ = String.valueOf(type.FOOTBALL);
        }

        if (weight > 260 && weight < 280 && radius > 104 && radius < 107) {
            this.typ = String.valueOf(type.VOLLEYBALL);
        }
    }

    @Override
    public String toString() {
        return "Ball{" +
                "radius=" + radius +
                ", weight=" + weight +
                ", type=" + typ +
                '}';
    }
}
