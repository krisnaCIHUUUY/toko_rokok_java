/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 *
 * @author ACER
 */
public class User {
    private int userId;
    private String username;
    private String password;
    
    public User(int userId, String username, String password){
        this.userId = userId;
        this.username = username;
        this.password = password;
    }
    
    public int getUserId(){
        return this.userId;
    }
    
    public void setUserId(int newId){
        this.userId = newId;
    }
    public String getUsername(){
        return this.username;
    }
    
    public void setUsername(String newUsername){
        this.username = newUsername;
    }
    public String getPassword(){
        return this.password;
    }
    
    public void setPassword(String newPassword){
        this.password = newPassword;
    }
    
    
}
