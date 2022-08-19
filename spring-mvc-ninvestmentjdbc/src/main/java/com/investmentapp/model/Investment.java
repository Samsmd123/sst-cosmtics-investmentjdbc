package com.investmentapp.model;

import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.validation.constraints.Size;

public class Investment {
	
	@Size(min=2,max=10)
	private String planName;
	private Integer planId;
	@Min(2)
	@Max(70)
	private int age;
	private String type;// mutual,ulip,ppf,fd,rd
	@Min(100)
	private double amount;
	private String purpose;//education,retirement,marriage
	private String risk;
	private String nominee;
	@Min(5)
	@Max(20)
	private int duartion;
	private int term;
	
	public Investment() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Investment(String planName, int age, String type, double amount, String purpose, String risk, String nominee,
			int duartion, int term) {
		super();
		this.setPlanName(planName);
		this.setAge(age);
		this.setType(type);
		this.setAmount(amount);
		this.setPurpose(purpose);
		this.setRisk(risk);
		this.setNominee(nominee);
		this.setDuartion(duartion);
		this.setTerm(term);
	}
	public String getPlanName() {
		return planName;
	}
	public void setPlanName(String planName) {
		this.planName = planName;
	}
	public Integer getPlanId() {
		return planId;
	}
	public void setPlanId(Integer planId) {
		this.planId = planId;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public int getTerm() {
		return term;
	}
	public void setTerm(int term) {
		this.term = term;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public double getAmount() {
		return amount;
	}
	public void setAmount(double amount) {
		this.amount = amount;
	}
	public String getPurpose() {
		return purpose;
	}
	public void setPurpose(String purpose) {
		this.purpose = purpose;
	}
	public String getRisk() {
		return risk;
	}
	public void setRisk(String risk) {
		this.risk = risk;
	}
	public String getNominee() {
		return nominee;
	}
	public void setNominee(String nominee) {
		this.nominee = nominee;
	}
	public int getDuartion() {
		return duartion;
	}
	public void setDuartion(int duartion) {
		this.duartion = duartion;
	}
	@Override
	public String toString() {
		return "Investment [planName=" + planName + ", planId=" + planId + ", age=" + age + ", type=" + type
				+ ", amount=" + amount + ", purpose=" + purpose + ", risk=" + risk + ", nominee=" + nominee
				+ ", duartion=" + duartion + ", term=" + term + "]";
	}

}
