import serviceTest.*;

public class Main {

	public static void main(String[] args) {
		//Creating an instance of courseService test in order to use the methods
		CourseServiceTest cstest = new CourseServiceTest();
		System.out.println("** COURSE_SERVICE::getCourse TEST **");
		//Printing test result
		System.out.println(cstest.getCourseTest());
		System.out.println("----------------------------------------");
	}

}
