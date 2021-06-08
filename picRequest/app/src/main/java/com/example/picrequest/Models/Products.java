package com.example.picrequest.Models;

public class Products{
	private String productCost;
	private String productPic;
	private String id;
	private String productName;

	public void setProductCost(String productCost){
		this.productCost = productCost;
	}

	public String getProductCost(){
		return productCost;
	}

	public void setProductPic(String productPic){
		this.productPic = productPic;
	}

	public String getProductPic(){
		return productPic;
	}

	public void setId(String id){
		this.id = id;
	}

	public String getId(){
		return id;
	}

	public void setProductName(String productName){
		this.productName = productName;
	}

	public String getProductName(){
		return productName;
	}

	@Override
 	public String toString(){
		return 
			"Products{" + 
			"productCost = '" + productCost + '\'' + 
			",productPic = '" + productPic + '\'' + 
			",id = '" + id + '\'' + 
			",productName = '" + productName + '\'' + 
			"}";
		}
}
