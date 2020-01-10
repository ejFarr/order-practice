public class Customer {
    private String customerName;
    private String email;

    public Customer (String name, String email) {
        this.customerName = name;
        this.email = email;
    }
    public Customer (String name, String email, Order order) {
        this.customerName = name;
        this.email = email;
    }
}