$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("contactUs.feature");
formatter.feature({
  "line": 1,
  "name": "Submit user info usin Contact Us form",
  "description": "",
  "id": "submit-user-info-usin-contact-us-form",
  "keyword": "Feature"
});
formatter.before({
  "duration": 2463905797,
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
  "duration": 742982751,
  "status": "passed"
});
formatter.match({
  "location": "ContactUsSteps.user_enters_valid_user_name()"
});
formatter.result({
  "duration": 311193374,
  "status": "passed"
});
formatter.match({
  "location": "ContactUsSteps.user_enters_valid_last_name(DataTable)"
});
formatter.result({
  "duration": 191585050,
  "status": "passed"
});
formatter.match({
  "location": "ContactUsSteps.user_enters_valid_email_address()"
});
formatter.result({
  "duration": 258099462,
  "status": "passed"
});
formatter.match({
  "location": "ContactUsSteps.user_enters_comments(DataTable)"
});
formatter.result({
  "duration": 187215251,
  "status": "passed"
});
formatter.match({
  "location": "ContactUsSteps.user_clicks_on_Sumbit_button()"
});
formatter.result({
  "duration": 908636714,
  "status": "passed"
});
formatter.match({
  "location": "ContactUsSteps.the_information_should_successfully_be_submited()"
});
formatter.result({
  "duration": 64027521,
  "status": "passed"
});
formatter.after({
  "duration": 155692970,
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
  "duration": 1556689696,
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
  "duration": 929103404,
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
  "duration": 836428787,
  "status": "passed"
});
formatter.match({
  "location": "ProductSteps.user_should_be_presented_with_promo_alert()"
});
formatter.result({
  "duration": 1242385439,
  "status": "passed"
});
formatter.after({
  "duration": 172152997,
  "status": "passed"
});
});