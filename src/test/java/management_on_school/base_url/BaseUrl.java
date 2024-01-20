package management_on_school.base_url;

import io.restassured.builder.RequestSpecBuilder;
import io.restassured.http.ContentType;
import io.restassured.specification.RequestSpecification;
import management_on_school.utilities.Authentication;
import management_on_school.utilities.ConfigReader;

import static management_on_school.utilities.Authentication.generateToken;

public class BaseUrl {
    public static RequestSpecification spec;

    public static void setUp(String username, String password){
        spec = new RequestSpecBuilder()
                .setBaseUri("https://managementonschools.com/app")
                .setContentType(ContentType.JSON)
                .addHeader("Authorization", generateToken(username, password))
                .build();
    }

    //---------------------------------------------------------------------------------------------

    public static void adminSetup(){
        spec=new RequestSpecBuilder()
                .setContentType(ContentType.JSON)
                .addHeader("Authorization",
                        Authentication.generateToken(ConfigReader.getProperty("admin_password"),
                                ConfigReader.getProperty("admin_username"))).
                setBaseUri("https://managementonschools.com/app")
                .build();
    }
    public static void deanSetup(){
        spec=new RequestSpecBuilder()
                .setContentType(ContentType.JSON)
                .addHeader("Authorization",
                        Authentication.generateToken(ConfigReader.getProperty("Dean_password"),
                                ConfigReader.getProperty("Dean_username"))).
                setBaseUri("https://managementonschools.com/app")
                .build();
    }
    public static void viceDeanSetup(){
        spec=new RequestSpecBuilder()
                .setContentType(ContentType.JSON)
                .addHeader("Authorization",
                        Authentication.generateToken(ConfigReader.getProperty("ViceDean_password"),
                                ConfigReader.getProperty("ViceDean_username"))).
                setBaseUri("https://managementonschools.com/app")
                .build();
    }
    public static void teacherSetup(){
        spec=new RequestSpecBuilder()
                .setContentType(ContentType.JSON)
                .addHeader("Authorization",
                        Authentication.generateToken(ConfigReader.getProperty("Teacher_password"),
                                ConfigReader.getProperty("Teacher_username"))).
                setBaseUri("https://managementonschools.com/app")
                .build();
    }
    public static void studentSetup(){
        spec=new RequestSpecBuilder()
                .setContentType(ContentType.JSON)
                .addHeader("Authorization",
                        Authentication.generateToken(ConfigReader.getProperty("Student_password"),
                                ConfigReader.getProperty("Student_username"))).
                setBaseUri("https://managementonschools.com/app")
                .build();
    }





}