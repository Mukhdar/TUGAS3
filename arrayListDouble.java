import java.util.ArrayList;


public class arrayListDouble {

	public static void main(String[] args) {
		ArrayList<Double> arlf= new ArrayList<Double>();
		// menambahkan
		arlf.add(34.98456789d);
		arlf.add(3.5456789d);
		arlf.add(3.24489902d);
		System.out.println(arlf);
		//menghapus
		arlf.remove("NURDINA");
		System.out.println(arlf);
		
		ArrayList<Double> arlF= (ArrayList<Double>)arlf.clone();
		arlF.add(2.36790d);
		System.out.println("arlf" +arlf);
		System.out.println("arlF" +arlF);
		
		System.out.println("kosongkah:" + arlf.isEmpty());
		if (arlf.contains(3.545588d))
			System.out.println(" ada 3.5");
		else{
			System.out.println("tak ada angka 3.5");
		}
		System.out.println("arlf" +arlf);
		System.out.println("arlF" +arlF);
	}

}
