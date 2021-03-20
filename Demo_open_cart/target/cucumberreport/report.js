$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("Practice.feature");
formatter.feature({
  "line": 1,
  "name": "Login",
  "description": "In order to perform successful login\r\nAS a user \r\nI want to enter correct username and password",
  "id": "login",
  "keyword": "Feature"
});
formatter.before({
  "duration": 411500,
  "status": "passed"
});
formatter.background({
  "line": 6,
  "name": "its a background",
  "description": "",
  "type": "background",
  "keyword": "Background"
});
formatter.step({
  "line": 8,
  "name": "given i am background",
  "keyword": "Given "
});
formatter.match({
  "location": "StepDefination.given_i_am_background()"
});
formatter.result({
  "duration": 239314800,
  "status": "passed"
});
formatter.scenario({
  "line": 11,
  "name": "to test with valid id and password",
  "description": "",
  "id": "login;to-test-with-valid-id-and-password",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 10,
      "name": "@smoke"
    }
  ]
});
formatter.step({
  "line": 13,
  "name": "i am scenario no one",
  "keyword": "Given "
});
formatter.match({
  "location": "StepDefination.i_am_scenario_no_one()"
});
formatter.result({
  "duration": 113700,
  "status": "passed"
});
formatter.before({
  "duration": 336200,
  "status": "passed"
});
formatter.background({
  "line": 6,
  "name": "its a background",
  "description": "",
  "type": "background",
  "keyword": "Background"
});
formatter.step({
  "line": 8,
  "name": "given i am background",
  "keyword": "Given "
});
formatter.match({
  "location": "StepDefination.given_i_am_background()"
});
formatter.result({
  "duration": 97000,
  "status": "passed"
});
formatter.scenario({
  "line": 17,
  "name": "to test with scenario two",
  "description": "",
  "id": "login;to-test-with-scenario-two",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 16,
      "name": "@smoke"
    }
  ]
});
formatter.step({
  "line": 19,
  "name": "i am scenario no two",
  "keyword": "Given "
});
formatter.match({
  "location": "StepDefination.i_am_scenario_no_two()"
});
formatter.result({
  "duration": 196000,
  "status": "passed"
});
});