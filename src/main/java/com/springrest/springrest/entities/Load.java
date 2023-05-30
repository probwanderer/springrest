package com.springrest.springrest.entities;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity(name = "Load")
@javax.persistence.Table(name = "`load`")
public class Load {
	
	@Id
    @GeneratedValue(strategy = GenerationType.AUTO)
	private long id;
	private String loadingPoint;
	private String unloadingPoint;
	private String productType;
	private String truckType;
	private Integer noOfTrucks;
	private Integer weight;
	private String comment;
	private String shipperID;
	private String Date;
	public Load(long id, String loadingPoint, String unloadingPoint, String productType, String truckType,
			Integer noOfTrucks, Integer weight, String comment, String shipperID, String date) {
		super();
		this.id = id;
		this.loadingPoint = loadingPoint;
		this.unloadingPoint = unloadingPoint;
		this.productType = productType;
		this.truckType = truckType;
		this.noOfTrucks = noOfTrucks;
		this.weight = weight;
		this.comment = comment;
		this.shipperID = shipperID;
		Date = date;
	}
	public Load() {
		super();
		// TODO Auto-generated constructor stub
	}
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getLoadingPoint() {
		return loadingPoint;
	}
	public void setLoadingPoint(String loadingPoint) {
		this.loadingPoint = loadingPoint;
	}
	public String getUnloadingPoint() {
		return unloadingPoint;
	}
	public void setUnloadingPoint(String unloadingPoint) {
		this.unloadingPoint = unloadingPoint;
	}
	public String getProductType() {
		return productType;
	}
	public void setProductType(String productType) {
		this.productType = productType;
	}
	public String getTruckType() {
		return truckType;
	}
	public void setTruckType(String truckType) {
		this.truckType = truckType;
	}
	public Integer getNoOfTrucks() {
		return noOfTrucks;
	}
	public void setNoOfTrucks(Integer noOfTrucks) {
		this.noOfTrucks = noOfTrucks;
	}
	public Integer getWeight() {
		return weight;
	}
	public void setWeight(Integer weight) {
		this.weight = weight;
	}
	public String getComment() {
		return comment;
	}
	public void setComment(String comment) {
		this.comment = comment;
	}
	public String getShipperID() {
		return shipperID;
	}
	public void setShipperID(String shipperID) {
		this.shipperID = shipperID;
	}
	public String getDate() {
		return Date;
	}
	public void setDate(String date) {
		Date = date;
	}
	@Override
	public String toString() {
		return "Load [id=" + id + ", loadingPoint=" + loadingPoint + ", unloadingPoint=" + unloadingPoint
				+ ", productType=" + productType + ", truckType=" + truckType + ", noOfTrucks=" + noOfTrucks
				+ ", weight=" + weight + ", comment=" + comment + ", shipperID=" + shipperID + ", Date=" + Date + "]";
	}

		
}
