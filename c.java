package in.gov.hp.Aadhaar_HP.SRDH;

import android.app.DatePickerDialog;
import android.app.DatePickerDialog.OnDateSetListener;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.support.v4.a.l;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class c
  extends l
{
  ArrayAdapter aa = null;
  private EditText ab;
  private EditText ac;
  private EditText ad;
  private TextView ae;
  private EditText af;
  private Button ag;
  private int ah;
  private int ai;
  private int aj;
  private DatePickerDialog.OnDateSetListener ak = new d(this);
  
  private void H()
  {
    String str1 = af.getText().toString().trim();
    String str2 = ae.getText().toString().trim();
    String str3 = ab.getText().toString().trim();
    String str4 = ac.getText().toString().trim();
    String str5 = ad.getText().toString().trim();
    if ((str1.length() != 0) || (str2.length() != 0) || (str3.length() != 0) || (str4.length() != 0) || (str5.length() != 0))
    {
      Intent localIntent = new Intent(b(), AdvancedListFive.class);
      localIntent.putExtra("District", str1);
      localIntent.putExtra("Name", str3);
      localIntent.putExtra("FHName", str4);
      localIntent.putExtra("Dob", str2);
      localIntent.putExtra("Pincode", str5);
      a(localIntent);
      return;
    }
    Toast.makeText(b(), " Our Central System is as big as the universe. Please provide some parameter.  ", 1).show();
  }
  
  private void I()
  {
    String str1;
    if (ai + 1 > 9)
    {
      str1 = "" + (ai + 1);
      if (aj >= 10) {
        break label139;
      }
    }
    label139:
    for (String str2 = "0" + aj;; str2 = "" + aj)
    {
      ae.setText(str2 + "-" + str1 + "-" + ah);
      return;
      str1 = "0" + (ai + 1);
      break;
    }
  }
  
  private DatePickerDialog a(int paramInt1, int paramInt2, int paramInt3, DatePickerDialog.OnDateSetListener paramOnDateSetListener)
  {
    paramOnDateSetListener = new DatePickerDialog(b(), paramOnDateSetListener, paramInt1, paramInt2, paramInt3);
    paramOnDateSetListener.setTitle("Please Select Your Date Of Birth");
    paramOnDateSetListener.show();
    return paramOnDateSetListener;
  }
  
  public static l a(Context paramContext)
  {
    return new c();
  }
  
  public View a(LayoutInflater paramLayoutInflater, ViewGroup paramViewGroup, Bundle paramBundle)
  {
    paramLayoutInflater = (ViewGroup)paramLayoutInflater.inflate(2130968612, null);
    af = ((EditText)paramLayoutInflater.findViewById(2131558566));
    ag = ((Button)paramLayoutInflater.findViewById(2131558583));
    ae = ((TextView)paramLayoutInflater.findViewById(2131558570));
    ab = ((EditText)paramLayoutInflater.findViewById(2131558574));
    ac = ((EditText)paramLayoutInflater.findViewById(2131558578));
    ad = ((EditText)paramLayoutInflater.findViewById(2131558582));
    ae.setOnClickListener(new e(this));
    ag.setOnClickListener(new f(this));
    return paramLayoutInflater;
  }
}

/* Location:
 * Qualified Name:     in.gov.hp.Aadhaar_HP.SRDH.c
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */