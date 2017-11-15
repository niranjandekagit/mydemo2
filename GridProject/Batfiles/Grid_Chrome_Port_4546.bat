Echo off

Title Chromedriver Node on 4546

Echo Setting Project Location for Node

Set projectLocation=C:\Users\niranjan.deka\Sofware\seleniumGrid
pushd %projectLocation%

Echo Setting ChromeDriver path and creating node on 4546

Java -Dwebdriver.chrome.driver=C:\Users\niranjan.deka\workspace\myappproj\BrowserDrivers\chromedriver.exe -jar selenium-server-standalone-3.4.0.jar -role node -hub http://10.88.2.216:4444/grid/register -port 4546
pause