FROM openjdk:17
COPY --from=build /targe/demo.jar demo.jar
EXPOSE 8080
ENTRYPOINT ["java","HelloWorld"]