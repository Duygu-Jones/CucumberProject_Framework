package management_on_school.stepDefinitions.db_step_defs.Admin.US_04;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import management_on_school.utilities.JDBC_Utils;

import java.sql.*;

import static management_on_school.stepDefinitions.api_step_defs.Admin.US_04.US_04_AdminDeanManagement_StepDef_API.deanObject;
import static org.junit.Assert.assertEquals;

public class US_04AdminDeanManagement_StepDef_DB {
    Connection connection;
    Statement statement;
    ResultSet resultSet;

    @Given("dj Connect to the Database")
    public void djConnectToTheDatabase()throws SQLException {
        connection = DriverManager.getConnection("jdbc:postgresql://managementonschools.com:5432/school_management",
                                                "select_user", "43w5ijfso");
    }

// ---> expected Data called from US_04_API_StepDef class: deanObject();

    @And("dj send a Query to get the Dean GetManagerById")
    public void djSendAQueryToGetTheDeanGetManagerById() throws SQLException{
        statement = connection.createStatement();
        resultSet = statement.executeQuery("SELECT * FROM dean WHERE username='jnsduygu'");
    }

    @And("dj verify registered Dean information")
    public void djVerifyRegisteredDeanInformation() throws SQLException{
        resultSet.next();
        assertEquals(deanObject.getUsername(),resultSet.getString("username"));
        assertEquals(deanObject.getName(),resultSet.getString("name"));
        assertEquals(deanObject.getSurname(),resultSet.getString("surname"));
        assertEquals(deanObject.getBirthDay(),resultSet.getString("birth_day"));
        assertEquals(deanObject.getSsn(),resultSet.getString("ssn"));
        assertEquals(deanObject.getBirthPlace(),resultSet.getString("birth_place"));
        assertEquals(deanObject.getPhoneNumber(),resultSet.getString("phone_number"));
        assertEquals(1,resultSet.getInt("gender"));
    }

    @And("Cut the connection")
    public void cutTheConnection() throws SQLException {
        statement.close();
        connection.close();
    }
}
