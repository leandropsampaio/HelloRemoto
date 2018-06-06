package Servidor;

import java.rmi.Naming;

/**
 *
 * @author Leandro Pereira Sampaio
 */
public class Main {

    public static void main(String[] args) {
        try {
            Gestor servidor = new Gestor();
            Naming.rebind("localhost/msg", servidor);

        } catch (Exception ex) {
            System.out.println("ERRO: " + ex.getMessage());
        }

    }
}
