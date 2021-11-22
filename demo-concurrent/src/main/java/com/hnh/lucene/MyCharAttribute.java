package com.hnh.lucene;

import org.apache.lucene.util.Attribute;

public interface MyCharAttribute extends Attribute {
	void setChars(char[] buffer, int length);

	char[] getChars();

	int getLength();

	String getString();
}
