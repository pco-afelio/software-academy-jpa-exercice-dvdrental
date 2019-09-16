package be.afelio.software_academy.jpa.exercise.dvdrental;

import be.afelio.software_academy.jpa.exercise.dvdrental.DvdRentalExerciseJpaRepository;

public class Factory {

	public static DvdRentalExerciseJpaRepository createDvdRentalExerciseRepository() {
		return null;
	}
	
    public static String getDatabaseUrl() {
        return "jdbc:postgresql://localhost:5432/dvdrental";
    }

    public static String getDatabaseUser() {
        return "postgres";
    }

    public static String getDatabasePassword() {
        return "postgres";
    }
	
}
