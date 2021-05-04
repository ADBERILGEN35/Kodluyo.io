import java.rmi.RemoteException;
import Abstract.IGamerService;
import Adapters.GamerValidationService;
import Adapters.MernisServiceAdapter;
import Concrete.GameManager;
import Concrete.GamerManager;
import Entities.Campaing;
import Service.*;
import Entities.Game;
import Entities.Gamer;
import Entities.Sale;
import Entities.Campaing;
public class Main {

    public static void main(String[] args)  {
        GamerValidationService gamerValidationService=new MernisServiceAdapter();
        Campaing campaign1 = new Campaing(1,"Yeni kayit indirimi",20);

        GamerManager gamerManager = new GamerManager(new MernisServiceAdapter());
        GameManager gameManager = new GameManager();
        Gamer gamer1 = new Gamer(3, "Oğuzhan", "Taşyaran",1995,1349944160L);
        Game game1 = new Game(1, "COD-8",95,15,30);

        if(gamerValidationService.validateCheck(gamer1)) {
            gamerManager.add(gamer1);
            gameManager.add(game1);
        }else {
            System.out.println("Mernis bilgileri teyit edilemedi.Kayıt başarısız.");
        }
    }

}
