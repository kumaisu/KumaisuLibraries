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
            <url>https://raw.github.com/kumaisu/KumaisuLibraries/mvn-repo/</url>
            <snapshots>
                <enabled>true</enabled>
                <updatePolicy>always</updatePolicy>
            </snapshots>
        </repository>
    </repositories>

    <dependencies>
        <dependency>
            <groupId>com.mycompany</groupId>
            <artifactId>KumaisuLibraries</artifactId>
            <version>0.1</version>
          <type>jar</type>
        </dependency>
    </dependencies>
</project>
```
Create a FatJar with maven-shade-plugin.  
It is recommended to "relocation" to prevent conflicts with different versions included in other plugins.  
```xml
<plugin>
    <groupId>org.apache.maven.plugins</groupId>
    <artifactId>maven-shade-plugin</artifactId>
    <version>3.2.0</version>
    <executions>
        <execution>
            <phase>package</phase>
            <goals>
                <goal>shade</goal>
            </goals>
            <configuration>
                <artifactSet>
                    <includes>
                        <include>com.mycompany:KumaisuLibraries</include>
                    </includes>
                </artifactSet>
                <relocations>
                    <relocation>
                        <pattern>com.mycompany:KumaisuLibraries</pattern>
                        <shadedPattern>com.mycompany.KumaisuLibraries</shadedPattern>
                    </relocation>
                </relocations>
            </configuration>
        </execution>
    </executions>
</plugin>
```
