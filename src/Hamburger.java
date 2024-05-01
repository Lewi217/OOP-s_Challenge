class Hamburger {

    private String name;
    private String rollType;
    private String meat;
    private double price;

    public Hamburger(String name, String rollType, String meat, double price) {
        this.name = name;
        this.rollType = rollType;
        this.meat = meat;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getRollType() {
        return rollType;
    }

    public void setRollType(String rollType) {
        this.rollType = rollType;
    }

    public String getMeat() {
        return meat;
    }

    public void setMeat(String meat) {
        this.meat = meat;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    //Subclass representing a HealthyBurger
    class HealthyBurger extends Hamburger {
        private boolean hasLettuce;
        private boolean hasTomato;

        public HealthyBurger(String name, String rollType, String meat, double price, boolean hasLettuce, boolean hasTomato) {
            super(name, rollType, meat, price);
            this.hasLettuce = hasLettuce;
            this.hasTomato = hasTomato;
        }

        public boolean hasLettuce() {
            return hasLettuce;
        }

        public boolean hasTomato() {
            return hasTomato;
        }
    }

    //Subclass representing a DeluxeBurger
    class DeluxeBurger extends Hamburger {
        private boolean chipsIncluded;
        private boolean drinksIncluded;

        public DeluxeBurger(String name, String rollType, String meat, double price, boolean chipsIncluded, boolean drinksIncluded) {
            super(name, rollType, meat, price);
            this.chipsIncluded = chipsIncluded;
            this.drinksIncluded = drinksIncluded;
        }

        @Override
        public void setName(String name) {
            super.setName(name);
        }

        @Override
        public void setPrice(double price) {
            super.setPrice(price);
        }

        @Override
        public double getPrice() {
            double basePrice = super.getPrice();
            if (chipsIncluded && drinksIncluded) {
                return basePrice;
            } else {
                System.out.println("Error: Deluxe Hamburger must include chips and drinks.");
                return -1; // Error code indicating missing additions
            }
        }
    }
}
