public class RequestDonation
{
private Entity entity;
private double quantity;
public RequestDonation(String wName,String wDescription,int wId,double quantity) //constructor for Service
throws CheckEntityException
{
/*for (int i=0;i<rdEntities.size();i++)
{
if(rdEntities.get(i).getID==wId)
throw new CheckEntityException();
}*/
Service w=new Service(wName,wDescription,wId);
this.quantity=quantity;
}
public RequestDonation(String Name,String Description,int Id,double Level1,double Level2,double Level3,double quantity) 
{
for (int i=0;i<rdEntities.size();i++)
{
if(rdEntities.get(i)==Id)
throw new CheckEntityException();
}
Material r=new Material(Name,Description,Id,Level1,Level2,Level3);
this.quantity=quantity;
}//constructor for materials
public int getID()
{
return getID();
}
public double getQuantity()
{
return quantity;
}
public void setQuantity(double quan) 
{
this.quantity=quan;
}
}