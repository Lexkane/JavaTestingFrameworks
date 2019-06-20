
package testjunit;

public interface DBInt {
    public String find(int id);
    public int save(int id, String name) throws java.sql.SQLException;
}
