package com.okul_no_20194703509.yavuzfetitopbas_2;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    TextView islem_ekrani_bir;
    TextView islem_ekrani_iki;
    TextView islem_ekrani_uc;
    TextView sonuc_ekrani;
    String islem_ekrani_uc_str = "";
    Float sayi_1_f = 0f;
    String sayi_1_str = "";
    Float sayi_2_f = 0f;
    String sayi_2_str = "";
    Float sonuc_f = 0f;
    String sonuc_str = "";
    String ekran = "1";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        getSupportActionBar().setBackgroundDrawable( new ColorDrawable(Color.parseColor("#202020")));
        islem_ekrani_bir = (TextView) findViewById(R.id.islem_ekrani_bir);
        islem_ekrani_iki = (TextView) findViewById(R.id.islem_ekrani_iki);
        islem_ekrani_uc = (TextView) findViewById(R.id.islem_ekrani_uc);
        sonuc_ekrani = (TextView) findViewById(R.id.sonuc_ekrani);
    }

    public void islem_ekrani_bir(View view)
    {
        ekran="1";
    }

    public void islem_ekrani_iki(View view)
    {
        ekran="2";
    }

    public void sil(View view)
    {
        sonuc_str = sonuc_ekrani.getText().toString();
        if (sonuc_str=="")
        {
            if (ekran=="1")
            {
                sayi_1_str = islem_ekrani_bir.getText().toString();
                if (sayi_1_str != "" && sayi_1_str.length()>1 && !sayi_1_str.equals("0."))
                {
                    islem_ekrani_bir.setText(sayi_1_str.substring(0,sayi_1_str.length()-1));
                }
                else if (sayi_1_str.length()==1 || sayi_1_str.equals("0."))
                {
                    sayi_1_str="";
                    islem_ekrani_bir.setText("");
                }
            }
            else if (ekran=="2")
            {
                sayi_2_str = islem_ekrani_iki.getText().toString();
                if (sayi_2_str != "" && sayi_2_str.length()>1 && !sayi_2_str.equals("0."))
                {
                    islem_ekrani_iki.setText(sayi_2_str.substring(0,sayi_2_str.length()-1));
                }
                else if (sayi_2_str.length()==1 || sayi_2_str.equals("0."))
                {
                    sayi_2_str="";
                    islem_ekrani_iki.setText("");
                }
                else if (sayi_2_str=="")
                {
                    ekran="1";
                    islem_ekrani_uc.setText("");
                }
            }
        }
        else
        {
            sonuc_ekrani.setText("");
        }
    }

    public void sayi_max()
    {
        sayi_1_str = islem_ekrani_bir.getText().toString();
        if (sayi_1_str.indexOf("+")==-1 && sayi_1_str.indexOf("-")==-1)
        {
            if (sayi_1_str.length()>7)
            {
                islem_ekrani_bir.setText(sayi_1_str.substring(0,sayi_1_str.length()-1));
                Toast.makeText(getApplicationContext(),"Bu alana maximum 7 karakter girilebilir.", Toast.LENGTH_LONG).show();
            }
        }
        else
        {
            if (sayi_1_str.length()>8)
            {
                islem_ekrani_bir.setText(sayi_1_str.substring(0,sayi_1_str.length()-1));
                Toast.makeText(getApplicationContext(),"Bu alana maximum 7 karakter girilebilir.", Toast.LENGTH_LONG).show();
            }
        }
        sayi_2_str = islem_ekrani_iki.getText().toString();
        if (sayi_2_str.indexOf("+")==-1 && sayi_2_str.indexOf("-")==-1)
        {
            if (sayi_2_str.length()>7)
            {
                islem_ekrani_iki.setText(sayi_2_str.substring(0,sayi_2_str.length()-1));
                Toast.makeText(getApplicationContext(),"Bu alana maximum 7 karakter girilebilir.", Toast.LENGTH_LONG).show();
            }
        }
        else
        {
            if (sayi_2_str.length()>8)
            {
                islem_ekrani_iki.setText(sayi_2_str.substring(0,sayi_2_str.length()-1));
                Toast.makeText(getApplicationContext(),"Bu alana maximum 7 karakter girilebilir.", Toast.LENGTH_LONG).show();
            }
        }
    }

    public void temizle(View view)
    {
        islem_ekrani_bir.setText("");
        islem_ekrani_iki.setText("");
        islem_ekrani_uc.setText("");
        sonuc_ekrani.setText("");
        sayi_1_f = 0f;
        sayi_1_str = "";
        sayi_2_f = 0f;
        sayi_2_str = "";
        sonuc_f = 0f;
        sonuc_str = "";
        ekran = "1";
    }

    public void nokta(View view)
    {
        if (ekran=="1")
        {
            sayi_1_str = islem_ekrani_bir.getText().toString();
            if (!sayi_1_str.equals("") && !sayi_1_str.substring(sayi_1_str.length()-1,sayi_1_str.length()).equals(".") && sayi_1_str.indexOf(".")==-1){islem_ekrani_bir.setText(sayi_1_str+".");}
            else if (sayi_1_str.equals("")){islem_ekrani_bir.setText("0.");}
        }
        else if(ekran=="2")
        {
            sayi_2_str = islem_ekrani_iki.getText().toString();
            if (!sayi_2_str.equals("") && !sayi_2_str.substring(sayi_2_str.length()-1,sayi_2_str.length()-1).equals(".") && sayi_2_str.indexOf(".")==-1){islem_ekrani_iki.setText(sayi_2_str+".");}
            else if (sayi_2_str.equals("")){islem_ekrani_iki.setText("0.");}
        }
        sayi_max();
    }

    public void negatif(View view)
    {
        if (ekran=="1")
        {
            sayi_1_str = islem_ekrani_bir.getText().toString();
            if (!sayi_1_str.equals(""))
            {
                if (!sayi_1_str.substring(0,1).equals("-"))
                {
                    if (sayi_1_str.substring(0,1).equals("+"))
                    {
                        islem_ekrani_bir.setText("-"+sayi_1_str.substring(1,sayi_1_str.length()));
                    }
                    else
                    {
                        islem_ekrani_bir.setText("-"+sayi_1_str);
                    }
                }
                else if (sayi_1_str.substring(0,1).equals("-"))
                {
                    islem_ekrani_bir.setText(sayi_1_str.substring(1,sayi_1_str.length()));
                }
            }
            else if (sayi_1_str.equals(""))
            {
                islem_ekrani_bir.setText("-");
            }
        }
        else if(ekran=="2")
        {
            sayi_2_str = islem_ekrani_iki.getText().toString();
            if (!sayi_2_str.equals(""))
            {
                if (!sayi_2_str.substring(0,1).equals("-"))
                {
                    if (sayi_2_str.substring(0,1).equals("+"))
                    {
                        islem_ekrani_iki.setText("-"+sayi_2_str.substring(1,sayi_2_str.length()));
                    }
                    else
                    {
                        islem_ekrani_iki.setText("-"+sayi_2_str);
                    }
                }
                else if (sayi_2_str.substring(0,1).equals("-"))
                {
                    islem_ekrani_iki.setText(sayi_2_str.substring(1,sayi_2_str.length()));
                }
            }
            else if (sayi_2_str.equals(""))
            {
                islem_ekrani_iki.setText("-");
            }
        }
    }

    public void bir (View view)
    {
        if (ekran=="1")
        {
            sayi_1_str = islem_ekrani_bir.getText().toString();
            islem_ekrani_bir.setText(sayi_1_str+"1");
        }
        else if(ekran=="2")
        {
            sayi_2_str = islem_ekrani_iki.getText().toString();
            islem_ekrani_iki.setText(sayi_2_str+"1");
        }
        sayi_max();
    }

    public void iki (View view)
    {
        if (ekran=="1")
        {
            sayi_1_str = islem_ekrani_bir.getText().toString();
            islem_ekrani_bir.setText(sayi_1_str+"2");
        }
        else if(ekran=="2")
        {
            sayi_2_str = islem_ekrani_iki.getText().toString();
            islem_ekrani_iki.setText(sayi_2_str+"2");
        }
        sayi_max();
    }

    public void uc (View view)
    {
        if (ekran=="1")
        {
            sayi_1_str = islem_ekrani_bir.getText().toString();
            islem_ekrani_bir.setText(sayi_1_str+"3");
        }
        else if(ekran=="2")
        {
            sayi_2_str = islem_ekrani_iki.getText().toString();
            islem_ekrani_iki.setText(sayi_2_str+"3");
        }
        sayi_max();
    }

    public void dort (View view)
    {
        if (ekran=="1")
        {
            sayi_1_str = islem_ekrani_bir.getText().toString();
            islem_ekrani_bir.setText(sayi_1_str+"4");
        }
        else if(ekran=="2")
        {
            sayi_2_str = islem_ekrani_iki.getText().toString();
            islem_ekrani_iki.setText(sayi_2_str+"4");
        }
        sayi_max();
    }

    public void bes (View view)
    {
        if (ekran=="1")
        {
            sayi_1_str = islem_ekrani_bir.getText().toString();
            islem_ekrani_bir.setText(sayi_1_str+"5");
        }
        else if(ekran=="2")
        {
            sayi_2_str = islem_ekrani_iki.getText().toString();
            islem_ekrani_iki.setText(sayi_2_str+"5");
        }
        sayi_max();
    }

    public void alti (View view)
    {
        if (ekran=="1")
        {
            sayi_1_str = islem_ekrani_bir.getText().toString();
            islem_ekrani_bir.setText(sayi_1_str+"6");
        }
        else if(ekran=="2")
        {
            sayi_2_str = islem_ekrani_iki.getText().toString();
            islem_ekrani_iki.setText(sayi_2_str+"6");
        }
        sayi_max();
    }

    public void yedi (View view)
    {
        if (ekran=="1")
        {
            sayi_1_str = islem_ekrani_bir.getText().toString();
            islem_ekrani_bir.setText(sayi_1_str+"7");
        }
        else if(ekran=="2")
        {
            sayi_2_str = islem_ekrani_iki.getText().toString();
            islem_ekrani_iki.setText(sayi_2_str+"7");
        }
        sayi_max();
    }

    public void sekiz (View view)
    {
        if (ekran=="1")
        {
            sayi_1_str = islem_ekrani_bir.getText().toString();
            islem_ekrani_bir.setText(sayi_1_str+"8");
        }
        else if(ekran=="2")
        {
            sayi_2_str = islem_ekrani_iki.getText().toString();
            islem_ekrani_iki.setText(sayi_2_str+"8");
        }
        sayi_max();
    }

    public void dokuz (View view)
    {
        if (ekran=="1")
        {
            sayi_1_str = islem_ekrani_bir.getText().toString();
            islem_ekrani_bir.setText(sayi_1_str+"9");
        }
        else if(ekran=="2")
        {
            sayi_2_str = islem_ekrani_iki.getText().toString();
            islem_ekrani_iki.setText(sayi_2_str+"9");
        }
        sayi_max();
    }

    public void sifir (View view)
    {
        if (ekran=="1")
        {
            sayi_1_str = islem_ekrani_bir.getText().toString();
            if (!sayi_1_str.equals("")){islem_ekrani_bir.setText(sayi_1_str+"0");}
            else if (sayi_1_str.equals("")){islem_ekrani_bir.setText("0.");}
        }
        else if(ekran=="2")
        {
            sayi_2_str = islem_ekrani_iki.getText().toString();
            if (!sayi_2_str.equals("")){islem_ekrani_iki.setText(sayi_2_str+"0");}
            else if (sayi_2_str.equals("")){islem_ekrani_iki.setText("0.");}
        }
        sayi_max();
    }

    public void arti (View view)
    {
        sayi_1_str = islem_ekrani_bir.getText().toString();
        if (!sayi_1_str.substring(sayi_1_str.length()-1,sayi_1_str.length()).equals("."))
        {
            islem_ekrani_uc.setText("+");
            ekran = "2";
        }
    }

    public void eksi (View view)
    {
        sayi_1_str = islem_ekrani_bir.getText().toString();
        if (!sayi_1_str.substring(sayi_1_str.length()-1,sayi_1_str.length()).equals("."))
        {
            islem_ekrani_uc.setText("-");
            ekran = "2";
        }
    }

    public void carpi (View view)
    {
        sayi_1_str = islem_ekrani_bir.getText().toString();
        if (!sayi_1_str.substring(sayi_1_str.length()-1,sayi_1_str.length()).equals("."))
        {
            islem_ekrani_uc.setText("*");
            ekran = "2";
        }
    }

    public void bolu (View view)
    {
        sayi_1_str = islem_ekrani_bir.getText().toString();
        if (!sayi_1_str.substring(sayi_1_str.length()-1,sayi_1_str.length()).equals("."))
        {
            islem_ekrani_uc.setText("/");
            ekran = "2";
        }
    }

    public void esittir (View view)
    {
        sayi_1_str = islem_ekrani_bir.getText().toString();
        sayi_2_str = islem_ekrani_iki.getText().toString();

        if (!sayi_1_str.equals("") && !sayi_2_str.equals(""))
        {
            sayi_1_f = Float.valueOf(sayi_1_str);
            sayi_2_f = Float.valueOf(sayi_2_str);

            islem_ekrani_uc_str = islem_ekrani_uc.getText().toString();
            if (islem_ekrani_uc_str == "+")
            {
                sonuc_f = sayi_1_f + sayi_2_f;
            }

            else if (islem_ekrani_uc_str == "-")
            {
                sonuc_f = sayi_1_f - sayi_2_f;
            }

            else if (islem_ekrani_uc_str == "*")
            {
                sonuc_f = sayi_1_f * sayi_2_f;
            }

            else if (islem_ekrani_uc_str == "/")
            {
                sonuc_f = sayi_1_f / sayi_2_f;
            }

            sonuc_str = String.valueOf(sonuc_f);

            if (sonuc_str.substring(sonuc_str.length()-2,sonuc_str.length()).equals(".0"))
            {
                sonuc_ekrani.setText("="+sonuc_str.substring(0,sonuc_str.length()-2));
            }
            else
            {
                sonuc_ekrani.setText("="+sonuc_str);
            }
        }
        else
        {
            Toast.makeText(getApplicationContext(),"Lütfen işlemi kontrol ediniz.", Toast.LENGTH_LONG).show();
        }
    }
}