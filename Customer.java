public class Customer {
    private String customerName;
    private String email;
    private Order order;

    public Customer (String name, String email) {
        this.customerName = name;
        this.email = email;
    }
    public Customer (String name, String email, Order order) {
        this.customerName = name;
        this.email = email;
        this.order = order;
    }

    public String getCustomerName() {
        return customerName;
    }

    public String getEmail() {
        return email;
    }

    
}