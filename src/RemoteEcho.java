import java.rmi.Remote;
import java.rmi.RemoteException;

/**
 * Created with IntelliJ IDEA.
 * User: moncef
 * Date: 13/11/13
 * Time: 08:27
 * To change this template use File | Settings | File Templates.
 */

public interface RemoteEcho extends Remote {
    String hello() throws RemoteException;

    String echo(String s) throws RemoteException;

}
