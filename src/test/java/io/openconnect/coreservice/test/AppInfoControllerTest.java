package io.openconnect.coreservice.test;

import io.openconnect.coreservice.controller.AppInfoController;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static io.restassured.RestAssured.given;
import static org.assertj.core.api.Assertions.assertThat;

@SpringBootTest
class AppInfoControllerTest {

    @Autowired
    private AppInfoController appInfoController;

    @Test
    @DisplayName("Get AppInfo should not be null")
    void getAppVersionShouldNotBeNull() {
        assertThat(appInfoController.getAppVersion()).isNotNull();
    }

    @Test
    @DisplayName("Get AppInfo should not be empty")
    void getAppVersionShouldNotBeEmpty() {
        assertThat(appInfoController.getAppVersion()).isNotEmpty();
    }

    @Test
    @DisplayName("Get AppInfo should not be blank")
    void getAppVersionShouldNotBeBlank() {
        assertThat(appInfoController.getAppVersion()).isNotBlank();
    }

    @Test
    @DisplayName("Get AppInfo contains correct format")
    void getAppVersionFormat() {
        assertThat(appInfoController.getAppVersion()).containsAnyOf("-SNAPSHOT", ".FINAL");
    }

    @Test
    @DisplayName("Get AppInfo and print the version")
    void getAppVersionAndPrintValue() {
        given().contentType("application/json")
                .when().request().get("/api/version").thenReturn().body().print();
    }
}
