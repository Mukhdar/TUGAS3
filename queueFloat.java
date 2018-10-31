import java.util.ArrayList;


public class queueFloat {
	ArrayList<Float> angka = new ArrayList<Float>();
	int akhir = -1;
	
	public void insert(Float value){
		akhir++; //=akhir + 1;
		angka.add(akhir, value);
	}
	
	public Float get(){
		Float value = 0.0f;
		if(!angka.isEmpty()){
		value = angka.get(0);
		angka.remove(0);
		akhir--;
		}
		return value;
		
	}
	public void cetak(){
		System.out.println("Akhir :" +akhir+" angka : "+angka.toString());
}}