package apas;

import java.util.Scanner;

public class Plus_One {
	public static void main(String[] args)
	{
		Scanner s= new Scanner(System.in);
		int n = s.nextInt();
		int a[] = new int[n];
		for(int i =0;i<n;i++) {
			a[i] = s.nextInt();
		}
		int b[] = plusOne(a);
		for(int i=0;i<b.length;i++) {
			System.out.print(b[i]+",");
		}
	}


    public static int[] plusOne(int[] digits) 
    {
        int size = digits.length;
        for (int i = size - 1; i >= 0; i --) {
        if (digits[i] < 9) {
            ++digits[i];
            return digits;
        }
        // that means the current digit is a 9
        digits[i] = 0;
    }
    
    // if we make it here that means we have all 9's in the given input
    int[] newDigits = new int[size + 1];
    newDigits[0] = 1;
    return newDigits;
}
}