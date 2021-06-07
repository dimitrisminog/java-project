//klash gia ta eidh dwreas
public abstract class Entity{//abstract gia na mhn ftiaxnei stigmiotupa
private String name;
private String description;
private int id;
public Entity(String name,String description,int id)
{
this.name=name;
this.description=description;
this.id=id;
}
public String getEntityInfo()
{
String q = Integer.toString(id);
return "\n"+name +"\n"+"perigrafh:"+ description + "\nid:"+q;
}
public abstract String getDetails();
@Override
public String toString()
{
return getEntityInfo() +"\n"+ getDetails();
}
public  int getID()
{
return id;
}
}