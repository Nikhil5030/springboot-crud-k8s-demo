FROM openjdk:17
EXPOSE 8080
ADD target/springboot-crud-k8s-demo.jar springboot-crud-k8s-demo.jar
ENTRYPOINT ["java","-jar","springboot-crud-k8s-demo.jar"]