public class A10task23{//9.139
	public static void main(String[] args) {
		String word="alysta zursemde  123";
        //sufr shgaradi asyuna retimen
		for(int i=0;i<word.length();i++){
			for(int j=1;j<=9;j++){
				if(word.charAt(i)==(""+j).charAt(0)){
					System.out.println(j);
				}
			}
		}
	}
}