
public class LateMachine implements ILateMachine {
    @Override
    public void steamMilk() {
        System.out.println("steam milk");
    }

    @Override
    public void fillWater() {
        System.out.println("fill water");
    }

    @Override
    public void fillCoffeeBeans() {
        System.out.println("fill coffee");
    }

    @Override
    public int getModelNumber() {
        return 234;
    }

    @Override
    public String getName() {
        return "LatheMachine";
    }

    @Override
    public Coffee makeCoffee() {
        boilingWater();
        millBeans();
        mixingComponents();

        Coffee c = new Coffee(250);

        c.fillMilk(50);

        return c;
    }

    private void mixingComponents() {
        System.out.println("mixing components");
    }

    private void millBeans() {
        System.out.println("milling beans");
    }

    protected void boilingWater() {
        System.out.println("boiling water");
    }
}
