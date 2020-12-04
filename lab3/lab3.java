import java.sql.*;
/**
* A Java MySQL SELECT statement example.
* Demonstrates the use of a SQL SELECT statement against a
* MySQL database, called from a Java program.
*
* Created by Alvin Alexander, http://alvinalexander.com
*/
public class sqlselect
{
    public static void main(String[] args)
        {
        try
        {
            // create our mysql database connection
            String myDriver = "com.mysql.cj.jdbc.Driver";
            String myUrl = "jdbc:mysql://127.0.0.1:3306/sakila";
            Class.forName(myDriver);
            Connection conn = DriverManager.getConnection(myUrl, "root", "root");

            // our SQL SELECT query.
            // if you only need a few columns, specify them by name instead of
            using "sakila"
            String query = "select film.film_id, film.title, category.name, film.rating from film\n"
                         + "inner join film_category\n"
                         + "on film.film_id = film_category.film_id\n"
                         + "inner join category\n"
                         + "on film_category.category_id = category.category_id\n"
                         + "where category.name = 'Action' and film.rating = 'PG';"

            // create the java statement
            Statement st = conn.createStatement();

            // execute the query, and get a java resultset
            ResultSet rs = st.executeQuery(query);

            // iterate through the java resultset
            while (rs.next())
            {
                int id = rs.getInt("film_id");
                String title = rs.getString("title");
                String name = rs.getString("name");
                Date rating = rs.getDate("rating");

                // print the results
                System.out.format("%s, %s, %s, %s\n", id, title, name, rating);
            }
            st.close();
        }
        catch (Exception e)
        {
            System.err.println("Got an exception!");
            System.err.println(e.getMessage());
        }
    }
}
