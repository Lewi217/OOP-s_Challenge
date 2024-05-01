public class Main {
    public static void main(String[] args) {
        // Creating a basic hamburger
        Hamburger hamburger = new Hamburger("Basic Hamburger", "Wheat", "Beef", 6.05);

        // Creating a healthy burger
        Hamburger.HealthyBurger healthyBurger = hamburger.new HealthyBurger("Healthy Burger", "Wheat", "Beef", 9.99, true, true);

        // Creating a deluxe burger
        Hamburger.DeluxeBurger deluxeBurger = hamburger.new DeluxeBurger("Deluxe Burger", "Wheat", "Beef", 9.99, true, true);

        // Display additional name and price for Healthy Burger
        System.out.println("Healthy Burger: ");
        System.out.println("Additional Name: " + healthyBurger.getName());
        System.out.println("Additional Price: $" + (healthyBurger.getPrice() - hamburger.getPrice()));

        // Display additional name and price for Deluxe Burger
        System.out.println("\nDeluxe Burger: ");
        System.out.println("Additional Name: " + deluxeBurger.getName());
        System.out.println("Additional Price: $" + (deluxeBurger.getPrice() - hamburger.getPrice()));

        // Calculate and display grand final total for each burger
        double healthyBurgerTotal = hamburger.getPrice() + (healthyBurger.getPrice() - hamburger.getPrice());
        double deluxeBurgerTotal = hamburger.getPrice() + (deluxeBurger.getPrice() - hamburger.getPrice());
        System.out.println("\nGrand Final Total for Healthy Burger: $" + healthyBurgerTotal);
        System.out.println("Grand Final Total for Deluxe Burger: $" + deluxeBurgerTotal);
    }
}
