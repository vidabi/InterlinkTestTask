public class CoffeeMaker {

    public Coffee makeCoffee(ICoffeMachine coffeMachine) {
        System.out.println("Making coffe with machine: " + coffeMachine.getName());

        coffeMachine.fillCoffeeBeans();
        coffeMachine.fillWater();

        Coffee coffee = coffeMachine.makeCoffee();

        System.out.println("Coffee ready! volume: " + coffee.getVolume());
        System.out.println("Is with milk: " + coffee.isWithMilk());

        return coffee;
    }

    public Coffee makeLatteCoffee(ILateMachine coffeMachine) {
        System.out.println("Making coffe with machine: " + coffeMachine.getName());

        coffeMachine.fillCoffeeBeans();
        coffeMachine.fillWater();
        coffeMachine.steamMilk();

        Coffee coffee = coffeMachine.makeCoffee();

        System.out.println("Coffee ready! volume: " + coffee.getVolume());
        System.out.println("Is with milk: " + coffee.isWithMilk());

        return coffee;
    }
}
