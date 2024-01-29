package management_on_school.stepDefinitions.api_step_defs.Admin.US_02;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;
import management_on_school.pojos.guestUser.*;
import org.json.JSONObject;

import static io.restassured.RestAssured.given;
import static management_on_school.base_url.BaseUrl.spec;
import static org.junit.Assert.assertEquals;

public class US_02_AdminGuestUserManager_StepDef_API {
    Response response;
    static int id;
    public static GuestGetAllContentListPojo expectedGetAllContentBody;
    public static GuestGetAllResponseBodyPojo actualGetAllResponseBody;

    GuestPostRequestPojo payload;
    GuestPostResponsePojo actualPostResponseBody;

    //----------------Scenario 1- POST Request--------------------
    @Then("dj create a POST Request with the URL and use guestUser-register path parameters for guestuser")
    public void djCreateAPOSTRequestWithTheURLAndUseGuestUserRegisterPathParametersForGuestuser() {
        spec.pathParams("first", "guestUser", "second", "register");
    }

    @Then("dj create a POST Request Body for guestuser")
    public void djCreateAPOSTRequestBodyForGuestuser() {
        payload =new GuestPostRequestPojo("1990-01-01",
                                            "Wales",
                                            "FEMALE",
                                            "GuestDuyguJ",
                                            "Project14",
                                            "444-932-1901",
                                            "823-10-7392",
                                            "Joneses",
                                            "000GuestDuyguJ");

    }

    @And("dj send a POST request and saves the response for guestuser")
    public void djSendAPOSTRequestAndSavesTheResponseForGuestuser() {
        response=given(spec)
                .when().body(payload)
                .post("{first}/{second}");

        response.prettyPrint();
    }

    @And("dj verify Status-Code is {int} for guestuser")
    public void djVerifyStatusCodeIsForGuestuser(int postGustStatus) {
        assertEquals(postGustStatus,response.statusCode());
    }

    @And("dj verify Content-Type is {string} for guestuser")
    public void djVerifyContentTypeIsForGuestuser(String postGuestContent) {
        assertEquals(postGuestContent,response.contentType());
    }

    @And("dj verify POST Response Body as expected for guestuser")
    public void djVerifyPOSTResponseBodyAsExpectedForGuestuser() {
        actualPostResponseBody=response.as(GuestPostResponsePojo.class);

        assertEquals(payload.getBirthDay(), actualPostResponseBody.getObject().getBirthDay());
        assertEquals(payload.getBirthPlace(), actualPostResponseBody.getObject().getBirthPlace());
        assertEquals(payload.getGender(), actualPostResponseBody.getObject().getGender());
        assertEquals(payload.getName(), actualPostResponseBody.getObject().getName());
        assertEquals(payload.getPhoneNumber(), actualPostResponseBody.getObject().getPhoneNumber());
        assertEquals(payload.getSsn(), actualPostResponseBody.getObject().getSsn());
        assertEquals(payload.getSurname(), actualPostResponseBody.getObject().getSurname());
        assertEquals(payload.getUsername(), actualPostResponseBody.getObject().getUsername());
    }

    //----------------Scenario 2-Get Request--------------------
    @Then("dj Admin sends GET Request with the URL and saves the userID after GuestUser registered")
    public void djAdminSavedTheUserIDAfterGuestUserRegistered() {
        spec.pathParams("first", "guestUser", "second", "getAll")
                .queryParams("page",0,
                        "size",500,
                                "sort","username",
                                "type","desc");

        response = given(spec)
                    .when()
                    .get("{first}/{second}");
        response.prettyPrint();

        JsonPath json = response.jsonPath();
                                //"findAll{it.username=='00GuestDuyguJ'}.id"
        id = json.getInt("content[0].id");
        System.out.println("id = " + id);
    }

    @Then("dj Admin creates Expected Response Body for guestUser")
    public void djAdminCreatesExpectedResponseBodyForGuestUser() {
        expectedGetAllContentBody =new GuestGetAllContentListPojo(id,
                                            "000GuestDuyguJ",
                                            "GuestDuyguJ",
                                            "Joneses",
                                            "1990-01-01",
                                            "823-10-7392",
                                            "Wales",
                                            "444-932-1901",
                                            "FEMALE");
    }


    @And("dj Admin verifies Status-Code {int} for guestUser")
    public void djAdminVerifiesStatusCodeForGuestUser(int guestGetStatusCode) {
        assertEquals(guestGetStatusCode,response.statusCode());
    }

    @And("dj Admin verifies Content-Type is {string} for guestUser")
    public void djAdminVerifiesContentTypeIsForGuestUser(String guestGetContentType) {
        assertEquals(guestGetContentType,response.contentType());
    }

    @And("dj Admin verifies GET Response Body as expected for guestUser")
    public void djAdminVerifiesGETResponseBodyAsExpectedForGuestUser() {
        actualGetAllResponseBody =response.as(GuestGetAllResponseBodyPojo.class);

        assertEquals(expectedGetAllContentBody.getName(), actualGetAllResponseBody.getContent().get(0).getName());
        assertEquals(expectedGetAllContentBody.getSurname(), actualGetAllResponseBody.getContent().get(0).getSurname());
        assertEquals(expectedGetAllContentBody.getUsername(), actualGetAllResponseBody.getContent().get(0).getUsername());
        assertEquals(expectedGetAllContentBody.getBirthDay(), actualGetAllResponseBody.getContent().get(0).getBirthDay());
        assertEquals(expectedGetAllContentBody.getBirthPlace(), actualGetAllResponseBody.getContent().get(0).getBirthPlace());
        assertEquals(expectedGetAllContentBody.getPhoneNumber(), actualGetAllResponseBody.getContent().get(0).getPhoneNumber());
        assertEquals(expectedGetAllContentBody.getSsn(), actualGetAllResponseBody.getContent().get(0).getSsn());
        assertEquals(expectedGetAllContentBody.getGender(), actualGetAllResponseBody.getContent().get(0).getGender());
    }


    //-------------Scenario 3-Delete Request------------------

    @Then("dj Admin creates DELETE Request with the URL and guestUser-delete-userID path parameters for guestUser")
    public void djAdminCreatesDELETERequestWithTheURLAndGuestUserDeleteUserIDPathParametersForGuestUser() {
        spec.pathParams("first","guestUser","second","delete","third", id);
    }

    @And("dj Admin sends DELETE Request and saves the response for guestUser")
    public void djAdminSendsDELETERequestAndSavesTheResponseForGuestUser() {
        response = given(spec)
                .when()
                .delete("{first}/{second}/{third}");
        response.prettyPrint();
    }

    @Then("dj Admin verifies Status-Code {int} for delete guestUser")
    public void dj_admin_verifies_status_code_for_delete_guest_user(int deleteStatusCode) {
        assertEquals(deleteStatusCode, response.statusCode());
    }

    @And("dj Admin verifies DELETE Response Body as expected for guestUser")
    public void djAdminVerifiesDELETEResponseBodyAsExpectedForGuestUser() {
        JSONObject expectedDeleteResponseBody=new JSONObject();
        expectedDeleteResponseBody.put("message"," Guest User deleted Successful");
        expectedDeleteResponseBody.put("httpStatus","OK");

        //Assertions
        JsonPath actualDeleteResponseBody=response.jsonPath();
        assertEquals(expectedDeleteResponseBody.get("message"), actualDeleteResponseBody.get("message"));
        assertEquals(expectedDeleteResponseBody.get("httpStatus"), actualDeleteResponseBody.get("httpStatus"));
    }



}
