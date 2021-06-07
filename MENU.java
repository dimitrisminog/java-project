import java.util.*;
public class MENU
{
public MENU(){};
public static int code=0;//analoga ton kwdiko fainete poios exei syndethei
public void start(Organization or)//methodos gia energopoihsh eframoghs
{
System.out.println("parakalw dwste ton arithmo thlefwnou:");
Scanner sc=new Scanner(System.in);
Scanner sca=new Scanner(System.in);
 String thl= sc.nextLine();
 
 if(thl==or.getAdmin().getPhone())
 {
int  codeA=0;
do{
 System.out.println("kalwshrthate Admin:"+or.getAdmin());
 System.out.println("MENU FOR admin \n");
 System.out.println("1:VIEW\n2:Monitor Organization \n3:Back\n4:Logout\n5:Exit");
  codeA=sca.nextInt();
  switch(codeA)
  {
  case 1://view
  or.listEntities();
  break;
  case 2://monitor organization
  int insert;
  do{
  System.out.println("emfanisei listas beneficiaries(1)\nlistas donators(2)\nreset beneficiraries(3)");
  insert=0;
  insert=sca.nextInt();
  if(insert==1)
  or.listBeneficiaries();
  else if(insert==2)
  or.listDonators();
  else if(insert==3)
  or.beneficiaryList.clear();
}while(insert==0||insert<0|| insert>3);
  break;
  case 3://back
  break;
  case 4://logout
  
  break;
  }
}while(codeA==5 || codeA>5 || codeA<1);
 }
 for(int i=0;i<or.beneficiaryList.size();i++){
 if(or.beneficiaryList.get(i).getBenPhone()==thl)

{
System.out.println("kaloshrthes beneficiay:"+ or.beneficiaryList.get(i));
System.out.println("\n1:add request\n2:show requests\n3:commit\n4:back\n5:logout\n6:exit\nepilexte ti thleete na kanete:");
int codeB=0;
codeB=sc.nextInt();
switch(codeB)
{
case 1://add request

}
break;
}}
 if(listDonators.contains(thl))
{
System.out.println("kalwshrthes donator:"+getDonator());
}
else
{
{System.out.printlf("thelete na kanete egrafi: y/n?");

String egrafi;

String egrafi= sc.nextLine();

if (egrafi="y") { System.out.printlf("os ti thelete na egrafite?"); //arxizei to if

String neosxristis= sc.nextLine();
switch (neosxristis) { //arxizei to switch casement
case "Donator" :
org.insertDonator();
System.out.println("Egrafikate epitixos os donator"+getDonator());
break;
case "Beneficiary" :
org.insertBeneficiary()
System.out.printlf("Egrafikate epitixos os beneficiary" + getBeneficiary());
break;
default:
System.out.println("valte mia apo tis 2 epiloges gia na kanete egrafi parakalo");  
break; } //telionei switch
}//telionei if

else {System.out.println("Kali sas mera"); }
} //telionei to else
}//kwdikas gia eggrafh
}
}