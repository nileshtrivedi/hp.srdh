package in.gov.hp.Aadhaar_HP.SRDH;

import android.view.View;
import android.view.View.OnClickListener;
import android.widget.EditText;
import android.widget.Toast;

class q
  implements View.OnClickListener
{
  q(SignIn paramSignIn) {}
  
  public void onClick(View paramView)
  {
    paramView = SignIn.a(a).getText().toString().trim();
    String str = SignIn.b(a).getText().toString().trim();
    if (SignIn.c(a).length() != 0)
    {
      if ((paramView != null) && (paramView.length() != 0))
      {
        if ((str != null) && (str.length() != 0))
        {
          new r(a).execute(new String[] { paramView, str, SignIn.c(a) });
          return;
        }
        Toast.makeText(a.getApplicationContext(), "Password cannot be empty", 1).show();
        return;
      }
      Toast.makeText(a.getApplicationContext(), "Username cannot be empty", 1).show();
      return;
    }
    Toast.makeText(a.getApplicationContext(), "Something Went Wrong. Please check your network connectivity", 1).show();
  }
}

/* Location:
 * Qualified Name:     in.gov.hp.Aadhaar_HP.SRDH.q
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */