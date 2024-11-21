package com.DoAnChuyenNganh.UngDungDatVeXemPhim.Entity;





import java.util.Date;

import jakarta.persistence.*;

@Entity
@Table(name = "accounts")
public class Accounts {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int account_id;
    
    @Column(name = "user_name", length = 50, nullable = false)
    private String userName;       // PK, varchar(50), not null
    
    @Column(name = "password", length = 255, nullable = false)
    private String password;   // varchar(255), not null
    
    @Column(name = "email", length = 100, nullable = false)
    private String email;          // varchar(100), not null
    
    @Column(name = "createAt")
    private Date createdAt;        // datetime, nullable
    
    @Column(name = "status")
    private int status;        // bit, nullable
    
    @Column(name = "role", length = 20)
    private String accountRole;    // nvarchar(10), nullable

    // No-argument constructor
    public Accounts() {
    	
    }

    
	public Accounts(String userName, String password, String email, Date createdAt, int status, String accountRole) {
		super();
		this.userName = userName;
		this.password = password;
		this.email = email;
		this.createdAt = createdAt;
		this.status = status;
		this.accountRole = accountRole;
	}


	public int getaccount_id() {
		return account_id;
	}

	public void setaccount_id(int account_id) {
		this.account_id = account_id;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public Date getCreatedAt() {
		return createdAt;
	}

	public void setCreatedAt(Date createdAt) {
		this.createdAt = createdAt;
	}

	public int getStatus() {
		return status;
	}

	public void setStatus(int status) {
		this.status = status;
	}

	public String getAccountRole() {
		return accountRole;
	}

	public void setAccountRole(String accountRole) {
		this.accountRole = accountRole;
	}

    
 
}


