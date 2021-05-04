package Concrete;

import Abstract.ISaleService;
import Entities.Campaing;
import Entities.Game;
import Entities.Gamer;
import Entities.Sale;

public class SaleManager implements ISaleService{

    @Override
    public void getId(Sale sale) {
        System.out.println(sale.getGameName()+" isimli oyununu "+sale.getId() +" Numaralı oyuncu satın aldı.");

    }

    @Override
    public void sale(Gamer gamer, Game game) {
        System.out.println(game.getGameName() + "İsimli oyun satildı.");
    }

    @Override
    public void saleCampaign(Gamer gamer, Game game, Campaing campaign) {
        System.out.println(gamer.getFirstName()+" isimli oyuncu "+game.getGameName()+" isimli oyunu aldı."
                + " "+" Uygulanan İnidirim Oranı: "+ game.getPrice()*campaign.getDiscountAmount()/100);

    }

    @Override
    public void update(Gamer gamer, Game game) {
        System.out.println(" Satış Güncellendi.");

    }

    @Override
    public void delete(Gamer gamer, Game game) {
        System.out.println("Satış silindi. ");

    }


}
