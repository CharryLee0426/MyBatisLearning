## MyBatisLearning

### 1. What's it?
A brief introduction about mybatis, a persistence framework.

### 2. How to start?
I use IDEA to create my project. You can just select `spring boot web`, `mybatis`, `mysql` to create a spring boot project.
Then, you must wait for IDE solve the dependencies to build the project. The entry point has an annotation called `@SpringBootApplication`.
After these, you can create pojo, dao, service and controller.

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

