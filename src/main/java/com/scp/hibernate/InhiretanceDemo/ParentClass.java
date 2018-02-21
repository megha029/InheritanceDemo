package com.scp.hibernate.InhiretanceDemo;

import javax.persistence.Column;
import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.Table;
import javax.transaction.Transaction;

import org.hibernate.Session;
import org.hibernate.annotations.Parent;

@Entity
@Table
@Inheritance(strategy = InheritanceType.SINGLE_TABLE)
@DiscriminatorValue("P")
public class ParentClass {
	@Id
	@Column(name = "ID")
	@GeneratedValue(strategy = GenerationType.TABLE)
	private int PID;

	@Column
	private String pname;

	public int getPID() {
		return PID;
	}

	public void setPID(int pID) {
		PID = pID;
	}

	public String getPname() {
		return pname;
	}

	public void setPname(String pname) {
		this.pname = pname;
	}

	@Override
	public String toString() {
		return "ParentClass [PID=" + PID + ", pname=" + pname + "]";
	}

	public ParentClass() {
		super();
		// TODO Auto-generated constructor stub
	}

	public ParentClass(int pID, String pname) {
		super();
		PID = pID;
		this.pname = pname;
	}

}

@Entity
@Table
@DiscriminatorValue("c1")
class Child1 extends ParentClass {

	@Column
	private String Cname;
	@Column
	private String city;

	public String getCname() {
		return Cname;
	}

	public void setCname(String cname) {
		Cname = cname;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	@Override
	public String toString() {
		return "Child1 [Cname=" + Cname + ", city=" + city + "]";
	}

	public Child1(String cname, String city) {
		super();
		Cname = cname;
		this.city = city;
	}

}

@Entity
@Table
@DiscriminatorValue("c2")
class child2 extends ParentClass {

	@Column
	private String Cname2;

	@Column
	private String Ccity2;

	public String getCname2() {
		return Cname2;
	}

	public void setCname2(String cname2) {
		Cname2 = cname2;
	}

	public String getCcity2() {
		return Ccity2;
	}

	public void setCcity2(String ccity2) {
		Ccity2 = ccity2;
	}

	@Override
	public String toString() {
		return "child2 [Cname2=" + Cname2 + ", Ccity2=" + Ccity2 + "]";
	}

	public child2(String cname2, String ccity2) {
		super();
		Cname2 = cname2;
		Ccity2 = ccity2;
	}

}
