package Cliente;

import java.rmi.Naming;

/**
 *
 * @author Leandro Pereira Sampaio
 */
public class Main {

    public static void main(String[] args) {
        try {
            Mensageiro cliente = (Mensageiro) Naming.lookup("localhost/msg");
            System.out.println(cliente.hello("Leandro"));
            
        } catch (Exception ex) {
            System.out.println("ERRO: " + ex.getMessage());
        }
    }
}
