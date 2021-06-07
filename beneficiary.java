import java.util.ArrayList;

public class beneficiary extends User {
    int noPersons=1;

    public RequestDonationList receivedList = new RequestDonationList();
    public Requests requestsList = new Requests();
    
    
    public beneficiary(String onoma,String tilefono){
       super(onoma,tilefono);   }
        
    
    
    public RequestDonationList getReceivedList() {
    
        return receivedList;
    }
    
    public void addReceived(RequestDonation rd) throws BeneficiaryExceptiona { 
                                                                               
        receivedList.add(rd);
    }
    
    public void modifyReceived(int id,double quantity) throws BeneficiaryExceptionb 
    {                                                                                   
        receivedList.modify(id,quantity);
    }
    
    public void removeReceived(int id) throws BeneficiaryExceptionc { 
                                                                      
        receivedList.remove(id);
    }
    
    public String monitorReceived(){
    
        return "dextikame ta etoimata sas"  + receivedList.monitor();
    }
    
    public void resetReceivedList() 
 {
        receivedList.reset();   
    }
    
    public requests getRequestsList() {
   
        return requestsList;
    }
    
    public void addRequest(RequestDonation rd) throws BeneficiaryExceptiond
    {
        requestsList.add(rd);
    }
    
    
    
    public void removeRequest(int id) throws BeneficiaryExceptionc
    {                                                                 
        requestsList.remove(id);
    }
    
    public String monitorRequests()
    {
        return "oriste ta pragmata pou prosferete auti tin stigmi" + requestsList.monitor();
    }
    
    public void commitRequests()
    {
        requestsList.commit();
    }
    
    public void resetRequests()
    {
        requestsList.reset();
    }

    public int getNoPersons()
    {
        return noPersons;
    }

    public void setNoPersons(int noPersons)
    {
        this.noPersons = noPersons;
    }
}