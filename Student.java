package surajapplication;

//Custom Exception for age validation
class AgeNotWithinRangeException extends Exception {
 public AgeNotWithinRangeException(String message) {
     super(message);
 }
}

//Custom Exception for name validation
class NameNotValidException extends Exception {
 public NameNotValidException(String message) {
     super(message);
 }
}

//Student class
class Student {
 private int rollNo;
 private String name;
 private int age;
 private String course;

 // Parameterized constructor
 public Student(int rollNo, String name, int age, String course) throws AgeNotWithinRangeException, NameNotValidException {
     if (age < 15 || age > 21) {
         throw new AgeNotWithinRangeException("Age not within range (15-21): " + age);
     }
     if (!name.matches("[a-zA-Z ]+")) { // Regex to check if the name contains only letters and spaces
         throw new NameNotValidException("Name contains invalid characters: " + name);
     }

     this.rollNo = rollNo;
     this.name = name;
     this.age = age;
     this.course = course;
 }

 @Override
 public String toString() {
     return "Student [rollNo=" + rollNo + ", name=" + name + ", age=" + age + ", course=" + course + "]";
 }

 public static void main(String[] args) {
     try {
         // Create Student objects
         Student student1 = new Student(1, "John Doe", 20, "Computer Science");
         System.out.println(student1);

         Student student2 = new Student(2, "Jane123", 22, "Mathematics"); // This will throw an exception
         System.out.println(student2);

     } catch (AgeNotWithinRangeException | NameNotValidException e) {
         System.out.println("Exception: " + e.getMessage());
     }
 }
}
