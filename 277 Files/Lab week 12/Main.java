//Rowland Sanders
//Eric Dao
//Brooke Yale
//Kevin Cordray
//CECS 277 Section 2
//Week 12 Singleton Group Assignment
//Due 11/10/2020
class Main {
  public static void main(String[] args) {
    MathLibrary first = MathLibrary.getInstance();
    MathLibrary second = MathLibrary.getInstance();
    System.out.println(first.someMathMethod());
    System.out.println(first.anotherMathMethod());
    System.out.println(first.hashCode());
    System.out.println(second.someMathMethod());
    System.out.println(second.anotherMathMethod());
    System.out.println(second.hashCode());
    
  }
}