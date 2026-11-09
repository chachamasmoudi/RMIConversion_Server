package rmiServer;

import java.rmi.Naming;
import java.rmi.registry.LocateRegistry;
import rmiService.ConversionImpl;

public class ConversionServer {
    public static void main(String[] args) {
        try {
            // i. activer l'annuaire RMIRegistry
            LocateRegistry.createRegistry(1099);

            // ii. créer l'instance de l'objet distant
            ConversionImpl conversion = new ConversionImpl();

            // iii. publier la référence dans l'annuaire
            Naming.rebind("rmi://localhost:1099/ConversionService", conversion);

            System.out.println("Serveur RMI prêt...");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}