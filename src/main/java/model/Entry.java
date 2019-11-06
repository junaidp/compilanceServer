package model;

import java.util.UUID;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Entry {

	private final UUID a;
	private final UUID b;
	
	public Entry(@JsonProperty("a")UUID a, @JsonProperty("b") UUID b)
	{
		this.a = a;
		this.b = b;
	}

	public UUID getA() {
		return a;
	}

	public UUID getB() {
		return b;
	}
}
