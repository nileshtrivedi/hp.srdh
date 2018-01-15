package in.gov.hp.Aadhaar_HP.SRDH;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.os.Bundle;
import android.widget.ListView;
import android.widget.ProgressBar;
import android.widget.Toast;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;

public class AdvancedListFive
  extends Activity
{
  String a = null;
  String b = null;
  String c = null;
  String d = null;
  String e = null;
  ProgressBar f;
  List g;
  List h;
  URL i;
  HttpURLConnection j;
  StringBuilder k = new StringBuilder();
  ListView l;
  Context m;
  
  protected boolean a()
  {
    NetworkInfo localNetworkInfo = ((ConnectivityManager)getSystemService("connectivity")).getActiveNetworkInfo();
    return (localNetworkInfo != null) && (localNetworkInfo.isConnectedOrConnecting());
  }
  
  protected void b()
  {
    v localv = new v(this, 2130968611, h);
    l.setAdapter(localv);
  }
  
  protected void onCreate(Bundle paramBundle)
  {
    super.onCreate(paramBundle);
    setContentView(2130968601);
    paramBundle = getIntent().getExtras();
    a = paramBundle.getString("District");
    b = paramBundle.getString("Name");
    c = paramBundle.getString("FHName");
    d = paramBundle.getString("Dob");
    e = paramBundle.getString("Pincode");
    l = ((ListView)findViewById(2131558480));
    m = this;
    f = ((ProgressBar)findViewById(2131558481));
    f.setVisibility(4);
    g = new ArrayList();
    if (a()) {
      new b(this).execute(new String[] { a, b, c, d, e });
    }
    for (;;)
    {
      l.setOnItemClickListener(new a(this));
      return;
      Toast.makeText(this, "Network isn't available", 1).show();
    }
  }
}

/* Location:
 * Qualified Name:     in.gov.hp.Aadhaar_HP.SRDH.AdvancedListFive
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */