# nbadraftws
Sample REST API for 2019 NBA Draft (Spring Boot, MySQL, JPA and Hibernate)

<h1>1. Clone the application </h1>
https://github.com/budhaths/nbadraftws.git

<h1>2. Create MySQL database</h1>
create database nba_draft_2019

<h1>change mysql username and password as per your installation</h1>
  •	open src/main/resources/application.properties <br>
  •	change spring.datasource.username and spring.datasource.password as per your mysql installation <br>

<h1>4. Build and run the app using maven</h1>

<h3>Explore Rest APIs </h3>
The app defines following Rest APIs.<br>

GET /api/v1/users    <br>
GET /apiv1.0/players  <br>
GET /apiv1.0/players/{playerid}  <br>
GET /apiv1.0/draftpick?round={?}&pick={}  <br>
GET /apiv1.0/draftpick/undrafted <br>
