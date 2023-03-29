FROM maven:3.5-jdk-8-slim
RUN mkdir /data
WORKDIR /data
# 这行不妥，因为会将当前目录下所有文件都会拷贝过去，显然大大超过了实际需要的
#COPY ./ /data

# 不应该在构建镜像时对代码打包，因为这会导致重新下载一遍maven依赖，太耗时
#RUN mvn clean package

# 下面这句不用复制，因为是在容器中执行的，jar包生成在容器中的当前target目录下
#COPY ./target/docker_learn-1.0-SNAPSHOT.jar /data/docker_learn-1.0-SNAPSHOT.jar

# 这里依赖了打包生成的jar，即依赖了版本，应该指定生成的jar包名字
#CMD ["java", "-jar", "/data/target/docker_learn-1.0-SNAPSHOT.jar"]


