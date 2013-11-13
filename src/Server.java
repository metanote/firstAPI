/**
 * Created with IntelliJ IDEA.
 * User: moncef
 * Date: 13/11/13
 * Time: 10:19
 * To change this template use File | Settings | File Templates.
 */

import java.rmi.AccessException;
import java.rmi.RemoteException;
import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;

public class Server {
    public static void main(String[] args) {
        try {
            Registry registry = LocateRegistry.createRegistry(8080);
            RemoteEchoImpl echo;
            echo = new RemoteEchoImpl();
            String rebindName = "echo Ahoy!";
            registry.rebind(rebindName, echo);
            System.out.println("Object Echo BLABLA");
        } catch (AccessException e) {
            e.printStackTrace();
        } catch (RemoteException e) {
            e.printStackTrace();
        }
    }
}