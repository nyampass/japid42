package com.nyampass.jerk.compiler;

import com.nyampass.jerk.compiler.JapidParser.Token;

class TokenPair {
	Token token;
	String source;
	public TokenPair(Token token, String source) {
		super();
		this.token = token;
		this.source = source;
	}
}