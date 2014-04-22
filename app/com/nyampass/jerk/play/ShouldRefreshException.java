package com.nyampass.jerk.play;

/**
 * to indicate the item in cache will expire soon and should be updated now
 * 
 * @author Bing Ran<bing_ran@hotmail.com>
 *
 */
public class ShouldRefreshException extends Exception {
	public CachedRenderResult renderResult;
	public ShouldRefreshException(CachedRenderResult renderResult) {
		this.renderResult= renderResult;
	}

}
