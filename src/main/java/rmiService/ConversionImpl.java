package rmiService;

import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;

public class ConversionImpl extends UnicastRemoteObject implements IConversion {

    private static final double TAUX_EUR_TND = 3.43; // taux simplifié, à ajuster

    public ConversionImpl() throws RemoteException {
        super(); // exporte l'objet (port TCP ouvert, stub généré)
    }

    @Override
    public double convertirMontant(double mt) throws RemoteException {
        return mt * TAUX_EUR_TND;
    }
}