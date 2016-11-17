package id.sch.smktelkom_mlg.project.xirpl505142332.itjob;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Spinner;
import android.widget.TextView;

public class dua extends AppCompatActivity {
    EditText Nama, Email, Telp;
    Button bOk;
    RadioGroup rgGender;
    TextView tvHasil;
    Spinner Bakat, Minat;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_dua);

        Nama = (EditText) findViewById(R.id.editTextNama);
        Email = (EditText) findViewById(R.id.editTextEmail);
        Telp = (EditText) findViewById(R.id.editTextTelp);
        Bakat = (Spinner) findViewById(R.id.spinBakat);
        Minat = (Spinner) findViewById(R.id.spinMinat);
        rgGender = (RadioGroup) findViewById(R.id.radioGroupGender);
        tvHasil = (TextView) findViewById(R.id.tvHasil);
        bOk = (Button) findViewById(R.id.bOK);

        findViewById(R.id.bOK).setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View view)
            {
                doClick();
            }
            private void doClick() {
                String hasil = null;

                if(rgGender.getCheckedRadioButtonId() != -1){
                    RadioButton rb = (RadioButton) findViewById(rgGender.getCheckedRadioButtonId());
                    hasil = rb.getText().toString();
                    if(hasil == null){
                        tvHasil.setText("Anda belum memilih gender");
                    }else{
                        tvHasil.setText("Gender anda " + hasil);
                    }
                }
            }
        });
        bOk.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (isValid()) ;


                String nama = Nama.getText().toString();
                String telepon = "\n\n Email anda:";
                int startlen = telepon.length();

                tvHasil.setText(
                        "\nNama Anda :" + Nama + Bakat.getSelectedItem().toString()
                                + "\n\nBakat Anda:" + Bakat);
            }
        });
    }

    private boolean isValid() {

        boolean valid = true;

        String email = Email.getText().toString();
        String Telepon = Telp.getText().toString();
        String nama = Nama.getText().toString();


        if (nama.isEmpty()) {
            Nama.setError("Nama Kosong");
            valid = false;
        } else if (nama.length() < 8) {
            Nama.setError("Minimal 8 Karakter");
            valid = false;
        } else {
            Nama.setError(null);
        }
        if (email.isEmpty()) {
            Email.setError("e-Mail Belum Diisi");
            valid = false;
        } else if (email.length() < 4) {
            Email.setError("Format Salah");
            valid = false;
        } else {
            Email.setError(null);
        }
        if (Telepon.isEmpty()) {
            Telp.setError("Kata Sandi Kosong");
            valid = false;
        } else if (Telp.length() < 8) {
            Telp.setError("Isi dengan benar");
            valid = false;
        }
        return valid;
    }


}

