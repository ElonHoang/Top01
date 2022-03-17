package fis.test.miniTest;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class functionList {
	public static List<Account> listAcc  = new ArrayList<>(); 
	public static void showMenu() {
		System.out.println("=====HE THONG QUAN LY TAI KHOAN=====");
		System.out.println("1. Danh Sach Tai Khoan");
		System.out.println("2. Them Moi Tai Khoan");
		System.out.println("3. Cap Nhat Thong Tin Tai Khoan");
		System.out.println("4. Xoa Tai Khoan");
		System.out.println("5. Chuyen Khoan");
		System.out.println("6. Exit");
		System.out.println("Chon ...");
	}
	public static List<Account> functionAccList(){
		if(listAcc == null || listAcc.isEmpty()) {
			System.out.println("Function Account List does not exists");
			return null;
		}
			for(Account a : listAcc) {
				System.out.println(a.toString());
			}
		return listAcc;	
	}
	public static Account addAccount() {
		Account acc = new Account();
				acc.input();
				listAcc.add(acc);
		return acc;	
	}
	public static Account updateAccount() {
		if(listAcc == null || listAcc.isEmpty()) {
			System.out.println("Function Account List does not exists");
			return null;
		}
		Account a = new Account();
		a.update();
		return a;
	}
	public static Account deleteInfAccount() {
		if(listAcc == null || listAcc.isEmpty()) {
			System.out.println("Function Account List does not exists");
			return null;
		}
		Account a = new Account();
		a.delete();
		//listAcc.add(a);
		return a;
	}
	
	public static void ChooseMenu() {
		Scanner sc = new Scanner(System.in);
		int choose;
		do {
			showMenu();
			choose = sc.nextInt();
			switch(choose) {
			case 1:
				functionAccList();
				break;
			case 2:
				addAccount();
				break;
			case 3:
				updateAccount();
				break;
			case 4:
				deleteInfAccount();
				break;
			case 5:
				//transferMoney();
				break;
			case 6:
				System.out.println("Thoat");
				return;
			default:
				System.out.println("Chi duoc chon tu 1 -> 6");
				break;
			}
		}while(choose != 6);
	}
	public static void main(String[] args) {
		ChooseMenu();
	}
	
}
