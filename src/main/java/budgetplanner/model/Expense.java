package budgetplanner.model;

import java.util.Date;

public class Expense {
	private int idExpense;
	private Date date;
	private String bill;
	private String description;
	private double cost;
	 

	public Expense(int idExpense, Date date, String bill,String desciption, double cost) {
		this.idExpense = idExpense;
		this.date = date;
		this.bill = bill;
		this.description = desciption;
		this.cost = cost;
	}

	public Date getDate() {
		return date;
	}

	public String getBill() {
		return bill;
	}
	
	

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public double getCost() {
		return cost;
	}

	public void setCost(double cost) {
		this.cost = cost;
	}

	public String toString() {
		String s = date.toString() + "  ,\n " + bill + " " + cost;
		return s;

	}

	public int getIdExpense() {
		return idExpense;
	}

	public void setIdExpense(int idExpense) {
		this.idExpense = idExpense;
	}

}
