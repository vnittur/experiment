
To build client we need to install angular in the system. Follow the below steps

1) Install latest version of Node.js (nodejs.org) 2) npm install -g @angular/cli 3) Run maven build



To run the application

cd base-docker
docker-compose up

For payments to work with the gateway call back, expsose webhook to outside world

download the file for windows https://bin.equinox.io/c/4VmDzA7iaHb/ngrok-stable-windows-amd64.zip 
download the file for linux https://bin.equinox.io/c/4VmDzA7iaHb/ngrok-stable-linux-amd64.zip

unzip ngrok-stable-windows-amd64.zip

Run the follwoing command
 ./ngrok authtoken HtLUwVknGC4c7iUfxzdq_5efimnDPakuAo8R7NGpG2

expose the service to gateway
./ngrok http 8083 if you are using docker CE or Entripse
./ngrok http http://192.168.99.100:8083 for docker machine
