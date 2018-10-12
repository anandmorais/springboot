FROM openjdk:8-jdk-alpine
MAINTAINER Vipin EV <vipin.veettil@allianz.com>
EXPOSE 8080
CMD java -Xmx64m -Xss1024k -jar /var/jenkins_home/workspace/SpringBootJob/?/.m2/repository/com/apps/samplemavenapplication/1.0.0-SNAPSHOT/samplemavenapplication-1.0.0-SNAPSHOT.jar

