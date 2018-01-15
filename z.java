package in.gov.hp.Aadhaar_HP.SRDH;

import android.util.Log;
import java.util.ArrayList;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import org.json.JSONTokener;

public class z
{
  public static List a(String paramString)
  {
    try
    {
      Object localObject = new JSONTokener(paramString).nextValue();
      if ((localObject instanceof JSONObject))
      {
        paramString = new JSONObject(paramString).optString("SearchResult");
        Log.d("Table===", paramString);
      }
      for (;;)
      {
        JSONArray localJSONArray = new JSONArray(paramString);
        localObject = new ArrayList();
        int i = 0;
        for (;;)
        {
          paramString = (String)localObject;
          if (i >= localJSONArray.length()) {
            break;
          }
          paramString = localJSONArray.getJSONObject(i);
          ab localab = new ab();
          localab.m(paramString.getString("Aadhaar"));
          localab.l(paramString.getString("Resident_Name"));
          localab.k(paramString.getString("Enroll_ID"));
          localab.j(paramString.getString("Addr_District"));
          localab.i(paramString.getString("Gender"));
          localab.h(paramString.getString("addr_pincode"));
          localab.g(paramString.getString("addr_state_name"));
          localab.e(paramString.getString("Address_Building"));
          localab.f(paramString.getString("Care_of"));
          localab.d(paramString.getString("Addr_Landmark"));
          localab.c(paramString.getString("Addr_Locality"));
          localab.b(paramString.getString("Addr_Street"));
          localab.a(paramString.getString("DOB"));
          ((List)localObject).add(localab);
          i += 1;
        }
        boolean bool = localObject instanceof JSONArray;
        if (bool) {}
        paramString = null;
      }
      return paramString;
    }
    catch (JSONException paramString)
    {
      paramString.printStackTrace();
      paramString = null;
    }
  }
}

/* Location:
 * Qualified Name:     in.gov.hp.Aadhaar_HP.SRDH.z
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */