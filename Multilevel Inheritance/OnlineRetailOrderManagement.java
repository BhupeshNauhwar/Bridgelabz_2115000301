class Order{
    public int orderId;
    public String orderDate;

    public Order(int orderId, String orderDate){
        this.orderId=orderId;
        this.orderDate=orderDate;
    }

    public String getOrderstatus(){
        return "Order Placed";
    }
    public void display(){
        System.out.println("Order Id:"+orderId);
        System.out.println("Order date:"+orderDate);
        System.out.println("Order Status:"+getOrderstatus());
           
    }
}

class ShippedOrder extends Order{
    private int trackingNumber;
    public ShippedOrder(int trackingNumber,int orderId, String orderDate){
        super(orderId, orderDate);
         this.trackingNumber=trackingNumber;
    }
    public String getOrderstatus(){
        return "Order Shipped" ;
    }
    public void display(){
        super.display();
        System.out.println("Tracking number:"+trackingNumber);
    }
}
class DeliveredOrder extends ShippedOrder{
    private String deliveryDate;
    public DeliveredOrder(String deliveryDate,int trackingNumber,int orderId, String orderDate){
        super(trackingNumber, orderId, orderDate);
        this.deliveryDate=deliveryDate;
    }
    public String getOrderstatus(){
        return "Order delivered";
    }
    public void display(){
        super.display();
        System.out.println("Delivery date:"+deliveryDate);

    }
}


public class OnlineRetailOrderManagement {
    public static void main(String[] args) {
     Order order=new Order(123, "7-2-25");   
     ShippedOrder ship=new ShippedOrder(456, 123, "7-2-25");
     DeliveredOrder delivered=new DeliveredOrder("9-2-25", 987, 123, "7-2-25");


     order.display();
     System.out.println();

     ship.display();
     System.out.println();

     delivered.display();
     System.out.println();
    }

}
