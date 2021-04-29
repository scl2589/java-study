package Chapter9.interfaceex;

public class CustomerTest {

    public static void main(String[] args) {
        Customer customer = new Customer();

        customer.buy();
        customer.sell();
        customer.order();
        customer.sayHello();

        Buy buyer = customer;
        buyer.buy();
        buyer.order();

        Sell seller = customer;
        seller.sell();
        seller.order(); //이때 호출되는 order는 instance의 order이다.
    }


}
