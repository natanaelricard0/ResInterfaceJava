package entities;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Contract {
	private Integer number;
	private Date date;
	private Double totalvalue;
	
	List<Installment> installments = new ArrayList<>();
	
	public Contract() {
		
	}

	public Contract(Integer number, Date date, Double totalvalue) {
		this.number = number;
		this.date = date;
		this.totalvalue = totalvalue;
	}

	public Integer getNumber() {
		return number;
	}

	public void setNumber(Integer number) {
		this.number = number;
	}

	public Date getDate() {
		return date;
	}

	public void setDate(Date date) {
		this.date = date;
	}

	public Double getTotalvalue() {
		return totalvalue;
	}

	public void setTotalvalue(Double totalvalue) {
		this.totalvalue = totalvalue;
	}

	public List<Installment> getInstallments() {
		return installments;
	}
	
}
