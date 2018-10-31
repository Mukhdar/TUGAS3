import java.util.ArrayList;
public class arrayListInteger {
	public static void main(String[] args){
		ArrayList<Integer> arl1= new ArrayList<Integer>();
		// menambahkan
		arl1.add(10);
		arl1.add(45);
		arl1.add(25);
		arl1.add(15);
		System.out.println(arl1);
		//menghapus
		arl1.remove(3);
		System.out.println(arl1);
		
		ArrayList<Integer> arl2= (ArrayList<Integer>)arl1.clone();
		arl2.add(24);
		System.out.println("arl1" +arl1);
		System.out.println("arl2" +arl2);
		
		System.out.println("kosongkah:" + arl1.isEmpty());
		if (arl1.contains(45))
			System.out.println(" ada angka 45");
		else{
			System.out.println("tak ada angka 45");
		}
		System.out.println("arl1" +arl1);
		System.out.println("arl2" +arl2);
			
		
	}

}
