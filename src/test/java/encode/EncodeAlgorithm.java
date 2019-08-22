package encode;

import java.io.UnsupportedEncodingException;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

/**
 * 加密算法
 * @author cdx
 * date 2019-08-22
 */
public class EncodeAlgorithm {
    private static MessageDigest md = null;
    private static String data = "abc";

    public static String encode(String algorithm)
            throws NoSuchAlgorithmException, UnsupportedEncodingException {
        md = MessageDigest.getInstance(algorithm);
        byte[] array = md.digest(data.getBytes("UTF-8"));
        StringBuilder sb = new StringBuilder();
        for (byte item : array) {
            sb.append(Integer.toHexString((item & 0xFF) | 0x100).substring(1, 3));
        }
        return sb.toString().toUpperCase();
    }

    public static void main(String[] args) throws UnsupportedEncodingException, NoSuchAlgorithmException {
        System.out.println("MD5      --->   " + encode("MD5")
                + "   --->   " + encode("MD5").length());

        System.out.println("SHA-1    --->   " + encode("SHA-1")
                + "   --->   " + encode("SHA-1").length());

        System.out.println("SHA-256  --->   " + encode("SHA-256")
                + "   --->   " + encode("SHA-256").length());
    }
}
