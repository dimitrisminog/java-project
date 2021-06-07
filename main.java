public class main{
public static void main(String[] args)
{
Organization org=new Organization("organwsh voitheias","KWSTAS","69345566464");
org.addEntity("milk","good for kids",121,1.0,0.0,0.0);
org.addEntity("sugar","used in coffee",122,0.0,1.0,0.0);
org.addEntity("rice","delicious",123,0.0,0.0,1.0);
org.addEntity("Medical Support","for every need of medicine",124);
org.addEntity("Nursey Supprot","for every need of hospital",125);
org.addEntity("BabySitting","the best people",126);
beneficiary b1=new beneficiary("mixalis","69434423");
beneficiary b2=new beneficiary("dimitris","546564554");
Donator d1=new Donator("thomas","224573");
MENU menu=new MENU();
menu.start(org);
}}