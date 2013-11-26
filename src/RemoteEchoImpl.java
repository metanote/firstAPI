import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;

/**
 * Created with IntelliJ IDEA.
 * User: moncef
 * Date: 13/11/13
 * Time: 08:27
 * To change this template use File | Settings | File Templates.
 */

public class RemoteEchoImpl extends UnicastRemoteObject implements RemoteEcho {
    private static final long serialVersionUID = -7278596802637355415L;

    protected RemoteEchoImpl() throws RemoteException {
        super();
    }

    public String hello() throws RemoteException {
        return "Ahoy";
    }

    public String echo(String s) throws RemoteException {
        return "le message est " + s + "Fom me";
    }


}
