
# GOF Design Patterns in Java

## Implementing some common GOF Design Patterns in Java with real world use cases

### What is design pattern ?

```
A design pattern is a reusable solution to a problem that programmers often face while implementing software applications.

It is like a tried-and-tested solution to a common problem in software design.

```

### Why it is used by programmers ?

```

When programmers use design patterns for Reusability, flexibility, maintainability, testability.

It helps making software cleaner, stronger and easier to fix and grow over time

```

### Singleton Design Pattern

```
1. Singleton Design Pattern - This pattern allows, only one instance of a class created and accessed everywhere. Also it controls how and when the instance will be created.

Why use singleton ?

Real world use case scenario : Create Database connection

Assume we have an application that needs to talk to a database in order to get user info, save data, or update records.

Suppose every time our app wants to connect to the database and create a new connection every time. 

Then it would be, slow as each connection takes time and wasteful because databases need to handle so many connections, also it is hard to manage as we have to keep track of all of them.

Solution : Singleton design Pattern

Here application implemented - Library Management System that uses singleton Database connection

DBConnectionManager - Singleton class that centralize the control over DB connections to avoid opening duplicate connections

Example used in JDK - java.util.logging.Logger - One logger instance shared across all classes.

Logger logger = Logger.getLogger("MyLogger")

```

### Factory Method Design Pattern 

```

This pattern provies way to delegate the creation of objects to subclasses, letting them decide which class to instantiate at runtime.

Why use Factory Method ?

Real world use case scenario - Create users for Hospital Management application

Suppose we are building a Hospital Management application, which may be used by different kind of users  or hospital staffs such as Doctor, Patient, Admin, other staffs.

Now, in this case, code needs to create these different users which may need to use, if or switch statements - Say. if the user is doctor, create a Doctor object, if the user is Admin create a Patient object, which gets messy and hard to maintain, also not scalable if more users are added later.

Solution: Factory Method pattern

This pattern will create the right type of object with help of factory classes and method, by replacing messy if conditions everywhere.

For this application, code will create Admin, , Patient,  Doctor type users extend or implement User and AdminFactory, PatientFactory, DoctorFactory  extend or implement UserFactory classes. Code will have logic that knows, how to create the correct type of User

Here application implemented - Hospital Management System

Example used in JDK  - java.util.Calendar.getInstance()

```

### Builder Design Pattern

```
Builder pattern lets us build different customized product step by step using the same build logic. Ie. Same construction steps used to create different products.

It separates the construction steps from its final result, so that same steps can be re-used for building different products.

Why use Builder pattern ?

Real world use case scenario - Building different type of house in House Construction Application 

Suppose we are building House construction application, that will perform different steps to build a house like build foundation, build structure, buil roof.
Also, need to manage the building steps.

Solution : Builder design pattern

Here, same steps will be re-used to build like, Concrete House, Luxury Villa etc.

Main components of the Builder pattern used,

Product - The complex object/product that is being built.
Class - House

Builder – An abstract interface / class that defines how to build parts of the Product.
Class - HouseBuilder

ConcreteBuilder – Implements the Builder interface/class and builds the parts of product 
Abstract Class - ConcreteHouseBuilder and LuxuryVillaBuilder

Director – Manage the building process using a Builder instance.
Class - CivilEngineer

Client – Uses the Director and Builder to construct the object/prduct
Class - HouseConstructionApplication

Use case implemented here - House construction application.

Example used in JDK  - StringBuilder 
String result = new StringBuilder().append("Java ").append("Builder ").append("Pattern").toString();

```

### Strategy Design Pattern

```

This patterns, allows us to choose different ways (algorithms) to do something at runtime without changing the code that uses it.

Why use Strategy pattern ?

Real world use case scenario - Choose the right treatment dynamically when required, based on patient condition.

Suppose, we want a health care system that can dynamically choose the right type treatment at runtime, based on the patient’s condition.

Solution - Strategy design pattern 

Here, system will be built where a patient can be treated using different treatment strategies like  MedicinalStrategy, PhysiotherapyStrategy, SurgicalStrategy

Use case implemented here - Health Care System

Example used in JDK - java.util.Comparator
List<String> courseNames = Arrays.asList("Java", "Python", "SQL");
Collections.sort(courseNames, Comparator.comparing(String::length));
System.out.println(courseNames);
 
```

### Template Method Design Pattern

```

It allows us to define a skeleton of a step by step process in an abstract super class (template), and let different subclasses fill in the details and customize the steps.
Here Template class provides default behaviour and subclasses can customize the behaviour

Why use Template Method pattern ?

Real world use case scenario - booking different types of flights in Airline Reservation System

Suppose we are building  Airline Reservation application , where we can have two types of flight bookings such as DomesticFlightBooking and InternationalFlightBooking

Here, Both need to follow a common process to book a flight like searchFlight(), selectSeat() and makePayment().

Solution: Template Method Design Pattern

We will define this overall process once in a template class (super class), but let each booking type (sub class) customize the steps if needed.

Ex. Template class with template method 

abstract class FlightBooking{
    bookFlight() {
        searchFlight();
        selectSeat();
        makePayment();
   }
	
Use case implemented here - Airline Reservation System

Example used in JDK -  
java.io.InputStream / OutputStream 
javax.servlet.http.HttpServlet

```

### Decorator Design Pattern

```
The Decorator Pattern lets you add new features to an object without changing its original code or class

Why use Decorator pattern ?

Real world use case scenario - prepare salary breakup for different employees in Payroll Management Application

Say, we will implement a Payroll application which needs to prepare salary breakup for different employees by adding HRA or/and Bonus or/and deducting Tax for different employees
that modify salary structure

Solution: Decorator Design Pattern

Here, we will create Salary class - Component Interface, for all salary related classes 
(Basic or decoared)

It ensures all salary related classes, whether basic or extended with bonuses, HRA, Tax deductions, can be used interchangeably.

class Salary{
	double calculateSalary(), 
	double getSalary();
	String getDescription();
}
	
Employee (Concrete Component) - 

It provides the base salary of the employee without any additional features like bonuses, HRA, deductions etc.

It is the core object that we will dynamically extend with other salary features / decoratoes.

SalaryDecorator (Abstract Decorator)
Acts as a base class for all decorator classes(e.g. Bonus, HRA, TaxDeduction)

It provides a common structure so that all decorators can, add new feature like HRA, Bonus or Tax to extend salary

Use case implemented - Payroll Management System

Example used in JDK -  InputStream

InputStream in = new FileInputStream("salary.txt");
in = new BufferedInputStream(in);
in = new DataInputStream(in);

InputStream	Component (interface)
FileInputStream	Concrete Component
BufferedInputStream, DataInputStream - Concrete Decorator

```
