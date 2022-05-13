
//Programmer: Timothy Nguyen
import java.util.ArrayList;

public class BevShop implements BevShopInterfce {

	private int aDrinks;

	private int cOrder;

	private ArrayList <Order> orders;

	public BevShop()
	{
		orders = new ArrayList<>();
	}


	@Override
	public boolean validTime(int time) {
		// TODO Auto-generated method stub

		if (time >= 8 && time <= 23)
		{
			return true;
		}

		else 
		{
			return false;
		}
	}

	@Override
	public boolean eligibleForMore() {
		// TODO Auto-generated method stub

		if(aDrinks < MAX_ORDER_FOR_ALCOHOL)
		{
			return true;
		}

		return false;

	}

	@Override
	public boolean validAge(int age) {
		// TODO Auto-generated method stub
		if(age > MIN_AGE_FOR_ALCOHOL)
		{
			return true;
		}


		return false;


	}

	@Override
	public void startNewOrder(int time, DAY day, String customerName, int customerAge) {
		// TODO Auto-generated method stub

		Customer customer = new Customer(customerName, customerAge);
		Order order = new Order(time, day, customer);
		orders.add(order);
		cOrder = orders.indexOf(order);
		aDrinks = 0;
	}

	@Override
	public void processCoffeeOrder(String bevName, SIZE size, boolean extraShot, boolean extraSyrup) {
		// TODO Auto-generated method stub
		orders.get(cOrder).addNewBeverage(bevName, size, extraShot, extraSyrup);

	}

	@Override
	public void processAlcoholOrder(String bevName, SIZE size) {
		// TODO Auto-generated method stub

		orders.get(cOrder).addNewBeverage(bevName, size);
		
		aDrinks++;
	}

	@Override
	public void processSmoothieOrder(String bevName, SIZE size, int numOfFruits, boolean addProtien) {
		// TODO Auto-generated method stub

		orders.get(cOrder).addNewBeverage(bevName, size, numOfFruits, addProtien);
	}

	@Override
	public int findOrder(int orderNo) {
		// TODO Auto-generated method stub

		for(int i = 0; i < orders.size(); i++)
		{
			if(orders.get(i).getOrderNo() == orderNo)
			{
				return i;
			}
		}
		return -1;
	}

	@Override
	public double totalOrderPrice(int orderNo) {
		// TODO Auto-generated method stub

		double price = 0;

		for(Order oo: orders)
		{
			if(oo.getOrderNo() == orderNo)
			{
				for(Beverage be: oo.getDrinks())
				{
					price += be.calcPrice();
				}
			}
		}

		return price;
	}

	@Override
	public double totalMonthlySale() {
		// TODO Auto-generated method stub

		double sale = 0;
		for(Order ms: orders)
		{
			for(Beverage bs: ms.getDrinks())
			{
				sale += bs.calcPrice();
			}
		}
		return sale;
	}

	@Override
	public void sortOrders() {
		// TODO Auto-generated method stub

		for(int j = 0; j < orders.size()-1; j++)
		{
			int sort = j;

			for(int a = j + 1; a < orders.size(); a++)
			{
				if(orders.get(a).getOrderNo() < orders.get(sort).getOrderNo())
				{
					sort = a;
				}
			}

			Order chip = orders.get(sort);

			orders.set(sort, orders.get(j));

			orders.set(j, chip);
		}

	}

	@Override
	public Order getOrderAtIndex(int index) {
		// TODO Auto-generated method stub
		return orders.get(index);
	}

	public int getMinAgeForAlcohol()
	{
		return MIN_AGE_FOR_ALCOHOL;
	}

	public int getMaxOrderForAlcohol()
	{
		return MAX_ORDER_FOR_ALCOHOL;
	}

	public int getNumOfAlcoholDrink()
	{
		return aDrinks;
	}

	public Order getCurrentOrder()
	{
		return orders.get(cOrder);

	}

	public boolean isMaxFruit(int num)
	{
		if(num > MAX_FRUIT)
		{
			return true;
		}
		return false;
	}


	public int totalNumOfMonthlyOrders()
	{
		return orders.size();
	}

	
	
	
	public String toString()
	{
		String apple;

		apple = "MonthlyOrders\n";

		for(Order ap: orders)
		{
			apple += ap.toString();
		}

		apple += "Total Sale: " + totalMonthlySale();

		return apple;
	}

}
