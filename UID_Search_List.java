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
import java.util.ArrayList;
import java.util.List;

public class UID_Search_List
  extends Activity
{
  String a = null;
  ProgressBar b;
  List c;
  List d;
  ListView e;
  Context f;
  
  protected boolean a()
  {
    NetworkInfo localNetworkInfo = ((ConnectivityManager)getSystemService("connectivity")).getActiveNetworkInfo();
    return (localNetworkInfo != null) && (localNetworkInfo.isConnectedOrConnecting());
  }
  
  protected void b()
  {
    v localv = new v(this, 2130968611, d);
    e.setAdapter(localv);
  }
  
  protected void onCreate(Bundle paramBundle)
  {
    super.onCreate(paramBundle);
    setContentView(2130968601);
    a = getIntent().getExtras().getString("UID");
    e = ((ListView)findViewById(2131558480));
    f = this;
    b = ((ProgressBar)findViewById(2131558481));
    b.setVisibility(4);
    c = new ArrayList();
    if (a()) {
      new u(this).execute(new String[] { a });
    }
    for (;;)
    {
      e.setOnItemClickListener(new t(this));
      return;
      Toast.makeText(this, "Network isn't available", 1).show();
    }
  }
}

/* Location:
 * Qualified Name:     in.gov.hp.Aadhaar_HP.SRDH.UID_Search_List
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */