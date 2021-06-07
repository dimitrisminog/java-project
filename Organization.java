import java.util.ArrayList;
public class Organization
{
String name;
Admin admin;
ArrayList<Entity> entityList=new ArrayList<Entity>();
ArrayList<Donator> donatorList= new ArrayList<Donator>();
ArrayList<beneficiary> beneficiaryList=new ArrayList<beneficiary>();
RequestDonationList currentDonations;
public Organization(String name,String a_name,String a_phone)
{
this.name=name;
Admin admin=new Admin(a_name,a_phone);
}
public void setAdmin(String a_name,String a_phone)
{
admin=null;
Admin a=new Admin(a_name,a_phone);
}
public Admin getAdmin()
{
return admin;
}
public void addEntity(String e_name,String e_description,int e_id,double e_level1,double e_level2,double e_level3)
{
Material m = new Material(e_name,e_description,e_id,e_level1,e_level2,e_level3);
}
public void addEntity(String s_name,String s_description,int s_id)
{
Service s=new Service(s_name,s_description,s_id);
}
public void removeEntity(Entity e,Admin a)
{
if(a instanceof Admin)
e=null;
}
public void insertDonator(String d_name,String d_phone)
{
Donator d=new Donator(d_name,d_phone);
}
public void removeDonator(Donator d)
{
d=null;
}
public void insertBeneficiary(String b_name,String b_phone)
{
 beneficiary be=new beneficiary(b_name,b_phone);
}
public void removeBeneficiary(beneficiary b)
{
b=null;
}
public void listEntities()
{
System.out.println("Entities:Service and Materials");
for (int i = 0; i < entityList.size(); i++)
System.out.print(entityList.get(i) + " ");
}
public void listBeneficiaries()
{
for (int i = 0; i < beneficiaryList.size(); i++)
System.out.print(entityList.get(i) + " ");
}
public void listDonators()
{
for (int i = 0; i < donatorList.size(); i++)
System.out.print(entityList.get(i) + " ");
}
}