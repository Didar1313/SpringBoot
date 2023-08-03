package com.example.demo.ProgrammerClass;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;


@Entity
public class Programmer {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int pId;
	private String pName;
	private String pLang;
	public Programmer(int pId, String pName, String pLang) {
		super();
		this.pId = pId;
		this.pName = pName;
		this.pLang = pLang;
	}
	public Programmer() {
		super();
	}
	public int getpId() {
		return pId;
	}
	public void setpId(int pId) {
		this.pId = pId;
	}
	public String getpName() {
		return pName;
	}
	public void setpName(String pName) {
		this.pName = pName;
	}
	public String getpLang() {
		return pLang;
	}
	public void setpLang(String pLang) {
		this.pLang = pLang;
	}
}
