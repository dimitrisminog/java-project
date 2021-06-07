public class Admin extends User {
       final boolean isAdmin=true;
       public Admin (String name,String phone) {
           super(name,phone);
       }
    @Override
public String toString()
{
return "admin name:"+getName()+"\n phone:" + getPhone();
}    
    }