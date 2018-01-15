package in.gov.hp.Aadhaar_HP.SRDH;

import android.view.View;
import android.view.View.OnClickListener;
import android.widget.EditText;
import android.widget.Toast;

class n
  implements View.OnClickListener
{
  n(LogOut paramLogOut) {}
  
  public void onClick(View paramView)
  {
    LogOut.a(a, LogOut.a(a).getText().toString().trim());
    if ((LogOut.b(a).length() != 0) && (LogOut.b(a) != null))
    {
      new o(a).execute(new String[] { LogOut.b(a) });
      return;
    }
    Toast.makeText(a.getApplicationContext(), "Username cannot be empty", 1).show();
  }
}

/* Location:
 * Qualified Name:     in.gov.hp.Aadhaar_HP.SRDH.n
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */