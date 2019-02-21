# embedded-jetty-demo

This demo shows how to package a Vaadin 12+ application as an "uber jar" using an embedded Jetty server.

The demo also packages Spark for REST endpoint serving.

# Try it out

```
git clone https://github.com/alejandro-du/embedded-jetty-demo.git
cd embedded-jetty-demo
mvn package
java -jar target/embedded-jetty-demo-1.0-SNAPSHOT.jar
```

The app should be visible at http://localhost:8080

To try out Spark, simply run the following in your terminal:

```bash
$ curl localhost:8080/rest/hello
Hello World
```

## Running From Your IDE

Simply run the `com.example.Application` class in your IDE - it contains the
`main()` method which starts up Jetty, Vaadin and Spark.

