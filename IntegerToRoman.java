package apas;

import java.util.Scanner;

public class IntegerToRoman {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int numbers[] = {1000,900,500,400,100,90,50,40,10,9,5,4,1};
		String roman[] = {"M","CM","D","CD","C","XC","L","XL","IX","X","V","IV","I"};
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		int i=0;
		StringBuilder ans = new StringBuilder();
		while(n>0) {
			if(numbers[i]<=n) {
				ans.append(roman[i]);
				n = n-numbers[i];
			}else {
				i++;
			}
		}
		System.out.println(ans);
	}

}
