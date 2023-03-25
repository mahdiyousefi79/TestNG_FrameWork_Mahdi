# TestNG framework created by Mahdi Yousefi


## Similar to Amazon framework

### BasePage Class
#### Some of the commonly used methods in a BasePage class in TestNG include:
#### we can remove BrowserUtils and put all common methods in BasePage class too (Amazon project was like this)

* Initialization of the driver object for web automation frameworks
* Navigation to the page URL
* Verification of page title and URL
* Handling of pop-ups and alerts
* Common actions such as click, send keys, and select option
* Waiting for the page to load and element to be visible using explicit and implicit waits.
* The purpose of the BasePage class is to provide a common set of methods that can be inherited by other page classes. This reduces the amount of code duplication and helps to maintain a consistent structure across the test automation framework.

### Maven Dependency
* will complete later



### TestBase class
*   Initialization of the WebDriver instance
*   Teardown test

