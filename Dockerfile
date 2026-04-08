FROM openjdk:17

WORKDIR /app

COPY target/notes-app-1.0.jar app.jar

EXPOSE 8080

CMD ["java", "-cp", "app.jar", "NotesController"]