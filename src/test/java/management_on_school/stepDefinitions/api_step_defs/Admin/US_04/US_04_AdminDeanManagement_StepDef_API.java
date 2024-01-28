package management_on_school.stepDefinitions.api_step_defs.Admin.US_04;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;
import management_on_school.pojos.dean_management.DeanObjectPojo;
import management_on_school.pojos.dean_management.DeanRequestPojo;
import management_on_school.pojos.dean_management.DeanResponsePojo;
import org.json.JSONObject;

import java.util.List;

import static io.restassured.RestAssured.given;
import static management_on_school.base_url.BaseUrl.*;
import static org.junit.Assert.assertEquals;

public class US_04_AdminDeanManagement_StepDef_API {
    DeanRequestPojo payload;
    Response response;
    DeanResponsePojo actualData;
    static int userId;
    public static DeanObjectPojo deanObject;
    public static DeanResponsePojo expectedData;

    @Given("Login as {string}")
    public void login_as(String user) {
        switch (user){
            case "Admin":
                setUp("Team05Admin", "Project14");
                System.out.println("Logged in as Admin");
                break;
            case "Dean":
                setUp("Team05Dean", "Project14");
                System.out.println("Logged in as Dean");
                break;
            case "Vice Dean":
                setUp("Team05ViceDean", "Project14");
                System.out.println("Logged in as ViceDean");
                break;
            default:
                System.out.println("Unauthorized, Full authentication is required");
                break;
        }
    }


//---------------------Scenario 1-----------------------------------------

    @Then("dj Admin creates POST Request with the URL and dean-save path parameters")
    public void djAdminCreatesPOSTRequestWithTheURLAndDeanSavePathParameters() {
        spec.pathParams("first", "dean", "second", "save");
    }

    @Then("dj Admin creates POST Request Body")
    public void djAdminCreatesPOSTRequestBody() {
        payload = new DeanRequestPojo("1989-08-10",
                                    "Izmir",
                                    "FEMALE",
                                    "Duygu",
                                    "Project14",
                                    "555-275-8196",
                                    "568-72-9305",
                                    "Jones",
                                    "jnsduygu");
    }

    @And("dj Admin sends POST request and saves the response")
    public void djAdminSendsPOSTRequestAndSavesTheResponse() {
        response=given(spec)
                .when().body(payload)
                .post("{first}/{second}");

        response.prettyPrint();

        actualData=response.as(DeanResponsePojo.class);
    }

    @And("dj Admin verifies Status-Code is {int}")
    public void djAdminVerifiesStatusCodeIs(int statuscode) {
        assertEquals(statuscode, response.statusCode());
    }

    @And("dj Admin verifies Content-Type is {string}")
    public void djAdminVerifiesContentTypeIs(String contentype) {
        assertEquals(contentype, response.contentType());
    }

    @And("dj Admin verifies POST Response Body as expected")
    public void djAdminVerifiesPOSTResponseBodyAsExpected() {
        assertEquals(payload.getBirthDay(), actualData.getObject().getBirthDay());
        assertEquals(payload.getBirthPlace(), actualData.getObject().getBirthPlace());
        assertEquals(payload.getGender(), actualData.getObject().getGender());
        assertEquals(payload.getName(), actualData.getObject().getName());
        assertEquals(payload.getPhoneNumber(), actualData.getObject().getPhoneNumber());
        assertEquals(payload.getSsn(), actualData.getObject().getSsn());
        assertEquals(payload.getSurname(), actualData.getObject().getSurname());
        assertEquals(payload.getUsername(), actualData.getObject().getUsername());
    }


//---------------------Scenario 2-----------------------------------------
    @Then("dj Admin saved the userID after created Dean")
    public void dj_admin_saved_the_user_ıd_after_created_dean() {
    spec.pathParams("first", "dean", "second", "getAll");
    response = given(spec).when().get("{first}/{second}");

    JsonPath json = response.jsonPath();
    List<Integer> userIdList = json.getList("findAll{it.username=='jnsduygu'}.userId");
    userId = userIdList.get(0);
}


    @Then("dj Admin creates GET Request with the URL and dean-search path parameters")
    public void djAdminCreatesGETRequestWithTheURLAndDeanSearchPathParameters() {
        spec.pathParams("first","dean","second","getManagerById","third",userId);
    }

    @Then("dj Admin creates Expected Response Body for Get")
    public void dj_admin_creates_expected_response_body_for_get() {
        deanObject = new DeanObjectPojo(userId,
                                        "jnsduygu",
                                        "Duygu",
                                        "Jones",
                                        "1989-08-10",
                                        "568-72-9305",
                                        "Izmir",
                                        "555-275-8196",
                                        "FEMALE");

        expectedData=new DeanResponsePojo(deanObject,
                                        "Dean successfully found",
                                        "OK");

    }

    @And("dj Admin sends GET Request and saves the response")
    public void djAdminSendsGETRequestAndSavesTheResponse() {
        response=given(spec)
                .when()
                .get("{first}/{second}/{third}");

        response.prettyPrint();

        actualData=response.as(DeanResponsePojo.class);
    }

    @And("dj Admin verifies GET Response Body as expected")
    public void djAdminVerifiesGETResponseBodyAsExpected() {
        assertEquals(deanObject.getUserId(), actualData.getObject().getUserId());
        assertEquals(deanObject.getUsername(), actualData.getObject().getUsername());
        assertEquals(deanObject.getName(), actualData.getObject().getName());
        assertEquals(deanObject.getSurname(), actualData.getObject().getSurname());
        assertEquals(deanObject.getBirthDay(), actualData.getObject().getBirthDay());
        assertEquals(deanObject.getSsn(), actualData.getObject().getSsn());
        assertEquals(deanObject.getBirthPlace(), actualData.getObject().getBirthPlace());
        assertEquals(deanObject.getPhoneNumber(), actualData.getObject().getPhoneNumber());
        assertEquals(deanObject.getGender(), actualData.getObject().getGender());
        assertEquals(expectedData.getMessage(), actualData.getMessage());
        assertEquals(expectedData.getHttpStatus(), actualData.getHttpStatus());

    }

    @Then("dj Admin creates DELETE Request with the URL and dean-delete-userID path parameters")
    public void djAdminCreatesDELETERequestWithTheURLAndDeanDeleteUserIDPathParameters() {
        spec.pathParams("first", "dean", "second", "delete", "third", userId);
    }

    @Then("dj Admin sends DELETE Request and saves the response")
    public void dj_admin_sends_delete_request_and_saves_the_response() {
        response = given(spec)
                .when()
                .delete("{first}/{second}/{third}");
        response.prettyPrint();
    }

    @Then("dj Admin verifies Status-Code is {int} for delete request")
    public void dj_admin_verifies_status_code_is_for_delete_request(int deleteStatusCode) {
        assertEquals(deleteStatusCode, response.statusCode());
    }

    @And("dj Admin verifies DELETE Response Body as expected")
    public void djAdminVerifiesDELETEResponseBodyAsExpected() {
        JSONObject expectedResponseBody=new JSONObject();
        expectedResponseBody.put("message","Dean Deleted");
        expectedResponseBody.put("httpStatus","OK");

        //Assertions
        JsonPath responseJsonBody=response.jsonPath();
        assertEquals(expectedResponseBody.get("message"), responseJsonBody.get("message"));
        assertEquals(expectedResponseBody.get("httpStatus"), responseJsonBody.get("httpStatus"));
    }
}
