// programmer: Timothy Nguyen

public class Alcohol extends Beverage {

	private boolean weekend;
	private double weekend_price = .60;
	
	public Alcohol(String name, SIZE size, boolean weekend) {
		super(name, TYPE.ALCOHOL, size);
		// TODO Auto-generated constructor stub
		this.weekend = weekend;
	}

	public void setweekend(boolean weekend)
	{
		this.weekend = weekend;
	}
	
	public boolean getweekend()
	{
		return weekend;
	}
	
	public double getWeekendPrice()
	{
		return weekend_price;
	}
	
	
	
	public double calcPrice() {
		double Alprice = super.getBasePrice();
		if(super.getSize() == SIZE.MEDIUM)
		{
			Alprice += super.getSizeprice(); 
		}

		if(super.getSize() == SIZE.LARGE)
		{
			Alprice += 2 * super.getSizeprice();
		}
		
		if(weekend)
		{
			Alprice += weekend_price;
		}
		
		
		return Alprice;
	}

	public String toString()
	{
		String a = getBevName() + "," + getSize() + "," + weekend;
		
		if(weekend)
		{
			a += weekend_price;
		}
		
		a += ", $" + calcPrice();
		
		return a;
	}
	
	
	
	public boolean equals(Alcohol alcohol)
	{
		if(super.equals(alcohol) && weekend == alcohol.getweekend())
		{
			return true;
		}
	
		else
			return false;
	
	
	}
	
}