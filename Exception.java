public class Debug {

  public static void main(String[] args) {
    
    int width = 0;
    int length = 40;
    //the statement to be under exception shhould be in try
    try {
    int ratio = length / width;
    }
    
    //checks arthmetic exception
    catch(ArithmeticException e){
      System.err.println("ArithmeticExceptio:"+e.getMessage());
    }
    //catch(NullPointerException e){} for NullPointerException 
  }
  
}
