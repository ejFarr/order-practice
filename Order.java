public class Order {
    private int totalPrice;
    private int finalPrice;
    private final float salesTax = 0.08;
    private Item[] order = new Item[10];
    
    public Order(Item[] order) {
        this.order = order;
    }

    public int calcTotalPrice() {
        int price;
        for (int i = 0; i < order.length; i ++) {
            price = order[i];
            totalPrice += price;
        }
        return totalPrice;
    }

    public int calcSalesTax() {
        totalPrice *= salesTax;
        return (int) totalPrice;
    }
}