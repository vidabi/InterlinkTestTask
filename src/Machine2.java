
public class Machine2 extends BaseMachine {
    @Override
    public void fillWater() {
        System.out.println("filling water");
    }

    @Override
    public void fillCoffeeBeans() {
        System.out.println("filling coffee beans");
    }

    @Override
    public int getModelNumber() {
        return 999;
    }

    @Override
    public String getName() {
        return "Machine2";
    }

    @Override
    public Coffee makeCoffee() {
        System.out.println("making coffee");

        boilingWater();
        millBeans();
        mixingComponents();

        Coffee coffee = new Coffee(200);

        return coffee;
    }

    private void mixingComponents() {
        System.out.println("mixing components");
    }

    private void millBeans() {
        System.out.println("milling beans");
    }
}
