package in.gov.hp.Aadhaar_HP.SRDH;

import android.app.ProgressDialog;
import android.content.Intent;
import android.content.SharedPreferences;
import android.content.SharedPreferences.Editor;
import android.os.AsyncTask;
import android.widget.Toast;
import org.json.JSONException;
import org.json.JSONObject;
import org.json.JSONTokener;

public class r
  extends AsyncTask
{
  Boolean a = Boolean.valueOf(false);
  private ProgressDialog c;
  
  protected r(SignIn paramSignIn) {}
  
  protected Boolean a(String... paramVarArgs)
  {
    String str2 = paramVarArgs[0];
    String str1 = paramVarArgs[1];
    paramVarArgs = paramVarArgs[2];
    paramVarArgs = b.getSharedPreferences("UserName", 0).edit();
    paramVarArgs.putString("USERNAME", str2);
    paramVarArgs.commit();
    paramVarArgs = b.getSharedPreferences("UserName", 0);
    if (paramVarArgs.contains("USERNAME")) {
      b.a = paramVarArgs.getString("USERNAME", "");
    }
    new k();
    str2 = k.a(str2);
    str1 = k.a(str1);
    paramVarArgs = new StringBuilder();
    paramVarArgs.append("http://hp.gov.in/uidreport/AWW.svc");
    paramVarArgs.append("/");
    paramVarArgs.append("signin");
    paramVarArgs.append("/");
    paramVarArgs.append(str2);
    paramVarArgs.append("/");
    paramVarArgs.append(str1);
    paramVarArgs.append("/");
    paramVarArgs.append("0");
    str1 = paramVarArgs.toString();
    str1 = new m().b(str1);
    paramVarArgs.delete(0, paramVarArgs.length());
    try
    {
      if ((new JSONTokener(str1).nextValue() instanceof JSONObject)) {
        a = Boolean.valueOf(new JSONObject(str1).optBoolean("CheckUserResult"));
      }
      return a;
    }
    catch (JSONException paramVarArgs)
    {
      for (;;)
      {
        paramVarArgs.printStackTrace();
        a = Boolean.valueOf(false);
      }
    }
  }
  
  protected void a(Boolean paramBoolean)
  {
    super.onPostExecute(paramBoolean);
    c.dismiss();
    if (paramBoolean.booleanValue())
    {
      paramBoolean = new Intent(b, ViewPagerStyle1Activity.class);
      paramBoolean.addFlags(67108864);
      b.startActivity(paramBoolean);
      b.finish();
      return;
    }
    Toast.makeText(b.getApplicationContext(), "Either the username/password is not valid or you are already logged in", 0).show();
    paramBoolean = new Intent(b, LogOut.class);
    b.startActivity(paramBoolean);
    b.finish();
  }
  
  protected void onPreExecute()
  {
    super.onPreExecute();
    c = new ProgressDialog(b);
    c.setMessage("Please wait....");
    c.show();
    c.setCancelable(false);
  }
}

/* Location:
 * Qualified Name:     in.gov.hp.Aadhaar_HP.SRDH.r
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */