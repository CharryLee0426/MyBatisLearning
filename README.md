## MyBatisLearning

### 1. What's it?
A brief introduction about mybatis, a persistence framework.

### 2. How to start?
Firstly, please make sure you have installed IDEA, java 1.8, MySQL. Just execute `create.sql` to initialize database.

I use IDEA to create my project. You can just select `spring boot web`, `mybatis`, `mysql` to create a spring boot project.
Then, you must wait for IDE solve the dependencies to build the project. The entry point has an annotation called `@SpringBootApplication`.
After these, you can create entity, dao, service and controller.

### 3. Configution
Firstly, you shoud add some mybatis configutions to `application.yml`.
```yaml
mybatis:
  type-aliases-package: com.lichen.mybatislearning.entity
  mapper-locations: classpath:mapper/*.xml
```
Type-aliases-package tells the system the entities' package, the system can find entity class automatically.
Mapper-locations tells the system where the mapper files are.

Then you can create .xml mapper files and dao class. You must add `@Mapper` for each dao class, or add `@MapperScan(basepackages="{your dao package}")` in entry class.

### 4. Mapper File
The mapper file is the solution that make sql easy in Java. Usually, iy's a .xml file. You can write sql so that the Dao interface
can find the sql in mapper file and excute it.

#### 4.1 Select
There are 2 examples about how to select some records of table user.
We should use `<select>`. `<select>` has two important properties: id and resultType.
Id must refer to the Dao's method name. ResultType must refer to an entity class.

#### 4.2 Insert and Update
`<insert>` and `<update>` don't have property resultType.
So, you should use `<select>` if you want to return something when you update or insert.

When you get params in your methods, you can use `#{0}, #{1}, #{2}...`
or `#{param1}, #{param2}, #{param3}...` to find params one by one. But we usually use annotation `@Param("name"")` to
give the param unique name. After that, you should use `#{name}` but not `#{0}`.


### 5. RESTful Controller
RESTful Controller is different from Controller. It can't return a html file(such as `login.html`).
However, it's very good for deliver data, because it will translate your Java Object to JSON. In this
project, I use RESTful Controller in order to watch response data more directly.

For example, it's the response of `/rest/user/list`.
![](images/list.png)

