Echo Off

Title Server HUB on port 4444

Echo Setting project Location
Set projectlocation=C:\Users\niranjan.deka\Sofware\seleniumGrid
pushd %projectlocation%

Echo Loading HUB on the default port 4444
java -jar selenium-server-standalone-3.4.0.jar -role hub
pause