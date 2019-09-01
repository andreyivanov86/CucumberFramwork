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
        "webdriver",
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
  "duration": 3055163650,
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
  "duration": 806801947,
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
  "duration": 322724157,
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
  "duration": 201142923,
  "status": "passed"
});
formatter.match({
  "location": "LoginSteps.user_clicks_on_Login_Button()"
});
formatter.result({
  "duration": 116074411,
  "status": "passed"
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
  "duration": 30030673,
  "status": "passed"
});
formatter.after({
  "duration": 320905402,
  "status": "passed"
});
formatter.before({
  "duration": 1438758922,
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
  "name": "User type \"webdriver\" username",
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
  "duration": 579477890,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "webdriver",
      "offset": 11
    }
  ],
  "location": "LoginSteps.user_type_username(String)"
});
formatter.result({
  "duration": 292443173,
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
  "duration": 228757225,
  "status": "passed"
});
formatter.match({
  "location": "LoginSteps.user_clicks_on_Login_Button()"
});
formatter.result({
  "duration": 100987015,
  "status": "passed"
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
  "duration": 13519248,
  "status": "passed"
});
formatter.after({
  "duration": 301741996,
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
  "duration": 1341682330,
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
  "duration": 638578184,
  "status": "passed"
});
formatter.match({
  "location": "ContactUsSteps.user_enters_valid_user_name()"
});
formatter.result({
  "duration": 378535085,
  "status": "passed"
});
formatter.match({
  "location": "ContactUsSteps.user_enters_valid_last_name(DataTable)"
});
formatter.result({
  "duration": 178749632,
  "status": "passed"
});
formatter.match({
  "location": "ContactUsSteps.user_enters_valid_email_address()"
});
formatter.result({
  "duration": 243205584,
  "status": "passed"
});
formatter.match({
  "location": "ContactUsSteps.user_enters_comments(DataTable)"
});
formatter.result({
  "duration": 174395820,
  "status": "passed"
});
formatter.match({
  "location": "ContactUsSteps.user_clicks_on_Sumbit_button()"
});
formatter.result({
  "duration": 1309048692,
  "status": "passed"
});
formatter.match({
  "location": "ContactUsSteps.the_information_should_successfully_be_submited()"
});
formatter.result({
  "duration": 62330065,
  "status": "passed"
});
formatter.after({
  "duration": 172041190,
  "status": "passed"
});
formatter.uri("products.feature");
formatter.feature({
  "line": 1,
  "name": "Products",
  "description": "",
  "id": "products",
  "keyword": "Feature"
});
formatter.scenarioOutline({
  "line": 3,
  "name": "Validate promo code alert is visible when clicking on special offers link",
  "description": "",
  "id": "products;validate-promo-code-alert-is-visible-when-clicking-on-special-offers-link",
  "type": "scenario_outline",
  "keyword": "Scenario Outline"
});
formatter.step({
  "line": 4,
  "name": "User navigates to \"\u003curl\u003e\" website",
  "keyword": "Given "
});
formatter.step({
  "line": 5,
  "name": "User clicks on \"\u003cbutton\u003e\" button",
  "keyword": "Then "
});
formatter.step({
  "line": 6,
  "name": "User should be presented with promo alert",
  "keyword": "Then "
});
formatter.examples({
  "line": 8,
  "name": "",
  "description": "",
  "id": "products;validate-promo-code-alert-is-visible-when-clicking-on-special-offers-link;",
  "rows": [
    {
      "cells": [
        "url",
        "button"
      ],
      "line": 9,
      "id": "products;validate-promo-code-alert-is-visible-when-clicking-on-special-offers-link;;1"
    },
    {
      "cells": [
        "http://webdriveruniversity.com/Page-Object-Model/products.html",
        "#container-special-offers"
      ],
      "line": 10,
      "id": "products;validate-promo-code-alert-is-visible-when-clicking-on-special-offers-link;;2"
    }
  ],
  "keyword": "Examples"
});
formatter.before({
  "duration": 1419988725,
  "status": "passed"
});
formatter.scenario({
  "line": 10,
  "name": "Validate promo code alert is visible when clicking on special offers link",
  "description": "",
  "id": "products;validate-promo-code-alert-is-visible-when-clicking-on-special-offers-link;;2",
  "type": "scenario",
  "keyword": "Scenario Outline"
});
formatter.step({
  "line": 4,
  "name": "User navigates to \"http://webdriveruniversity.com/Page-Object-Model/products.html\" website",
  "matchedColumns": [
    0
  ],
  "keyword": "Given "
});
formatter.step({
  "line": 5,
  "name": "User clicks on \"#container-special-offers\" button",
  "matchedColumns": [
    1
  ],
  "keyword": "Then "
});
formatter.step({
  "line": 6,
  "name": "User should be presented with promo alert",
  "keyword": "Then "
});
formatter.match({
  "arguments": [
    {
      "val": "http://webdriveruniversity.com/Page-Object-Model/products.html",
      "offset": 19
    }
  ],
  "location": "ProductSteps.user_navigates_to_website(String)"
});
formatter.result({
  "duration": 861836059,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "#container-special-offers",
      "offset": 16
    }
  ],
  "location": "ProductSteps.user_clicks_on_button(String)"
});
formatter.result({
  "duration": 302516805,
  "status": "passed"
});
formatter.match({
  "location": "ProductSteps.user_should_be_presented_with_promo_alert()"
});
formatter.result({
  "duration": 1506194502,
  "status": "passed"
});
formatter.after({
  "duration": 178217083,
  "status": "passed"
});
});