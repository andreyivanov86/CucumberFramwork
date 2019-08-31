$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("Login.feature");
formatter.feature({
  "line": 1,
  "name": "Login to account",
  "description": "",
  "id": "login-to-account",
  "keyword": "Feature"
});
formatter.scenarioOutline({
  "line": 3,
  "name": "Login to account using valid  and invalid credentials",
  "description": "",
  "id": "login-to-account;login-to-account-using-valid--and-invalid-credentials",
  "type": "scenario_outline",
  "keyword": "Scenario Outline"
});
formatter.step({
  "line": 4,
  "name": "User navigates to \"\u003curl\u003e\" login page",
  "keyword": "Given "
});
formatter.step({
  "line": 5,
  "name": "User type \"\u003cusername\u003e\" username",
  "keyword": "And "
});
formatter.step({
  "line": 6,
  "name": "User type \"\u003cpassword\u003e\" password",
  "keyword": "And "
});
formatter.step({
  "line": 7,
  "name": "User clicks on Login Button",
  "keyword": "When "
});
formatter.step({
  "line": 8,
  "name": "User should be presented with \"\u003cmessage\u003e\" message",
  "keyword": "Then "
});
formatter.examples({
  "line": 9,
  "name": "",
  "description": "",
  "id": "login-to-account;login-to-account-using-valid--and-invalid-credentials;",
  "rows": [
    {
      "cells": [
        "url",
        "username",
        "password",
        "message"
      ],
      "line": 10,
      "id": "login-to-account;login-to-account-using-valid--and-invalid-credentials;;1"
    },
    {
      "cells": [
        "http://webdriveruniversity.com/Login-Portal/run.html",
        "andreyivanov",
        "198632",
        "validation failed"
      ],
      "line": 11,
      "id": "login-to-account;login-to-account-using-valid--and-invalid-credentials;;2"
    },
    {
      "cells": [
        "http://webdriveruniversity.com/Login-Portal/run.html",
        "webdriver123",
        "webdriver123",
        "validation succeeded"
      ],
      "line": 12,
      "id": "login-to-account;login-to-account-using-valid--and-invalid-credentials;;3"
    }
  ],
  "keyword": "Examples"
});
formatter.before({
  "duration": 2181957530,
  "status": "passed"
});
formatter.scenario({
  "line": 11,
  "name": "Login to account using valid  and invalid credentials",
  "description": "",
  "id": "login-to-account;login-to-account-using-valid--and-invalid-credentials;;2",
  "type": "scenario",
  "keyword": "Scenario Outline"
});
formatter.step({
  "line": 4,
  "name": "User navigates to \"http://webdriveruniversity.com/Login-Portal/run.html\" login page",
  "matchedColumns": [
    0
  ],
  "keyword": "Given "
});
formatter.step({
  "line": 5,
  "name": "User type \"andreyivanov\" username",
  "matchedColumns": [
    1
  ],
  "keyword": "And "
});
formatter.step({
  "line": 6,
  "name": "User type \"198632\" password",
  "matchedColumns": [
    2
  ],
  "keyword": "And "
});
formatter.step({
  "line": 7,
  "name": "User clicks on Login Button",
  "keyword": "When "
});
formatter.step({
  "line": 8,
  "name": "User should be presented with \"validation failed\" message",
  "matchedColumns": [
    3
  ],
  "keyword": "Then "
});
formatter.match({
  "arguments": [
    {
      "val": "http://webdriveruniversity.com/Login-Portal/run.html",
      "offset": 19
    }
  ],
  "location": "LoginSteps.user_navigates_to_login_page(String)"
});
formatter.result({
  "duration": 726099542,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "andreyivanov",
      "offset": 11
    }
  ],
  "location": "LoginSteps.user_type_username(String)"
});
formatter.result({
  "duration": 321416666,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "198632",
      "offset": 11
    }
  ],
  "location": "LoginSteps.user_type_password(String)"
});
formatter.result({
  "duration": 230316612,
  "status": "passed"
});
formatter.match({
  "location": "LoginSteps.user_clicks_on_Login_Button()"
});
formatter.result({
  "duration": 86192839,
  "error_message": "java.lang.NullPointerException\n\tat pageObjects.Login_Page.clickLoginButton(Login_Page.java:42)\n\tat stepDifinitions.LoginSteps.user_clicks_on_Login_Button(LoginSteps.java:31)\n\tat ✽.When User clicks on Login Button(Login.feature:7)\n",
  "status": "failed"
});
formatter.match({
  "arguments": [
    {
      "val": "validation failed",
      "offset": 31
    }
  ],
  "location": "LoginSteps.user_should_be_presented_with_message(String)"
});
formatter.result({
  "status": "skipped"
});
formatter.embedding("image/png", "embedded0.png");
formatter.after({
  "duration": 530191102,
  "status": "passed"
});
formatter.before({
  "duration": 1616118764,
  "status": "passed"
});
formatter.scenario({
  "line": 12,
  "name": "Login to account using valid  and invalid credentials",
  "description": "",
  "id": "login-to-account;login-to-account-using-valid--and-invalid-credentials;;3",
  "type": "scenario",
  "keyword": "Scenario Outline"
});
formatter.step({
  "line": 4,
  "name": "User navigates to \"http://webdriveruniversity.com/Login-Portal/run.html\" login page",
  "matchedColumns": [
    0
  ],
  "keyword": "Given "
});
formatter.step({
  "line": 5,
  "name": "User type \"webdriver123\" username",
  "matchedColumns": [
    1
  ],
  "keyword": "And "
});
formatter.step({
  "line": 6,
  "name": "User type \"webdriver123\" password",
  "matchedColumns": [
    2
  ],
  "keyword": "And "
});
formatter.step({
  "line": 7,
  "name": "User clicks on Login Button",
  "keyword": "When "
});
formatter.step({
  "line": 8,
  "name": "User should be presented with \"validation succeeded\" message",
  "matchedColumns": [
    3
  ],
  "keyword": "Then "
});
formatter.match({
  "arguments": [
    {
      "val": "http://webdriveruniversity.com/Login-Portal/run.html",
      "offset": 19
    }
  ],
  "location": "LoginSteps.user_navigates_to_login_page(String)"
});
formatter.result({
  "duration": 687035787,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "webdriver123",
      "offset": 11
    }
  ],
  "location": "LoginSteps.user_type_username(String)"
});
formatter.result({
  "duration": 366126685,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "webdriver123",
      "offset": 11
    }
  ],
  "location": "LoginSteps.user_type_password(String)"
});
formatter.result({
  "duration": 268436848,
  "status": "passed"
});
formatter.match({
  "location": "LoginSteps.user_clicks_on_Login_Button()"
});
formatter.result({
  "duration": 103179402,
  "error_message": "java.lang.NullPointerException\n\tat pageObjects.Login_Page.clickLoginButton(Login_Page.java:42)\n\tat stepDifinitions.LoginSteps.user_clicks_on_Login_Button(LoginSteps.java:31)\n\tat ✽.When User clicks on Login Button(Login.feature:7)\n",
  "status": "failed"
});
formatter.match({
  "arguments": [
    {
      "val": "validation succeeded",
      "offset": 31
    }
  ],
  "location": "LoginSteps.user_should_be_presented_with_message(String)"
});
formatter.result({
  "status": "skipped"
});
formatter.embedding("image/png", "embedded1.png");
formatter.after({
  "duration": 541391777,
  "status": "passed"
});
formatter.uri("contactUs.feature");
formatter.feature({
  "line": 1,
  "name": "Submit user info usin Contact Us form",
  "description": "",
  "id": "submit-user-info-usin-contact-us-form",
  "keyword": "Feature"
});
formatter.before({
  "duration": 1674907023,
  "status": "passed"
});
formatter.scenario({
  "line": 3,
  "name": "Submit valid user info via Contact Us fomr",
  "description": "",
  "id": "submit-user-info-usin-contact-us-form;submit-valid-user-info-via-contact-us-fomr",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 4,
  "name": "User access webdriveruniversity Contact us form",
  "keyword": "Given "
});
formatter.step({
  "line": 5,
  "name": "User enters valid user name",
  "keyword": "When "
});
formatter.step({
  "line": 6,
  "name": "User enters valid last name",
  "rows": [
    {
      "cells": [
        "Woods",
        "Jackson",
        "Jones"
      ],
      "line": 7
    }
  ],
  "keyword": "And "
});
formatter.step({
  "line": 8,
  "name": "User enters valid email address",
  "keyword": "And "
});
formatter.step({
  "line": 9,
  "name": "User enters comments",
  "rows": [
    {
      "cells": [
        "comment 1",
        "comment 2"
      ],
      "line": 10
    }
  ],
  "keyword": "And "
});
formatter.step({
  "line": 11,
  "name": "User clicks on Sumbit button",
  "keyword": "When "
});
formatter.step({
  "line": 12,
  "name": "the information should successfully be submited",
  "keyword": "Then "
});
formatter.match({
  "location": "ContactUsSteps.user_access_webdriveruniversity_Contact_us_form()"
});
formatter.result({
  "duration": 874382280,
  "status": "passed"
});
formatter.match({
  "location": "ContactUsSteps.user_enters_valid_user_name()"
});
formatter.result({
  "duration": 326704785,
  "status": "passed"
});
formatter.match({
  "location": "ContactUsSteps.user_enters_valid_last_name(DataTable)"
});
formatter.result({
  "duration": 206115361,
  "status": "passed"
});
formatter.match({
  "location": "ContactUsSteps.user_enters_valid_email_address()"
});
formatter.result({
  "duration": 342438675,
  "status": "passed"
});
formatter.match({
  "location": "ContactUsSteps.user_enters_comments(DataTable)"
});
formatter.result({
  "duration": 208000629,
  "status": "passed"
});
formatter.match({
  "location": "ContactUsSteps.user_clicks_on_Sumbit_button()"
});
