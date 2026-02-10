package java_07;

import java.util.ArrayList;
import java.util.List;

public class J02_TestStudent {


    public static void main(String[] args) {

        /*
        Create a List<Student> and add 3 Student objects into the list.
        Iterate the list and print each student’s information.
         */
        Student student1=new Student("Ilya",20,89);
        Student student2=new Student("Dritan",18,95);
        Student student3=new Student("Fatima",35,60);

        List<Student> list=new ArrayList<>();
        list.add(student1);
        list.add(student2);
        list.add(student3);


        for (Student eachStudent : list) {
            System.out.println(eachStudent.getName());
        }


        System.out.println("------------------------------");
        printTheStudentsOlderThanAge(list,20);

        System.out.println("---------------------------");

     Student result=   getTheStudentWhoHasTheHighestGrade(list);

        System.out.println(result);



    }

    /*
    Write a method that returns a Student object whose grade is the highest from a given List<Student>.
     */
    private static Student getTheStudentWhoHasTheHighestGrade(List<Student> list) {

        int max=list.get(0).getGrade();

        Student result=list.get(0);

        for (Student eachStudent : list) {

            if (eachStudent.getGrade()>max){
                max= eachStudent.getGrade();
                result=eachStudent;
            }

        }

        return result;


    }







    /*
    Given a List<Student>, write a method that prints only students whose age is greater than 20.
     */

    private static void printTheStudentsOlderThanAge(List<Student> list, int age) {

        for (Student eachStudent : list) {

            if (eachStudent.getAge()>age){
                System.out.println(eachStudent);
            }


        }

    }
}
