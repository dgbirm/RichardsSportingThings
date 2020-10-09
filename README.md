---
title: Richard's Sporting Things
category: REST API, Web UX
layout: 2017/sheet
tags: [Featured]
updated: Oct 9 2020
keywords:
  - React
  - Spring
  - Bootstrap
  - Hibernate
---

Richard's Sporting Things
---------------
![Example Image][workingExample]
## Introduction

We have designed a full stack web application ux for a hypothetical Sports Retailer named Richard's Sporting Things. This application is built on the following components: 
  - Spring boot (Java) backend utilizing hibernate and JPA for data persistance
  - Management of MySQL database that supports a many-to-many relationship between:
   - Retail products with their image url and price
   - Hierarchical tags used to group these retail products in a meaningful way
  - Web interface implemented as an application in React JS

This project incorporates many relevant features of a robust Full-Stack application including but not limited to:
 - REST API
 - **Finish Here**

 ### Structure
This project uses [Spring][spring] Data REST to build hypermedia-powered repositories and [React][react] to leverage easy-to-use views in JavaScript for the web application. 

### Backend
This project is managed with the [Apache Maven][maven] management tool.

### TODO:
Specific features of our backend... Something like the following

> `Employee.java` and `Department.java` are POJOs to model employees and departments respectively. Using Spring annotations, these models are transformed into Spring Rest domains. There are a number of department types that inherit from `Department.java` including `Leadership.java` and `Manufacturing.java`.

### Data Persistance
Data persistance has been implemented using the hibernate framework and MySQL to support a RESTful interface.

### Frontend
The frontend for this project lives within the React framework. The CSS uses... *any notable packages we use* Note that `npm` is the JS dependency management tool we have chosen to use for this project.

## Usage

### Getting files from Github
If you are unclear on cloning a repository from GH, please follow the instructions [here][ghclone]. *Note:* at some time, this project may be runnable as a single script, but this is not that time.

### Setting up the test MySQL Database
In the top level of the project, there exits an a script file named **Insert this** that may be used to set up a test database. Using [MySQL Workbench][mysqlWorkbench], navigate to to *Server* > *Data Import*, choose *Import From Self-Contained File* and *Start Import*

*Note*: Before running the application you may need to change the login credentials for your personal instance of `localhost`. This can be done by editing the information in `\RichardsSportingThings\Hackathon-TeamCsGetDegrees-backend\src\main\resources`. By default the, the user is `root` and the password is `password`.

### Launching the Backend
To use this application with the command line, navigate to your local install of the backend java project and run it using the `mvmn` command (`mvmn.bat` for Windows users):
```bash
cd /Directory/of/RichardsSportingThings/Hackathon-TeamCsGetDegrees-backend
# first clean up the output directory,
# next build the project and verify the outcome
./mvnw clean verify --enable-preview 
./mvnw spring-boot:run
```
Personally, we work with this project in Eclipse, and so we use the [Spring Tools 4][Spt4] to run the project. If the project runs successfully, you should be able to use `curl` or an app like Postman to make HTTP `GET` requests to `http://localhost:8080/tags` and `http://localhost:8080/api/tagitems` (as long as you haven't configured tomcat to run on some port other than the default.)

### Launching the Frontend
To start the web application, navigate to the `rst-front` folder and use `npm` to  install necessary `node_modules` and start the applications:
```bash
cd RichardsSportingThings/rst-front
npm i #to build need install packages locally
npm start
```
By default, the web application should run on `http://localhost:3000`. *Note:* if you choose to run the application on some other port, you may need to update the `@CrossOrigins` annotation in both `ItemController.java` and `ItemTagController.java` to avoid potential CORS issues.

At this point with the database set up and both the front and back ends running, you should be able to navigate to `http://localhost:3000` and use the web application as intended.

## Still Under Construction

* ### Animated transitions
We hope to implement some sort of dynamic transition on a 'button click within the ui

* ### Machine Learning
We would like to use a machine learning clustering algorithm to generate tag groupings between objects in the data base at some point. So far, we have experimented with...

* ### Frontend integration with spring integration
At some point, I would like to integrate the front and back ends so that starting the application launches both. For example, I might have to semi-link the front end `index.html` to the location where spring expects it on the back end.


 <!-- Links -->
[maven]: https://maven.apache.org/
[spring]: https://spring.io/
[react]: https://reactjs.org/
[react-bootstrap]: https://react-bootstrap.github.io/
[ghclone]: https://docs.github.com/en/github/creating-cloning-and-archiving-repositories/cloning-a-repository
[SpT4]: https://marketplace.eclipse.org/content/spring-tools-4-aka-spring-tool-suite-4
[mysqlWorkbench]: https://www.mysql.com/products/workbench/

[workingExample]: ./exampleImage.jpg