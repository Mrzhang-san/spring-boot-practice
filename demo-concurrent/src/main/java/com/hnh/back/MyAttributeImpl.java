package com.hnh.back;

import org.apache.lucene.util.AttributeImpl;
import org.apache.lucene.util.AttributeReflector;

import java.util.Random;

public class MyAttributeImpl extends AttributeImpl {
 
	int value = 0;
	Random rd = new Random();
 
	public int getAttr() {
		return value;
	}
 
	@Override
	public void clear() {
		value = rd.nextInt(1000);
	}
 
	@Override
	public void reflectWith(AttributeReflector reflector) {
		// TODO Auto-generated method stub
 
	}
 
	@Override
	public void copyTo(AttributeImpl target) {
 
	}
}