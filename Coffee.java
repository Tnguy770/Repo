// programmer: Timothy Nguyen


public class Coffee extends Beverage {

	final private double Xshot = .50;
	final private double Xsyrup = .50;

	private boolean Shots;
	private boolean Syrup;


	public Coffee(String name, SIZE size, boolean shots, boolean syrup) {
		super(name, TYPE.COFFEE, size);
		// TODO Auto-generated constructor stub
		this.Shots = shots;
		this.Syrup = syrup;

	}

	public void setShots(boolean shots) {

		this.Shots = shots;
	}

	public void setSyrup(boolean syrup) {
		this.Syrup = syrup;
	}

	public double getSyrupPrice()
	{
		return Xsyrup;
	}

	public double getShotsPrice()
	{
		return Xshot;
	}

	public boolean getExtraShot()
	{
		return Shots;
	}

	public boolean getExtraSyrup()
	{
		return Syrup;
	}



	public double calcPrice() {

		double Coprice = super.getBasePrice();
		if(super.getSize() == SIZE.MEDIUM)
		{
			Coprice += super.getSizeprice(); 
		}

		if(super.getSize() == SIZE.LARGE)
		{
			Coprice += 2 * super.getSizeprice();
		}
		
		if(Shots)
		{
			Coprice += Xshot;
		}
		
		if(Syrup)
		{
			Coprice += Xsyrup;
		}
		
		return Coprice;
	}

	public String toString() {

		String c = getBevName() + "," + getSize() + "," + Shots + Syrup;
		
		if(Shots)
		{
			c += Xshot;
		}

		if(Syrup) 
		{
			c += Xsyrup;
		}
		
		c += ", $" + calcPrice();
		return c;
	}



	public boolean equals(Coffee coffee)
	{
		if(super.equals(coffee) && Shots == coffee.getExtraShot() && Syrup == coffee.getExtraSyrup())
		{
			return true;
		}

		else
			return false;
	}
}






