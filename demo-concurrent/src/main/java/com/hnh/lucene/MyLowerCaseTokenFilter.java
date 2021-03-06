package com.hnh.lucene;

import org.apache.lucene.analysis.TokenFilter;
import org.apache.lucene.analysis.TokenStream;

import java.io.IOException;

public class MyLowerCaseTokenFilter extends TokenFilter {

	public MyLowerCaseTokenFilter(TokenStream input) {
		super(input);
	}

	MyCharAttribute charAttr = this.addAttribute(MyCharAttribute.class);

	@Override
	public boolean incrementToken() throws IOException {
		boolean res = this.input.incrementToken();
		if (res) {
			char[] chars = charAttr.getChars();
			int length = charAttr.getLength();
			if (length > 0) {
				for (int i = 0; i < length; i++) {
					chars[i] = Character.toLowerCase(chars[i]);
				}
			}
		}
		return res;
	}

}
