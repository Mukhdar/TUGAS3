import java.util.ArrayList;


public class arrayListString {

	public static void main(String[] args) {
		ArrayList<String> arls= new ArrayList<String>();
		// menambahkan
		arls.add("NURDINA");
		arls.add("NURFADILAH");
		arls.add("NISMAWATI");
		System.out.println(arls);
		//menghapus
		arls.remove("NURDINA");
		System.out.println(arls);
		
		ArrayList<String> arlS= (ArrayList<String>)arls.clone();
		arlS.add("INDAH");
		System.out.println("arls" +arls);
		System.out.println("arlS" +arlS);
		
		System.out.println("kosongkah:" + arls.isEmpty());
		if (arls.contains("NURDINA"))
			System.out.println(" ada NURDINA");
		else{
			System.out.println("tak ada NURDINA");
		}
		System.out.println("arl1" +arls);
		System.out.println("arl2" +arlS);
			
	}

}
