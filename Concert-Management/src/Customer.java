public class Customer {
    // Data Field
    private String name;
    private String userName;
    private String password;
    private double bill;

    // Constructor
    public Customer() {
        name = "";
        userName = "";
        password = "";
        bill = 0;
    }
    public Customer(String name, String userName, String password, double bill) {
        this.name = name;
        this.userName = userName;
        this.password = password;
        this.bill = bill;
    }

    // Getter & Setter
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }

    public String getUserName() {
        return userName;
    }
    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPassword() {
        return password;
    }
    public void setPassword(String password) {
        this.password = password;
    }

    public double getBill() {
        return bill;
    }
    public void setBill(double bill) {
        this.bill = bill;
    }
}
