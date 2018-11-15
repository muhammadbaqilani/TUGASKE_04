import java.util.ArrayList;
import java.util.Scanner;

public class LinearSearch4 {

	public static void main(String[] args) {
		
		ArrayList<Double> data = new ArrayList<Double>();
		
		data.add(15.17);
		data.add(11.11);
		data.add(12.19);
		data.add(4.4);
		data.add(15.13);
		data.add(27.0);
		data.add(8.9);
		data.add(19.15);
		data.add(6.8);
		data.add(7.6);
		data.add(2.2);

		
		System.out.println("Data : " + data.toString());		
		
		Scanner s = new Scanner(System.in);
		System.out.print("Masukkan kunci pencarian: ");
		double key	= s.nextDouble();
		
		int posisi = -1;
		
		
		for(int i=0;i<data.size();i++){
			if(key==data.get(i)){
				posisi = i;
				break;
			}
		}
		
		if(posisi!=-1){
			System.out.println("KEY: "+key+" Berada di index array list: "+posisi);
		}else{
			System.out.println("KEY TIDAK DITEMUKAN");
		}
		
		

	}

}