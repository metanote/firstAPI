/**
 * Created with IntelliJ IDEA.
 * User: moncef
 * Date: 13/11/13
 * Time: 10:19
 * To change this template use File | Settings | File Templates.
 */



import java.rmi.NotBoundException;
import java.rmi.Remote;
import java.rmi.RemoteException;
import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;

public class Client {


    public static void main(String[] args) {
        System.out.println("Ahoy client");
        try {
            Registry registry = LocateRegistry.getRegistry(9000);
            Remote rem = registry.lookup("rmi://161.3.116.112/TestRMI");
            System.out.println(rem);
        } catch (RemoteException e) {
            e.printStackTrace();
        } catch (NotBoundException e) {
            e.printStackTrace();
        }
        System.out.println("END client");
    }

}