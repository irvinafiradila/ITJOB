package id.sch.smktelkom_mlg.project.xirpl505142332.itjob;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;

public class dua extends AppCompatActivity {
    EditText Nama, Email, Telp;
    Button bOk;
    RadioButton rbPria, rbWanita;
    RadioGroup rgGender;
    TextView tvHasil;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_dua);

        Nama = (EditText) findViewById(R.id.editTextNama);
        Email = (EditText) findViewById(R.id.editTextEmail);
        Telp = (EditText) findViewById(R.id.editTextTelp);
        rbPria = (RadioButton) findViewById(R.id.Pria);
        rbWanita = (RadioButton) findViewById(R.id.Wanita);
        rgGender = (RadioGroup) findViewById(R.id.radioGroupGender);
        tvHasil = (TextView) findViewById(R.id.tvHasil);
        bOk = (Button) findViewById(R.id.bOK);

        bOk.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                doProcess();
                startActivity(new Intent("com.wew.ltiga"));
            }
        });
    }

    private void doProcess() {
        if (isValid()) {
            String nama = Nama.getText().toString();
            String email = Email.getText().toString();
            String telp = Telp.getText().toString();
        }


    }

    private boolean isValid() {

        boolean valid = true;

        String nama = Nama.getText().toString();
        String email = Email.getText().toString();
        String telp = Telp.getText().toString();

        if (nama.isEmpty()) {
            Nama.setError("Nama Belum Diisi");
            valid = false;
        } else {
            Nama.setError(null);
            }
        if (email.isEmpty()) {
            Email.setError("Email Belum Diisi");
            valid = false;
        } else {
            Email.setError(null);
        }
        if (telp.isEmpty()) {
            Telp.setError("Nomer Telepon Belum Diisi");
            valid = false;
        } else {
            Telp.setError(null);
        }


        return valid;
    }
}
