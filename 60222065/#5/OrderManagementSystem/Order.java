package OrderManagementSystem;

public class Order {
    private String orderID;
    private String status;

    public void setStatus(String status) {
        this.status = status;
    }	
    public void setOrderID(String id) {
    	this.orderID = id;
    }
    public String getOrderID() {
    	return this.orderID;
    }
    public String getStatus() {
    	return this.status;
    }
}
