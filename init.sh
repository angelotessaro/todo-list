sudo apt-get update
sudo apt-get -y install maven
sudo apt install nodejs
sudo apt install npm
mvn clean package
java -jar target/todo-list-0.0.1-SNAPSHOT.jar

