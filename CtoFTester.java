public class CtoFTester{
  public static void main(String[] args){
    System.out.println (CtoF(30.0));
    System.out.println (FtoC(41.0));
}

public static double CtoF(double c){
  return ((c * 9.0)/5.0) + 32.0;
}
public static double FtoC(double f){
  return ((f - 32.0) * 5.0) / 9.0;
}}
