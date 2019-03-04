package com.example.demo.model.entity;

import java.sql.Date;

public class EmpVo {
	private int empno,mgr;
	private String ename,job;
	private Date hiredate;
	
	public EmpVo() {
	}

	public EmpVo(int empno, String ename, String job, int mgr, Date hiredate) {
		super();
		this.empno = empno;
		this.mgr = mgr;
		this.ename = ename;
		this.job = job;
		this.hiredate = hiredate;
	}

	@Override
	public String toString() {
		return "EmpVo [empno=" + empno + ", mgr=" + mgr + ", ename=" + ename + ", job=" + job + ", hiredate=" + hiredate
				+ "]";
	}

	public int getEmpno() {
		return empno;
	}

	public void setEmpno(int empno) {
		this.empno = empno;
	}

	public int getMgr() {
		return mgr;
	}

	public void setMgr(int mgr) {
		this.mgr = mgr;
	}

	public String getEname() {
		return ename;
	}

	public void setEname(String ename) {
		this.ename = ename;
	}

	public String getJob() {
		return job;
	}

	public void setJob(String job) {
		this.job = job;
	}

	public Date getHiredate() {
		return hiredate;
	}

	public void setHiredate(Date hiredate) {
		this.hiredate = hiredate;
	}
	
}
