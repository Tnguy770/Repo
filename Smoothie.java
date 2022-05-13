// programmer: Timothy Nguyen

public class Smoothie extends Beverage {

	final private double PROTIEN = 1.50;
	final private double FRUIT = 0.50;

	private boolean addProtien;
	private double numOffruits;


	public Smoothie(String name, SIZE size, int fruits, boolean protien) {
		// TODO Auto-generated constructor stub
		super(name, TYPE.SMOOTHIE, size);

		numOffruits = fruits;
		addProtien = protien;

	}


	public void setnumOffruits(int fruits)
	{
		this.numOffruits = fruits;

	}

	public void setAddProtien(boolean protien)
	{
		this.addProtien = protien;

	}

	public boolean getAddProtien()
	{
		return addProtien;
	}

	public double getNumOfFruits()
	{
		return numOffruits;
	}

	public double getProteinPrice()
	{
		return PROTIEN;
	}

	public double getFruitPrice()
	{
		return FRUIT;
	}




	public double calcPrice() {

		double Smprice = super.getBasePrice();

		if(super.getSize() == SIZE.MEDIUM)
		{
			Smprice += super.getSizeprice(); 
		}

		if(super.getSize() == SIZE.LARGE)
		{
			Smprice += 2 * super.getSizeprice();
		}
		
		if(addProtien)
		{
			Smprice += PROTIEN;
		}


		return Smprice += numOffruits * FRUIT;
	}


	public String toString()
	{
		String p = getBevName() + "," + getSize() + "," + numOffruits + " Fruits ";
		if(addProtien)
		{
			p += " protein powder"; 
		}

		p += ", $" + calcPrice();

		return p;
	}


	public boolean equals(Smoothie smoothie)
	{
		if(super.equals(smoothie) && numOffruits == smoothie.getNumOfFruits() && addProtien == smoothie.getAddProtien())
		{
			return true;
		}

		else 
			return false;

	}








}
