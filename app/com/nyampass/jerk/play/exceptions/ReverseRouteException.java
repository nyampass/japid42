package com.nyampass.jerk.play.exceptions;

import com.nyampass.jerk.exceptions.JapidRuntimeException;

public class ReverseRouteException extends JapidRuntimeException{
	private static final long serialVersionUID = 3289291726726075602L;
	String action;

	public ReverseRouteException(String action) {
		super("Reverse Route Exception", "action not found: " + action);
		this.action = action;
	}
	
}
