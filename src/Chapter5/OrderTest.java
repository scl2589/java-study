package Chapter5;

public class OrderTest {
    public static void main(String[] args) {
        Order order = new Order();
        order.orderId = 201907210001L;
        order.customerId = "abc123";
        order.orderDate = "2019년 7월 21일";
        order.customerName = "홍길순";
        order.productId = "PD0345-12";
        order.address = "서울시 영등포구 여의도동 20번지";

        System.out.println("주문번호는 " + order.orderId + "이며, " + order.orderDate + "자로 주문되었습니다.");
        System.out.println("고객 성함은 " + order.customerName + "으로 고객번호는 " + order.customerId + "입니다. ");
        System.out.println("주문 상품번호는 " + order.productId + "이며, 배송 주소는 다음과 같습니다." + order.address);
    }
}
