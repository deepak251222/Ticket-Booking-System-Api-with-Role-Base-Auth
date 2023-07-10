package com.spring.Entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.validation.constraints.Email;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;

@Entity
public class Passenger {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int pid;
    @NotEmpty
	private String pname;
    @Min(value =5,message="must be above 5 digit ")
	private String pauthid;
    @NotNull
	private String page;
    @Email(message = "please enter valid email _____@gmail.com")
	private String pemail;
    @NotEmpty
	private String ppassword;
    private String role;

	public Passenger() {
		super();
	}
	public Passenger(int pid, String pname, String pauthid, String page, String pemail, String ppassword,String role) {
		super();
		this.pid = pid;
		this.pname = pname;
		this.pauthid = pauthid;
		this.page = page;
		this.pemail = pemail;
		this.ppassword = ppassword;
		this.role=role;
	}

	public int getPid() {
		return pid;
	}

	public void setPid(int pid) {
		this.pid = pid;
	}

	public String getPname() {
		return pname;
	}

	public void setPname(String pname) {
		this.pname = pname;
	}

	public String getPauthid() {
		return pauthid;
	}

	public void setPauthid(String pauthid) {
		this.pauthid = pauthid;
	}

	public String getPage() {
		return page;
	}

	public void setPage(String page) {
		this.page = page;
	}

	public String getPemail() {
		return pemail;
	}

	public void setPemail(String pemail) {
		this.pemail = pemail;
	}

	public String getPpassword() {
		return ppassword;
	}

	public void setPpassword(String ppassword) {
		this.ppassword = ppassword;
	}

	public String getRole() {
		return role;
	}
	public void setRole(String role) {
		this.role = role;
	}
	@Override
	public String toString() {
		return "Passenger [pid=" + pid + ", pname=" + pname + ", pauthid=" + pauthid + ", page=" + page + ", pemail="
				+ pemail + ", ppassword=" + ppassword + ", role=" + role + "]";
	}
	
}
