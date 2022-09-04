FROM openjdk:8
EXPOSE 8080
ADD target/k8s_first_project.jar k8s_first_project.jar
ENTRYPOINT ["java", "-jar", "/k8s_first_project.jar"]