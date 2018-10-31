import java.util.ArrayList;

public class queue {
	ArrayList<String> container = new ArrayList<String>();
	int ecor = -1;
	
	public void insert(String value){
		ecor++; //=ecor + 1;
		container.add(ecor, value);
	}
	
	public String get(){
		String value = "kosong";
		if(!container.isEmpty()){
		value = container.get(0);
		container.remove(0);
		ecor--;
		}
		return value;
		
	}
	public void cetak(){
		System.out.println("ECOR :" +ecor+" # CONTAINER : "+container.toString());
	}

}
