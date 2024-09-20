Lab 03 Filter Interface
Learning Goals:


•	Get practice using Interfaces
•	Create a predicate based interface
•	Create a call back interface
•	Create UML diagrams with Interfaces
Lab Directions: 

1.	Create an IntelliJ project called Interfaces. All of your code will be in this project.
Add your project to GitHub source control.
2.	Create a callback interface Filter as follows:
public interface Filter
{
   boolean accept(Object x);
}
