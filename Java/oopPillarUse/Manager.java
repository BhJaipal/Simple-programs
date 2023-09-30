import java.lang.Integer;
import java.lang.Void;

public class Manager extends Person{
	private Integer salary;
	/**
	 * @param name Name of programmer
	 * @param age age of programmer
	 * @param salary salary of programmer
	 */
	public Manager(String name, Integer age, Integer salary) {
		super(name, age);
		this.salary= salary;
	}
	/**
	 * @param salary Enter new salary
	 */
	@Override
	public Void setSalary(Integer salary) {
		this.salary= salary;
		return null;
	}
	/**
	 * @return Salary of programmer
	 */
	@Override 
	public Integer getSalary() {
		return this.salary;
	}
}
