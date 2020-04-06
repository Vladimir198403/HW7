public class Plate {
    private int food;

    public Plate(int food) {
        this.food = food;
    }

    public void info() {
        System.out.println(this);
    }

    public int getFood() {
        return food;
    }

    public void AddFood(int foodCount) {
        this.food += foodCount;
    }

    public void decreaseFood(int foodCount) {
        this.food -= foodCount;
    }

    @Override
    public String toString() {
        return "Plate{" +
                "food=" + food +
                '}';
    }

    public boolean isFoodEnough(int foodCount) {
        return getFood() >= foodCount;
    }
}
