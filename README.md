# Email Microservice
## Uber Backend Challenge

![Java](https://img.shields.io/badge/java-%23ED8B00.svg?style=for-the-badge&logo=openjdk&logoColor=white)
![Spring](https://img.shields.io/badge/spring-%236DB33F.svg?style=for-the-badge&logo=spring&logoColor=white)
[![Licence](https://img.shields.io/github/license/Ileriayo/markdown-badges?style=for-the-badge)](./LICENSE)

This project is an API built using **Java, Java Spring, AWS Simple Email Service.**

## Table of Contents

- [Installation](#installation)
- [Configuration](#configuration)
- [Usage](#usage)
- [API Endpoints](#api-endpoints)
- [Database](#database)
- [Contributing](#contributing)

## Installation

1. Clone the repository: https://github.com/Renan1Pollo/send-email-service.git

```bash
git clone 
```

2. Install dependencies with Maven

3. Update `application.properties` puting your AWS Credentials

```yaml
aws.region=us-east-1
aws.accessKeyId=1111111
aws.secretKey=111111
```
## Usage

1. Start the application with Maven
2. The API will be accessible at http://localhost:8080

## API Endpoints
The API provides the following endpoints:

**GET EMAIL**
```markdown
POST /api/email/send - Send a e-mail from your sender to the destination
```

**BODY**
```json
{
  "to": "renansk18@outlook.com",
  "subject": "teste",
  "body": "teste"
}
```

## Acknowledgements
This project was inspired by the work of [Fernanda-Kipper](https://github.com/Fernanda-Kipper). Special thanks to her for providing the initial idea and inspiration. You can find her on GitHub [here](https://github.com/Fernanda-Kipper).
