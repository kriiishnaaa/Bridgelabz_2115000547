import java.util.*;
class Account{ 
private int accNum; 
private double bal; 
public Account(int accNum,double initBal){ 
this.accNum=accNum; 
this.bal=initBal; 
} 
public void deposit(double amt){ 
bal+=amt; 
System.out.println(); 
System.out.println("Deposited:"+amt+" to Account Number:"+accNum); 
} 
public void withdraw(double amt){ 
if(bal>=amt){ 
bal-=amt; 
System.out.println("Withdraw:"+amt+" from Account Number:"+accNum); 
} else{ 
System.out.println("Insufficient balance!"); 
} 
} 
public double getBalance(){ 
return bal; 
} 
public int getAccountNumber(){ 
return accNum; 
} 
} 
class Customer{ 
private String custName; 
private ArrayList<Account> accList; 
public Customer(String custName){ 
this.custName=custName; 
accList=new ArrayList<>(); 
} 
public void openAccount(Account acc){ 
accList.add(acc); 
} 
public void viewBalance(){ 
for(Account acc:accList){ 
System.out.println("Account Number:"+acc.getAccountNumber()+", Balance:"+acc.getBalance()); 
} 
} 
public String getName(){ 
return custName; 
} 
} 
class Bank{ 
private String bName; 
public Bank(String bName){ 
this.bName=bName; 
} 
public void openAccount(Customer cust,Account acc){ 
cust.openAccount(acc); 
System.out.println("Account opened for "+cust.getName()+" with Account Number:"+acc.getAccountNumber()); 
} 
public void viewCustomerBalance(Customer cust){ 
System.out.println("Balance details for "+cust.getName()+":"); 
cust.viewBalance(); 
} 
} 
public class BankDetails{ 
public static void main(String[] args){ 
Bank b=new Bank("SBI Bank"); 
Customer c1=new Customer("Khushi"); 
Customer c2=new Customer("Piyush"); 
Account a1=new Account(1,5000); 
Account a2=new Account(2,3000); 
b.openAccount(c1,a1); 
b.openAccount(c2,a2); 
b.viewCustomerBalance(c1); 
b.viewCustomerBalance(c2); 
a1.deposit(2000); 
a2.withdraw(1000); 
System.out.println("\nAfter Transactions:"); 
b.viewCustomerBalance(c1); 
b.viewCustomerBalance(c2); 
} 
}
