public class Item {
    private String name;
    private int sku;

    public Item (String name, int sku) {
        this.name = name;
        this.sku = sku;
    }

    public String getName() {
        return name;
    }
    
    public int findPrice() {
        for (int i = 0; i < sku; i ++) {
            if (sku == i) {
                int price = sku * 100;
            }
        }
        return price;
    }
}