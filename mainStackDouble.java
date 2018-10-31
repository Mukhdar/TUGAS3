
public class mainStackDouble {

	public static void main(String[] args) {
		stackDouble sd = new stackDouble();
		sd.cetak();
		
		sd.push(1.24d);
		sd.cetak();
		
		sd.push(5.905885d);
		sd.cetak();
		
		sd.push(34.98508765d);
		sd.cetak();
		
		Double out1 = sd.pop();
		System.out.println(out1);
		sd.cetak();
		
		Double out2 = sd.pop();
		System.out.println(out2);
		sd.cetak();
		
		Double out3 = sd.pop();
		System.out.println(out3);
		sd.cetak();
		
		Double out4 = sd.pop();
		System.out.println(out4);
		sd.cetak();
		
	}

}
