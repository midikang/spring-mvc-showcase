package org.springframework.samples.mvc.midi;

import java.math.BigDecimal;
import java.util.Date;

import javax.validation.constraints.Min;

import org.hibernate.validator.constraints.NotEmpty;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.format.annotation.DateTimeFormat.ISO;
import org.springframework.format.annotation.NumberFormat;
import org.springframework.format.annotation.NumberFormat.Style;
import org.springframework.samples.mvc.convert.MaskFormat;

public class Shipment {
	
	@NotEmpty
	private String customer;
	
	@Min(1)
	private int totalContainer;
	
	@DateTimeFormat(iso=ISO.DATE)
	private Date createDate; 
	
	@MaskFormat("(###) ########")
	private String customerPhone;
	
	@NumberFormat(pattern="RMB ###,###.00")
	private BigDecimal currency;
	
	@NumberFormat(style=Style.PERCENT)
	private BigDecimal percent;

	public String getCustomer() {
		return customer;
	}

	public void setCustomer(String customer) {
		this.customer = customer;
	}

	public int getTotalContainer() {
		return totalContainer;
	}

	public void setTotalContainer(int totalContainer) {
		this.totalContainer = totalContainer;
	}

	public Date getCreateDate() {
		return createDate;
	}

	public void setCreateDate(Date createDate) {
		this.createDate = createDate;
	}

	public String getCustomerPhone() {
		return customerPhone;
	}

	public void setCustomerPhone(String customerPhone) {
		this.customerPhone = customerPhone;
	}

	public BigDecimal getCurrency() {
		return currency;
	}

	public void setCurrency(BigDecimal currency) {
		this.currency = currency;
	}

	public BigDecimal getPercent() {
		return percent;
	}

	public void setPercent(BigDecimal percent) {
		this.percent = percent;
	}
	
	

}
