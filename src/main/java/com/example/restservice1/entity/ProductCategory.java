package com.example.restservice1.entity;

import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name="ProductCategory", schema="dashapp")
public class ProductCategory extends KeyColumn {

	private String categoryName;
	private int percentage;
	private boolean bestCategory;
	
	
	public String getCategoryName() {
		return categoryName;
	}
	public void setCategoryName(String categoryName) {
		this.categoryName = categoryName;
	}
	public int getPercentage() {
		return percentage;
	}
	public void setPercentage(int percentage) {
		this.percentage = percentage;
	}
	public boolean isBestCategory() {
		return bestCategory;
	}
	public void setBestCategory(boolean bestCategory) {
		this.bestCategory = bestCategory;
	}
	
}
