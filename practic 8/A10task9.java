import java.util.Scanner;
public class A10task9{//9.42
  public static void main(String[] args) {
    Scanner in = new Scanner(System.in);
    System.out.println("Enter the word");
    String word = in.nextLine();
    String newword = "";
    int length = word.length();
    for(int i = length - 1; 0 <= i; i-- ) {
      newword = newword + word.charAt(i);
      System.out.println(newword);
    }//созди сонгы арипинен бастап шыгарып береди
  }
}