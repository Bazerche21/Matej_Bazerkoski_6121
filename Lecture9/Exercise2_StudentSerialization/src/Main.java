public class Main {
    public static void main ( String[] args ) {
        String fileName = "test2.txt";
        Student student = new Student("Petar", "075500000", 543, 6301);
        StudentFileSteam studentFileSteam = new StudentFileSteam();
        studentFileSteam.writeToFile(student, fileName);
        Student resultStudent = studentFileSteam.readFromFile(fileName);
        studentFileSteam.printData(resultStudent);
    }
}