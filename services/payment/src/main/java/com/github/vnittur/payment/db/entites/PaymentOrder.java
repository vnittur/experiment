package com.github.vnittur.payment.db.entites;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import org.joda.time.DateTime;

@Entity
@Table(name = "payment_order")
public class PaymentOrder 
{
	
	@Column(name = "pyo_id")
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
	public int getPyoId() {
		return pyoId;
	}

	public void setPyoId(int pyoId) {
		this.pyoId = pyoId;
	}

	@Column(name = "ord_id",unique = true)
	public long getOrdId() {
		return ordId;
	}

	public void setOrdId(long ordId) {
		this.ordId = ordId;
	}
	
	@Column(name = "amount")
	public double getAmount() {
		return amount;
	}

	public void setAmount(double amount) {
		this.amount = amount;
	}

	@Column(name = "email_id")
	public String getEmailId() {
		return emailId;
	}

	public void setEmailId(String emailId) {
		this.emailId = emailId;
	}
	@Column(name = "phone_number")
	public String getPhoneNumber() {
		return phoneNumber;
	}

	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}

	//Start date time
	@Column(name = "transaction_dttm")
	public DateTime getTransactionDttm() {
		return transactionDttm;
	}

	public void setTransactionDttm(DateTime transactionDttm) {
		this.transactionDttm = transactionDttm;
	}

	@Column(name = "transaction_completion_dttm")
	public DateTime getTransactionCompletionDttm() {
		return transactionCompletionDttm;
	}

	public void setTransactionCompletionDttm(DateTime transactionCompletionDttm) {
		this.transactionCompletionDttm = transactionCompletionDttm;
	}

	@Column(name = "status")
	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	//Currently it will only INR
	@Column(name = "currenty_iso_code")
	public String getCurrencyIsoCode() {
		return currencyIsoCode;
	}

	public void setCurrencyIsoCode(String currencyIsoCode) {
		this.currencyIsoCode = currencyIsoCode;
	}

	//Payment order id, used as transaction id
	private int pyoId;
	
	//Actual order id from order service.
	private long ordId;
	
	//Amount of transaction.
	private double amount;
	
	//String email id of buyer
	private String emailId;
	
	//Phone number of the buyer, this is string as numbers can contain +91 or +61 digits.
	private String phoneNumber;
	
	//Transaction date time
	private DateTime transactionDttm;
	
	//Transaction completion time;
	private DateTime transactionCompletionDttm;
	
	//Transaction status(Success/Failed)
	private String status;
	
	//Currency of the amount, its better to store amount in bigdecimal if we need currency convertion at later stage.
	private String currencyIsoCode;
}
