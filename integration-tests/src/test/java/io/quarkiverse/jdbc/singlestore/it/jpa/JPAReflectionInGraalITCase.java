package io.quarkiverse.jdbc.singlestore.it.jpa;

import static org.hamcrest.Matchers.is;

import org.junit.jupiter.api.Test;

import io.quarkus.test.junit.QuarkusIntegrationTest;
import io.restassured.RestAssured;

/**
 * Test reflection around JPA entities
 *
 *
 */
@QuarkusIntegrationTest
public class JPAReflectionInGraalITCase {

    @Test
    public void testFieldAndGetterReflectionOnEntityFromServlet() throws Exception {
        RestAssured.when().get("/jpa/testreflection").then().body(is("OK"));
    }

}
