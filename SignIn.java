package in.gov.hp.Aadhaar_HP.SRDH;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.telephony.TelephonyManager;
import android.widget.Button;
import android.widget.EditText;

public class SignIn
  extends Activity
{
  public String a;
  private Button b;
  private EditText c;
  private EditText d;
  private String e;
  
  public String a(Context paramContext)
  {
    String str = ((TelephonyManager)paramContext.getSystemService("phone")).getDeviceId();
    paramContext = str;
    if (str == null) {
      paramContext = Integer.toString(0);
    }
    return paramContext;
  }
  
  protected void onCreate(Bundle paramBundle)
  {
    super.onCreate(paramBundle);
    setContentView(2130968603);
    e = a(this);
    b = ((Button)findViewById(2131558501));
    c = ((EditText)findViewById(2131558500));
    d = ((EditText)findViewById(2131558497));
    b.setOnClickListener(new q(this));
  }
}

/* Location:
 * Qualified Name:     in.gov.hp.Aadhaar_HP.SRDH.SignIn
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */