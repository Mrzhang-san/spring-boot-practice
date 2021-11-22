package com.hnh.lucene;

import org.apache.lucene.analysis.Analyzer;
import org.apache.lucene.analysis.TokenStream;
import org.apache.lucene.analysis.Tokenizer;

import java.io.IOException;

public class MyWhitespaceAnalyzer extends Analyzer {

	@Override
	protected TokenStreamComponents createComponents(String fieldName) {
		Tokenizer source = new MyWhitespaceTokenizer();
		TokenStream filter = new MyLowerCaseTokenFilter(source);
		return new TokenStreamComponents(source, filter);
	}

	static class MyWhitespaceTokenizer extends Tokenizer {

		// 需要记录的属性
		// 词
		MyCharAttribute charAttr = this.addAttribute(MyCharAttribute.class);

		// 存词的出现位置

		// 存放词的偏移

		//
		char[] buffer = new char[255];
		int length = 0;
		int c;

		@Override
		public boolean incrementToken() throws IOException {
			// 清除所有的词项属性
			clearAttributes();
			length = 0;
			while (true) {
				c = this.input.read();

				if (c == -1) {
					if (length > 0) {
						// 复制到charAttr
						this.charAttr.setChars(buffer, length);
						return true;
					} else {
						return false;
					}
				}

				if (Character.isWhitespace(c)) {
					if (length > 0) {
						// 复制到charAttr
						this.charAttr.setChars(buffer, length);
						return true;
					}
				}

				buffer[length++] = (char) c;
			}
		}
	}
}
