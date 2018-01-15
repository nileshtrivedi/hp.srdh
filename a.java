package in.gov.hp.Aadhaar_HP.SRDH;

import android.content.Intent;
import android.view.View;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemClickListener;

class a
  implements AdapterView.OnItemClickListener
{
  a(AdvancedListFive paramAdvancedListFive) {}
  
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
 * Qualified Name:     in.gov.hp.Aadhaar_HP.SRDH.a
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */