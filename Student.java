import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class Student {

	String name;
	int id;
	Student(String name,int id){
		this.name=name;
		this.id=id;
	}
//	public static class SortbyName implements Comparator<Student>{
//		public int compare(Student a,Student b) {
//			return a.name.compareTo(b.name); 
//		}
//	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Student> ar= new ArrayList<Student>();
		ar.add(new Student("bbbb", 111)); 
        ar.add(new Student("aaaa", 131)); 
        ar.add(new Student("cccc", 121)); 
  
        System.out.println("Unsorted"); 
        for (int i=0; i<ar.size(); i++) 
            System.out.println(ar.get(i)); 
        
        Comparator<Student> com = new Comparator<Student>() {
			public int compare(Student a ,Student b) {
				// TODO Auto-generated method stub
					if(a.id>b.id) return 1;
					else
						return -1;
	        		//return a.name.compareTo(b.name);
						}
        		};
  
        Collections.sort(ar,com); 
  
        System.out.println("\nSorted by rollno"); 
        for (int i=0; i<ar.size(); i++) 
            System.out.println(ar.get(i)); 
	}

}
