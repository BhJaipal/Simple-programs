import java.lang.Void;
import java.lang.Integer;

abstract public class Person{
	private String name;
	private Integer age;
	/**
	 * @param name Person name
	 * @param age Person age
	 * @return creates object
	 */
	public Person(String name, Integer age) {
		this.name= name;
		this.age= age;
	}
	/**
	 * @param name Enter new name
	 */
	public Void setName(String name) {
		this.name= name;
		return null;
	}
	/**
	 * @return name of person
	 */
	public String getName() {
		return this.name;
	}
	/**
	 * @param age Enter new age
	 */
	public Void setAge(Integer age) {
		this.age= age;
		return null;
	}
	/**
	 * @return age of person
	 */
	public Integer getAge() {
		return this.age;
	}
	abstract Void setSalary(Integer salary);
	abstract Integer getSalary();
}
