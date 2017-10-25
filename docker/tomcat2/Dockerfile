FROM tomcat:9.0.1-alpine

MAINTAINER Uchiyama <shintaro.0112@gmail.com>

ADD tomcat-users.xml server.xml web.xml context.xml catalina.properties /usr/local/tomcat/conf/
ADD mysql-connector-java-5.1.12-bin.jar /usr/local/tomcat/lib/mysql-connector-java-5.1.12-bin.jar
# ADD context.xml /usr/local/tomcat/webapps/manager/META-INF/context.xml

# delete default directry
RUN rm -rf /usr/local/tomcat/webapps/ROOT \
    /usr/local/tomcat/webapps/docs \
    /usr/local/tomcat/webapps/examples

# adjust timezone
RUN apk --update add tzdata && \
    cp /usr/share/zoneinfo/Asia/Tokyo /etc/localtime && \
    apk del tzdata && \
    rm -rf /var/cache/apk/*

CMD ["catalina.sh", "run"]
