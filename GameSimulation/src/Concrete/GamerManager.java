package Concrete;

import Abstract.IGamerService;
import Adapters.GamerValidationService;
import Entities.Gamer;

public class GamerManager implements IGamerService{

    private GamerValidationService gamerValidationService;


    public GamerManager(GamerValidationService gamerValidationService) {
        this.gamerValidationService = gamerValidationService;
    }

    @Override
    public void add(Gamer gamer) {

        System.out.println("Sisteme oyuncu kaydı gerçekleştirildi. "+gamer.getFirstName()+" "+gamer.getLastName());


    }

    @Override
    public void update(Gamer gamer) {
        System.out.println(gamer.getFirstName()+ " "+ gamer.getLastName() + " Gamer güncellendi. .");
    }

    @Override
    public void delete(Gamer gamer) {
        System.out.println(gamer.getFirstName()+ " "+ gamer.getLastName() + " Gamer silindi.");

    }



}
