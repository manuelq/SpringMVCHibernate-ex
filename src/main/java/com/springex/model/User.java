package com.springex.model;

import java.util.Date;
import java.util.HashSet;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;

import org.springframework.format.annotation.NumberFormat;
import org.springframework.format.annotation.NumberFormat.Style;

@Entity
@Table(name = "t_user")
public class User implements java.io.Serializable {

	private static final long serialVersionUID = 3302763173315884925L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "pk_user_id", unique = true, nullable = true)
	private Long userID;

	@Column(name = "login_name", length = 45)
	private String loginName;

	@Column(name = "email", length = 45)
	private String email;

	@Column(name = "password", length = 45)
	private String password;

	@Column(name = "ordercode")
	private Integer orderCode;

	@ManyToMany(cascade = { CascadeType.ALL })
	@JoinTable(name = "t_user_role", joinColumns = { @JoinColumn(name = "pk_user_id") }, inverseJoinColumns = { @JoinColumn(name = "pk_role_id") })
	private Set<Role> roles = new HashSet<Role>();

	@NotNull
	@NumberFormat(style = Style.CURRENCY)
	private Double balance;

	public User(String string, double d) {
		super();
		this.setLoginName(string);
		this.setBalance(d);
	}
	
	public User(){
		super();
	}

	public Long getUserID() {
		return userID;
	}

	public void setUserID(Long userID) {
		this.userID = userID;
	}

	public String getLoginName() {
		return loginName;
	}

	public void setLoginName(String loginName) {
		this.loginName = loginName;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public Integer getOrderCode() {
		return orderCode;
	}

	public void setOrderCode(Integer orderCode) {
		this.orderCode = orderCode;
	}

	public Set<Role> getRoles() {
		return roles;
	}

	public void setRoles(Set<Role> roles) {
		this.roles = roles;
	}

	public Double getBalance() {
		return balance;
	}

	public void setBalance(Double balance) {
		this.balance = balance;
	}
}
