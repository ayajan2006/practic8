import java.util.Scanner;
public class A10task16{//9.112
	public static void main(String[] args) {
	       	Scanner in=new Scanner(System.in);

        	System.out.println("enter predlozhenie: ");
        	String predlozhenie=in.nextLine();

	       	System.out.println("enter p1 and  p2 number: ");
        	int p1=in.nextInt();
        	int p2=in.nextInt();

        	String check=predlozhenie.substring(0,p1);
       	    String check2=predlozhenie.substring(p2+1);

	        System.out.println("result: "+check+check2);
	}
}