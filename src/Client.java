/**
 * Created with IntelliJ IDEA.
 * User: moncef
 * Date: 13/11/13
 * Time: 10:19
 * To change this template use File | Settings | File Templates.
 */

import java.rmi.NotBoundException;
import java.rmi.RemoteException;
import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;

public class Client {
    public static void main(String[] args) {
        String serverAdress = "localhost";
        try {
            Registry registry = LocateRegistry.getRegistry(serverAdress, 8080);
            RemoteEcho echo = (RemoteEcho) registry.lookup("echo");
            System.out.println("Connection OK to " + serverAdress);
            String s = echo.Hello() + "\n" + echo.Echo("All your base are belong to us");
                System.out.println(s);
        } catch (RemoteException e) {
            e.printStackTrace();
        } catch (NotBoundException e) {
            e.printStackTrace();
        }
    }
}