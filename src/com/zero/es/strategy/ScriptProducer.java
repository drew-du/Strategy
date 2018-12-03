package com.zero.es.strategy;

import java.util.ArrayList;
import java.util.List;

public class ScriptProducer implements IProducer<Field, String> {
	
	private List<Field> materials = new ArrayList<>();
	
	@Override
	public String produce() {
		return null;
	}

	@Override
	public void add(Field material) {
		this.materials.add(material);
	}

}
