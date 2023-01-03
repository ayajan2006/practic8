import java.util.Scanner;
public class A10task11{//9.49
  public static void main(String[] args) {
    Scanner in = new Scanner(System.in);
    System.out.println("Enter the word");
    String word = in.nextLine();
    int length = word.length();
    String zhuldyz = "";
    //1создин ишинде канша арип болса алдына жане артына сонша жулдыз шыгарып береди
    for(int i = 0; i<length; i++) {  
        zhuldyz += "*";
    }
    System.out.println(zhuldyz+word+zhuldyz);
  }
}