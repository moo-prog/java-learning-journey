public class MilkDecorator implements Coffe{
    private Coffe baseCoffee;

    public MilkDecorator(Coffe coffee){
        this.baseCoffee = coffee;
    }

    @Override
    public double getPrice() {

        return baseCoffee.getPrice() + 2;
    }


    @Override
    public String getDescriprion() {

        return baseCoffee.getDescriprion() +" with Milk";
    }
}
