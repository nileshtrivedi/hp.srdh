package in.gov.hp.Aadhaar_HP.SRDH;

import android.app.Activity;
import android.os.Bundle;
import android.widget.RelativeLayout;
import android.widget.TextView;

public class LoginActivity
  extends Activity
{
  TextView a;
  RelativeLayout b;
  
  protected void onCreate(Bundle paramBundle)
  {
    super.onCreate(paramBundle);
    setContentView(2130968604);
    a = ((TextView)findViewById(2131558504));
    b = ((RelativeLayout)findViewById(2131558505));
    b.setOnClickListener(new p(this));
  }
}

/* Location:
 * Qualified Name:     in.gov.hp.Aadhaar_HP.SRDH.LoginActivity
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */