package Homework428;
import java.util.Date;
import java.util.ArrayList;
public class EX1108 {
	public static void main(String[] args) {
		Account George=new Account(1.5,"George",1122,1000);
		George.deposit(30);
		George.deposit(40);
		George.deposit(50);
		George.withDraw(5);
		George.withDraw(4);
		George.withDraw(2);
		System.out.println("-------------------------------------Bill-----------------------------------------");
		System.out.println("Name:\t\t"+"AnnualInterestRate:(%)\t"+"Type:\t\t"+"Aomunt:\t\t"+"Balance:\t\t");
		for(int i=0;i<George.transaction.size();i++) {
			System.out.printf("%s\t\t%.2f\t\t\t%c\t\t%.2f\t\t%.2f",
					George.getName(),George.getAnnualInterestRate(),George.transaction.get(i).getType(),
					George.transaction.get(i).getAmount(),George.transaction.get(i).getBalance());
			System.out.println();
		}
	}
}

class Account{
	private int id=0;
	private double balance=0;
	private double annualInterestRate=0;
	private Date dateCreated;
	private String name;
	public ArrayList<Transaction> transaction=new ArrayList<>();
	
    public Account() {	
	}
    public Account(int id,double balance) {
		this.id=id;
		this.balance=balance;
	}
    public Account(double annualInterestRate,String name,int id,double balance) {
    	dateCreated=new Date();
    	this.annualInterestRate=annualInterestRate;
    	this.name=name;
    	this.id=id;
    	this.balance=balance;
    }
    
    public int getId() {
	return id;
}
    public double getBalance() {
	return balance;
}
    public double getAnnualInterestRate() {
    	return annualInterestRate;
    }
    public void setId(int newId) {
    	id=newId;
    }
    public void setBalance(double newBalance) {
    	balance=newBalance;
    }
    public void setAnnualInterestRate(double newAnnualInterestRate) {
    	annualInterestRate=newAnnualInterestRate;
    }
    public String getName() {
    	return name;
    }
    public Date getDateCreated() {
    	return dateCreated;
    }
    public double getMonthlyInterestRate() {
    	return annualInterestRate/1200;
    }
    public double getMonthlyInterest() {
    	return balance*getMonthlyInterestRate();
    }
    public void withDraw(double amount) {
    	balance-=amount;
    	transaction.add(new Transaction('W',amount,balance,"withDraw"));
    }
    public void deposit(double amount) {
    	balance+=amount;
    	transaction.add(new Transaction('D',amount,balance,"deposit"));
    }
    
}

class Transaction{
	private Date date;
	private char type;
	private double amount;
	private double balance;
	private String description;
	
	Transaction(char type,double amount,double balance,String description){
		date=new Date();
		this.type=type;
		this.amount=amount;
		this.balance=balance;
		this.description=description;
	}
	
	public Date getDate() {
		return date;
	}
	public char getType() {
		return type;
	}
	public double getAmount() {
		return amount;
	}
	public double getBalance() {
		return balance;
	}
	public String getDescription(){
		return description;
	}
}