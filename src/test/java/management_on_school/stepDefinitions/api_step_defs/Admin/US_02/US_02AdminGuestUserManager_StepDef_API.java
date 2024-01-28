package management_on_school.stepDefinitions.api_step_defs.Admin.US_02;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;
import management_on_school.pojos.guestUser.GuestContentBodyPojo;
import management_on_school.pojos.guestUser.GuestResponseBodyPojo;
import org.json.JSONObject;

import static io.restassured.RestAssured.given;
import static management_on_school.base_url.BaseUrl.spec;
import static org.junit.Assert.assertEquals;

public class US_02AdminGuestUserManager_StepDef_API {
    Response response;
    static int id;
    public static GuestContentBodyPojo expectedData;
    public static GuestResponseBodyPojo actualData;


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
        //response.prettyPrint();

        JsonPath json = response.jsonPath();
                                //"findAll{it.username=='00GuestDuyguJ'}.id"
        id = json.getInt("content[0].id");
        System.out.println("id = " + id);
    }

    @Then("dj Admin creates Expected Response Body for guestUser")
    public void djAdminCreatesExpectedResponseBodyForGuestUser() {
        expectedData =new GuestContentBodyPojo(id,
                                            "00GuestDuyguJ",
                                            "GuestDuyguJ",
                                            "Joneses",
                                            "1990-01-01",
                                            "823-10-7392",
                                            "Wales",
                                            "444-932-1901",
                                            "FEMALE");
        actualData=response.as(GuestResponseBodyPojo.class);
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
        //guestObjectPojo expected olarak olusturuldu
        assertEquals(expectedData.getName(),actualData.getContent().get(0).getName());
        assertEquals(expectedData.getSurname(),actualData.getContent().get(0).getSurname());
        assertEquals(expectedData.getUsername(),actualData.getContent().get(0).getUsername());
        assertEquals(expectedData.getBirthDay(),actualData.getContent().get(0).getBirthDay());
        assertEquals(expectedData.getBirthPlace(),actualData.getContent().get(0).getBirthPlace());
        assertEquals(expectedData.getPhoneNumber(),actualData.getContent().get(0).getPhoneNumber());
        assertEquals(expectedData.getSsn(),actualData.getContent().get(0).getSsn());
        assertEquals(expectedData.getGender(),actualData.getContent().get(0).getGender());
    }



    //-------------Scenario 3-Delete Request------------------

    @Then("dj Admin creates DELETE Request with the URL and guestUser-delete-userID path parameters for guestUser")
    public void djAdminCreatesDELETERequestWithTheURLAndGuestUserDeleteUserIDPathParametersForGuestUser() {
        spec.pathParams("first","guestUser","second","delete","third",id);
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
