FROM openjdk:8
COPY app.jar /app.jar
RUN chmod +x /app.jar
ENTRYPOINT ["java", "-jar", "/app.jar"]
## аргумент, который передаётся в командную строку
CMD  ["9"]
