Echo off

Title IEdriver Node on 4545

Echo Setting Project Location for Node

Set projectLocation=C:\Users\niranjan.deka\Sofware\seleniumGrid
pushd %projectLocation%

Echo Setting ChromeDriver path and creating node on 4546

Java -Dwebdriver.ie.driver=C:\Users\niranjan.deka\workspace\myappproj\BrowserDrivers\IEDriverServer32.exe -jar selenium-server-standalone-3.4.0.jar -role node -hub http://localhost:4444/grid/register -port 4545
pause