
package javaapplication18;



public class Customer {
    private int  id;
    private String name;
    private String address;
    private int phone;
    private int acctno;
    private double currentbalance;
    
    public Customer(String n,String add, int i, int ph,  int acct, double ba)
    {
        name =n;
        id= i;
        address= add;
        phone= ph ;
        acctno=acct;
        currentbalance= ba;
    
    }
    public void setName(String n){
        name = n;
    
    }
     public void setID(int i){
         id= i;
     }
      public void setName(int ph){
          phone = ph;
      
      }
    
}
