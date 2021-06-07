import java.util.ArrayList;
public class RequestDonationList
{
public ArrayList <RequestDonation> rdEntities=new ArrayList<RequestDonation>();
public RequestDonationList(){};

public ArrayList<RequestDonation> getrdEntities()
{
return rdEntities;
}
int in=0;
public RequestDonation get(int id)
{ 
int flag0=0;
for(int i=0;i<rdEntities.size();i++)
{
if(rdEntities.get(i).getID()==id)
 flag0=i;
}
return rdEntities.get(flag0);
}
public void add(RequestDonation re)
{
boolean flag1=false;
for(int i=0;i<rdEntities.size();i++)
{
 if(rdEntities.get(i).getID()==re.getID())
 {
 flag1=true;
 in=i;
 break;
 }
} 
if(flag1==true)
rdEntities.get(in).setQuantity(re.getQuantity()); 
else rdEntities.add(re);
} 
public void remove()
{
rdEntities.remove(in);
} 
public void modify(double newQuan,int num)
{
rdEntities.get(num).setQuantity(newQuan);
}
public void monitor()
{
for(int i=0;i<rdEntities.size();i++)
{
System.out.println(rdEntities.get(i)+"  ,");
}
}
public void reset()
{
rdEntities.clear();
}
}
