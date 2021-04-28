package Chapter7;

public class CustomerTest {
    public static void main(String[] args) {
        Customer customerLee = new Customer();
        customerLee.setCustomerName("이순신");
        customerLee.setCustomerID(10010);
        customerLee.bonusPoint = 1000;
        System.out.println(customerLee.showCustomerInfo());

        VIPCustomer customerKim = new VIPCustomer(10020, "김유신");
        Customer customerYoon = new VIPCustomer(10030, "가나다");
//        customerKim.setCustomerName("김유신");
//        customerKim.setCustomerID(10020);
        customerKim.bonusPoint = 10000;
        System.out.println(customerKim.showCustomerInfo());
    }
}
