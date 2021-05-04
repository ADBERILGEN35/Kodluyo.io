package Adapters;

import Entities.Gamer;
import Service.KPSPublic;
import Service.KPSPublicSoap;
import Service.*;

import java.rmi.RemoteException;

public class MernisServiceAdapter implements GamerValidationService {

    @Override
    public boolean validateCheck(Gamer gamer) {
        KPSPublic kpsPublic = new KPSPublic();
        boolean result = false;
        try {
            return kpsPublic.getKPSPublicSoap().tcKimlikNoDogrula(
                    gamer.getNationalityID(),
                    gamer.getFirstName().toUpperCase(),
                    gamer.getLastName().toUpperCase(),
                    gamer.getBirthYear());
        } catch (NumberFormatException e) {
            e.printStackTrace();
        }

        return false;
    }

}