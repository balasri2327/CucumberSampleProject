$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("checkbox.feature");
formatter.feature({
  "comments": [
    {
      "line": 1,
      "value": "#Author: your.email@your.domain.com"
    },
    {
      "line": 2,
      "value": "#Keywords Summary :"
    },
    {
      "line": 3,
      "value": "#Feature: List of scenarios."
    },
    {
      "line": 4,
      "value": "#Scenario: Business rule through list of steps with arguments."
    },
    {
      "line": 5,
      "value": "#Given: Some precondition step"
    },
    {
      "line": 6,
      "value": "#When: Some key actions"
    },
    {
      "line": 7,
      "value": "#Then: To observe outcomes or validation"
    },
    {
      "line": 8,
      "value": "#And,But: To enumerate more Given,When,Then steps"
    },
    {
      "line": 9,
      "value": "#Scenario Outline: List of steps for data-driven as an Examples and \u003cplaceholder\u003e"
    },
    {
      "line": 10,
      "value": "#Examples: Container for s table"
    },
    {
      "line": 11,
      "value": "#Background: List of steps run before each of the scenarios"
    },
    {
      "line": 12,
      "value": "#\"\"\" (Doc Strings)"
    },
    {
      "line": 13,
      "value": "#| (Data Tables)"
    },
    {
      "line": 14,
      "value": "#@ (Tags/Labels):To group Scenarios"
    },
    {
      "line": 15,
      "value": "#\u003c\u003e (placeholder)"
    },
    {
      "line": 16,
      "value": "#\"\""
    },
    {
      "line": 17,
      "value": "## (Comments)"
    },
    {
      "line": 18,
      "value": "#Sample Feature Definition Template"
    }
  ],
  "line": 20,
  "name": "I want to use this template for my feature file",
  "description": "",
  "id": "i-want-to-use-this-template-for-my-feature-file",
  "keyword": "Feature",
  "tags": [
    {
      "line": 19,
      "name": "@tag"
    }
  ]
});
formatter.scenario({
  "line": 23,
  "name": "Verify checkbox",
  "description": "",
  "id": "i-want-to-use-this-template-for-my-feature-file;verify-checkbox",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 22,
      "name": "@tag1"
    }
  ]
});
formatter.step({
  "line": 24,
  "name": "User is in DemoQa Register Checkbox",
  "keyword": "Given "
});
formatter.step({
  "line": 25,
  "name": "User enter the Checkbox",
  "keyword": "When "
});
formatter.step({
  "line": 26,
  "name": "I validate the verify Checkbox",
  "keyword": "Then "
});
formatter.match({
  "location": "CheckBox.user_is_in_DemoQa_Register_Checkbox()"
});
formatter.result({
  "duration": 13311060753,
  "status": "passed"
});
formatter.match({
  "location": "CheckBox.user_enter_the_Checkbox()"
});
formatter.result({
  "duration": 947665955,
  "status": "passed"
});
formatter.match({
  "location": "CheckBox.i_validate_the_verify_Checkbox()"
});
formatter.result({
  "duration": 27320878,
  "status": "passed"
});
formatter.uri("main.feature");
formatter.feature({
  "comments": [
    {
      "line": 1,
      "value": "#Author: your.email@your.domain.com"
    },
    {
      "line": 2,
      "value": "#Keywords Summary :"
    },
    {
      "line": 3,
      "value": "#Feature: List of scenarios."
    },
    {
      "line": 4,
      "value": "#Scenario: Business rule through list of steps with arguments."
    },
    {
      "line": 5,
      "value": "#Given: Some precondition step"
    },
    {
      "line": 6,
      "value": "#When: Some key actions"
    },
    {
      "line": 7,
      "value": "#Then: To observe outcomes or validation"
    },
    {
      "line": 8,
      "value": "#And,But: To enumerate more Given,When,Then steps"
    },
    {
      "line": 9,
      "value": "#Scenario Outline: List of steps for data-driven as an Examples and \u003cplaceholder\u003e"
    },
    {
      "line": 10,
      "value": "#Examples: Container for s table"
    },
    {
      "line": 11,
      "value": "#Background: List of steps run before each of the scenarios"
    },
    {
      "line": 12,
      "value": "#\"\"\" (Doc Strings)"
    },
    {
      "line": 13,
      "value": "#| (Data Tables)"
    },
    {
      "line": 14,
      "value": "#@ (Tags/Labels):To group Scenarios"
    },
    {
      "line": 15,
      "value": "#\u003c\u003e (placeholder)"
    },
    {
      "line": 16,
      "value": "#\"\""
    },
    {
      "line": 17,
      "value": "## (Comments)"
    },
    {
      "line": 18,
      "value": "#Sample Feature Definition Template"
    }
  ],
  "line": 21,
  "name": "Title of your feature",
  "description": "I want to use this template for my feature file",
  "id": "title-of-your-feature",
  "keyword": "Feature",
  "tags": [
    {
      "line": 20,
      "name": "@tag"
    }
  ]
});
formatter.scenario({
  "line": 25,
  "name": "Checking TextBoxes",
  "description": "",
  "id": "title-of-your-feature;checking-textboxes",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 24,
      "name": "@tag1"
    }
  ]
});
formatter.step({
  "line": 26,
  "name": "User is in Register page",
  "keyword": "Given "
});
formatter.step({
  "line": 27,
  "name": "User enter the firstname and lastname and phonenumber and username and email and about yourself and password and cofirmpassword",
  "keyword": "When "
});
formatter.step({
  "line": 28,
  "name": "I validate the entered firstname and lastname and phonenumber and username and email and about yourself and password and cofirmpassword",
  "keyword": "Then "
});
formatter.match({
  "location": "TexboxTest.user_is_in_Register_page()"
});
formatter.result({
  "duration": 11514693021,
  "status": "passed"
});
formatter.match({
  "location": "TexboxTest.user_enter_the_firstname_and_lastname_and_phonenumber_and_username_and_email_and_about_yourself_and_password_and_cofirmpassword()"
});
formatter.result({
  "duration": 676270065,
  "status": "passed"
});
formatter.match({
  "location": "TexboxTest.i_validate_the_entered_firstname_and_lastname_and_phonenumber_and_username_and_email_and_about_yourself_and_password_and_cofirmpassword()"
});
formatter.result({
  "duration": 204671062,
  "status": "passed"
});
formatter.uri("radio.feature");
formatter.feature({
  "comments": [
    {
      "line": 1,
      "value": "#Author: your.email@your.domain.com"
    },
    {
      "line": 2,
      "value": "#Keywords Summary :"
    },
    {
      "line": 3,
      "value": "#Feature: List of scenarios."
    },
    {
      "line": 4,
      "value": "#Scenario: Business rule through list of steps with arguments."
    },
    {
      "line": 5,
      "value": "#Given: Some precondition step"
    },
    {
      "line": 6,
      "value": "#When: Some key actions"
    },
    {
      "line": 7,
      "value": "#Then: To observe outcomes or validation"
    },
    {
      "line": 8,
      "value": "#And,But: To enumerate more Given,When,Then steps"
    },
    {
      "line": 9,
      "value": "#Scenario Outline: List of steps for data-driven as an Examples and \u003cplaceholder\u003e"
    },
    {
      "line": 10,
      "value": "#Examples: Container for s table"
    },
    {
      "line": 11,
      "value": "#Background: List of steps run before each of the scenarios"
    },
    {
      "line": 12,
      "value": "#\"\"\" (Doc Strings)"
    },
    {
      "line": 13,
      "value": "#| (Data Tables)"
    },
    {
      "line": 14,
      "value": "#@ (Tags/Labels):To group Scenarios"
    },
    {
      "line": 15,
      "value": "#\u003c\u003e (placeholder)"
    },
    {
      "line": 16,
      "value": "#\"\""
    },
    {
      "line": 17,
      "value": "## (Comments)"
    },
    {
      "line": 18,
      "value": "#Sample Feature Definition Template"
    }
  ],
  "line": 20,
  "name": "I want to use this template for my feature file",
  "description": "",
  "id": "i-want-to-use-this-template-for-my-feature-file",
  "keyword": "Feature",
  "tags": [
    {
      "line": 19,
      "name": "@tag"
    }
  ]
});
formatter.scenario({
  "line": 23,
  "name": "Check RadioButton",
  "description": "",
  "id": "i-want-to-use-this-template-for-my-feature-file;check-radiobutton",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 22,
      "name": "@tag1"
    }
  ]
});
formatter.step({
  "line": 24,
  "name": "User is in DemoQa Register page",
  "keyword": "Given "
});
formatter.step({
  "line": 25,
  "name": "User enter the RadioButton",
  "keyword": "When "
});
formatter.step({
  "line": 26,
  "name": "I validate the Checked RadioButton",
  "keyword": "Then "
});
formatter.match({
  "location": "RadioButtonTest.user_is_in_DemoQa_Register_page()"
});
formatter.result({
  "duration": 12365716554,
  "status": "passed"
});
formatter.match({
  "location": "RadioButtonTest.user_enter_the_RadioButton()"
});
formatter.result({
  "duration": 318214009,
  "status": "passed"
});
formatter.match({
  "location": "RadioButtonTest.i_validate_the_Checked_RadioButton()"
});
formatter.result({
  "duration": 11205255,
  "status": "passed"
});
});