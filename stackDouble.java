import java.util.ArrayList;


public class stackDouble {
	ArrayList<Double> kelas= new ArrayList<Double>();
	int top = -1;
	
	public void push(Double value){
		top = top + 1;
		kelas.add(top, value);
	}
	
	public Double pop(){
		Double value = 0.0d;
		if(!kelas.isEmpty()){
			value = kelas.get(top);
			kelas.remove(top);
			top = top - 1;
			
		}
		return value;
	}
	
	public void cetak(){
		System.out.println("TOP :" +top+" # KELAS: "+ kelas.toString());
	}
}





