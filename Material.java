public class Material extends Entity
{
final private double level1;//posothta gia 1 atomo
final private double level2;//gia 2-4 atoma
final private double level3;// 5+ atoma
public Material(String name,String description,int id,double level1,double level2,double level3)
{
super(name,description,id);
this.level1=level1;
this.level2=level2;
this.level3=level3;
}
public String getDetails()
{
return "Object Materials: level1:"+Double.toString(level1)+"\n level 2:"+ Double.toString(level2)+"\n level3:"+Double.toString(level3);
}
public int getID()
{
return getID();
}
}