import java.util.ArrayList;

public class Donator extends User
{
public ArrayList <offers> offerList = new ArrayList<offers>();
    
    public Donator(String name, String phone)
    {
        super(name, phone);
    }
     
    public void addOffer(RequestDonation rd) throws DonatorExceptiona 
    {                                                                        
        offersList.add(rd);
    }
    
    public void removeOffer(int id) throws DonatorExceptionb 
    {                                                               
        offersList.remove(id);
    }
    
    public void modifyOffer(int id, double quantity) throws DonatorExceptionc 
    {                                                                                
        offersList.modify(id, quantity);
    }
    
    public String monitorOffers()
    {
        return "CURRENT OFFERS\n" + offersList.monitor();
    }
    
    public void commitOffers()
    {
        offersList.commit();
    }
    
    public void resetOffers()
    {
        offersList.reset();
    }
    
    public Offers getOffersList()
    {
        return offersList;
    }
} 