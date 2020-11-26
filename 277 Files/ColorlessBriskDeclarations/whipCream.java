public class whipCream extends IceCreamDecorator{
  
 protected Dessert flavor; 

 public static final double COST = 0.25;

 public whipCream(Dessert flavor) {
  this.flavor = flavor;
 }
 
 public String getDescription() {
  return flavor.getDescription() + " with whip cream";
 }

 public double cost() {
  return flavor.cost() + COST;
 }
}