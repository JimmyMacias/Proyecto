package GESTIONES;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class PersonQueries {

    private static final String URL = "jdbc:postgresql://localhost:5432/SistemaVenta";
    private static final String USERNAME = "postgres";
    private static final String PASSWORD = "vjjimmy92";
    private Connection connection = null;
    private PreparedStatement selectAllPeople = null;
    private PreparedStatement selectPeopleByLastName = null;
    private PreparedStatement selectPeopleByFecha = null;
    private PreparedStatement insertNewPerson = null;
    private String selectAll = "select * from vuelos_disponibles ";
    private String selectByLastName = "SELECT * FROM vuelos_disponibles WHERE destino=?";
    private String selectByfecha = "SELECT * FROM vuelos_disponibles WHERE fecha=?";
    private String insertPerson = "INSERT INTO horarios_vuelo "
            + "(destino, fecha, valor_vuelo, numero_vuelo,origen)" + " VALUES(?,?,?,?,?)";

    public PersonQueries() {
        try {
            Class.forName("org.postgresql.Driver");
            connection = DriverManager.getConnection(URL, USERNAME, PASSWORD);
            //connection.setSchema("ADMINI");
            System.out.println("Conexion realizada satisfactoriamente");
        } catch (Exception ex) {
            System.out.println("error en : " + ex.getMessage());
        }
    }

    public List<Person> getAllPeople() {
        List<Person> results = null;
        ResultSet resultSet = null;

        try {
            selectAllPeople = connection.prepareStatement(selectAll);
            resultSet = selectAllPeople.executeQuery();
            results = new ArrayList<Person>();

            while (resultSet.next()) {
                Person oPerson = new Person(
                        resultSet.getString("destino"),
                        resultSet.getString("origen"),
                        resultSet.getDate("fecha"),
                        resultSet.getInt("numero_vuelo"),
                        resultSet.getInt("valor_vuelo"));
                results.add(oPerson);

            }
        } catch (SQLException sqlException) {
            System.out.println(sqlException.getMessage());
        } finally {
            try {
                resultSet.close();
            } catch (SQLException sqlException) {
                System.out.println(sqlException.getMessage());
                close();
            }
        }
        return results;
    }

    public int addPerson(Person pPerson) {
        int result = 0;

        try {
            insertNewPerson = connection.prepareStatement(insertPerson);
            insertNewPerson.setString(1, pPerson.getDestino());
            insertNewPerson.setString(2, pPerson.getOrigen());
            //insertNewPerson.setString(3, pPerson.getFecha());
            //insertNewPerson.setString(4,(Integer.parseInt(pPerson.getNumeroVuelo())));
            //insertNewPerson.setString(5, pPerson.getValor());

            result = insertNewPerson.executeUpdate();
        } catch (SQLException sqlException) {
            System.out.println("error al insertar persona " + sqlException.getMessage());
            close();
        }

        return result;
    }

    private void close() {
        try {
            connection.close();
        } catch (SQLException sqlException) {
            sqlException.getMessage();
        }
    }

    public List< Person> getPeopleByLastName(String name) {
        List< Person> results = null;
        ResultSet resultSet = null;
        try {
            selectPeopleByLastName = connection.prepareStatement(selectByLastName);
            selectPeopleByLastName.setString(1, name);
            resultSet = selectPeopleByLastName.executeQuery();
            results = new ArrayList< Person>();
            while (resultSet.next()) {
                results.add(new Person(resultSet.getString("destino"),
                        resultSet.getString("fecha"),
                        resultSet.getDate("valor_vuelo"),
                        resultSet.getInt("numero_vuelo"),
                        resultSet.getInt("origen")));
            }
        } catch (SQLException sqlException) {
            System.out.println(sqlException.getMessage());
        } finally {
            try {
                resultSet.close();
            } catch (SQLException sqlException) {
                System.out.println(sqlException.getMessage());
                close();
            }
        }
        return results;
    }
     public List< Person> getDatosporFecha(String name) {
        List< Person> results = null;
        ResultSet resultSet = null;
        try {
            selectPeopleByFecha = connection.prepareStatement(selectByfecha);
            selectPeopleByFecha.setString(1, name);
            resultSet = selectPeopleByFecha.executeQuery();
            results = new ArrayList< Person>();
            while (resultSet.next()) {
                results.add(new Person(resultSet.getString("destino"),
                        resultSet.getString("fecha"),
                        resultSet.getDate("valor_vuelo"),
                        resultSet.getInt("numero_vuelo"),
                        resultSet.getInt("origen")));
            }
        } catch (SQLException sqlException) {
            System.out.println(sqlException.getMessage());
        } finally {
            try {
                resultSet.close();
            } catch (SQLException sqlException) {
                System.out.println(sqlException.getMessage());
                close();
            }
        }
        return results;
    }
}
