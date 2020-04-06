

    public class Cat {
        private final String name;
        private int appetite;
        private boolean satiety;

        public Cat(String name, int appetit) {
            this.name = name;
            this.appetite = appetit;
        }

        public String getName() {
            return name;
        }

        public int getAppetite() {
            return appetite;
        }

        public void setAppetit() {
            this.appetite = appetite;
        }

        public boolean eat(Plate plate) {
            String validateMessage = checkEat(plate);
            if (validateMessage != null) {
                System.out.println(validateMessage);
                return false;
            }
            doEat(plate);
            satiety = true;
            return true;
        }

        private String checkEat(Plate plate) {
            if (!plate.isFoodEnough(appetite)) {
                return "Еды в миске не достаточно!";
            }
            if (satiety) {
                return "Кот уже сытый";
            }
            return null;
        }

        private void doEat(Plate plate) {
            plate.decreaseFood(appetite);
        }

        public boolean isSatiety() {
            return satiety;
        }
    }
