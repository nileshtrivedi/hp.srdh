package in.gov.hp.Aadhaar_HP.SRDH;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

public class UserDetailsSearch
  extends Activity
{
  ImageView a;
  private TextView b;
  private TextView c;
  private TextView d;
  private TextView e;
  private TextView f;
  private TextView g;
  private TextView h;
  private TextView i;
  private TextView j;
  private TextView k;
  private TextView l;
  private TextView m;
  private TextView n;
  private Button o;
  
  protected void onCreate(Bundle paramBundle)
  {
    super.onCreate(paramBundle);
    setContentView(2130968606);
    paramBundle = (ab)getIntent().getSerializableExtra("Details");
    b = ((TextView)findViewById(2131558523));
    c = ((TextView)findViewById(2131558513));
    e = ((TextView)findViewById(2131558517));
    i = ((TextView)findViewById(2131558537));
    j = ((TextView)findViewById(2131558525));
    k = ((TextView)findViewById(2131558541));
    l = ((TextView)findViewById(2131558539));
    m = ((TextView)findViewById(2131558527));
    n = ((TextView)findViewById(2131558529));
    f = ((TextView)findViewById(2131558533));
    g = ((TextView)findViewById(2131558535));
    h = ((TextView)findViewById(2131558531));
    d = ((TextView)findViewById(2131558519));
    o = ((Button)findViewById(2131558550));
    a = ((ImageView)findViewById(2131558512));
    b.setText(paramBundle.m());
    c.setText(paramBundle.l());
    e.setText(paramBundle.k());
    i.setText(paramBundle.j());
    j.setText(paramBundle.i());
    k.setText(paramBundle.h());
    l.setText(paramBundle.g());
    m.setText(paramBundle.f());
    n.setText(paramBundle.e());
    f.setText(paramBundle.d());
    g.setText(paramBundle.c());
    h.setText(paramBundle.b());
    d.setText(paramBundle.a());
    Log.d("DOB", paramBundle.a());
    o.setOnClickListener(new w(this));
    a.setOnClickListener(new x(this));
  }
}

/* Location:
 * Qualified Name:     in.gov.hp.Aadhaar_HP.SRDH.UserDetailsSearch
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */