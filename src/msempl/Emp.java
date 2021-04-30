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
public class Emp extends Person {
    private String pos;
    private String startwork;
    private String phone;
    private double salary;
    
    public Emp(String pos,String startwork,String phone,double salary,Person p){
        super(p);
        this.pos = pos; this.startwork = startwork; this.phone = phone;
        this.salary = salary;
    }
    
    public void setPosition(String position){pos = position;}
    public void setStartWork(String startwork){this.startwork = startwork;}
    public void setSalary(double salary){this.salary = salary;}
    public void setPhoneNumber(String number){phone = number;}
    
    public String getPosition(){return pos;}
    public String getStartWork(){return startwork;}
    public String getPhoneNumber(){return phone;}
    public double getSalary(){return salary;}
    
    
}
