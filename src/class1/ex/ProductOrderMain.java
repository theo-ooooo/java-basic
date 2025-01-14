package class1.ex;

public class ProductOrderMain {
    public static void main(String[] args) {
        ProductOrder[] productOrders = new ProductOrder[3];

        ProductOrder order1 = new ProductOrder();
        order1.setProductName("두부");
        order1.setPrice(2000);
        order1.setQuantity(2);
        productOrders[0] = order1;

        ProductOrder order2 = new ProductOrder();
        order2.setProductName("김치");
        order2.setPrice(5000);
        order2.setQuantity(1);
        productOrders[1] = order2;

        ProductOrder order3 = new ProductOrder();
        order3.setProductName("콜라");
        order3.setPrice(1500);
        order3.setQuantity(2);
        productOrders[2] = order3;


        int totalPrice = 0;

        for (ProductOrder order : productOrders) {
            System.out.println("상품명: " + order.getProductName() + ", 가격: " + order.getPrice() + ", 수량: " + order.getQuantity());
            totalPrice += order.getPrice() * order.getQuantity();
        }


        System.out.println("총 결제 금액 : " + totalPrice);
    }
}
