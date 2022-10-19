// Java core packages
// @HW@
// add grade average point GPA
//

import java.io.Serializable;

public class AccountRecord implements Serializable { // if it is interface it
														// should be implements
														// (tagging interface);

	private static final long serialVersionUID = 3417040053089159204L;
	private int account;
	private String firstName;
	private String lastName;
	private String address;
	private String socsec;
	private double balance;
	private double gpa;
	private String title;

	// no-argument constructor calls other constructor with
	// default values
	public AccountRecord() {
		this(0, "", "", "", "",0,0,""); // default way of private variables.
	}

	// initialize a record
	public AccountRecord(int acct, String first, String last, String addr, String socs, double bal, double Gpa, String title) {
		setAccount(acct);
		setFirstName(first);
		setLastName(last);
		setAddress(addr);
		setSocsec(socs);
		setBalance(bal);
		setGpa(Gpa);
		setTitle(title);
		
	}

	// set account number
	public void setAccount(int account) {
		this.account = account;
	}

	// get account number
	public int getAccount() {
		return account;
	}

	// set first name
	public void setFirstName(String first) {
		firstName = first;
	}

	// get first name
	public String getFirstName() {
		return firstName;
	}

	// set last name
	public void setLastName(String last) {
		lastName = last;
	}

	// get last name
	public String getLastName() {
		return lastName;
	}

	// setAddress
	public void setAddress(String addr){ address = addr; }

	// getAddress
	public String getAddress(){ return address; }

	// set Socsec
	public void setSocsec(String socs){ socsec = socs; }

	// get socsec
	public String getSocsec(){ return socsec; }

	// set balance
	public void setBalance(double bal){ balance = bal; }

	// get balance
	public double getBalance(){ return balance ;}

	//set gpa
	public void setGpa(double Gpa){ gpa =  Gpa; }

	//get gpa
	public double getGpa(){ return gpa; }

	//get title
	public void setTitle(String title1){ title = title1; }

	//set title
	public String getTitle() { return title; }
	
	
	
	
} // end class AccountRecord









