public class ShoppingCart implements ShoppingCartVisitor{
double price;
  
public double visit(Magazine mag){
  if (mag.getPrice() >= 5.00) {
    price = (mag.getPrice() * .90);
  } else 
  {
    price = mag.getPrice();
  }
  System.out.println("Magazine::" + mag.getTitle() +" "+ mag.getVdate() + " cost = " +price);
  return price;
  
}


public double visit(Fruit fruit){
  price = fruit.getAmount() * fruit.getPrice();
  System.out.println(fruit.getName() + " unit price: " + fruit.getPrice() + " amount: " + fruit.getAmount() + " cost = " + price);
  return price;

  }

}