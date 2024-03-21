# Health Calculator

## Project Overview

#### This Simple Health Calculator is a Java-based application designed to offer users insights into their health metrics. This project includes calculators for Body Mass Index (BMI), daily calorie intake, and blood pressure categorization. It implements fundamental Java programming concepts, including object-oriented programming, exception handling, and user input handling through the console.

## Features

- **BMI Calculator: Calculates and displays the user's Body Mass Index based on height and weight inputs.**

    Formula used: $\text{BMI} = \frac{\text{weight (lb)}}{[\text{height (in)}]^2} \times 703$


- **Daily Calorie Intake Calculator: Estimates the user's daily calorie needs considering their height, weight, age, gender, and activity level.**

    Formulas used: 

    $\text{BMR (female)} = (4.7 \times \text{height in inches}) + (4.35 \times \text{weight in pounds}) - (4.7 \times \text{age in years}) + 655$

    $\text{BMR (male)} = (12.7 \times \text{height in inches}) + (6.23 \times \text{weight in pounds}) - (6.8 \times \text{age in years}) + 66$

    $\text{Daily Calorie Intake} = \text{BMR} \times \text{Activity Multiplier}$

    The Daily Calorie Intake is calculated by multiplying the Basal Metabolic Rate (BMR) by an Activity Multiplier, which depends on the level of activity:

    *Sedentary (little to no exercise):* 
  - Activity Multiplier = 1.2

    *Lightly active (exercising 1-to-3 days per week):*
  - Activity Multiplier = 1.375

    *Moderately active (exercising 3-to-5 days per week):* 
  - Activity Multiplier = 1.55

    *Very active (sports or exercise 6-to-7 days per week):*
  - Activity Multiplier = 1.725

    *Extra active (very physically demanding jobs or exercise):*
  - Activity Multiplier = 1.9

- **Blood Pressure Checker: Categorizes the user's blood pressure status based on systolic and diastolic blood pressure readings.**

#### Blood Pressure Categories:

The categorization of blood pressure readings into different health categories is based on the following table:

| Blood Pressure Category                          | Systolic mm Hg (upper number) | and/or | Diastolic mm Hg (lower number) |
|--------------------------------------------------|-------------------------------|--------|--------------------------------|
| NORMAL                                           | Less than 120                 | and    | Less than 80                   |
| ELEVATED                                         | 120 – 129                     | and    | Less than 80                   |
| HIGH BLOOD PRESSURE (HYPERTENSION) STAGE 1       | 130 – 139                     | or     | 80 – 89                        |
| HIGH BLOOD PRESSURE (HYPERTENSION) STAGE 2       | 140 or higher                 | or     | 90 or higher                   |
| HYPERTENSIVE CRISIS (consult your doctor immediately) | Higher than 180           | and/or | Higher than 120                |

This table assists in determining the category of one's blood pressure reading, using the "and" condition for categories where both systolic and diastolic criteria must be met, and "or" for categories where meeting either criterion is sufficient. The "and/or" condition for hypertensive crisis indicates that this state can be triggered by exceeding either the systolic or diastolic threshold, or both.


**NOTE: Please consult a healthcare professional for a comprehensive evaluation.**

## Learning Journey

This project was created to explore and learn some Java fundamentals, such as object-oriented programming, user input handling, and the development of a simple user interface via the console. 




## References
This project uses formulas and guidelines from the following sources:

- **Blood Pressure Categorization**: American Heart Association. [The Facts About High Blood Pressure](https://www.heart.org/en/health-topics/high-blood-pressure/the-facts-about-high-blood-pressure). This resource was used to categorize blood pressure readings according to recognized health standards.
- **BMI Calculation**: Centers for Disease Control and Prevention (CDC). [Assessing Your Weight](https://www.cdc.gov/healthyweight/assessing/bmi/adult_bmi/index.html#Interpreted). This source provided the formula used to calculate Body Mass Index (BMI) for adults.
- **Daily Calorie Intake Calculation**: wikiHow. [How to Calculate Your Total Daily Calorie Needs](https://www.wikihow.com/Calculate-Your-Total-Daily-Calorie-Needs). This article provided the guidelines to estimate daily calorie needs based on various factors, including activity level.
