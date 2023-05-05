package Homework;

public class DeliveryV2 {

    public static int calculateRoutes(int customers){
        if(customers == 0){
            return 1;
        }
        return customers * calculateRoutes(customers - 1);
    }
    public static void main(String[] args) {
        int customers = 10;
        int routes = calculateRoutes((customers));
        System.out.println("You could have " + routes + "routes");
    }
}
