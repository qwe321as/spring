package Basic3;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

/*Consumer Consumer = new Consumer()*/
@Component("Consumer")
public class Consumer implements Person {

	private String name;
	private int age;
	
	@Autowired
	@Qualifier("Morning")
	private Car car;
	
	@Override
	public void setName(String name) {
		this.name = name;
	}

	@Override
	public String getName() {
		return name;
	}

	@Override
	public void setAge(int age) {
		this.age = age;
	}

	@Override
	public int getAge() {
		return age;
	}

	@Override
	public String personDrive() {
		return car.drive();
	}

}




