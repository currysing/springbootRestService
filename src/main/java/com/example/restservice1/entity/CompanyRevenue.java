package com.example.restservice1.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name="CompanyRevenue", schema="dashapp")
public class CompanyRevenue extends KeyColumn {

	@Column(name="revenue_month", nullable=false)
	private String _month;
	
	@Column(name="revenue", nullable=false)
	private double _revenue;
	
	@Column(name="expense")
	private double _expense;
	
	@Column(name="margins")
	private double _margins;

	
	public String get_month() {
		return _month;
	}

	public void set_month(String _month) {
		this._month = _month;
	}

	public double get_revenue() {
		return _revenue;
	}

	public void set_revenue(double _revenue) {
		this._revenue = _revenue;
	}

	public double get_expense() {
		return _expense;
	}

	public void set_expense(double _expense) {
		this._expense = _expense;
	}

	public double get_margins() {
		return _margins;
	}

	public void set_margins(double _margins) {
		this._margins = _margins;
	}
	
}
