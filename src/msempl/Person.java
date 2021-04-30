/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package msempl;

/**
 *
 * @author senghak
 */
public class Person {
    private String id;
    private String fname;
    private String lname;
    private String sex;
    private String dob;
    private String address;
    
    public Person( Person p){
        id = p.id;
        fname = p.getFirstName();
        lname = p.lname;
        sex = p.sex;
        dob = p.dob;
        address = p.getAddress();
    }
    public Person(String id, String fn,String ln,String sex,String dob,String add){
        this.id = id; this.fname = fn; this.lname = ln; this.sex = sex ; 
        this.dob = dob; address = add;
    }
    public String getAddress(){return address;}
    public String getFullName(){return fname+" "+lname;}
    public String getID(){return id;}
    public String getLastName(){return lname;}
    public String getFirstName(){return fname;}
    public String getSex(){return sex;}
    public String getDob(){return dob;}
    
    
    
}
