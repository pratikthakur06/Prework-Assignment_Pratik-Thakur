import java.util.Scanner;
public class PatternPrinter
{
	public static void main(String[] args) {
        Scanner in = new Scanner(System.in); 
        int n = in .nextInt(); 
        patternPrinter(n); 
	}
	static void patternPrinter(int n) { 
        for(int i=0;i<n;i++) {
            for(int j=n;j>0;j--) {
                for(int k=0;k<n-i;k++) {
                    System.out.print(j+" ");
                }
            }
            System.out.println();
        }
    } 
}