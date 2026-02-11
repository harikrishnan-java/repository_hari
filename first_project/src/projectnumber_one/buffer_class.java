package projectnumber_one;

public class buffer_class {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StringBuffer s=new StringBuffer("hello");
		s.reverse();
		System.out.println(s);
		
		//append
		StringBuffer s1 = new StringBuffer("hello");
        s1.append("world");
        System.out.println(s1);
        
        //insert
        
        StringBuffer s2=new StringBuffer("hello");
        s2.insert(2,"world");
        System.out.println(s2);
        
        //delete
        
        StringBuffer s3=new StringBuffer("hello");
        s3.delete(1,3);
        System.out.println(s3);
        
        //replace
        
        StringBuffer s4=new StringBuffer("hello");
        s4.replace(1,3,"world");
        System.out.println(s4);
	}

}
