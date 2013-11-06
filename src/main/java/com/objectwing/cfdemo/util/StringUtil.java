/*
 * Licensed Materials - Property of IBM
 * (C) Copyright IBM Corp. 2012, 2012 All Rights Reserved
 * US Government Users Restricted Rights - Use, duplication or 
 * disclosure restricted by GSA ADP Schedule Contract with IBM Corp.
 */

package com.objectwing.cfdemo.util;

/**
 * The StringUtil class provide String utility.
 * 
 * @version 1.0 September 30, 2012.
 * @author Qing Guang Lu
 */
public class StringUtil {
	
	/**
	 * indicate string has length 
	 * @param str
	 * @return
	 */
	public static boolean hasLength(String str) {
		return (str != null && str.length() > 0);
    }
	
	/**
	 * indicate string has text 
	 * @param str
	 * @return
	 */
	public static boolean hasText(String str) {
        if (!hasLength(str)) {
            return false;
        }
        int strLen = str.length();
        for (int i = 0; i < strLen; i++) {
            if (!Character.isWhitespace(str.charAt(i))) {
                return true;
            }
        }
        return false;
    }

}
