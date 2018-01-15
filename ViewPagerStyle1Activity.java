package in.gov.hp.Aadhaar_HP.SRDH;

import android.app.AlertDialog;
import android.app.AlertDialog.Builder;
import android.os.Bundle;
import android.support.v4.a.o;
import android.support.v4.view.ViewPager;
import android.view.View;

public class ViewPagerStyle1Activity
  extends o
{
  SignIn n = new SignIn();
  ag o = new ag(this);
  private ViewPager p;
  private ac q;
  
  private void g()
  {
    p = ((ViewPager)findViewById(2131558556));
    q = new ac(getApplicationContext(), f());
    p.setAdapter(q);
    p.setCurrentItem(0);
  }
  
  private void h()
  {
    findViewById(2131558552).setActivated(true);
    findViewById(2131558553).setActivated(true);
    p.setOnPageChangeListener(new ad(this));
  }
  
  public void onBackPressed()
  {
    AlertDialog.Builder localBuilder = new AlertDialog.Builder(this);
    localBuilder.setMessage("Are you sure you want to exit the HPSRDH application?").setCancelable(false).setPositiveButton("Yes", new af(this)).setNegativeButton("No", new ae(this));
    localBuilder.create().show();
  }
  
  public void onCreate(Bundle paramBundle)
  {
    super.onCreate(paramBundle);
    setContentView(2130968608);
    g();
    h();
  }
}

/* Location:
 * Qualified Name:     in.gov.hp.Aadhaar_HP.SRDH.ViewPagerStyle1Activity
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */