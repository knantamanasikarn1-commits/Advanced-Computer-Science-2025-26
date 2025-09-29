// 1. made 'public' lowercase
// 2. renamed class name to Cat to match file name
public class Cat {
	private String name;
	private String breed;
	private boolean isHungry;
	private int livesRemaining;
	
	// 2-Parameter Constructor
    // 3. renamed constructor to Cat to match file name
    // 4. added parameter String breed
	public Cat(String name, String breed) {
        // 5. added 'this' keyword
		this.name = name;
		this.breed = breed;
        // 6. changed 'yes' to boolean true
		this.isHungry = true;
		livesRemaining = 9;
	}

    // 7. changed void to String because returning name, a String
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

    // 8. changing void to boolean because returning isHungry, a boolean
    // 9. renaming to getIsHungry for camel case
	public boolean getIsHungry(){
		return isHungry;
	}

    // 10. changed 'boolean' to void because is not returning
	public void feed() {
		this.isHungry = false;
	}

	public boolean equals(Cat other) {
        // 11. changing == for name comparison to .equals() because name is String
        // 12. changing = to == to show comparison for lives comparison
		return this.name.equals(other.name) && this.breed.equals(other.breed)
			&& this.livesRemaining == other.livesRemaining;
	}

	public String toString() {
        // 13. made toString() return String instead of printing it
		return name + " is of breed " + breed + " and has " + livesRemaining + " lives remaining.";
	}
}