package fis.test.miniTest;

import java.time.LocalDate;

public class Transaction {
	private Long Id;
	private LocalDate transactionDate;
	private Number formAccount;
	private Double amount;
	private Integer status;
	private String content;
	private String errorReason;
	public Transaction() {
		
	}
	public Transaction(Long _id, LocalDate _tran, Number _form, Double _amount, Integer _status, String _content, String _error) {
		this.Id = _id;
		this.transactionDate = _tran;
		this.formAccount = _form;
		this.amount = _amount;
		this.status = _status;
		this.content = _content;
		this.errorReason = _error;
	}
	public Long getId() {
		return this.Id;
	}
	public LocalDate getTransactionDate() {
		return this.transactionDate;
	}
	public Number getFormAccount() {
		return this.formAccount;
	}
	public Double getAmount() {
		return this.amount;
	}
	public Integer getStatus() {
		return this.status;
	}
	public String getContent() {
		return this.content;
	}
	public String getErrorReason() {
		return this.errorReason;
	}
	public void setId(Long _id) {
		this.Id = _id;
	}
	public void setTransactionDate(LocalDate _date) {
		this.transactionDate = _date;
	}
	public void setFormAccount(Number _form) {
		this.formAccount = _form;
	}
	public void setAmount(Double _amount) {
		this.amount = _amount;
	}
	public void setStatus(Integer _status) {
		this.status = _status;
	}
	public void setContent(String _content) {
		this.content = _content;
	}
	public void setErrorReason(String _error) {
		this.errorReason = _error;
	}
	@Override
	public String toString() {
		return("Transaction Date :" + getTransactionDate() + "\n"
				+ "Form Account :" + getFormAccount() + "\n"
				+ "Amount :" + getAmount() + "\n"
				+ "Status :" + getStatus() + "\n"
				+ "Content :" + getContent() + "\n"
				+ "ErrorReason :" + getErrorReason() + "\n\n");
	}
}
