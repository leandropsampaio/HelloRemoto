package Servidor;

import Cliente.Mensageiro;
import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;

/**
 *
 * @author Leandro Pereira Sampaio
 */
public class Gestor extends UnicastRemoteObject implements Mensageiro {

    public Gestor() throws RemoteException {
        super();
    }

    @Override
    public String hello(String nome) throws RemoteException {
        return "Bom dia, " + nome;
    }

}
