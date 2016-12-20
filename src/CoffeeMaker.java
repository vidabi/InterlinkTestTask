public class CoffeeMaker {

    public Coffee makeCoffee(ICoffeMachine coffeMachine) {
        System.out.println("Making coffe with machine: " + coffeMachine.getName());

        Coffee coffee = coffeMachine.makeCoffee();

        return coffee;
    }
}
