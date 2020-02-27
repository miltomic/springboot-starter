# SpringBoot Service Starter Code

Boilerplate code for a typical Spring Boot CRUD service

### Prerequisites

What things you need to install the software and how to install them

* Installed [JDK 11](https://docs.oracle.com/en/java/javase/11/install/overview-jdk-installation.html)
* Environment variable ```JAVA_HOME``` needs to point to above JDK 11, e.g.```JAVA_HOME =/usr/lib/jvm/java-11-openjdk-amd64```
* Installed [Docker Compose](https://docs.docker.com/compose/install/)

### Running

All services that SpringBoot Starter depends on are defined in [docker-compose.yml](docker-compose.yml)<br/>
**NOTE**: These services are only to be used in *development* environment and *not be used* in production. <br/>
Start them by executing following line from root of the project:

```docker-compose up```

After all services in are started by docker compose just trigger Gradle ```bootRun``` task by executing one of the following:

* ```./gradlew bootRun``` on Linux environments
* ```gradlew bootRun``` on Windows

Verify service is running by hitting the GET HTTP request against http://localhost:8080/starter/foos

## Built With

* [Gradle](https://gradle.org/) - Dependency Management

## License

This project is licensed under the GNU General Public License - see the [LICENSE.md](LICENSE.md) file for details
