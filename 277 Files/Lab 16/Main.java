/*
* Brooke Yale
* David Lam
* Rowland Sanders
* Naeun Yu
* Time Demoed: 4:58pm
*/

import java.util.ArrayList;

class Main {
  public static void main(String[] args) {
    ItemElement[] items = new ItemElement[]{
      new Magazine("Vogue", "December 2017", 6.49),
      new Magazine("Time", "July 2018", 4.49),
      new Fruit("Apple", 4, .50),
      new Fruit("Pineapple", 2, 1.19)
    };
    double total = calcTotal(items);
    System.out.println("Total price = " + total);
    }

  
  private static double calcTotal(ItemElement[] items)
  {
    ShoppingCart visitor = new ShoppingCart();
    double tot = 0;
    for(ItemElement item : items){
      tot += item.accept(visitor);
    }
    return tot;
  }
  }
