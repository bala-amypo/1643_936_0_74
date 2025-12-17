package com.example.demo.entity;

@Entity
public class StudentEntity{
    Private Integer Id;
    Private String Username;
    Private String Email;
    Private String Password;
    Private Data Created;

    //Getter Method
    public void getId(){
        return Id;
    }
    public void getUsername(){
        return Username;
    }
    public void getEmail(){
        return Email;
    }
    public void getPassword(){
        return Password;
    }
    public void getCreated(){
        return Created;
    } 

    //Setter Method
    public void setId(int id){
        this.Id = id;
    }
    public void setUsername(String name){
        this.Username = name;
    }
    public void setEmail(String email){
        this.Email = email;
    }
    public void setPassword(String pass){
        this.Password = pass;
    }
    public void setCreated(Data date){
        this.Created = date;
    } 

    //Constructor
    void getAll(int Id, String name, String Email, String Password, Data Created){
        this.Id = Id;
        this.Username = name;
        this.Email = Email;
        this.Password = Password;
        this.Created = Created;
    }

    //Default Constructor
    void getAll(){

    }

}