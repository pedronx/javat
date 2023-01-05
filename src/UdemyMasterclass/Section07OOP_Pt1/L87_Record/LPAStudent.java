package UdemyMasterclass.Section07OOP_Pt1.L87_Record;

public record LPAStudent(String id, String name, String dateOfBirth, String classList) {
    /*
    Available by default from JDK 14.
    The getters, setters and toString() are all implicitly created by default

    For each component in the header, Java generates:
     . A field with the same name and declared type as the record component.
     . The field is declared private and final

    Java generates a toString() method that prints out each attribute in a formatted String.

    Java also generates a public accessor method for each component.
     . This method has the same name and type of the component (no prefix).
     . The accessor method, for id for ex., is simply id();
    */
}