# Consuming Soap Services
This demo project illustrates how you can consume SOAP Web services from within Spring Boot. Using [calculator-webservices](http://calculator-webservice.mybluemix.net/calculator)
the application consumes 4 SOAP operations, namely; a) Add b) Subtract c) Divide and d) Multiply.

## Prerequisites
1. Internet connection
2. Java 8
3. IDE (IntelliJIDEA)

## Build
To build the project files:

``
mvn clean package
``

This command will generate the application jar file located at: ``target/spring-consuming-soap-services-0.0.1-SNAPSHOT.jar``.


## Run
To execute the application:

``
java -jar target/spring-consuming-soap-services-0.0.1-SNAPSHOT.jar 12 34
``

The last 2 numbers 12 and 34 are the parameters to be passed to the application for addition, subtraction, division and multiplication.

## License
```
MIT License

Copyright (c) 2019 Mr Mod

Permission is hereby granted, free of charge, to any person obtaining a copy
of this software and associated documentation files (the "Software"), to deal
in the Software without restriction, including without limitation the rights
to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
copies of the Software, and to permit persons to whom the Software is
furnished to do so, subject to the following conditions:

The above copyright notice and this permission notice shall be included in all
copies or substantial portions of the Software.

THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN THE
SOFTWARE.

```