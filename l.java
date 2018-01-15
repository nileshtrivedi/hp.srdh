package in.gov.hp.Aadhaar_HP.SRDH;

public class l
{
  /* Error */
  public static String a(String paramString)
  {
    // Byte code:
    //   0: new 12	java/net/URL
    //   3: dup
    //   4: aload_0
    //   5: invokespecial 16	java/net/URL:<init>	(Ljava/lang/String;)V
    //   8: invokevirtual 20	java/net/URL:openConnection	()Ljava/net/URLConnection;
    //   11: checkcast 22	java/net/HttpURLConnection
    //   14: astore_0
    //   15: new 24	java/lang/StringBuilder
    //   18: dup
    //   19: invokespecial 27	java/lang/StringBuilder:<init>	()V
    //   22: astore_2
    //   23: new 29	java/io/BufferedReader
    //   26: dup
    //   27: new 31	java/io/InputStreamReader
    //   30: dup
    //   31: aload_0
    //   32: invokevirtual 35	java/net/HttpURLConnection:getInputStream	()Ljava/io/InputStream;
    //   35: invokespecial 38	java/io/InputStreamReader:<init>	(Ljava/io/InputStream;)V
    //   38: invokespecial 41	java/io/BufferedReader:<init>	(Ljava/io/Reader;)V
    //   41: astore_1
    //   42: aload_1
    //   43: astore_0
    //   44: aload_1
    //   45: invokevirtual 45	java/io/BufferedReader:readLine	()Ljava/lang/String;
    //   48: astore_3
    //   49: aload_3
    //   50: ifnull +51 -> 101
    //   53: aload_1
    //   54: astore_0
    //   55: aload_2
    //   56: new 24	java/lang/StringBuilder
    //   59: dup
    //   60: invokespecial 27	java/lang/StringBuilder:<init>	()V
    //   63: aload_3
    //   64: invokevirtual 49	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   67: ldc 51
    //   69: invokevirtual 49	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   72: invokevirtual 54	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   75: invokevirtual 49	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   78: pop
    //   79: goto -37 -> 42
    //   82: astore_2
    //   83: aload_1
    //   84: astore_0
    //   85: aload_2
    //   86: invokevirtual 57	java/lang/Exception:printStackTrace	()V
    //   89: aload_1
    //   90: ifnull +7 -> 97
    //   93: aload_1
    //   94: invokevirtual 60	java/io/BufferedReader:close	()V
    //   97: aconst_null
    //   98: astore_0
    //   99: aload_0
    //   100: areturn
    //   101: aload_1
    //   102: astore_0
    //   103: aload_2
    //   104: invokevirtual 54	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   107: astore_2
    //   108: aload_2
    //   109: astore_0
    //   110: aload_1
    //   111: ifnull -12 -> 99
    //   114: aload_1
    //   115: invokevirtual 60	java/io/BufferedReader:close	()V
    //   118: aload_2
    //   119: areturn
    //   120: astore_0
    //   121: aload_0
    //   122: invokevirtual 61	java/io/IOException:printStackTrace	()V
    //   125: aconst_null
    //   126: areturn
    //   127: astore_0
    //   128: aload_0
    //   129: invokevirtual 61	java/io/IOException:printStackTrace	()V
    //   132: aconst_null
    //   133: areturn
    //   134: astore_1
    //   135: aconst_null
    //   136: astore_0
    //   137: aload_0
    //   138: ifnull +7 -> 145
    //   141: aload_0
    //   142: invokevirtual 60	java/io/BufferedReader:close	()V
    //   145: aload_1
    //   146: athrow
    //   147: astore_0
    //   148: aload_0
    //   149: invokevirtual 61	java/io/IOException:printStackTrace	()V
    //   152: aconst_null
    //   153: areturn
    //   154: astore_1
    //   155: goto -18 -> 137
    //   158: astore_2
    //   159: aconst_null
    //   160: astore_1
    //   161: goto -78 -> 83
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	164	0	paramString	String
    //   41	74	1	localBufferedReader	java.io.BufferedReader
    //   134	12	1	localObject1	Object
    //   154	1	1	localObject2	Object
    //   160	1	1	localObject3	Object
    //   22	34	2	localStringBuilder	StringBuilder
    //   82	22	2	localException1	Exception
    //   107	12	2	str1	String
    //   158	1	2	localException2	Exception
    //   48	16	3	str2	String
    // Exception table:
    //   from	to	target	type
    //   44	49	82	java/lang/Exception
    //   55	79	82	java/lang/Exception
    //   103	108	82	java/lang/Exception
    //   114	118	120	java/io/IOException
    //   93	97	127	java/io/IOException
    //   0	42	134	finally
    //   141	145	147	java/io/IOException
    //   44	49	154	finally
    //   55	79	154	finally
    //   85	89	154	finally
    //   103	108	154	finally
    //   0	42	158	java/lang/Exception
  }
}

/* Location:
 * Qualified Name:     in.gov.hp.Aadhaar_HP.SRDH.l
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */