# ObjectRepositoryRetriever

This project develops a Groovy class `com.kazurayam.ks.ObjectRepositoryRetriever`.

This class reads the contents of `Object Repository` directory, converts the XML config files into `com.kms.katalon.core.testobject.TestObject`, 
and then convert them into JSON text.

Try to run "Test Cases/testObjectRepositoryRetriever" to see what happens.

```
2022-08-03 23:26:39.893 INFO  c.k.katalon.core.main.TestCaseExecutor   - --------------------
2022-08-03 23:26:39.897 INFO  c.k.katalon.core.main.TestCaseExecutor   - START Test Cases/testObjectRepositoryRetriever
2022-08-03 23:26:40.616 DEBUG testcase.testObjectRepositoryRetriever   - 1: projectDir = Paths.get(getProjectDir())
2022-08-03 23:26:40.636 DEBUG testcase.testObjectRepositoryRetriever   - 2: testObjects = ObjectRepositoryRetriever.readTestObjectFiles(projectDir)
2022-08-03 23:26:42.483 DEBUG testcase.testObjectRepositoryRetriever   - 3: assert testObjects.size() > 0
2022-08-03 23:26:42.487 DEBUG testcase.testObjectRepositoryRetriever   - 4: println(testObjects.size())
19
2022-08-03 23:26:42.495 DEBUG testcase.testObjectRepositoryRetriever   - 5: testObjects.forEach({ java.lang.Object to -> ... })
null
{
  "isParentObjectShadowRoot": false,
  "properties": [
    {
      "name": "id",
      "condition": "EQUALS",
      "value": "comment",
      "isActive": true
    }
  ],
  "xpaths": [],
  "objectId": "Page_AppointmentConfirmation/lbl_Comment",
  "useRelativeImagePath": false,
  "selectorMethod": "BASIC",
  "selectorCollection": {}
}
{
  "isParentObjectShadowRoot": false,
  "properties": [
    {
      "name": "id",
      "condition": "EQUALS",
      "value": "facility",
      "isActive": true
    }
  ],
  "xpaths": [],
  "objectId": "Page_AppointmentConfirmation/lbl_Facility",
  "useRelativeImagePath": false,
  "selectorMethod": "BASIC",
  "selectorCollection": {}
}
{
  "isParentObjectShadowRoot": false,
  "properties": [
    {
      "name": "id",
      "condition": "EQUALS",
      "value": "hospital_readmission",
      "isActive": true
    }
  ],
  "xpaths": [],
  "objectId": "Page_AppointmentConfirmation/lbl_HospitalReadmission",
  "useRelativeImagePath": false,
  "selectorMethod": "BASIC",
  "selectorCollection": {}
}
{
  "isParentObjectShadowRoot": false,
  "properties": [
    {
      "name": "id",
      "condition": "EQUALS",
      "value": "program",
      "isActive": true
    }
  ],
  "xpaths": [],
  "objectId": "Page_AppointmentConfirmation/lbl_Program",
  "useRelativeImagePath": false,
  "selectorMethod": "BASIC",
  "selectorCollection": {}
}
{
  "isParentObjectShadowRoot": false,
  "properties": [
    {
      "name": "id",
      "condition": "EQUALS",
      "value": "visit_date",
      "isActive": true
    }
  ],
  "xpaths": [],
  "objectId": "Page_AppointmentConfirmation/lbl_VisitDate",
  "useRelativeImagePath": false,
  "selectorMethod": "BASIC",
  "selectorCollection": {}
}
{
  "isParentObjectShadowRoot": false,
  "properties": [
    {
      "name": "id",
      "condition": "EQUALS",
      "value": "btn-book-appointment",
      "isActive": true
    }
  ],
  "xpaths": [],
  "objectId": "Page_CuraAppointment/btn_BookAppointment",
  "useRelativeImagePath": false,
  "selectorMethod": "BASIC",
  "selectorCollection": {
    "BASIC": "//*[@id \u003d \u0027btn-book-appointment\u0027]",
    "CSS": "",
    "XPATH": ""
  }
}
{
  "isParentObjectShadowRoot": false,
  "properties": [
    {
      "name": "id",
      "condition": "EQUALS",
      "value": "radio_program_medicaid",
      "isActive": true
    }
  ],
  "xpaths": [],
  "objectId": "Page_CuraAppointment/chk_Medicaid",
  "useRelativeImagePath": false,
  "selectorMethod": "BASIC",
  "selectorCollection": {}
}
{
  "isParentObjectShadowRoot": false,
  "properties": [
    {
      "name": "id",
      "condition": "EQUALS",
      "value": "radio_program_medicare",
      "isActive": true
    }
  ],
  "xpaths": [],
  "objectId": "Page_CuraAppointment/chk_Medicare",
  "useRelativeImagePath": false,
  "selectorMethod": "BASIC",
  "selectorCollection": {}
}
{
  "isParentObjectShadowRoot": false,
  "properties": [
    {
      "name": "id",
      "condition": "EQUALS",
      "value": "radio_program_none",
      "isActive": true
    }
  ],
  "xpaths": [],
  "objectId": "Page_CuraAppointment/chk_None",
  "useRelativeImagePath": false,
  "selectorMethod": "BASIC",
  "selectorCollection": {}
}
{
  "isParentObjectShadowRoot": false,
  "properties": [
    {
      "name": "name",
      "condition": "EQUALS",
      "value": "hospital_readmission",
      "isActive": true
    }
  ],
  "xpaths": [],
  "objectId": "Page_CuraAppointment/chk_Readmission",
  "useRelativeImagePath": false,
  "selectorMethod": "BASIC",
  "selectorCollection": {}
}
{
  "isParentObjectShadowRoot": false,
  "properties": [
    {
      "name": "id",
      "condition": "EQUALS",
      "value": "appointment",
      "isActive": true
    }
  ],
  "xpaths": [],
  "objectId": "Page_CuraAppointment/div_Appointment",
  "useRelativeImagePath": false,
  "selectorMethod": "BASIC",
  "selectorCollection": {}
}
{
  "isParentObjectShadowRoot": false,
  "properties": [
    {
      "name": "id",
      "condition": "EQUALS",
      "value": "combo_facility",
      "isActive": true
    }
  ],
  "xpaths": [],
  "objectId": "Page_CuraAppointment/lst_Facility",
  "useRelativeImagePath": false,
  "selectorMethod": "BASIC",
  "selectorCollection": {}
}
{
  "isParentObjectShadowRoot": false,
  "properties": [
    {
      "name": "id",
      "condition": "EQUALS",
      "value": "txt_comment",
      "isActive": true
    }
  ],
  "xpaths": [],
  "objectId": "Page_CuraAppointment/txt_Comment",
  "useRelativeImagePath": false,
  "selectorMethod": "BASIC",
  "selectorCollection": {}
}
{
  "isParentObjectShadowRoot": false,
  "properties": [
    {
      "name": "id",
      "condition": "EQUALS",
      "value": "txt_visit_date",
      "isActive": true
    }
  ],
  "xpaths": [],
  "objectId": "Page_CuraAppointment/txt_VisitDate",
  "useRelativeImagePath": false,
  "selectorMethod": "BASIC",
  "selectorCollection": {}
}
{
  "isParentObjectShadowRoot": false,
  "properties": [
    {
      "name": "id",
      "condition": "EQUALS",
      "value": "btn-make-appointment",
      "isActive": true
    }
  ],
  "xpaths": [],
  "objectId": "Page_CuraHomepage/btn_MakeAppointment",
  "useRelativeImagePath": false,
  "selectorMethod": "BASIC",
  "selectorCollection": {}
}
{
  "isParentObjectShadowRoot": false,
  "properties": [
    {
      "name": "id",
      "condition": "EQUALS",
      "value": "btn-login",
      "isActive": true
    }
  ],
  "xpaths": [],
  "objectId": "Page_Login/btn_Login",
  "useRelativeImagePath": false,
  "selectorMethod": "BASIC",
  "selectorCollection": {}
}
{
  "isParentObjectShadowRoot": false,
  "properties": [
    {
      "name": "id",
      "condition": "EQUALS",
      "value": "txt-password",
      "isActive": true
    }
  ],
  "xpaths": [],
  "objectId": "Page_Login/txt_Password",
  "useRelativeImagePath": false,
  "selectorMethod": "BASIC",
  "selectorCollection": {}
}
{
  "isParentObjectShadowRoot": false,
  "properties": [
    {
      "name": "id",
      "condition": "EQUALS",
      "value": "txt-username",
      "isActive": true
    }
  ],
  "xpaths": [],
  "objectId": "Page_Login/txt_UserName",
  "useRelativeImagePath": false,
  "selectorMethod": "BASIC",
  "selectorCollection": {}
}
2022-08-03 23:26:42.645 INFO  c.k.katalon.core.main.TestCaseExecutor   - END Test Cases/testObjectRepositoryRetriever

```