
public class Machine1 extends BaseMachine {
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
        return 123;
    }

    @Override
    public String getName() {
        return "Machine1";
    }

    @Override
    public Coffee makeCoffee() {
        millBeans();
        boilingWater();
        mixingComponents();

        Coffee coffee = new Coffee(100);
        addMilk(coffee);

        return coffee;
    }

    private void addMilk(Coffee coffee) {
        coffee.fillMilk(20);
    }

    private void mixingComponents() {
        System.out.println("mixing components");
    }

    @Override
    protected void boilingWater() {
        System.out.println("boiling water with special way");
    }

    private void millBeans() {
        System.out.println("milling beans");
    }
}
