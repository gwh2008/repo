package com.gary.test.ws.test;

public class EncryptHelper
{
  public static final String DEFAULT_ENCODING = "UTF-8";

  public static String byte2hex(byte[] bytes)
  {
    StringBuffer retString = new StringBuffer();
    for (int i = 0; i < bytes.length; i++) {
      retString.append(Integer.toHexString(256 + (bytes[i] & 0xFF)).substring(1));
    }
    return retString.toString().toUpperCase();
  }

  public static byte[] hex2byte(String hex)
  {
    byte[] bts = new byte[hex.length() / 2];
    for (int i = 0; i < bts.length; i++) {
      bts[i] = (byte)Integer.parseInt(hex.substring(2 * i, 2 * i + 2), 16);
    }
    return bts;
  }
}