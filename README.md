# Autism and ADHD Screening Test – Java Console Application

This repository contains Java-based console applications designed to simulate a preliminary screening test for Autism and ADHD traits using basic fuzzy logic. It consists of two Java files:

- `Austism_and_ADHD.java`
- `ScreeningTest.java`

Both scripts perform a similar function and are built for educational and demonstration purposes to show how fuzzy logic can be applied in mental health assessment scenarios.

---

## 🔍 Project Overview

The goal of this project is to create a soft computing-based questionnaire that:
- Asks users a series of behavior-related questions.
- Normalizes the input using a fuzzy logic scale.
- Calculates the probability of Autism or ADHD traits.
- Suggests next steps based on the calculated likelihood.

---

## 🛠️ Technologies Used

- Java (JDK 8+)
- Scanner (for user input)
- Console-based UI
- Basic fuzzy logic (custom implementation)

---

## 📁 File Descriptions

### `Austism_and_ADHD.java`
- Main class with embedded questions.
- Uses a custom `fuzzify()` function to convert responses to fuzzy values.
- Calculates and prints the likelihood of Autism and ADHD traits.

### `ScreeningTest.java`
- Similar in functionality to the first file.
- Slightly cleaner structure with improved input handling.
- Placeholder for external fuzzy logic module replaced with inline logic.

---

## ⚙️ How It Works

1. The program asks 5 questions related to Autism traits and 5 questions for ADHD.
2. Each response is rated on a scale of 1 to 5:
   - 1: Never
   - 2: Rarely
   - 3: Sometimes
   - 4: Often
   - 5: Always
3. Responses are converted to values between 0.0 and 1.0 using a simple fuzzification method.
4. Average scores are calculated and presented as probabilities.
5. Based on thresholds, the program outputs:
   - Minimal Traits
   - Moderate Traits
   - High Traits

---

## 📦 How to Run

1. Ensure Java is installed on your system.
2. Compile and run any of the files using the terminal:

```bash
javac Austism_and_ADHD.java
java Austism_and_ADHD
