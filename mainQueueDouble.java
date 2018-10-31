
public class mainQueueDouble {

	public static void main(String[] args) {
		queueDouble angka = new queueDouble();
		angka.cetak();
		
		angka.insert(3.905887840d);
		angka.cetak();
		
		angka.insert(4.789208473d);
		angka.cetak();
		
		angka.insert(5.6887999d);
		angka.cetak(); 
		
		Double o1 = angka.get();
		System.out.println(o1);
		angka.cetak();
		
		Double o2 = angka.get();
		System.out.println(o2);
		angka.cetak();
		
		Double o3 = angka.get();
		System.out.println(o3);
		angka.cetak();
		
		Double o4 = angka.get();
		System.out.println(o4);
		angka.cetak();
	}

}
