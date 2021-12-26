package com.sit.entity;

import java.io.Serializable;
import java.math.BigDecimal;
import java.time.LocalDate;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "bids")
public class Bid implements Serializable {

	@Id
	@Column(name = "bid_id")
	private Long bidId;
	@Column(name = "bid_price")
	private BigDecimal bidPrice;
	@Column(name = "bid_date")
	private LocalDate bidDate;
			
	public Bid() {
		// TODO Auto-generated constructor stub
	}

	public Bid(Long bidId, BigDecimal bidPrice, LocalDate bidDate) {
		super();
		this.bidId = bidId;
		this.bidPrice = bidPrice;
		this.bidDate = bidDate;
	}
	
	@Override
	public String toString() {
		return "Bid [bidId=" + bidId + ", bidPrice=" + bidPrice + ", bidDate=" + bidDate + "]";
	}

	public Long getBidId() {
		return bidId;
	}

	public void setBidId(Long bidId) {
		this.bidId = bidId;
	}

	public BigDecimal getBidPrice() {
		return bidPrice;
	}

	public void setBidPrice(BigDecimal bidPrice) {
		this.bidPrice = bidPrice;
	}

	public LocalDate getBidDate() {
		return bidDate;
	}

	public void setBidDate(LocalDate bidDate) {
		this.bidDate = bidDate;
	}

}
