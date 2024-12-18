# 🛒 E-com Application Based on Microservice Architecture

## 🎯 Objective
Create a microservice-based application to manage invoices containing products and belonging to a customer.

## 🛠️ Work to be Done

1. **🧑‍💼 Create the `customer-service` microservice**
   - Manages customers.

2. **📦 Create the `inventory-service` microservice**
   - Manages products.

3. **🌐 Create the Spring Cloud Gateway**
   - Static routing configuration.

4. **🔍 Create the Eureka Discovery Service**
   - Service discovery.

5. **🔄 Dynamic route configuration for the gateway**
   - Using Spring Cloud Gateway.

6. **💸 Create the `billing-service`**
   - Uses OpenFeign for inter-service communication.

7. **⚙️ Create the configuration service**
   - Centralized configuration management.

8. **💻 Create an Angular client**
   - User interface to interact with microservices.

## 🏗️ Project Structure

- `customer-service`: Manages customers.
- `inventory-service`: Manages products.
- `gateway-service`: Routes requests.
- `eureka-service`: Service discovery.
- `billing-service`: Manages billing.
- `config-service`: Centralized configuration.
- `angular-client`: Angular client for UI.

## 📋 Prerequisites

- ☕ Java 21
- 🐘 Maven
- 🟢 Node.js (for Angular client)
- 🐳 Docker (optional for containerization)

## 🚀 Installation

1. **Clone the repository:**
   ```sh
   git clone https://github.com/mohamedYoussfi/micro-services-app.git
   cd micro-services-app