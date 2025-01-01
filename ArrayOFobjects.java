class Students{
    int rollno  ;
    String name;
    int marks;
}

public class ArrayOFobjects {
    public static void main(String[] args) {
        Students s1 = new Students();
        s1.rollno = 1;
        s1.name = "XYZ";
        s1.marks = 15 ;

        Students s2 = new Students(); 
        s2.rollno = 2;
        s2.name = "ABC";
        s2.marks = 45 ;

        Students s3 = new Students(); 
        s2.rollno = 3;
        s2.name = "sbsdjf";
        s2.marks = 45 ;

        Students studs[] = new Students[3] ;
        studs[0] = s1 ;
        studs[1] = s2 ;
        studs[2] = s3 ;

        for(Students std : studs){
            System.out.println("Roll No : " + std.rollno + "\t" + " Name : " + std.name + "\t" + " Marks : " + std.marks);

        }
    }

}