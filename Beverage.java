// programmer: Timothy Nguyen


public abstract class Beverage {

	private String beverage_name;
	private TYPE beverage_type;
	private SIZE size;

	private final double price = 2.0;
	private final double size_price = 1.0;

	public Beverage(String beverage_name, TYPE beverage_type, SIZE size) {

		this.beverage_name = beverage_name; 
		this.beverage_type = beverage_type;
		this.size = size;
	}


	public abstract double calcPrice();

	public String toString()
	{
		return beverage_name +", " + size;
	}

	public boolean equals(Beverage beverage)
	{
		if(beverage_name.equals(beverage.getBevName()) && beverage_type == beverage.getType() && size == beverage.getSize())
		{
			return true;
		}
		else

			return false;
	}

	public void setName(String beverage_name)
	{
		this.beverage_name = beverage_name; 

	}

	public void setType(TYPE beverage_type)
	{
		this.beverage_type = beverage_type;

	}

	public void setSize(SIZE size)
	{
		this.size = size;

	}


	public String getBevName()
	{
		return beverage_name;
	}

	public TYPE getType()
	{
		return beverage_type;
	}

	public SIZE getSize()
	{
		return size;
	}

	public double getBasePrice()
	{
		return price;
	}


	public double getSizeprice()
	{
		return size_price;
	}
}
