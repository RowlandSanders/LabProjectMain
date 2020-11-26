public class MathLibrary {
  private MathLibrary(){}

  private static MathLibrary firstInstance = null;
  public static MathLibrary getInstance(){
    if(firstInstance == null){
      firstInstance = new MathLibrary();
    }
    return firstInstance;

  }
	public int someMathMethod() {
		return -1;
	}
	
	public double anotherMathMethod() {
		return 0;
	}
  
}