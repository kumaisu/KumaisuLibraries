# KumaisuLibraries
Minecraft My Plugin Common Libraries

## 使い方 -USAGE-

### Utility
```java
  Utility.confoleMode mode = Utility.consoleMode.none;
  String msg = StringBuild( "A", "B", "C" ... "Z" );
```

### InetCalc
```java
  long ipl = InetCalc.ipToInt( "xxx.xxx.xxx.xxx" );
  String ips = InetCalc.toInetAddress( long ipl );
```


### setup pom.xml

```xml
<project xmlns="http://maven.apache.org/POM/4.0.0" xmlns:xsi="http://www.w3.org/2001/XMLSchema-instance"
         xsi:schemaLocation="http://maven.apache.org/POM/4.0.0 http://maven.apache.org/xsd/maven-4.0.0.xsd">
    <repositories>
        <repository>
            <id>kumaisulibraries-repo</id>
            <url>https://raw.github.com/kumaisu/KumaisuLibraries/gh-pages/</url>
        </repository>
    </repositories>

    <dependencies>
        <dependency>
            <groupId>kumaisulibraries-repo</groupId>
            <artifactId>KumaisuLibraries</artifactId>
            <version>0.1</version>
        </dependency>
    </dependencies>
</project>
```
