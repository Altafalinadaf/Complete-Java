package com.keypairvalue.genericexample;

// type you can give anything but always remember java convention(standard rules)
// give <K,V> which says key pair value

public class PairValue<K,V> {
	private K key;
	private V value;
	
	public PairValue(K key,V value){
		this.key=key;
		this.value=value;
	}
	
	public K getKey() {
		return key;
	}
	
	public V getValue() {
		return value;
	}
	
}
