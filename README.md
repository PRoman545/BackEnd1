# Лабораторна Робота №1

## Launching the project

Requirements: Install Docker and docker-compose, check updates

Step 1. Clone the repository using this command:
```
git clone https://github.com/PRoman545/BackEnd1
```
Step 2. Create image:
```
docker build -t labwork .
```
Step 3. Launch Docker:
```
docker-compose up
```
Project can now be accessed through [localhost](http://localhost:8080/healthcheck)

Alternatively, it can be accessed without deploying it on your machine, through [Render.com](https://backend1-0e4l.onrender.com/)
