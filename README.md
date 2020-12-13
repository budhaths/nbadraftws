# nbadraftws
Sample REST API for 2019 NBA Draft (Spring Boot, MySQL, JPA and Hibernate)

## Steps to Setup

**1. Clone the application**

```bash
https://github.com/budhaths/nbadraftws.git
```

**2. Create Mysql database**
```bash
create database nba_draft_2019
```

**3. Change mysql username and password as per your installation**

+ open `src/main/resources/application.properties`

+ change `spring.datasource.username` and `spring.datasource.password` as per your mysql installation

**4. Build and run the app using maven**

## Explore Rest APIs

The app defines following Rest APIs.

    GET /apiv1.0/players
    
    GET /apiv1.0/players/{playerid}
    
    GET /apiv1.0/draftpick?round={?}&pick={}
    
    GET/apiv1.0/draftpick/undrafted
    
