package com.zero.es.strategy;

public interface IProducer<M, P> {
	
	void add(M material);
	P produce();
}
