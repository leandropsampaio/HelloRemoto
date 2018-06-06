package Cliente;

import java.rmi.Remote;
import java.rmi.RemoteException;

/**
 *
 * @author Leandro Pereira Sampaio
 */
public interface Mensageiro extends Remote {

    public String hello(String nome) throws RemoteException;
    
}
