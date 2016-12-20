import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
        System.out.println("Hello World!");

        Machine1 mach1 = new Machine1();
        Machine2 mach2 = new Machine2();
        LateMachine lm = new LateMachine();

        CoffeeMaker man = new CoffeeMaker();

        ArrayList<ICoffeMachine> coffeMachines = new ArrayList<ICoffeMachine>();

        coffeMachines.add(mach1);
        coffeMachines.add(mach2);
        coffeMachines.add(lm);

        for (ICoffeMachine machine : coffeMachines) {
            machine.fillCoffeeBeans();
            machine.fillWater();
        }

        for (int i = 0; i < 15; i++) {
            for (ICoffeMachine machine : coffeMachines) {
                System.out.println("---------------------------------------------");
                Coffee coffee = man.makeCoffee(machine);
                if (coffee != null) {
                    System.out.println("Coffee ready! volume: " + coffee.getVolume());
                    System.out.println("Is with milk: " + coffee.isWithMilk());
                }else{
                    System.out.printf("Error! No coffee");
                }
            }
        }
        System.out.println("---------------------------------------------");
    }
}
