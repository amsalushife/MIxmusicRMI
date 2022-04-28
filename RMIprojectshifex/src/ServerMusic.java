
import java.rmi.*;
import java.rmi.Naming;
public class ServerMusic{
    public static void main(String args[]){
    try{
        RMIinterface stub=new RemoteClass();
        Naming.rebind("rmi://10.194.119.25:62472/MUSIC",stub);
        } catch(Exception e){System.out.println(e);}
     }
}
