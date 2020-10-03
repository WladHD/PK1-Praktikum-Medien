package de.wlad;

import java.util.Objects;

public class Audio extends Medium {
	private String interpret;
	private int dauer;

	public Audio(String titel, int jahr, String interpret, int dauer) {
		super(titel, jahr);
		this.interpret = interpret;
		this.dauer = dauer;
	}

	public String getInterpret() {
		return interpret;
	}

	public int getDauer() {
		return dauer;
	}

	@Override
	public void druckeDaten() {
		System.out.printf("ID = %d \"%s\" von %s aus %d Spieldauer: %d sek.%n", getId(), getTitel(), getInterpret(),
				getJahr(), getDauer());
	}

	@Override
	public int hashCode() {
		return super.hashCode() + 7 * Objects.hashCode(interpret) + 11 * Integer.hashCode(dauer);
	}

	@Override
	public boolean equals(Object o) {
		return super.equals(o);
	}
}