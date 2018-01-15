package in.gov.hp.Aadhaar_HP.SRDH;

import android.app.Activity;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;

public class LogOut
  extends Activity
{
  private EditText a;
  private Button b;
  private String c = null;
  
  protected void onCreate(Bundle paramBundle)
  {
    super.onCreate(paramBundle);
    setContentView(2130968602);
    a = ((EditText)findViewById(2131558493));
    b = ((Button)findViewById(2131558498));
    b.setOnClickListener(new n(this));
  }
}

/* Location:
 * Qualified Name:     in.gov.hp.Aadhaar_HP.SRDH.LogOut
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */