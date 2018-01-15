package in.gov.hp.Aadhaar_HP.SRDH;

import android.util.Log;
import java.util.ArrayList;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import org.json.JSONTokener;

public class y
{
  public static List a(String paramString)
  {
    try
    {
      Object localObject = new JSONTokener(paramString).nextValue();
      if ((localObject instanceof JSONObject))
      {
        Log.d("Json ", "Object");
        paramString = new JSONObject(paramString).optString("GetWithEIDResult");
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
          Log.d("Aadhaar is @@@", paramString.getString("Aadhaar"));
          localab.l(paramString.getString("Resident_Name"));
          Log.d("Resident_Name is @@@", paramString.getString("Resident_Name"));
          localab.k(paramString.getString("Enroll_ID"));
          Log.d("Enroll_ID is @@@", paramString.getString("Enroll_ID"));
          localab.j(paramString.getString("Addr_District"));
          Log.d("Addr_District is @@@", paramString.getString("Addr_District"));
          localab.i(paramString.getString("Gender"));
          Log.d("Gender is @@@", paramString.getString("Gender"));
          localab.h(paramString.getString("addr_pincode"));
          Log.d("addr_pincode is @@@", paramString.getString("addr_pincode"));
          localab.g(paramString.getString("addr_state_name"));
          Log.d("addr_state_name is @@@", paramString.getString("addr_state_name"));
          localab.e(paramString.getString("Address_Building"));
          Log.d("Address_Building is @@@", paramString.getString("Address_Building"));
          localab.f(paramString.getString("Care_of"));
          Log.d("Care_of is @@@", paramString.getString("Care_of"));
          localab.d(paramString.getString("Addr_Landmark"));
          Log.d("Addr_Landmark is @@@", paramString.getString("Addr_Landmark"));
          localab.c(paramString.getString("Addr_Locality"));
          Log.d("Addr_Locality is @@@", paramString.getString("Addr_Locality"));
          localab.b(paramString.getString("Addr_Street"));
          Log.d("Addr_Street is @@@", paramString.getString("Addr_Street"));
          localab.a(paramString.getString("DOB"));
          Log.d("Addr_Street is @@@", paramString.getString("DOB"));
          ((List)localObject).add(localab);
          i += 1;
        }
        if ((localObject instanceof JSONArray)) {
          Log.d("Json ", "Array");
        }
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
 * Qualified Name:     in.gov.hp.Aadhaar_HP.SRDH.y
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */