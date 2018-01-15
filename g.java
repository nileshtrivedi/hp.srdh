package in.gov.hp.Aadhaar_HP.SRDH;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.support.v4.a.l;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class g
  extends l
{
  private EditText aa;
  private EditText ab;
  private Button ac;
  
  private void H()
  {
    Object localObject1 = aa.getText().toString().trim();
    Object localObject2 = ab.getText().toString().trim();
    if ((((String)localObject1).length() == 0) && (((String)localObject2).length() == 0)) {
      Toast.makeText(b(), "Please enter your Aadhaar no. or Enroll Id no.", 1).show();
    }
    do
    {
      return;
      if ((localObject1 != null) && (((String)localObject1).length() != 0))
      {
        if (((String)localObject1).length() == 12)
        {
          localObject2 = new Intent(b(), UID_Search_List.class);
          ((Intent)localObject2).putExtra("UID", (String)localObject1);
          a((Intent)localObject2);
          return;
        }
        Toast.makeText(b(), "Aadhar ID is not valid", 1).show();
        return;
      }
    } while (localObject2 == null);
    if (((String)localObject2).length() == 14)
    {
      localObject1 = new Intent(b(), EID_Search_List.class);
      ((Intent)localObject1).putExtra("EID", (String)localObject2);
      a((Intent)localObject1);
      return;
    }
    Toast.makeText(b(), "Please enter a valid Enroll ID", 1).show();
  }
  
  public static l a(Context paramContext)
  {
    return new g();
  }
  
  public View a(LayoutInflater paramLayoutInflater, ViewGroup paramViewGroup, Bundle paramBundle)
  {
    paramLayoutInflater = (ViewGroup)paramLayoutInflater.inflate(2130968613, null);
    aa = ((EditText)paramLayoutInflater.findViewById(2131558587));
    ab = ((EditText)paramLayoutInflater.findViewById(2131558591));
    ac = ((Button)paramLayoutInflater.findViewById(2131558592));
    ac.setOnClickListener(new h(this));
    return paramLayoutInflater;
  }
}

/* Location:
 * Qualified Name:     in.gov.hp.Aadhaar_HP.SRDH.g
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */