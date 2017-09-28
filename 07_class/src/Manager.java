
public class Manager {
	private String name;
	private String address;
	
	public Order[] totalOrders = new Order[100];
	
	public void addOrder(int index, Order order) {
		totalOrders[index] = order;
	}
}
