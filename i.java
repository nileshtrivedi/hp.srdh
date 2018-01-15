package in.gov.hp.Aadhaar_HP.SRDH;

import android.content.Intent;
import android.view.View;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemClickListener;

class i
  implements AdapterView.OnItemClickListener
{
  i(EID_Search_List paramEID_Search_List) {}
  
  public void onItemClick(AdapterView paramAdapterView, View paramView, int paramInt, long paramLong)
  {
    paramAdapterView = (ab)paramAdapterView.getItemAtPosition(paramInt);
    paramView = new Intent();
    paramView.putExtra("Details", paramAdapterView);
    paramView.setClass(a, UserDetailsSearch.class);
    a.startActivity(paramView);
  }
}

/* Location:
 * Qualified Name:     in.gov.hp.Aadhaar_HP.SRDH.i
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */