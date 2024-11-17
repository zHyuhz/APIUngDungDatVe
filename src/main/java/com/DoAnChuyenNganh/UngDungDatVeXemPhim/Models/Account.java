package com.DoAnChuyenNganh.UngDungDatVeXemPhim.Models;





import java.util.Date;

import jakarta.persistence.*;

@Entity
@Table(name = "account")
public class Account {
    
    @Id
    @Column(name = "Username", length = 50, nullable = false)
    private String userName;       // PK, varchar(50), not null
    
    @Column(name = "passwordhash", length = 255, nullable = false)
    private String passwordHash;   // varchar(255), not null
    
    @Column(name = "Email", length = 100, nullable = false)
    private String email;          // varchar(100), not null
    
    @Column(name = "createdat")
    private Date createdAt;        // datetime, nullable
    
    @Column(name = "Status")
    private Boolean status;        // bit, nullable
    
    @Column(name = "accountrole", length = 10)
    private String accountRole;    // nvarchar(10), nullable

    // No-argument constructor
    public Account() {
    }

    // Constructor with all parameters
    public Account(String username, String passwordHash, String email) {
        this.userName = username;
        this.passwordHash = passwordHash;
        this.email = email;
    }

    // Getters and Setters
    public String getUserName() {
        return userName;
    }

    public void setUserName(String username) {
        this.userName = username;
    }

    public String getPasswordHash() {
        return passwordHash;
    }

    public void setPasswordHash(String passwordHash) {
        this.passwordHash = passwordHash;
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

    public Boolean getStatus() {
        return status;
    }

    public void setStatus(Boolean status) {
        this.status = status;
    }

    public String getAccountRole() {
        return accountRole;
    }

    public void setAccountRole(String accountRole) {
        this.accountRole = accountRole;
    }

    // Optional: Override toString method for easy printing
    @Override
    public String toString() {
        return "User{" +
                "username='" + userName + '\'' +
                ", passwordHash='" + passwordHash + '\'' +
                ", email='" + email + '\'' +
                ", createdAt=" + createdAt +
                ", status=" + status +
                ", accountRole='" + accountRole + '\'' +
                '}';
    }
}


