package ref.ex;

public class ProductOrderMain2 {
    public static void main(String[] args) {

        ProductOrder order1 = createdOrder("두부", 2000, 2);
        ProductOrder order2 = createdOrder("김치", 5000, 1);
        ProductOrder order3 = createdOrder("콜라", 1500, 2);
        ProductOrder[] productOrders = new ProductOrder[]{order1, order2, order3};

        printOrder(productOrders);
        int totalAmount = getTotalAmount(productOrders);
        System.out.println("총 결제 금액: " + totalAmount);
    }
    static ProductOrder createdOrder(String productName, int price, int quantity) {
        ProductOrder order = new ProductOrder();
        order.productName = productName;
        order.price = price;
        order.quantity = quantity;

        return order;
    }

    static void printOrder(ProductOrder[] orders) {
        for (ProductOrder order : orders) {
            System.out.println("상품명 : " + order.productName + " 가격 : " + order.price + " 수량 :" + order.quantity);
        }
    }

    static int getTotalAmount(ProductOrder[] orders) {
        int totalAmount = 0;
        for (ProductOrder order : orders) {
            totalAmount += order.quantity * order.price;
        }

        return totalAmount;
    }
}
