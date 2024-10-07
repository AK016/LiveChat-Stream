# LiveChat Stream

LiveChat Stream is a real-time commenting system for live video streams, inspired by Facebook Live. It provides a scalable backend architecture using Java, Kafka, and Redis, coupled with a responsive frontend built with HTML, CSS, and JavaScript.

## Features

- Real-time comment streaming using WebSockets
- Scalable backend architecture with Kafka for high-volume comment processing
- Redis caching for improved performance
- Simple and intuitive user interface
- Responsive design for various screen sizes

## Technology Stack

### Backend
- Java
- Apache Kafka
- Redis
- WebSocket

### Frontend
- HTML5
- CSS3
- JavaScript (ES6+)

## Getting Started

### Prerequisites

- Java JDK 11 or higher
- Apache Kafka
- Redis
- Maven

### Installation

1. Clone the repository:
git clone https://github.com/yourusername/livechat-stream.git
Copy
2. Navigate to the project directory:
cd livechat-stream
Copy
3. Install backend dependencies:
mvn install
Copy
4. Start the Kafka server and create a topic named 'live_comments'

5. Start the Redis server

6. Run the backend application:
mvn spring-boot:run
Copy
7. Open the `index.html` file in a web browser to view the frontend

## Usage

1. Open the application in a web browser
2. Enter your name in the "Your name" field
3. Type your comment in the "Type your comment" field
4. Click "Send" or press Enter to submit your comment
5. View real-time comments appearing in the comments section

## Configuration

- Backend server port: 8080 (configurable in `application.properties`)
- WebSocket endpoint: `ws://localhost:8080/comments`
- Kafka bootstrap servers: localhost:9092 (configurable in `KafkaManager.java`)
- Redis host: localhost (configurable in `RedisCacheManager.java`)
- Redis port: 6379 (configurable in `RedisCacheManager.java`)

## Contributing

Contributions are welcome! Please feel free to submit a Pull Request.

## License

This project is licensed under the MIT License - see the [LICENSE.md](LICENSE.md) file for details.

## Acknowledgments

- Inspired by Facebook Live commenting system
- Built with love for real-time communication enthusiasts
