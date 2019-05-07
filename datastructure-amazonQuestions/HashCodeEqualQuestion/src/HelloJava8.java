
 interface DefaultMethodInterface {
    default public void defaultMethod(){
       System.out.println("DefaultMethodInterface");        
    }
}

 interface DefaultMethodInterface2 {          
        default public void defaultMethod(){
               System.out.println("DefaultMethodInterface2");        
        }
}

public class HelloJava8 implements DefaultMethodInterface,DefaultMethodInterface2 {
   public static void main(String[] args){   
           DefaultMethodInterface defMethIn = new HelloJava8();
           defMethIn.defaultMethod();
    }

@Override
public void defaultMethod() {
	// TODO Auto-generated method stub
	DefaultMethodInterface.super.defaultMethod();
}
}