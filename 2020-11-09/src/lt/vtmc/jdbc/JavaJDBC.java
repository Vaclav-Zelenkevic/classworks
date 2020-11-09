package lt.vtmc.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class JavaJDBC {

	private static final String JDBC_DRIVER = "org.h2.Driver";
	private static final String DB_URL = "jdbc:h2:~/test";

	private static final String USER = "sa";
	private static final String PASS = "";

	private static String queryString; // sqlQuery --> executeQuery()
	private static List<Person> personsFromGrupeTable = new ArrayList<>();

	public static void main(String[] args) {
//		queryString = "CREATE TABLE GRUPE " + "(id INTEGER not NULL, " + " name VARCHAR(255), " + " age INTEGER, "
//				+ " PRIMARY KEY ( id ))";
//		queryString = "INSERT INTO GRUPE " + "VALUES (1, 'Akvile', 18)";
//		executeQuery(queryString);
//		queryString = "INSERT INTO GRUPE " + "VALUES (2, 'Tomas', 20)";
//		executeQuery(queryString);
//		queryString = "INSERT INTO GRUPE " + "VALUES (3, 'Raimonda', 18)";
//		executeQuery(queryString);
//		queryString = "INSERT INTO GRUPE " + "VALUES (4, 'Ieva', 21)";
//		executeQuery(queryString);

		queryString = "SELECT id, name, age FROM GRUPE";
		readRecordFromTable(queryString);
		System.out.println(personsFromGrupeTable);
		personsFromGrupeTable = personsFromGrupeTable.stream().filter(e -> e.getAge() < 20)
				.collect(Collectors.toList());
		personsFromGrupeTable.forEach(System.out::println);
	}

	private static void readRecordFromTable(String queryString) {
		try (Connection connection = DriverManager.getConnection(DB_URL, USER, PASS);
				Statement statement = connection.createStatement()) {
			System.out.println("Connecting database ...");
			Class.forName(JDBC_DRIVER);
			System.out.println("Executing query ...");
			ResultSet resultSet = statement.executeQuery(queryString);
			while (resultSet.next()) {
				personsFromGrupeTable
						.add(new Person(resultSet.getInt("id"), resultSet.getString("name"), resultSet.getInt("age")));
			}
			System.out.println("Query executed...");
		} catch (SQLException | ClassNotFoundException e) {
			e.printStackTrace();
		}

	}

	private static void executeQuery(String queryString) {
		try (Connection connection = DriverManager.getConnection(DB_URL, USER, PASS);
				Statement statement = connection.createStatement()) {
			System.out.println("Connecting database ...");
			Class.forName(JDBC_DRIVER);
			System.out.println("Executing query ...");
			statement.execute(queryString);
			System.out.println("Query executed...");
		} catch (SQLException | ClassNotFoundException e) {
			e.printStackTrace();
		}
	}

}
