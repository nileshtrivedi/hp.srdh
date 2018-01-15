package in.gov.hp.Aadhaar_HP.SRDH;

import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import android.content.SharedPreferences;
import android.util.Log;

class af
  implements DialogInterface.OnClickListener
{
  af(ViewPagerStyle1Activity paramViewPagerStyle1Activity) {}
  
  public void onClick(DialogInterface paramDialogInterface, int paramInt)
  {
    SharedPreferences localSharedPreferences = a.getSharedPreferences("UserName", 0);
    paramDialogInterface = null;
    if (localSharedPreferences.contains("USERNAME"))
    {
      paramDialogInterface = localSharedPreferences.getString("USERNAME", "");
      Log.d("User Name is: ", paramDialogInterface);
    }
    a.o.execute(new String[] { paramDialogInterface });
  }
}

/* Location:
 * Qualified Name:     in.gov.hp.Aadhaar_HP.SRDH.af
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */