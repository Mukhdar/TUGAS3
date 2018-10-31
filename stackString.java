import java.util.ArrayList;

public class stackString {
	ArrayList<String> kelas= new ArrayList<String>();
	int top = -1;
	
	public void push(String value){
		top = top + 1;
		kelas.add(top, value);
	}
	
	public String pop(){
		String value = "TIDAK ADA MAHASISWA";
		if(!kelas.isEmpty()){
			value = kelas.get(top);
			kelas.remove(top);
			top = top - 1;
			
		}
		return value;
	}
	
	public void cetak(){
		System.out.println("TOP :" +top+" # KELAS: "+kelas.toString());
	}
}


