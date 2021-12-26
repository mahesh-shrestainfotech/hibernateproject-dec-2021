package com.sit.entity;

import java.io.Serializable;
import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.Objects;
import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.Table;



@Entity
@Table(name="items")
public class Item implements Serializable{
	
	@Id
	@Column(name="item_id")
	private Long itemId;
	@Column(name="item_name")
	private String itemName;	
	@Column(name="created_date")
	private LocalDate createdDate;	
	@Column(name="initial_price")
	private BigDecimal initialPrice;	
	@Column(name="bid_start_date")
	private LocalDate bidStartDate;	
	@Column(name="bid_end_date")
	private LocalDate bidEndDate;
		
	@OneToMany
	@JoinColumn(name="item_id")
	private Set<Bid> bids;
		
	public Item() {
		// TODO Auto-generated constructor stub
	}	

	public Item(Long itemId, String itemName, LocalDate createdDate, BigDecimal initialPrice, LocalDate bidStartDate,
			LocalDate bidEndDate, Set<Bid> bids) {
		super();
		this.itemId = itemId;
		this.itemName = itemName;
		this.createdDate = createdDate;
		this.initialPrice = initialPrice;
		this.bidStartDate = bidStartDate;
		this.bidEndDate = bidEndDate;
		this.bids = bids;
	}


	

	@Override
	public String toString() {
		return "Item [itemId=" + itemId + ", itemName=" + itemName + ", createdDate=" + createdDate + ", initialPrice="
				+ initialPrice + ", bidStartDate=" + bidStartDate + ", bidEndDate=" + bidEndDate + ", bids=" + bids
				+ "]";
	}

	@Override
	public int hashCode() {
		return Objects.hash(bidEndDate, bidStartDate, bids, createdDate, initialPrice, itemId, itemName);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Item other = (Item) obj;
		return Objects.equals(bidEndDate, other.bidEndDate) && Objects.equals(bidStartDate, other.bidStartDate)
				&& Objects.equals(bids, other.bids) && Objects.equals(createdDate, other.createdDate)
				&& Objects.equals(initialPrice, other.initialPrice) && Objects.equals(itemId, other.itemId)
				&& Objects.equals(itemName, other.itemName);
	}

	public void setBids(Set<Bid> bids) {
		this.bids = bids;
	}
	
	public Set<Bid> getBids() {
		return bids;
	}	
	
	public LocalDate getCreatedDate() {
		return createdDate;
	}

	public void setCreatedDate(LocalDate createdDate) {
		this.createdDate = createdDate;
	}

	public LocalDate getBidStartDate() {
		return bidStartDate;
	}

	public void setBidStartDate(LocalDate bidStartDate) {
		this.bidStartDate = bidStartDate;
	}

	public LocalDate getBidEndDate() {
		return bidEndDate;
	}

	public void setBidEndDate(LocalDate bidEndDate) {
		this.bidEndDate = bidEndDate;
	}

	public Long getItemId() {
		return itemId;
	}

	public void setItemId(Long itemId) {
		this.itemId = itemId;
	}

	public String getItemName() {
		return itemName;
	}

	public void setItemName(String itemName) {
		this.itemName = itemName;
	}


	public BigDecimal getInitialPrice() {
		return initialPrice;
	}

	public void setInitialPrice(BigDecimal initialPrice) {
		this.initialPrice = initialPrice;
	}


	

	
}
