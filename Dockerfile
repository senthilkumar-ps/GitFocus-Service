FROM adoptopenjdk
RUN apt-get -y update
RUN apt-get -y install git
RUN mkdir /home/gitfocus
WORKDIR /home/gitfocus
RUN git clone https://github.com/senthilkumar-ps/gitfocus-service-helm.git
WORKDIR /home/gitfocus/gitfocus-service-helm
#EXPOSE 8888
ENTRYPOINT ["java","-jar","/home/gitfocus/gitfocus-service-helm/gitfocus-service.jar"]