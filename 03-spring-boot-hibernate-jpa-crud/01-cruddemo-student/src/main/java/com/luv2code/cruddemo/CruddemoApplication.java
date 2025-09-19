package com.luv2code.cruddemo;

import com.luv2code.cruddemo.dao.StudentDAO;
import com.luv2code.cruddemo.entity.Student;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Bean;

import java.util.List;

@SpringBootApplication
public class CruddemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(CruddemoApplication.class, args);
	}

    @Bean
    public  CommandLineRunner commandLineRunner(StudentDAO studentDAO) {
        return runner -> {
            //createStudent(studentDAO);
            //readStudent(studentDAO);
            //queryForStudentsByLastName(studentDAO);
            //updateStudentName(studentDAO);
            //deleteStudent(studentDAO);
            deleteEveryone(studentDAO);
            queryForStudents(studentDAO);

        };
    }


    private void deleteEveryone(StudentDAO studentDAO) {
        System.out.println("Deleting all students...");
        System.out.println("Number of Students deleted: " + studentDAO.deleteAll());

    }

    private void deleteStudent(StudentDAO studentDAO) {

        int id = 3;
        System.out.println("Deleteing id: " + id);
        studentDAO.delete(id);
    }

    private void updateStudentName(StudentDAO studentDAO) {
        int getid = 1;
        System.out.println("Updating student with id " + getid);
        Student student = studentDAO.findById(getid);
        System.out.println("student= " + student);
        student.setFirstname("Jack");
        System.out.println("New firstname= " + student.getFirstname());
        studentDAO.UpdateName(student);

    }

    private void queryForStudentsByLastName(StudentDAO studentDAO) {
        System.out.println("Querying for students by last name");
        List <Student> students = studentDAO.findByLastName("Cake");
        System.out.println("Found " + students);
    }

    private void queryForStudents(StudentDAO studentDAO) {
       List<Student> students =  studentDAO.findAll();
       System.out.println("gathered students:");
       System.out.println(students);
    }

    private void readStudent(StudentDAO studentDAO) {
        System.out.println("retriving a student object");

        Student student = new Student("Caraber", "jack", "jacker@gmmail.com");
        System.out.println("Saving student object");
        studentDAO.save(student);

        System.out.println("Saved student id: " + student.getId());
        System.out.println("Getting info on :" + studentDAO.findById(student.getId()));
    }
    private void createStudent(StudentDAO studentDAO) {
        System.out.println("Creating a student object");

        //Student student = new Student("Paul", "Doe", "paul@gmmail.com");
        //Student student2 = new Student("Taffy", "Cake", "cake@gmmail.com");
        //studentDAO.save(student2);
        System.out.println("Saving student object");
        Student student3 = new Student("Broly", "Cake", "Broly@gmmail.com");
        studentDAO.save(student3);
        //studentDAO.save(student);
        //Student temp = studentDAO.findById(student.getId());
        //System.out.println("Saved student id: " + temp);




    }
}
