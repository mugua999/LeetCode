package contest;

public class MinHOfTraining {
	public static void main(String[] args) {
		int initialEnergy = 1, initialExperience = 1;
		int[] energy = {1,1,1,1};
		int[] experience = {1,1,1,50};
				
		MinHOfTraining mot = new MinHOfTraining();
		
		System.out.println(mot.minNumberOfHours(initialEnergy, initialExperience, energy, experience));
	}
	
    public int minNumberOfHours(int initialEnergy, int initialExperience, int[] energy, int[] experience) {
        int energyTra = 0, expTra = 0;
        
        int totalEnergy = 0;
        for (int i = 0; i < energy.length; i++) {
			totalEnergy += energy[i];
		}
        energyTra = totalEnergy - initialEnergy + 1;
        
        for (int i = 0; i < experience.length; i++) {
        	int diff = experience[i] - initialExperience;
        	
			if (diff < 0) {
				initialExperience += experience[i];
			} else {
				expTra += diff + 1;
				initialExperience += diff + experience[i] + 1;
			}
		}
        
        return energyTra + expTra;
    }
}
