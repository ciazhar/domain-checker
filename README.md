# Domain Checker
Checking domain whether blocked by DNSBL or not. Support for Java and Kotlin.

## Prerequisites:
- Java JDK
- Apache Maven 

## Install
Because this project not pushed to any public maven repos, you should install it first locally
```bash
    mvn clean install
```

add this project as dependency of your project
```xml
    <dependency>
        <groupId>com.ciazhar</groupId>
          <artifactId>domain-checker</artifactId>
          <version>0.0.1-SNAPSHOT</version>
    </dependency>
```
## Usage
### Java / Kotlin
Add this line of code 
```kotlin
    DomainChecker.check("domain.you.want.to.check")
```
If you execute the program, it will print in your Command Line Interface (Terminal/CMD) whether the domain is blocked or not.