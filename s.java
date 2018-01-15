package in.gov.hp.Aadhaar_HP.SRDH;

import android.content.Intent;

class s
  implements Runnable
{
  s(SplashScreen paramSplashScreen) {}
  
  public void run()
  {
    Intent localIntent = new Intent(a, LoginActivity.class);
    a.startActivity(localIntent);
    a.finish();
  }
}

/* Location:
 * Qualified Name:     in.gov.hp.Aadhaar_HP.SRDH.s
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */