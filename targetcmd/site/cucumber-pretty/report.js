$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("Test.feature");
formatter.feature({
  "line": 2,
  "name": "QT Assessment",
  "description": "Placing an Order for T-shirt\r\nSign-in during placing an Order\r\nValidate Order history for placed order",
  "id": "qt-assessment",
  "keyword": "Feature",
  "tags": [
    {
      "line": 1,
      "name": "@Assessment"
    }
  ]
});
formatter.scenario({
  "line": 8,
  "name": "order t-shirt \u0026 validate order history",
  "description": "",
  "id": "qt-assessment;order-t-shirt-\u0026-validate-order-history",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 7,
      "name": "@PlaceOrder"
    }
  ]
});
formatter.step({
  "line": 9,
  "name": "launch automation practise site",
  "keyword": "Given "
});
formatter.step({
  "line": 10,
  "name": "select t-shirt tab and place an order",
  "keyword": "When "
});
formatter.step({
  "line": 11,
  "name": "sign-in for successful checkout",
  "keyword": "And "
});
formatter.step({
  "line": 12,
  "name": "accept the agreement \u0026 place order",
  "keyword": "And "
});
formatter.step({
  "line": 13,
  "name": "validate order status \u0026 the amount",
  "keyword": "Then "
});
formatter.match({
  "location": "stepDefinition.launch_automation_practise_site()"
});
formatter.result({
  "duration": 6979414400,
  "status": "passed"
});
formatter.match({
  "location": "stepDefinition.select_t_shirt_tab_and_place_an_order()"
});
formatter.result({
  "duration": 14767364300,
  "status": "passed"
});
formatter.match({
  "location": "stepDefinition.sign_in_for_successful_checkout()"
});
formatter.result({
  "duration": 2520545800,
  "status": "passed"
});
formatter.match({
  "location": "stepDefinition.accept_the_agreement_place_order()"
});
formatter.result({
  "duration": 8248739200,
  "status": "passed"
});
formatter.match({
  "location": "stepDefinition.validate_order_status_the_amount()"
});
formatter.result({
  "duration": 5074213800,
  "status": "passed"
});
formatter.scenario({
  "line": 16,
  "name": "Update user profile",
  "description": "",
  "id": "qt-assessment;update-user-profile",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 15,
      "name": "@Updateuserprofile"
    }
  ]
});
formatter.step({
  "line": 17,
  "name": "launch automation practise site",
  "keyword": "Given "
});
formatter.step({
  "line": 18,
  "name": "sign-in to access the user account",
  "keyword": "When "
});
formatter.step({
  "line": 19,
  "name": "update user name",
  "keyword": "And "
});
formatter.step({
  "line": 20,
  "name": "validate profile update status",
  "keyword": "Then "
});
formatter.match({
  "location": "stepDefinition.launch_automation_practise_site()"
});
formatter.result({
  "duration": 6722211000,
  "status": "passed"
});
formatter.match({
  "location": "stepDefinition.sign_in_to_access_the_user_account()"
});
formatter.result({
  "duration": 4404028800,
  "status": "passed"
});
formatter.match({
  "location": "stepDefinition.update_user_name()"
});
formatter.result({
  "duration": 2566426700,
  "status": "passed"
});
formatter.match({
  "location": "stepDefinition.validate_profile_update_status()"
});
formatter.result({
  "duration": 183760400,
  "status": "passed"
});
});