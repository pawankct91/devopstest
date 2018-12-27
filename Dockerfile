FROM java:8
ADD build/libs/demo-1.0.jar demo-1.0.jar
ENTRYPOINT ["java", "-jar", "demo-1.0.jar"]