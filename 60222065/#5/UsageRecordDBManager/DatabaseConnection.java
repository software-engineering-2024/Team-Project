import java.sql.Connection;
import java.sql.ResultSet;

// DatabaseConnection 인터페이스
public interface DatabaseConnection {
    Connection connect();
    ResultSet executeQuery(String query);
}

