
public class CourseFactoryClass implements CourseFactoryInterface{

	@Override
	public Course getCourse(String courseType) {

      if(courseType.equals("HLD")) {
    	  return new HLD();
      }
      else if(courseType.equals("LLD")) {
    	  return new LLD();
      }
      else {
		return null;
      }
	}


}
