package Fis.B2;

import java.util.List;
import java.util.Scanner;

public class Form {
	public List<Component> componests;
	public Form() {
		
	}
	public void addComponent(Component com) {
		Scanner sc = new Scanner(System.in);
		if(componests != null) return;
		if(!validateForm()) return;
		System.out.println("Enter data :");
		String dt = sc.nextLine();
		componests.add(new Component(dt));
	}
	public boolean validateForm() {
		//if()
		return false;
	}
	
}
