public class OrderTester {
    public static void main(String[] args) {
        Item[] items = new Item[10];

        items[0] = new Item("Bob Ross Chia Pet", 1, 100);
        items[1] = new Item("Tall Bob Ross Chia Pet", 2, 200);
        items[2] = new Item("Stinky Bob Ross Chia Pet", 3, 300);
        items[3] = new Item("Short Bob Ross Chia Pet", 4, 400);
        items[4] = new Item("Beautiful Bob Ross Chia Pet", 5, 500);
        items[5] = new Item("Ugly Bob Ross Chia Pet", 6, 600);
        items[6] = new Item("Happy Bob Ross Chia Pet", 7, 700);
        items[7] = new Item("Disgusting Bob Ross Chia Pet", 8, 800);
        items[8] = new Item("Loud Bob Ross Chia Pet", 9, 900);
        items[9] = new Item("Sexy Bob Ross Chia Pet", 10, 1000);

        Order order1 = new Order(items);

        Customer customer1 = new Customer("Bob", "BobRoass@gmail.com", order1);


        int orderPrice = order1.calcTotalPrice();
        orderPrice += order1.calcSalesTax();

        System.out.println(customer1.getCustomerName() + "\t" + customer1.getEmail());



        for (int i = 0; i < 10; i ++) {
            System.out.println(items[i].getName() + 
            "\t" + "$" + items[i].getPrice()/100.0);
        }
        System.out.println("Total price: " + "$" + orderPrice/100.0);

        //Plepel four meme of teh decade, meh and teh boyz four meme of teh yearzel,                                           freud
    }
}