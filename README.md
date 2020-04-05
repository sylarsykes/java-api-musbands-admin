# Musbands Admin

[![Codacy Badge](https://api.codacy.com/project/badge/Grade/d2874b795fea4cfba2f7df1e13621ab2)](https://www.codacy.com/app/juan.gonzalez.fernandez.jgf/java-musbands-admin?utm_source=github.com&amp;utm_medium=referral&amp;utm_content=sylarsykes/java-musbands-admin&amp;utm_campaign=Badge_Grade)

Musbands Admin it is an API Rest with the administration of the master entities for [Musbands API Rest](https://github.com/sylarsykes/java-musbands). It is composed of the modules [Function Member](https://github.com/sylarsykes/java-musbands-admin/tree/master/java-musbands-admin.function-member), [Instument](https://github.com/sylarsykes/java-musbands-admin/tree/master/java-musbands-admin.instrument), [Musical Genre](https://github.com/sylarsykes/java-musbands-admin/tree/master/java-musbands-admin.musical-genre), [Musbands Admin User](https://github.com/sylarsykes/java-musbands-admin/tree/master/java-musbands-admin.users), [Application](https://github.com/sylarsykes/java-musbands-admin/tree/master/java-musbands-admin.application), [Client](https://github.com/sylarsykes/java-musbands-admin/tree/master/java-musbands-admin.client).


## Features
*  [Function Member](https://github.com/sylarsykes/java-musbands-admin/tree/master/java-musbands-admin.function-member) Function Member API. Describe the function of a band member.
*  [Instrument](https://github.com/sylarsykes/java-musbands-admin/tree/master/java-musbands-admin.instrument) Instrument API. Describe the instrument of a band member.
*  [Musical Genre](https://github.com/sylarsykes/java-musbands-admin/tree/master/java-musbands-admin.musical-genre) Musical Genre API. Describe the musical genre of the bands.
*  [Musbands Admin User](https://github.com/sylarsykes/java-musbands-admin/tree/master/java-musbands-admin.users) Users API. Describe the users managemnt.
*  [Application](https://github.com/sylarsykes/java-musbands-admin/tree/master/java-musbands-admin.application) Spring Boot Application
*  [Client](https://github.com/sylarsykes/java-musbands-admin/tree/master/java-musbands-admin.client) Rest Template Client for connect to Function Member, Instrument, Musical Genre APIs.

## How to use libraries?

*  Add repository in pom

```
<!-- Core API Framework -->
<repositories>
	<repository>
		<id>java-musbands-admin</id>
		<url>https://github.com/sylarsykes/java-musbands-admin</url>
		<snapshots>
			<enabled>true</enabled>
			<updatePolicy>always</updatePolicy>
		</snapshots>
	</repository>
</repositories>
```

*  Function member, import dependency

```
<dependency>
	<groupId>org.sylrsykssoft</groupId>
	<artifactId>java-musbands.admin.function-member</artifactId>
	<version>${java-musbands.admin.function-member.version}</version>
</dependency>
```

*  Instrument, import dependency

```
<dependency>	
	<groupId>org.sylrsykssoft</groupId>
	<artifactId>coreapi-framework.api</artifactId>
	<version>${coreapi-framework.api.version</version>
</dependency>
```

*  Musical Genre, import dependency

```
<dependency>
	<groupId>org.sylrsykssoft</groupId>
	<artifactId>java-musbands.admin.musical-genre</artifactId>
	<version>${java-musbands.admin.musical-genre.version}</version>
</dependency>
```

*  Client, import dependency

```
<dependency>
	<groupId>org.sylrsykssoft</groupId>
	<artifactId>java-musbands.admin.client</artifactId>
	<version>${java-musbands.admin.client.version}</version>
</dependency>
```


## Built with

*  [Maven](https://mvnrepository.com/) Dependency manager
*  [Core API Framework](https://github.com/sylarsykes/coreapi-framework)
*  [Spring Framework](https://github.com/spring-projects/spring-framework)
*  [Spring Security](https://spring.io/projects/spring-security)
*  [Apache Commons](https://github.com/apache/commons-lang)
*  [Apache Commons Collections](https://github.com/apache/commons-collections/)
*  [Lombok](https://projectlombok.org/)
*  [Modelmapper](http://modelmapper.org/getting-started/)


## Version

0.0.1-SNAPSHOT. We use [SemVer](https://semver.org/) for versioning. For all available versions, see the [tags](https://github.com/sylarsykes/coreapi-framework/tags) in this repository.


## Authors

*  Juan González Fernández [juan.gonzalez.fernandez.jgf](https://github.com/sylarsykes)


## Related projects

-  [Musbands](https://github.com/sylarsykes/java-musbands)
-  [Musbands Admin Web](https://github.com/sylarsykes/react-musbands-admin)

## License

The Core API Framework is released under version 2.0 of the [Apache License](https://www.apache.org/licenses/LICENSE-2.0).
