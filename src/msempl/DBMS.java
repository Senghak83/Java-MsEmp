/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package msempl;

import java.util.ArrayList;

/**
 *
 * @author senghak
 */
public class DBMS {
   private ArrayList<Emp> db = new ArrayList();
   
   public ArrayList<Emp> getAllEmp(){return db ; }
   
   public DBMS(){}
   public DBMS(Emp p){db.add(p);}
   public void InsetEmp(Emp p){db.add(p);}
   public void RemoveEmp(int index ){db.remove(index);}
   public void UpdateEmp(Emp p, int index){db.set(index, p); }
   
   //---- Method --
   public ArrayList<Emp> filterByName(String name){
       ArrayList<Emp> ls = new ArrayList<>();
       for(int i = 0 ; i<db.size(); i++){
           String n = db.get(i).getFullName();
           if(name.length()>n.length())continue;
           n = n.substring(0, name.length());
           if(name.compareTo(n)==0){
               ls.add(db.get(i));
           }
       }// end for loop
       return ls;
   }
   //-----
   public void sortEmp(){
       for(int i = 0 ; i<db.size(); i++){
           for(int j =i+1 ; j<db.size(); j++){
               if(db.get(i).getFirstName().compareTo(db.get(j).getFirstName())>0){
                   Emp e = db.get(i);
                   db.set(i, db.get(j));
                   db.set(j, e);
               }
           }
       }// out loop
   }
   //-------
   
   
}
