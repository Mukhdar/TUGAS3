import java.util.ArrayList;


public class queueString {
	ArrayList<String> kelas = new ArrayList<String>();
	int akhir = -1;
	
	public void insert(String value){
		akhir++; //=akhir + 1;
		kelas.add(akhir, value);
	}
	
	public String get(){
		String value = "KELAS KOSONG";
		if(!kelas.isEmpty()){
		value = kelas.get(0);
		kelas.remove(0);
		akhir--;
		}
		return value;
		
	}
	public void cetak(){
		System.out.println("Akhir :" +akhir+" Kelas : "+kelas.toString());
	}
}
