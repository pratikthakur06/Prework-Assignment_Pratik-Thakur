import java.util.Scanner; 
public class FirstLetterPrinter
{
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in); 
        String input = in.nextLine(); 
        System.out.println(firstLetterPrinter(input));
	}
	static String firstLetterPrinter(String str) { 
        String res="";
        String[] words = str.split(" ");
        for(String word:words) {
            //System.out.println(word);
            res+=word.charAt(0);
        }
        return res;
    }
}