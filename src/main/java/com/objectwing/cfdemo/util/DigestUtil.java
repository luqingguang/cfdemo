/*
 * Licensed Materials - Property of IBM
 * (C) Copyright IBM Corp. 2012, 2012 All Rights Reserved
 * US Government Users Restricted Rights - Use, duplication or 
 * disclosure restricted by GSA ADP Schedule Contract with IBM Corp.
 */

package com.objectwing.cfdemo.util;

import java.io.IOException;
import java.io.InputStream;
import java.security.GeneralSecurityException;
import java.security.MessageDigest;
import java.security.SecureRandom;


/**
 * The DigestUtil class provide digest utility use SHA.
 * 
 * @version 1.0 September 30, 2012.
 * @author Qing Guang Lu
 */
public class DigestUtil {
	
	private static final String SHA1 = "SHA-1";
	
	private static SecureRandom random = new SecureRandom();

	/**
	 * sha1
	 * 
	 * @param input
	 * @return
	 */
	public static byte[] sha1(byte[] input) {
		return digest(input, SHA1, null, 1);
	}
	
	/**
	 * sha1
	 * 
	 * @param input
	 * @param salt
	 * @return
	 */
	public static byte[] sha1(byte[] input, byte[] salt) {
		return digest(input, SHA1, salt, 1);
	}
	
	/**
	 * sha1
	 * 
	 * @param input
	 * @param salt
	 * @param iterations
	 * @return
	 */
	public static byte[] sha1(byte[] input, byte[] salt, int iterations) {
		return digest(input, SHA1, salt, iterations);
	}

	/**
	 * digest
	 * 
	 * @param input
	 * @param algorithm
	 * @param salt
	 * @param iterations
	 * @return
	 */
	private static byte[] digest(byte[] input, String algorithm, byte[] salt, int iterations) {
		try {
			MessageDigest digest = MessageDigest.getInstance(algorithm);

			if (salt != null) {
				digest.update(salt);
			}

			byte[] result = digest.digest(input);

			for (int i = 1; i < iterations; i++) {
				digest.reset();
				result = digest.digest(result);
			}
			return result;
		} catch (GeneralSecurityException e) {
			throw new RuntimeException(e);
		}
	}

	/**
	 * generate salt
	 * 
	 * @param numBytes
	 * @return
	 */
	public static byte[] generateSalt(int numBytes) {
		

		byte[] bytes = new byte[numBytes];
		random.nextBytes(bytes);
		return bytes;
	}

	/**
	 * sha1
	 * 
	 * @param input
	 * @return
	 * @throws IOException
	 */
	public static byte[] sha1(InputStream input) throws IOException {
		return digest(input, SHA1);
	}
	
	/**
	 * digest
	 * 
	 * @param input
	 * @param algorithm
	 * @return
	 * @throws IOException
	 */
	private static byte[] digest(InputStream input, String algorithm) throws IOException {
		try {
			MessageDigest messageDigest = MessageDigest.getInstance(algorithm);
			int bufferLength = 8 * 1024;
			byte[] buffer = new byte[bufferLength];
			int read = input.read(buffer, 0, bufferLength);

			while (read > -1) {
				messageDigest.update(buffer, 0, read);
				read = input.read(buffer, 0, bufferLength);
			}

			return messageDigest.digest();
			
		} catch (GeneralSecurityException e) {
			throw new RuntimeException(e);
		}
	}

}
