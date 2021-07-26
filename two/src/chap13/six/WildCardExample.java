package chap13.six;

import java.util.Arrays;



public class WildCardExample {

	public static void registerCourse(Course<?>course) {
		System.out.println(course.getName()+"수강생 :"+Arrays.toString(course.getStudents()));
	}
	
	public static void registerCourseStudent(Course<?extends Students> course) {
		System.out.println(course.getName()+"수강생 :"+Arrays.toString(course.getStudents()));
	}
	public static void registerCourseWorker(Course<? super Worker> course) {
		System.out.println(course.getName()+"수강생 :"+Arrays.toString(course.getStudents()));
	}
	public static void main(String[]args) {
	Course<Person>personCourse = new Course<Person>("일반인과정",5);
		personCourse.add(new Person("일반인"));
		personCourse.add(new Worker("직장인"));
		personCourse.add(new Students("학생"));
		personCourse.add(new HighStudent("일반인"));
		
	Course<Worker>workerCourse = new Course<Worker>("직장인과정",5);
	workerCourse.add(new Worker("직장인"));
	
	Course<Students>student = new Course<student>("학생과정",5);
	studentCourse.add(new student("학생"));
	
	Course<HighStudent>highStudentCourse = new Course<HighStudent>("고등학생과정",5);
	highStudentCourse.add(new HighStudent("고등학생"));
	System.out.println();
	
	//registerCourseStudent(personCourse);
	//registerCourseStudent(workerCourse);
	registerCourseStudent(studentCourse);
	registerCourseStudent(highStudentCourse);
	System.out.println();
	
	registerCourseWorker(personCourse);
	registerCourseWorker(workerCourse);
	//registerCourseWorker(studentCourse);
	//registerCourseWorker(highStudentCourse);
	}
	
		
	
}
