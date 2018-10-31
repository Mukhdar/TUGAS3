
public class mainQueueString {

	public static void main(String[] args) {
		queueString nama = new queueString();
		nama.cetak();
		
		nama.insert("Nurdina");
		nama.cetak();
		
		nama.insert("Nurfadilah");
		nama.cetak();
		
		nama.insert("Nismawati");
		nama.cetak(); 
		
		String o1 = nama.get();
		System.out.println(o1);
		nama.cetak();
		
		String o2 = nama.get();
		System.out.println(o2);
		nama.cetak();
		
		String o3 = nama.get();
		System.out.println(o3);
		nama.cetak();
		
		String o4 = nama.get();
		System.out.println(o4);
		nama.cetak();
	

	
	}

}
