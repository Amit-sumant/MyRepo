$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("C:/Users/mypc/eclipse-workspace/FreeCRMBDDFramework/src/main/java/features/login.festures");
formatter.feature({
  "line": 1,
  "name": "Login page of FreeCRM application",
  "description": "",
  "id": "login-page-of-freecrm-application",
  "keyword": "Feature"
});
formatter.scenario({
  "line": 3,
  "name": "Successful Login to FreeCRM application",
  "description": "",
  "id": "login-page-of-freecrm-application;successful-login-to-freecrm-application",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 4,
  "name": "user is on Login Page",
  "keyword": "Given "
});
formatter.step({
  "line": 5,
  "name": "title of Login page is FreeCRm",
  "keyword": "When "
});
formatter.step({
  "line": 6,
  "name": "user enter username and password",
  "keyword": "Then "
});
formatter.step({
  "line": 7,
  "name": "user click on Login button",
  "keyword": "Then "
});
formatter.step({
  "line": 8,
  "name": "user is on home page",
  "keyword": "And "
});
formatter.match({
  "location": "LoginStepDefination.user_is_on_login()"
});
formatter.result({
  "duration": 27437504301,
  "status": "passed"
});
formatter.match({
  "location": "LoginStepDefination.title_oflogin_page()"
});
formatter.result({
  "duration": 296766571,
  "status": "passed"
});
formatter.match({
  "location": "LoginStepDefination.user_enter_username_and_password()"
});
formatter.result({
  "duration": 23542711501,
  "error_message": "org.openqa.selenium.WebDriverException: unknown error: call function result missing \u0027value\u0027\n  (Session info: chrome\u003d85.0.4183.83)\n  (Driver info: chromedriver\u003d2.33.506120 (e3e53437346286c0bc2d2dc9aa4915ba81d9023f),platform\u003dWindows NT 6.3.9600 x86_64) (WARNING: The server did not provide any stacktrace information)\nCommand duration or timeout: 0 milliseconds\nBuild info: version: \u00273.5.3\u0027, revision: \u0027a88d25fe6b\u0027, time: \u00272017-08-29T12:42:44.417Z\u0027\nSystem info: host: \u0027ARNAV_SUMANT\u0027, ip: \u0027116.75.44.156\u0027, os.name: \u0027Windows 8.1\u0027, os.arch: \u0027amd64\u0027, os.version: \u00276.3\u0027, java.version: \u00271.8.0_121\u0027\nDriver info: org.openqa.selenium.chrome.ChromeDriver\nCapabilities [{mobileEmulationEnabled\u003dfalse, hasTouchScreen\u003dfalse, platform\u003dWIN8_1, acceptSslCerts\u003dtrue, webStorageEnabled\u003dtrue, browserName\u003dchrome, takesScreenshot\u003dtrue, javascriptEnabled\u003dtrue, platformName\u003dWIN8_1, setWindowRect\u003dtrue, unexpectedAlertBehaviour\u003d, applicationCacheEnabled\u003dfalse, rotatable\u003dfalse, networkConnectionEnabled\u003dfalse, chrome\u003d{chromedriverVersion\u003d2.33.506120 (e3e53437346286c0bc2d2dc9aa4915ba81d9023f), userDataDir\u003dC:\\Users\\mypc\\AppData\\Local\\Temp\\scoped_dir10200_2062}, takesHeapSnapshot\u003dtrue, pageLoadStrategy\u003dnormal, unhandledPromptBehavior\u003d, databaseEnabled\u003dfalse, handlesAlerts\u003dtrue, version\u003d85.0.4183.83, browserConnectionEnabled\u003dfalse, nativeEvents\u003dtrue, locationContextEnabled\u003dtrue, cssSelectorsEnabled\u003dtrue}]\nSession ID: 0ba38984640b9c9c53956ce9bd484de7\r\n\tat sun.reflect.NativeConstructorAccessorImpl.newInstance0(Native Method)\r\n\tat sun.reflect.NativeConstructorAccessorImpl.newInstance(NativeConstructorAccessorImpl.java:62)\r\n\tat sun.reflect.DelegatingConstructorAccessorImpl.newInstance(DelegatingConstructorAccessorImpl.java:45)\r\n\tat java.lang.reflect.Constructor.newInstance(Constructor.java:423)\r\n\tat org.openqa.selenium.remote.ErrorHandler.createThrowable(ErrorHandler.java:215)\r\n\tat org.openqa.selenium.remote.ErrorHandler.throwIfResponseFailed(ErrorHandler.java:167)\r\n\tat org.openqa.selenium.remote.http.JsonHttpResponseCodec.reconstructValue(JsonHttpResponseCodec.java:40)\r\n\tat org.openqa.selenium.remote.http.AbstractHttpResponseCodec.decode(AbstractHttpResponseCodec.java:82)\r\n\tat org.openqa.selenium.remote.http.AbstractHttpResponseCodec.decode(AbstractHttpResponseCodec.java:45)\r\n\tat org.openqa.selenium.remote.HttpCommandExecutor.execute(HttpCommandExecutor.java:164)\r\n\tat org.openqa.selenium.remote.service.DriverCommandExecutor.execute(DriverCommandExecutor.java:82)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.execute(RemoteWebDriver.java:646)\r\n\tat org.openqa.selenium.remote.RemoteWebElement.execute(RemoteWebElement.java:275)\r\n\tat org.openqa.selenium.remote.RemoteWebElement.sendKeys(RemoteWebElement.java:99)\r\n\tat stepDefination.LoginStepDefination.user_enter_username_and_password(LoginStepDefination.java:47)\r\n\tat ✽.Then user enter username and password(C:/Users/mypc/eclipse-workspace/FreeCRMBDDFramework/src/main/java/features/login.festures:6)\r\n",
  "status": "failed"
});
formatter.match({
  "location": "LoginStepDefination.user_click_on_Login_button()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "LoginStepDefination.user_is_on_home_page()"
});
formatter.result({
  "status": "skipped"
});
});