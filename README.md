# MicroserviceProject

# CampEase
CampEase Tunisia is a web application designed with a robust microservice architecture to enhance users' camping experiences by providing comprehensive features for exploring and reserving camping events, offering feedback on camp locations, and managing camping products. Leveraging microservices allows for modularization and scalability, ensuring seamless performance even as demands grow.
Our platform aims to offer a seamless experience for users, enabling them to discover exciting camping opportunities and optimize their outdoor adventures.

## Features
### For Normal Users
- Event Reservation: Easily browse and reserve camping events based on location, date, and available spots, ensuring a seamless booking experience for your next outdoor adventure.
- Feedback on Camp Places: Share your camping experiences and insights by providing feedback on camp places you have visited. Your feedback helps other users make informed decisions and enhances the camping community's collective knowledge.
- Product Management: Explore and manage a diverse selection of camping products curated to enhance your camping experience. From tents to outdoor cooking gear, find everything you need for a comfortable and enjoyable camping trip.
### For Admin Users
- Camp Place Management: Admin can add, edit, and delete camp places, providing detailed information such as location, amenities, and pricing.
- Product Management: Admin have full control over the camping products, including adding new products, updating prices, and managing inventory.
- Event Management: Admin can manage camping events, including creating new events, updating event details, and handling event reservations.
  
## Technologies Used
- Front-end: Angular, HTML, CSS, Angular Material, TypeScript
- Back-end: SpringBoot, Django DRF, MysQl, Postgresql, Java 17, python 3

 ## Services Used 
- Eureka Server
- API Gateway
- Auth Service
- Product Service
- Event Service
- CampPlace Service
- Feedback Service
- Reservation Service

 ### To execute the API's through the gateway
    1) http://localhost:8088/api/register
    2) http://localhost:8088/api/login
    3) http://localhost:8088/api/logout
    4) http://localhost:8088/api/product
    5) http://localhost:8088/api/product/addProduct
    6) http://localhost:8088/api/product 
    7) http://localhost:8088/api/product/{id}
    8) http://localhost:8088/api/product/getNewestProduct
    9) http://localhost:8088/api/product/productCount
    10) http://localhost:8088/api/feedback/addFeedback
    11) http://localhost:8088/api/event/addEvent
    12) http://localhost:8088/api/reservation/add

### 🔨 Run the App

<b>Docker</b>

<b>1 )</b> Install <b>Docker Desktop</b>. Here is the installation <b>link</b> : https://docs.docker.com/docker-for-windows/install/

<b>2 )</b> Open <b>Terminal</b> under <b>resources</b> folder to run <b>Keycloak</b> and <b>RabbitMq</b> on <b>Docker</b> Container
```
    docker-compose up -d
```
<b>3 )</b> Implement Keycloak Settings
```
    1 ) Open Keycloak on the Browser through localhost:9999
 

