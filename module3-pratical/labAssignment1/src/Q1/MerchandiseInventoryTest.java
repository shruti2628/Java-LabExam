package Q1;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.nio.Buffer;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

public class MerchandiseInventoryTest {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		ArrayList<Merchandise> list = new ArrayList<>();
		
		try (BufferedReader br = new BufferedReader(new FileReader("C:\\tools\\sts-4.32.2.RELEASE\\labAssignment1\\src\\Q1\\input.dat"))){
			String line=null;
			while((line=br.readLine())!=null) {
				int itemCode = sc.nextInt();
				int quantity = sc.nextInt();
				double unitPrice = sc.nextDouble();
				
				list.add(new Merchandise(itemCode, quantity, unitPrice));
				
			}
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} catch(Exception e) {
			System.out.println(e);
		}
		
		Collections.sort(list, Comparator.comparing(Merchandise::getItemCode));

	    System.out.println("Sorting by Item Code:");
	    for (Merchandise m : list) {
	    	System.out.println(m);
	    }
		
	    Collections.sort(list, Comparator.comparing(Merchandise::getUnitPrice).reversed());
	    
	    System.out.println("Sorting by Unit Price in descending order");
	    for (Merchandise m : list) {
	    	System.out.println(m);
	    }
	}
}
