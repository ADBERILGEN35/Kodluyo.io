package Concrete;

import Abstract.IGameService;
import Entities.Game;

public class GameManager implements IGameService {

    @Override
    public void add(Game game) {
        System.out.println(game.getGameName() + " Oyun Eklendi.");

    }

    @Override
    public void update(Game game) {
        System.out.println(game.getGameName() + " Oyun Güncellendi.");

    }

    @Override
    public void delete(Game game) {
        System.out.println(game.getGameName() + " Oyun Silindi.");

    }

}