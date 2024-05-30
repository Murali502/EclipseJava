set projectLocation=C:\Users\girish\Desktop\EclipseJava\JenkinsTest

cd %projectLocation%

set classpath=%projectLocation%\bin;%projectLocation%\jars\*

java org.testng.TestNG %projectLocation%\testng.xml
