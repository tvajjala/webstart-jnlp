STEPS to create signed jars
===============================================================================
Create executable jar with manifest file
$/>jar -cfvm myApplication.jar Mainfest.txt com/cisco/dialog/JNLPDiaglog.class

Most JNLP Clients, including Web Start, use the security API in the Java 2 platform. The Java 2 SE JRE 1.2.x supports code signing with the SHA-with-SDA algorithm. J2SE JRE 1.3 also supports MD2withRSA and MD5withRSA.

The steps to sign your JAR files with auto-certificates (useful only for development purposes) are as follows:
Prepare the directory in which you want to store your keys, and remember to have the Java signing tools in the path, located in the bin directory of any J2SE JDK distribution.
Create a test key store
	$/>keytool -genkey -keystore <myfile.jks> -alias <some_alias_name>
	$/>keytool -genkey -keystore keystore.jks -alias cisco
Certificate generated in the same folder where you executed the above command

Sign your jar file (assuming your application jar already build with manifest file) with below command
  $/>jarsigner -keystore keystore.jks myApplication.jar cisco

Verify you jar with below command (ignore warning if it is self-signed)
 $/>jarsigner -verify myApplication.jar
