import java.util.Scanner;

public class Program
{
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		String text = scanner.nextLine();
		char[] arr = text.toCharArray();
		int end=arr.length-1;
		char tmp;
		int val;
		
		for(int i=0;i<=end/2;i++)
		{   val=end-i;
			

			tmp=arr[i];
			arr[i]=arr[val];
			arr[val]=tmp;
			val=0;	
		}
		System.out.println(arr);		
		
	}
}
