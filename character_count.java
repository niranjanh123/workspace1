package apas;

import java.util.Scanner;

public class character_count {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		String input = s.nextLine();
		String a[] = input.split(" ");
		int space_count = a.length;
		int char_count=0;
		for(int i=0;i<input.length();i++)
		{
			char ch = input.charAt(i);
			if(Character.isLetterOrDigit(ch))
				char_count++;
		}
		int total_count=char_count+space_count-1;
		System.out.println("Total number of characters is "+total_count);
		System.out.println("Total numner of words "+space_count);
	}

}
