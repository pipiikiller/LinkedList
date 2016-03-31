package model;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		int count=0;
		
		LinkMatrix lm= new LinkMatrix();
		try {
			Scanner sc= new Scanner(new File("StockTickerStreamData.csv"));
			String element;
			sc.useDelimiter(",");
			while(sc.hasNext()){
				element=sc.next();
				Item item= new Item(element);
				Node node= new Node(item,null);
				lm.add(node);
				//System.out.println(node.getNext());
			}
		
		System.out.println(lm.toString());
			
		} catch (FileNotFoundException e) {
			
			e.printStackTrace();
		}
	}
}
