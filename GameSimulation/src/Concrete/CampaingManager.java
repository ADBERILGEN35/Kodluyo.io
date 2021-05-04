package Concrete;

import Abstract.ICampaingService;
import Entities.Campaing;

public class CampaingManager implements ICampaingService {

    @Override
    public void add(Campaing campaign) {
        System.out.println(campaign.getCampaignName() + " Kampanya Uygulandı..");

    }

    @Override
    public void delete(Campaing campaign) {
        System.out.println(campaign.getCampaignName() + " Kampanyal İptal Edildi.");

    }

    @Override
    public void update(Campaing campaign) {
        System.out.println(campaign.getCampaignName() + " Kampanya Güncellendi.");

    }
}
