
public class Runner {

	public static void main(String args[]) {
		CourseFactoryInterface coursefactory = new CourseFactoryClass();
		Course course1 = coursefactory.getCourse("HLD");
	}

}
