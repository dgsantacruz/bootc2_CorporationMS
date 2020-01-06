#This is the base.
FROM java:8

#This is the port.
EXPOSE 8012:8012

#No idea
ADD /target/BusinessClientJar.jar BusinessClientJar.jar

#No idea
ENTRYPOINT ["java", "-jar", "BusinessClientJar.jar"]