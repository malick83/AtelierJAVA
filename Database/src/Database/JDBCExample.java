package Database;
import java.sql.*;//teste
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;


public class JDBCExample {

    public static void main(String[] args) {

        // https://docs.oracle.com/javase/8/docs/api/java/sql/package-summary.html#package.description
        // auto java.sql.Driver discovery -- no longer need to load a java.sql.Driver class via Class.forName

        // register JDBC driver, optional since java 1.6
    	
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }

        // auto close connection
        try {
            // db parameters
            
            final String DB_DSN = "jdbc:mysql://localhost:3306/jdbcData";
            final String DB_USER = "m3ta";
            final String DB_PASS = "";
            
        	Connection conn = DriverManager.getConnection(DB_DSN, DB_USER, DB_PASS);

            if (conn != null) {
                System.out.println("Connected to the database!");
                
              //étape 3: créer l'objet statement 
                Statement stmt = conn.createStatement();
                
                //étape 4: exécuter la requête
                ResultSet res = stmt.executeQuery("select * from c_users");
                
                while(res.next())
                  System.out.println(res.getInt(1)+"  "+res.getString(2)+"  "
                  +res.getString(3));
                
                //étape 5: fermez l'objet de connexion
                conn.close();
                
            } else {
                System.out.println("Failed to make connection!");
            }
            

        } catch (SQLException e) {
            System.err.format("SQL State: %s\n%s", e.getSQLState(), e.getMessage());
        } catch (Exception e) {
            e.printStackTrace();
        }

    }
}