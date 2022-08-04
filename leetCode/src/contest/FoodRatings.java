package contest;

public class FoodRatings {
	String[] foods;
	String[] cuisines;
	int[] ratings;

	public FoodRatings(String[] foods, String[] cuisines, int[] ratings) {
		this.foods = foods;
		this.cuisines = cuisines;
		this.ratings = ratings;
	}

	public void changeRating(String food, int newRating) {
		for (int i = 0; i < this.foods.length; i++) {
			if (this.foods[i].equals(food)) {
				this.ratings[i] = newRating;
			}
		}
	}

	public String highestRated(String cuisine) {
		String highest = foods[0];
		int high = 0;

		for (int i = 0; i < cuisines.length; i++) {
			if (cuisines[i].equals(cuisine)) {
				if (ratings[i] > high || (foods[i].compareTo(highest) < 0 && ratings[i] == high)) {
					highest = foods[i];
					high = ratings[i];
				}
			}
		}

		return highest;
	}
}
