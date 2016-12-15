
public class BaseMachine implements ICoffeMachine {

    @Override
    public void fillWater() {

    }

    @Override
    public void fillCoffeeBeans() {

    }

    @Override
    public int getModelNumber() {
        return 0;
    }

    @Override
    public String getName() {
        return null;
    }

    @Override
    public Coffee makeCoffee() {
        return null;
    }

    protected void boilingWater() {
        System.out.println("boiling water");
    }
}
