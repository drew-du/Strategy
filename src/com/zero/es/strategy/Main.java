package com.zero.es.strategy;

public class Main {
	
	public static void main(String[] args) {
		Strategy<String> strategy = new Strategy<>();
		IExecutor<String> executor = new QueryExecutor();
		strategy.setParams(null).build(executor).get();
		
	}
	
}