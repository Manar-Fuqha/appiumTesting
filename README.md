# 📱 Appium Mobile Automation – Calculator App

This project demonstrates **Mobile Test Automation using Appium** with a sample Calculator App on an Android emulator.  
It includes automated tests for mathematical calculations such as **subtraction, multiplication, square root, power, and factorial**.

---

## ⚙️ Setup Instructions

### 1. Install Node.js
Download and install from: [Node.js](https://nodejs.org)

---

### 2. Install Android Studio
Download and install from: [Android Studio](https://developer.android.com/studio)  

We will use it to create **emulators (Virtual Devices)**.

---

### 3. Install Appium Inspector
Download from: [Appium Inspector](https://github.com/appium/appium-inspector/releases/download/v2023.3.1/Appium-Inspector-windows-2023.3.1.exe)  

---

### 4. Install Appium Server (Desktop GUI)
Download from: [Appium Server](https://github.com/appium/appium-desktop/releases/download/v1.22.3-4/Appium-Server-GUI-windows-1.22.3-4.exe) 

This will be used to connect **Eclipse/Java tests** with the emulator.

---

### 5. Configure Environment Variables

- **ANDROID_HOME**  
C:\Users<YourUser>\AppData\Local\Android\Sdk


- **NODE_HOME**  
C:\Program Files\nodejs


- **Add to PATH**  
  - C:\Program Files\nodejs
  - C:\Program Files\nodejs\node_modules\npm\bin
  - C:\Users<YourUser>\AppData\Local\Android\Sdk\platform-tools

---

### 6. Create Emulator via Android Studio

1. Open **Virtual Device Manager**  
2. Click **Create Device**  
3. Select **Pixel 3a**  
4. Rename the device with your name for easy identification

---
## 🧮 Automated Test Cases

Create a class called **`MathematicalCalculations`** that contains the following test cases:

- **Addition** → Verify addition of two numbers 
- **Subtraction** → Verify subtraction of two numbers  
- **Multiplication** → Verify multiplication of two numbers  
- **Square Root** → Verify square root of any number  
- **Power** → Verify power of two numbers  
- **Factorial** → Verify factorial of any number  

---

## 🚀 How to Run

1. Start the **Appium Server GUI**  
2. Launch the **Android Emulator (Pixel 3a)**  
3. Run the test class from **Eclipse/IntelliJ**  
4. View execution results in the **console**


