public class Fruit implements ItemElement
{
	private double price;
	private int amount;
	private String name;

  public double accept(ShoppingCart visitor) {
    return visitor.visit(this);
  }

	public Fruit(String iname,int iamount,double iprice)
	{
		name=iname;
		price=iprice;
		amount=iamount;
	}

	public double getPrice()
	{
		return price;
	}

	public int getAmount()
	{
		return amount;
	}

	public String getName()
	{
		return this.name;
	}


}