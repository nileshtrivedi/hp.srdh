package in.gov.hp.Aadhaar_HP.SRDH;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;
import java.util.List;

public class v
  extends ArrayAdapter
{
  private Context a;
  private List b;
  
  public v(Context paramContext, int paramInt, List paramList)
  {
    super(paramContext, paramInt, paramList);
    a = paramContext;
    b = paramList;
  }
  
  public View getView(int paramInt, View paramView, ViewGroup paramViewGroup)
  {
    paramView = ((LayoutInflater)a.getSystemService("layout_inflater")).inflate(2130968611, paramViewGroup, false);
    paramViewGroup = (ab)b.get(paramInt);
    TextView localTextView1 = (TextView)paramView.findViewById(2131558561);
    TextView localTextView2 = (TextView)paramView.findViewById(2131558562);
    localTextView1.setText(paramViewGroup.m());
    localTextView2.setText(paramViewGroup.l());
    return paramView;
  }
}

/* Location:
 * Qualified Name:     in.gov.hp.Aadhaar_HP.SRDH.v
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */