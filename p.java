package in.gov.hp.Aadhaar_HP.SRDH;

import android.content.Intent;
import android.view.View;
import android.view.View.OnClickListener;

class p
  implements View.OnClickListener
{
  p(LoginActivity paramLoginActivity) {}
  
  public void onClick(View paramView)
  {
    paramView = new Intent(a, SignIn.class);
    a.startActivity(paramView);
    a.finish();
  }
}

/* Location:
 * Qualified Name:     in.gov.hp.Aadhaar_HP.SRDH.p
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */