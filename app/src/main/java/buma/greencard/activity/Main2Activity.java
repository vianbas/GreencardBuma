package buma.greencard.activity;

import android.content.Intent;
import android.support.design.widget.TextInputEditText;
import android.support.design.widget.TextInputLayout;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RadioButton;

import buma.greencard.R;

public class Main2Activity extends AppCompatActivity {

    private TextInputEditText mKegiatan;
    private TextInputLayout mKegiatanLayout;

    private TextInputLayout mDetailLokasiLayout;
    private TextInputEditText mDetailLokasi;

    private Button mNext;
    private Button mBack;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        mKegiatan = (TextInputEditText) findViewById(R.id.tiet_kegiatan);

        mKegiatanLayout = (TextInputLayout) findViewById(R.id.til_kegiatan);

        setHint(mKegiatan, mKegiatanLayout, getString(R.string.contoh_kegiatan),
                getString(R.string.jenis_kegiatan_yang_diobservasi));

        mDetailLokasi = (TextInputEditText) findViewById(R.id.tiet_detail_lokasi);

        mDetailLokasiLayout = (TextInputLayout) findViewById(R.id.til_detail_lokasi);

        setHint(mDetailLokasi, mDetailLokasiLayout, getString(R.string.detail_lokasi_contoh),
                getString(R.string.detail_lokasi));

        mNext = (Button) findViewById(R.id.next_to_page3);
        mBack = (Button) findViewById(R.id.back_to_page1);

        mNext.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view) {
                Intent go = new Intent(view.getContext(),Main3Activity.class);
                startActivity(go);
            }
        });

        mBack.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view) {
                onBackPressed();
            }
        });


    }

    private void setHint(TextInputEditText ed, final TextInputLayout til,final String text1,
                         final String text2){
        ed.setOnFocusChangeListener(new View.OnFocusChangeListener() {
            @Override
            public void onFocusChange(View v, boolean hasFocus) {
                if (hasFocus) {
                    til.setHint(text1);
                } else {
                    til.setHint(text2);
                }
            }
        });
    }

    public void onRadioButtonClicked(View view) {
        boolean checked = ((RadioButton) view).isChecked();

        // Check which radio button was clicked
        switch(view.getId()) {
            case R.id.radio_AA:
                if (checked)

                    break;
            case R.id.radio_A:
                if (checked)

                    break;
            case R.id.radio_B:
                if (checked)

                    break;
            case R.id.radio_C:
                if (checked)

                    break;
        }
    }
}
