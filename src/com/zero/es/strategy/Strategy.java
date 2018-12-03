package com.zero.es.strategy;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Strategy<P> {
	
	private Map<String, Object> params = new HashMap<>();
	private IExecutor<P> executor;
	private List<IProducer<Field, P>> producers = new ArrayList<>();
	private List<Field> fields = new ArrayList<>();
	
	public Strategy<P> setParams(Map<String, Object> params) {
		this.params = params;
		return this;
	}
	
	public Strategy<P> setFields(List<Field> fields){
		this.fields = fields;
		return this;
	}
	
	public Strategy<P> build(IExecutor<P> executor){
		this.executor = executor;
		for(Field field: fields) {
			if(field.getType() == Field.TYPE_ORIGINAL) {
				
			}
		}
		
		return this;
	}
	
	public P get() {
		executor.execute(null);
		return null;
	}
	
	
	
}
