package in.gov.hp.Aadhaar_HP.SRDH;

import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Toast;

class h
  implements View.OnClickListener
{
  h(g paramg) {}
  
  public void onClick(View paramView)
  {
    try
    {
      g.a(a);
      return;
    }
    catch (Exception paramView)
    {
      Toast.makeText(a.b(), paramView.getMessage().toString().trim(), 1).show();
    }
  }
}

/* Location:
 * Qualified Name:     in.gov.hp.Aadhaar_HP.SRDH.h
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */