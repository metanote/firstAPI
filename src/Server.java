/**
 * Created with IntelliJ IDEA.
 * User: moncef
 * Date: 13/11/13
 * Time: 10:19
 * To change this template use File | Settings | File Templates.
 */

import java.net.InetAddress;
import java.net.UnknownHostException;
import java.rmi.AccessException;
import java.rmi.RemoteException;
import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;

public class Server {
    public static void main(String[] args) {
        try {
            Registry registry = LocateRegistry.createRegistry(9000);
            RemoteEchoImpl remoteEchoImpl = new RemoteEchoImpl();
            String url = "rmi://" + InetAddress.getLocalHost().getHostAddress() + "/TestRMI";
            System.out.println("Enregistrement de l'objet avec l'url : " + url);
            registry.rebind(url, remoteEchoImpl);

            System.out.println("Serveur lancé");
            System.out.println(remoteEchoImpl.hello());
        } catch (RemoteException e) {
            e.printStackTrace();
        } catch (UnknownHostException e) {
            e.printStackTrace();
        }
    }
}