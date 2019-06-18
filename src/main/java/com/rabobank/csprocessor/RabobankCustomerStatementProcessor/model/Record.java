package com.rabobank.csprocessor.RabobankCustomerStatementProcessor.model;

import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;

public class Record {

	private int tr;
	private String accountNumber;
	private double startBalance;
	private double mutation;
	private String description;
	private double endBalance;

	public Record() {
	}

	public Record(int reference, String accountNumber, double startBalance, double mutation, String description,
				  double endBalance) {
		super();
		this.tr = reference;
		this.accountNumber = accountNumber;
		this.startBalance = startBalance;
		this.mutation = mutation;
		this.description = description;
		this.endBalance = endBalance;
	}

	@XmlAttribute(name="reference")
	public int getReference() {
		return tr;
	}

	public void setReference(int reference) {
		this.tr = reference;
	}

	@XmlElement(name="accountNumber")
	public String getAccountNumber() {
		return accountNumber;
	}

	public void setAccountNumber(String accountNumber) {
		this.accountNumber = accountNumber;
	}

	@XmlElement(name="startBalance")
	public double getStartBalance() {
		return startBalance;
	}

	public void setStartBalance(double startBalance) {
		this.startBalance = startBalance;
	}

	@XmlElement(name="mutation")
	public double getMutation() {
		return mutation;
	}

	public void setMutation(double mutation) {
		this.mutation = mutation;
	}

	@XmlElement(name="description")
	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	@XmlElement(name="endBalance")
	public double getEndBalance() {
		return endBalance;
	}

	public void setEndBalance(double endBalance) {
		this.endBalance = endBalance;
	}

}
