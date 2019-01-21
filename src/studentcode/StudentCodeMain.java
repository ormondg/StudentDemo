/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package studentcode;

/**
 *
 * @author Graham
 */
public class StudentCodeMain{
    public static void main(String[] args)
    {
        StudentCode1 [] studentList;
        studentList = new StudentCode1[5];
        StudentCode1 student1 = new StudentCode1("1", "Jim Halpern");
        studentList[0] = student1;
        studentList[1] = new StudentCode1("2", "Michael Scott");
        studentList[2] = new StudentCode1("3", "Pam Beasley");
        studentList[3] = new StudentCode1("4", "Dwight Schrute");
        studentList[4] = new StudentCode1("5", "Toby Flendersen");
        
        for (StudentCode1 studentList1 : studentList) {
            System.out.println(studentList1.getName());
        }
    }
    
}

