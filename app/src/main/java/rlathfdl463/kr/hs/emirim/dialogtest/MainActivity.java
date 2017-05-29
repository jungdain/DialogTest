package rlathfdl463.kr.hs.emirim.dialogtest;

import android.content.DialogInterface;
import android.preference.DialogPreference;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{
    String[] itemArr={"최승철", "에스쿱스", "승행설", "쿱뜨"};
    Button butDialog;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        butDialog=(Button)findViewById(R.id.but_dialog);
        butDialog.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
        AlertDialog.Builder dialog=new AlertDialog.Builder(this);
        dialog.setTitle("첫번째 다이얼로그");
        dialog.setIcon(R.mipmap.ic_launcher);
//        dialog.setMessage("여기는 메시지를 쓰는 곳입니다.");
//단순목록
/*        dialog.setItems(itemArr, new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialogInterface, int i) {
                butDialog.setText(itemArr[i]);
            }
        });*/
//라디오 버튼 목록
/*        dialog.setSingleChoiceItems(itemArr, 0, new DialogInterface.OnClickListener(){
        @Override
        public void onClick(DialogInterface dialogInterface, int i) {
            butDialog.setText(itemArr[i]);
        }
    });*/
//      체크 박스 목록
//      선택 여부 배열
        boolean[] checkedItems={true, false, true, false};
        dialog.setMultiChoiceItems(itemArr, checkedItems, new DialogInterface.OnMultiChoiceClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int i, boolean b) {
                if(b)
                    butDialog.setText(itemArr[i]);
            }
        });

//        dialog.setPositiveButton("OK", null);
        dialog.show();
    }
}
