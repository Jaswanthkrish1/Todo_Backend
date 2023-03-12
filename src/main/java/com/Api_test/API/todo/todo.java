package com.Api_test.API.todo;

import java.util.Date;
import java.util.Objects;

public class todo {
	private Long PrbId;
	private String name;
	private String Problam;
	private boolean workComplited;
	private Date date;

	public todo(Long prbId,String name, String problam, boolean workComplited, Date date) {
		super();
		PrbId = prbId;
		this.name=name;
		Problam = problam;
		this.workComplited = workComplited;
		this.date = date;
	}
    public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Long getPrbId() {
		return PrbId;
	}
	public void setPrbId(Long prbId) {
		PrbId = prbId;
	}
	public String getProblam() {
		return Problam;
	}
	public void setProblam(String problam) {
		Problam = problam;
	}
	public boolean isWorkComplited() {
		return workComplited;
	}
	public void setWorkComplited(boolean workComplited) {
		this.workComplited = workComplited;
	}
	public Date getDate() {
		return date;
	}
	public void setDate(Date date) {
		this.date = date;
	}
	@Override
	public int hashCode() {
		return Objects.hash(PrbId);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return true;
		todo other = (todo) obj;
		return Objects.equals(PrbId, other.PrbId);
	}
	
}
