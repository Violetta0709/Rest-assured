package specs;

import io.restassured.specification.RequestSpecification;

import static helpers.CustomApiListener.withCustomTemplates;
import static io.restassured.RestAssured.with;
import static io.restassured.http.ContentType.JSON;

public class UnsuccessRegRequestSpec {
    public static RequestSpecification unsuccessRequestSpec = with()
            .filter(withCustomTemplates())
            .baseUri("https://reqres.in")
            .basePath("/api/register")
            .log().all()
            .contentType(JSON);
}
