/*
 * Licensed Materials - Property of IBM
 * (C) Copyright IBM Corp. 2012, 2012 All Rights Reserved
 * US Government Users Restricted Rights - Use, duplication or 
 * disclosure restricted by GSA ADP Schedule Contract with IBM Corp.
 */
package com.objectwing.cfdemo.util;

import org.apache.commons.codec.DecoderException;
import org.apache.commons.codec.binary.Hex;


/**
 * The EncodeUtil class provide Hex encode utility.
 * 
 * @version 1.0 September 30, 2012.
 * @author Qing Guang Lu
 */
public class EncodeUtil {
	
	/**
	 * encode hex
	 * 
	 * @param input
	 * @return
	 */
	public static String encodeHex(byte[] input) {
		
		return String.valueOf(Hex.encodeHex(input));
		
	}

	/**
	 * decode Hex
	 * 
	 * @param input
	 * @return
	 */
	public static byte[] decodeHex(String input) {
		try {
			return Hex.decodeHex(input.toCharArray());
		} catch (DecoderException e) {
			throw new RuntimeException(e);
		}
	}

}
