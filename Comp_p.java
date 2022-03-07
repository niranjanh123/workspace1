import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;

public class Comp_p {
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Integer> list=new ArrayList<>();
		list.add(5);
		list.add(3);list.add(8);list.add(1);list.add(9);
		Comparator<Integer> com = new Comparator<Integer>()
				{
					public int compare(Integer a,Integer b) {
						if(a<b)
							return 1;
						else
						return -1;
					}
				};
		Collections.sort(list, com);
		for(int i:list) {
			System.out.println(i);
		}
	}

}
