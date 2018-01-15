package in.gov.hp.Aadhaar_HP.SRDH;

import android.os.AsyncTask;
import android.widget.ProgressBar;
import android.widget.Toast;
import java.util.List;

class j
  extends AsyncTask
{
  String a = null;
  String b = null;
  
  j(EID_Search_List paramEID_Search_List) {}
  
  protected String a(String... paramVarArgs)
  {
    a = paramVarArgs[0];
    paramVarArgs = new StringBuilder();
    paramVarArgs.append("http://hp.gov.in/uidreport/AWW.svc");
    paramVarArgs.append("/");
    paramVarArgs.append("searbyEID");
    paramVarArgs.append("/");
    paramVarArgs.append(a);
    b = paramVarArgs.toString();
    return l.a(b);
  }
  
  protected void a(String paramString)
  {
    super.onPostExecute(paramString);
    c.d = y.a(paramString);
    if (c.d.isEmpty()) {
      Toast.makeText(c.getApplicationContext(), "No match found", 1).show();
    }
    for (;;)
    {
      c.c.remove(this);
      if (c.c.size() == 0) {
        c.b.setVisibility(4);
      }
      return;
      c.b();
    }
  }
  
  protected void onPreExecute()
  {
    super.onPreExecute();
    if (c.c.size() == 0) {
      c.b.setVisibility(0);
    }
    c.c.add(this);
  }
}

/* Location:
 * Qualified Name:     in.gov.hp.Aadhaar_HP.SRDH.j
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */