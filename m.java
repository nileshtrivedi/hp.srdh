package in.gov.hp.Aadhaar_HP.SRDH;

import android.util.Log;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.PrintStream;
import java.io.UnsupportedEncodingException;
import org.apache.http.HttpEntity;
import org.apache.http.HttpResponse;
import org.apache.http.StatusLine;
import org.apache.http.client.ClientProtocolException;
import org.apache.http.client.HttpClient;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.impl.client.DefaultHttpClient;

public class m
{
  static InputStream a = null;
  static String b = null;
  public String c = "";
  
  public String a(String paramString)
  {
    Object localObject = new DefaultHttpClient();
    try
    {
      paramString = ((HttpClient)localObject).execute(new HttpGet(paramString));
      localObject = paramString.getStatusLine();
      if (((StatusLine)localObject).getStatusCode() == 200)
      {
        a = paramString.getEntity().getContent();
        try
        {
          paramString = new BufferedReader(new InputStreamReader(a, "utf-8"), 32);
          localObject = new StringBuilder();
          for (;;)
          {
            String str = paramString.readLine();
            if (str == null) {
              break;
            }
            ((StringBuilder)localObject).append(str + "\n");
          }
          paramString.getEntity().getContent().close();
        }
        catch (Exception paramString)
        {
          Log.e("Buffer Error", "Error converting result " + paramString.toString());
          return "";
        }
      }
      else
      {
        throw new IOException(((StatusLine)localObject).getReasonPhrase());
      }
    }
    catch (UnsupportedEncodingException paramString)
    {
      for (;;)
      {
        paramString.printStackTrace();
      }
    }
    catch (ClientProtocolException paramString)
    {
      for (;;)
      {
        paramString.printStackTrace();
      }
    }
    catch (IOException paramString)
    {
      for (;;)
      {
        paramString.printStackTrace();
      }
      a.close();
      c = ((StringBuilder)localObject).toString();
      System.out.println(c);
    }
    return c;
  }
  
  public String b(String paramString)
  {
    Object localObject = new DefaultHttpClient();
    try
    {
      paramString = ((HttpClient)localObject).execute(new HttpGet(paramString));
      localObject = paramString.getStatusLine();
      if (((StatusLine)localObject).getStatusCode() == 200)
      {
        a = paramString.getEntity().getContent();
        try
        {
          paramString = new BufferedReader(new InputStreamReader(a, "utf-8"), 32);
          localObject = new StringBuilder();
          for (;;)
          {
            String str = paramString.readLine();
            if (str == null) {
              break;
            }
            ((StringBuilder)localObject).append(str + "\n");
          }
          paramString.getEntity().getContent().close();
        }
        catch (Exception paramString)
        {
          Log.e("Buffer Error", "Error converting result " + paramString.toString());
          return "";
        }
      }
      else
      {
        throw new IOException(((StatusLine)localObject).getReasonPhrase());
      }
    }
    catch (UnsupportedEncodingException paramString)
    {
      for (;;)
      {
        paramString.printStackTrace();
      }
    }
    catch (ClientProtocolException paramString)
    {
      for (;;)
      {
        paramString.printStackTrace();
      }
    }
    catch (IOException paramString)
    {
      for (;;)
      {
        paramString.printStackTrace();
      }
      a.close();
      c = ((StringBuilder)localObject).toString();
      System.out.println("varification is" + c);
    }
    return c;
  }
}

/* Location:
 * Qualified Name:     in.gov.hp.Aadhaar_HP.SRDH.m
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */