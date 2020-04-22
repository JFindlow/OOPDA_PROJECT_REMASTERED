package v1;

public class FoodItem {
	private String name;
	private int calories;
	public FoodItem(String name, int calories) {
		this.name = name;
		this.calories = calories;
	}
	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}
	/**
	 * @param name the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}
	/**
	 * @return the calories
	 */
	public int getCalories() {
		return calories;
	}
	/**
	 * @param calories the calories to set
	 */
	public void setCalories(int calories) {
		this.calories = calories;
	}
	
	public String getString() {
		return name + " : " + calories;
	}

}