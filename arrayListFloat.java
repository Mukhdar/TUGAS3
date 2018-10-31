import java.util.ArrayList;
public class arrayListFloat {

	public static void main(String[] args) {
		ArrayList<Float> arlf= new ArrayList<Float>();
		// menambahkan
		arlf.add(34.98f);
		arlf.add(3.5f);
		arlf.add(3.24f);
		System.out.println(arlf);
		//menghapus
		arlf.remove("NURDINA");
		System.out.println(arlf);
		
		ArrayList<Float> arlF= (ArrayList<Float>)arlf.clone();
		arlF.add(2.3f);
		System.out.println("arlf" +arlf);
		System.out.println("arlF" +arlF);
		
		System.out.println("kosongkah:" + arlf.isEmpty());
		if (arlf.contains(3.5f))
			System.out.println(" ada 3.5");
		else{
			System.out.println("tak ada angka 3.5");
		}
		System.out.println("arlf" +arlf);
		System.out.println("arlF" +arlF);
			
	}

}
