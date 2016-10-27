/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package inheritance;

/**
 *
 * @author juba
 */
class A{
    int i, j;
    void showij(){
System.out.println("i and j :"+i+ " "+j);
    }
}

class B extends A {
    int k,u;
    void showku (){
        System.out.println("k  and U:"+k  + " "+u);
        
    }
    class C extends A{
        
    }
void sum(){
    
    System.out.println("comlex :" +(i+j+k*u));
    
}
}

public class Inheritance {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        A superob=new A();
        B subob=new B ();
        superob.i= 15;
        superob.j=20;
        System.out.println("contents of super object:");
        superob.showij();
        System.out.println();
        
        subob.k=30;
        subob.u=superob.i+superob.j;
           System.out.println("contents of subob:");
           subob.showku();
           System.out.println();
           System.out.println("complex equation ;");
           subob.sum();
        
        // TODO code application logic here
    }
    
}
