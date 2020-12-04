package _01_race_car;
/*
 *    Copyright (c) The League of Amazing Programmers 2013-2019
 *    Level 1
 */



public class RaceCarRunner {
	public static void main(String[] args) {
		RaceCar rob = new RaceCar("Corvette",5);
		int place = rob.getPositionInRace();
		System.out.println(place);
		rob.crash();
		if(rob.isDamaged()) {
			rob.pit();
		}
		
		for(int i =0; i<1;) {	
		rob.overtake();
		if(place==1) {
			System.exit(0);;
		}
		}
		// 1. Create a RaceCar and place it in 5th position
	
		// 2. Print the RaceCar's position in the race

		// 3. Crash the RaceCar
		
		// 4. If the car is damaged. Bring it in for a pit stop.

		// 5. Help the car move into first place.

	}
}
