
public class Customer {
	private String name;
	private String address;
	
	public Order[] myOrders = new Order[100];
	
	public void addOrder(int index, Order order) {
		myOrders[index] = order;
	}
}