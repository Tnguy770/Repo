import java.util.ArrayList;
import java.util.Random;
//programmer: Timothy Nguyen
public class Order implements OrderInterface, Comparable <Order> {

	private int ordernumber;
	private int ordertime;

	private DAY orderday;
	private Customer customer;

	private ArrayList <Beverage> beverages;

	public Order(int ordertime, DAY orderday, Customer customer)
	{
		ordernumber = randNum();
		
		this.ordertime = ordertime;
		this.orderday = orderday;
		this.customer = customer;
		
		beverages = new ArrayList<>();
	}


	public int randNum()
	{
		Random randy = new Random();

		int randyto = randy.nextInt(90000 - 10000);


		return randyto;
	}


	public int getTotalItems()
	{

		return beverages.size();
	}


	@Override
	public int compareTo(Order o) {
		// TODO Auto-generated method stub
		if(ordernumber == o.getOrderNo())
		{
			return 0;
		}

		if(ordernumber > o.getOrderNo())
		{
			return 1;
		}

		else
		{
			return -1;
		}
	}

	@Override
	public boolean isWeekend() {
		// TODO Auto-generated method stub
		if(orderday == DAY.SATURDAY || orderday == DAY.SUNDAY)
		{
			return true;
		}

		return false;
	}

	@Override
	public Beverage getBeverage(int itemNo) {
		// TODO Auto-generated method stub

		beverages.get(itemNo);

		return beverages.get(itemNo);
	}

	@Override
	public void addNewBeverage(String bevName, SIZE size, boolean extraShot, boolean extraSyrup) {
		// TODO Auto-generated method stub

		Coffee coffee = new Coffee(bevName, size, extraShot, extraSyrup);

		beverages.add(coffee);
	}

	@Override
	public void addNewBeverage(String bevName, SIZE size) {
		// TODO Auto-generated method stub

		boolean isWeekend = false;

		if(orderday == DAY.SATURDAY || orderday == DAY.SUNDAY)
		{
			isWeekend = true;
		}

		Alcohol alcohol = new Alcohol(bevName, size, isWeekend);

		beverages.add(alcohol);
	}

	@Override
	public void addNewBeverage(String bevName, SIZE size, int numOfFruits, boolean addPRotien) {
		// TODO Auto-generated method stub

		Smoothie smoothie = new Smoothie(bevName, size, numOfFruits, addPRotien);
		beverages.add(smoothie);

	}

	@Override
	public double calcOrderTotal() {
		// TODO Auto-generated method stub

		double total = 0;

		for(Beverage bb: beverages)
		{
			total += bb.calcPrice();
		}


		return total;
	}

	@Override
	public int findNumOfBeveType(TYPE type) {
		// TODO Auto-generated method stub

		int guess = 0;

		for(Beverage pp: beverages)
		{
			if(pp.getType() == type)
			{
				guess++;
			}
		}

		return guess;
	}

	public int getOrderNo()
	{
		return ordernumber;
	}
	
	public Customer getCustomer()
	{
		return new Customer(customer);
	}
	
	
	public ArrayList <Beverage> getDrinks()
	{
		return beverages;
	}
	
	public int getOrderTime()
	{
		return ordertime;
	}
	
	public DAY getOrderDay()
	{
		return orderday;
	}
	
	
	
	
	public String toString()
	{
		String info = "_" +orderday.toString() + "," + ordertime + "\n" + customer.toString() + "Order Number: " + ordernumber; 
		
		for(Beverage p: beverages)
		{
			info += "\n" +p.toString();
		}

		info += "\n Order Total: " + calcOrderTotal();
		
		return info;
	}



}
