# Night Life System

## Why

The Night Life System addresses the challenges of managing and automating event reservations in nightclubs. Traditional methods involve manual phone calls and paper-based bookings, which are prone to errors and inefficiencies. This system allows users to reserve spots digitally, ensuring accuracy and convenience for both the users and the nightclub staff.

## Description

Night Life System is a microservice-based web application built with Spring Boot and React for the UI. It provides an efficient and user-friendly platform for managing nightclub reservations.

## Features

- **User Registration and Login**: Users can sign up and log in to make reservations.
- **Event Reservation**: Users can browse and reserve spots for events.
- **Admin Management**: Admins can manage events, view reservations, and handle user roles.
- **Automated Notifications**: Email notifications for reservation confirmations and reminders.
- **Responsive UI**: A modern, responsive UI built with React.

## Architecture

The system is divided into several microservices:

1. **Event Scraping Service**: Gathers information about events from various sources. (not yet implemented)
2. **Mail Server**: Handles all email-related functionalities.
3. **Night Life Service**: Core service managing reservations and user interactions.
4. **Night Life UI**: Frontend application built with React.

## Technologies Used

- **Backend**: Spring Boot, Java
- **Frontend**: React, JavaScript, HTML, CSS
- **Database**: PostgreSQL
- **Others**: Docker, Maven

## Getting Started

### Prerequisites

- Java 8
- Node.js
- Docker

### Installation

1. Clone the repository:
    ```sh
    git clone https://github.com/CodeMaster1101/night-life-system.git
    cd night-life-system
    ```

2. Build and run the services individually

3. Access the application:
    - UI: `http://localhost:3000`
    - API: `http://localhost:8443`

## Usage

### User Registration

1. Go to the registration page.
2. Fill in the required details and submit.
3. Verify your email (if email verification is enabled).

### Event Reservation

1. Browse the available events.
2. Select an event and choose your preferred spot.
3. Confirm the reservation.

### Admin Management

1. Log in as an admin.
2. Manage events, view user reservations, and assign roles.

*Note: This README file provides an overview and instructions for the Night Life System project. For detailed information, please refer to the project documentation.*

### Mile Stanislavov ###
