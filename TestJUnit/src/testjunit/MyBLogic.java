package testjunit;

public class MyBLogic {

    public int editItem(int id, String newName,DBInt db) throws java.sql.SQLException{
        System.out.println("edit item" +id);
        String itemName=db.find(id);
        if (itemName !=null){
            itemName=newName;
            int res= db.save(id,itemName);
            //db.save(id,itemName);
            if (res==2) System.out.println("res==2!!!");
        }
        else throw new IllegalArgumentException("record with id="+id+"not supported");
        return 1;
    }
    
    
}
