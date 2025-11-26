import java.io.Serializable;

public class Student implements Serializable {
    String name;
    String phoneNum;
    int indexNumber;
    transient int recordNumber;

    public Student () {
    }

    public Student ( String name, String phoneNum, int indexNumber, int recordNumber ) {
        this.name = name;
        this.phoneNum = phoneNum;
        this.indexNumber = indexNumber;
        this.recordNumber = recordNumber;
    }


}
