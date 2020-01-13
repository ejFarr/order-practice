public class OrderTester {
    public static void main(String[] args) {
        Item[] items = new Item[10];

        items[0] = new Item("Bob Ross Chia Pet", 1);
        items[1] = new Item("Tall Bob Ross Chia Pet", 2);
        items[2] = new Item("Stinky Bob Ross Chia Pet", 3);
        items[3] = new Item("Short Bob Ross Chia Pet", 4);
        items[4] = new Item("Beautiful Bob Ross Chia Pet", 5);
        items[5] = new Item("Ugly Bob Ross Chia Pet", 6);
        items[6] = new Item("Happy Bob Ross Chia Pet", 7);
        items[7] = new Item("Disgusting Bob Ross Chia Pet", 8);
        items[8] = new Item("Loud Bob Ross Chia Pet", 9);
        items[9] = new Item("Sexy Bob Ross Chia Pet", 10);

        Order order1 = new Order(items);


        int orderPrice = order1.calcTotalPrice();
        orderPrice += order1.calcSalesTax();
    }
}