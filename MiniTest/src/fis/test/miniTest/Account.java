package fis.test.miniTest;

import java.util.Iterator;
import java.util.Scanner;



public class Account {

	private Long Id;
	private String accountNumber;
	private String accountName;
	private Double balance;
	private Integer status;
	public Account() {
		
	}
	public Account(Long _id, String _accNum, String _accName, Double _balance, Integer _status) {
		this.Id = _id;
		this.accountNumber = _accNum;
		this.accountName = _accName;
		this.balance = _balance;
		this.status = _status;
	}
	public Long getId() {
		return this.Id;
	}
	public String getAccNumber() {
		return this.accountNumber;
	}
	public String getAccName() {
		return this.accountName;
	}
	public Double getBalance() {
		return this.balance;
	}
	public Integer getStatus() {
		return this.status;
	}
	public void setId(Long _id) {
		this.Id = _id;
	}
	public void setAccNum(String _accNum) {
		this.accountNumber = _accNum;
	}
	public void setAccName(String _accName) {
		this.accountName = _accName;
	}
	public void setBalance(Double _balance) {
		this.balance = _balance;
	}
	public void setStatus(Integer _status) {
		this.status = _status;
	}
	public void input() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Account Numer :");
		accountNumber = sc.nextLine();
		while(accountNumber.length() != 12) {
			System.out.println("Account must be lenght = 12 characters !");
			System.out.println("Enter Account Numer again :");
			accountNumber = sc.nextLine();
		}
		for(Account a : functionList.listAcc) {
			if(a.getAccNumber().equalsIgnoreCase(accountNumber)) {
				System.out.println("Account already exists ");
				return;
			}
		}
		System.out.println("Enter Account Name :");
		accountName = sc.nextLine();
		while(accountName.length()<= 5 || accountName.length() >= 100 ) {
			System.out.println("Account Name must be length > 5 character and < 100 character");
			System.out.println("Enter Account Name again :");
			accountName = sc.nextLine();
		}
		System.out.println("Insert Sucessfull");
		balance = 100000.0;
		status = 1;
	}
	
	public void update() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter AccountNumber need fix :");
		accountNumber  = sc.nextLine();
		for(Account a : functionList.listAcc) {
			if(a.getAccNumber().equals(accountNumber)) {
				System.out.println("Enter AccountName :");
				accountName = a.accountName;
				a.accountName = sc.nextLine();
				
				while(a.accountName.length()<= 5 || a.accountName.length() >= 100 ) {
					System.out.println("Account Name must be length > 5 character and < 100 character");
					System.out.println("Enter Account Name again :");
					a.accountName = sc.nextLine();
				}
				
				System.out.println("Enter Status (must be equals [0,1,2]) :");
				status = a.status;
				a.status = sc.nextInt();
				while(a.status > 2 || a.status < 0) {
					System.out.println("Status (must be equals [0,1,2])");
					System.out.println("Enter Status again :");
					a.status = sc.nextInt();
				}
				System.out.println("Update Successfull");
			}else {
				System.out.println("AccountNumber not true");
				return;
			}
		}
	}
	public void delete() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter AccountNumber need delete :");
		accountNumber = sc.nextLine();
		for(Account a : functionList.listAcc) {
			if(a.getAccNumber().equalsIgnoreCase(accountNumber)) {
				functionList.listAcc.removeIf(l -> l.equals(a));
				System.out.println("Delete Successfull !");
			}else {
				System.out.println("Account does not exists");
				return;
			}
		}
		
		
	
	}
	@Override
	public String toString() {
		return ("Account Number :" + getAccNumber() + "\n"
					+ "Account Name :" + getAccName() + "\n"
					+ "Balance :" + getBalance() + "\n"
					+ "Status :" + getStatus() + "\n\n");
	}
}
