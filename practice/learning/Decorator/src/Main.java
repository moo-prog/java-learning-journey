public class Main {
    public static void main(String[] args) {

        Coffe myOrder = new BasicCoffee();

        Coffe myOrderWithMilk = new MilkDecorator(myOrder);



        // 3. نطبع النتيجة النهائية المحدثة تلقائياً بالتغليف
        System.out.println("Order: " + myOrder.getDescriprion());
        System.out.println("Total Price: " + myOrder.getPrice() + "€");

        System.out.println("Order with milk: " + myOrderWithMilk.getDescriprion());
        System.out.println("Total Price: " + myOrderWithMilk.getPrice() + "€");
    }
}