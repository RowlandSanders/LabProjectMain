//Emmanuel Rodriguez
//Yang Xu
//Rowland Sanders
//Demo time: 4:18pm
//Week 13
public class Main {
 public static void main(String[] args) {
  Dessert chocolate = new Chocolate();
  
  System.out.println(chocolate.getDescription());
  System.out.println(chocolate.cost());
  
  // now decorate the chocolate with a cherry
  chocolate = new Cherry(chocolate);
  System.out.println(chocolate.getDescription());
  System.out.println(chocolate.cost());
  
  // now add a second cherry
  chocolate = new Cherry(chocolate);
  System.out.println(chocolate.getDescription());
  System.out.println(chocolate.cost());

  // we can also decorate an ice cream cone with
  // two cherries in a single step
  Dessert strawberry= new Strawberry();
  strawberry = new Cherry(new Cherry(strawberry));
  System.out.println(strawberry.getDescription());
  System.out.println(strawberry.cost());
  /////////////////////////
  
  Dessert vanilla = new Vanilla();
  Dessert newVanilla = new Vanilla();
  
  System.out.println(vanilla.getDescription());
  System.out.println(vanilla.cost());
  
  // now decorate the chocolate with a cherry
  vanilla = new hotFudge(vanilla);
  System.out.println(vanilla.getDescription());
  System.out.println(vanilla.cost());
  
  // now add a second cherry
  chocolate = new whipCream(vanilla);
  System.out.println(vanilla.getDescription());
  System.out.println(vanilla.cost());

  // we can also decorate an ice cream cone with
  // added whip cream and hot fudge
  newVanilla = new whipCream(new hotFudge(newVanilla));
  System.out.println(newVanilla.getDescription());
  System.out.println(newVanilla.cost());
 }
}
