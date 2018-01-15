package in.gov.hp.Aadhaar_HP.SRDH;

import android.app.ProgressDialog;
import android.os.AsyncTask;
import android.os.Process;
import android.util.Log;
import android.widget.Toast;
import org.json.JSONException;
import org.json.JSONObject;
import org.json.JSONTokener;

public class ag
  extends AsyncTask
{
  String a = null;
  Boolean b = Boolean.valueOf(false);
  private ProgressDialog d;
  
  public ag(ViewPagerStyle1Activity paramViewPagerStyle1Activity) {}
  
  protected Boolean a(String... paramVarArgs)
  {
    paramVarArgs = paramVarArgs[0];
    new k();
    String str = k.a(paramVarArgs);
    paramVarArgs = new StringBuilder();
    paramVarArgs.append("http://hp.gov.in/uidreport/AWW.svc");
    paramVarArgs.append("/");
    paramVarArgs.append("signout");
    paramVarArgs.append("/");
    paramVarArgs.append(str);
    a = paramVarArgs.toString();
    str = new m().a(a);
    paramVarArgs.delete(0, paramVarArgs.length());
    try
    {
      if ((new JSONTokener(str).nextValue() instanceof JSONObject)) {
        b = Boolean.valueOf(new JSONObject(str).optBoolean("LogOutUserResult"));
      }
      return b;
    }
    catch (JSONException paramVarArgs)
    {
      for (;;)
      {
        paramVarArgs.printStackTrace();
        b = Boolean.valueOf(false);
      }
    }
  }
  
  protected void a(Boolean paramBoolean)
  {
    super.onPostExecute(paramBoolean);
    d.dismiss();
    if (paramBoolean.booleanValue())
    {
      Log.d("Result Exit", paramBoolean.toString());
      c.finish();
      Process.killProcess(Process.myPid());
      return;
    }
    Toast.makeText(c.getApplicationContext(), "Something Went Wrong. Please check your network connectivity", 1).show();
  }
  
  protected void onPreExecute()
  {
    super.onPreExecute();
    d = new ProgressDialog(c);
    d.setMessage("Logging Out,Please wait..");
    d.show();
    d.setCancelable(false);
  }
}

/* Location:
 * Qualified Name:     in.gov.hp.Aadhaar_HP.SRDH.ag
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */