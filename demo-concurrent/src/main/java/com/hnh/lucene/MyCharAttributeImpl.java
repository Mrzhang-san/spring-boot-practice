package com.hnh.lucene;

import org.apache.lucene.util.AttributeImpl;
import org.apache.lucene.util.AttributeReflector;

public class MyCharAttributeImpl extends AttributeImpl implements MyCharAttribute {


	private char[] chatTerm = new char[255];
	private int length = 0;

	@Override
	public void setChars(char[] buffer, int length) {
		this.length = length;
		if (length > 0) {
			System.arraycopy(buffer, 0, this.chatTerm, 0, length);
		}
	}

	public char[] getChars() {
		return this.chatTerm;
	}

	public int getLength() {
		return this.length;
	}

	@Override
	public String getString() {
		if (this.length > 0) {
			return new String(this.chatTerm, 0, length);
		}
		return null;
	}

	@Override
	public void clear() {
		this.length = 0;
	}

	@Override
	public void reflectWith(AttributeReflector reflector) {

	}

	@Override
	public void copyTo(AttributeImpl target) {

	}
}
