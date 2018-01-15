package in.gov.hp.Aadhaar_HP.SRDH;

import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

public class k
{
  private static MessageDigest a;
  
  static
  {
    try
    {
      a = MessageDigest.getInstance("MD5");
      return;
    }
    catch (NoSuchAlgorithmException localNoSuchAlgorithmException)
    {
      localNoSuchAlgorithmException.printStackTrace();
    }
  }
  
  public static String a(String paramString)
  {
    if ((paramString == null) || (paramString.length() == 0)) {
      throw new IllegalArgumentException("String to encript cannot be null or zero length");
    }
    a.update(paramString.getBytes());
    paramString = a.digest();
    StringBuffer localStringBuffer = new StringBuffer();
    int i = 0;
    if (i < paramString.length)
    {
      if ((paramString[i] & 0xFF) < 16) {
        localStringBuffer.append("0" + Integer.toHexString(paramString[i] & 0xFF));
      }
      for (;;)
      {
        i += 1;
        break;
        localStringBuffer.append(Integer.toHexString(paramString[i] & 0xFF));
      }
    }
    return localStringBuffer.toString();
  }
}

/* Location:
 * Qualified Name:     in.gov.hp.Aadhaar_HP.SRDH.k
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */