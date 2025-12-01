# CaloCalc
Managing weight is not always easy. But being able to track your calories **should be**. 
There are apps that solve that problem. However they don't do it without stashing away some of the most helpful features behind a paywall. 
**CaloCalc** aims to provide as much functionality **free of cost** to make reaching your goals as easy as possible. 
From me, Haivan G. Benjamin, to the world :)

---

## Tech Stack

### Frontend
- **Mobile:** React Native  
- **Desktop:** React + Electron  

### Backend
- **API:** Java Spring Boot  
- **Database:** MariaDB (production), SQLite (local/testing)

---

## Status
🚧 **Work in Progress**  
Some features and documentation are still being developed.

---

## Getting Started
*(Downloads coming soon — this section will be updated once builds are available.)*

1. Download the app from the Releases page or official website  
2. Open the app  
3. Create your profile  
4. Start tracking meals and goals

---

## Features

### Available 🟢 / Planned 🟠
- Track daily calorie intake 🟠
- Set and monitor weight or body-composition goals 🟠
- Visualize progress with charts and statistics 🟠
- Free access to all core features 🟠
- Clean, intuitive interface 🟠
- (More features coming soon…)

---

## Installation (Development Setup)

### 1. Clone the repository
```bash
git clone https://github.com/HGBenjamin/CaloCalc.git
cd CalCalc
```

### 2. Install dependencies (per project)

**Backend:**
```bash
cd backend
./mvnw install
```

**Mobile App:**
```bash
cd mobile
npm install
```

**Desktop App:**
```bash
cd desktop
npm install
```

### 3. Run the projects

**Backend (Spring Boot):**
```bash
./mvnw spring-boot:run
```

**Mobile App:**
```bash
npm start
```

**Desktop App:**
```bash
npm run electron:start
```

*(Commands may change — this will need to be updated once project structure is finalized.)*

---

## Contributing

Contributions are welcome!

To contribute:
1. Fork the repository  
2. Create a feature branch  
3. Make your changes  
4. Submit a pull request  

For significant changes, please open an issue first to discuss the proposal.

---

## License

This project is licensed under the **GNU General Public License v3.0 (GPL-3.0)**.  
See the `LICENSE` file for full details.
