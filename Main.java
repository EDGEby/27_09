public class Main {
    public static void main(String[] args) {

        final int size=2;
        Student[] mas = new Student[size];
        Student s1=new Student("Ivan","Ivanov",2123,4.5);
        Aspirant a1=new Aspirant("Bivan","Bivanov",23,2.5);

        mas[0]=s1;
        mas[1]=a1;

        Student q1= new Aspirant("Ifor","Igorof",22,4.0);
        System.out.println(q1.getScholarship());

            for (Student s:mas){
            System.out.print(s);
             System.out.println("grant="+s.getScholarship());
        }




    }
}
