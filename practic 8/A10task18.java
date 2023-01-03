import java.util.Scanner;//9.76
public class A10task18{
	public static void main(String[] args) {
    	Scanner in = new Scanner(System.in);

    	String sentence = in.nextLine();
    	int count = 0;

	    System.out.println("For first number of e");
	    for(int i = 0 ;i<sentence.length();i++){
	        if(sentence.charAt(i)=='e'){
	        int t = sentence.indexOf("e");
	        System.out.println(t+1);
	        count++;
	        if(count == 1){
	         break;
        }
        }
    }

	      System.out.println("For last:");
	    for(int i = 0;i<sentence.length();i++){
	        if(sentence.charAt(i)=='e'){
	        int t1 = sentence.lastIndexOf("e");
	        System.out.println(t1+1);
	        break;
	        }
    }
	}
}