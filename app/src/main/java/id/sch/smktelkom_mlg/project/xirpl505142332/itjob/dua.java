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
    Spinner spBakat;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_dua);

        Nama = (EditText) findViewById(R.id.editTextNama);
        Email = (EditText) findViewById(R.id.editTextEmail);
        Telp = (EditText) findViewById(R.id.editTextTelp);
        spBakat = (Spinner) findViewById(R.id.spinBakat);
        rgGender = (RadioGroup) findViewById(R.id.radioGroupGender);
        tvHasil = (TextView) findViewById(R.id.tvHasil);
        bOk = (Button) findViewById(R.id.bOK);

        bOk.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View view)
            {
                String nama = Nama.getText().toString();
                String email = Email.getText().toString();
                String telp = Telp.getText().toString();


                if (nama != null){
                    if(email != null){
                        if(telp != null){
                            if(rgGender.getCheckedRadioButtonId()== -1){
                                RadioButton rb = (RadioButton)
                                        findViewById(rgGender.getCheckedRadioButtonId());
                                tvHasil.setText(" Nama : " + nama
                                        + "Email : " + email
                                        + "Telp" + telp
                                        + "Gender anda " + rb.getText().toString());
                            }
                        }else {
                            Telp.setError("No Telepon belum diisi");
                        }
                    }else{
                        Email.setError("Email anda belum di isi");
                    }
                }else {
                    Nama.setError("Nama anda belum di isi");
                }
            }
        });
    }}