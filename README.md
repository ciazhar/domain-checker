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
        <groupId>co.mailtarget.domainchecker</groupId>
        <artifactId>domain-checker</artifactId>
        <version>0.0.1-SNAPSHOT</version>
    </dependency>
```
## Usage
### Java / Kotlin
Add this line of code 
```
    DomainChecker.check("domain.you.want.to.check")
```
or
```
    DomainChecker.check("domain.you.want.to.check", additionalDnsblList)
```