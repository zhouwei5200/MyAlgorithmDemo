package com.qkhl.myalgorithmdemo;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        MaoPao();
    }

    /**
     *   冒泡排序
     */
    private void MaoPao() {
        int socore[] = {67, 69, 75, 87, 89, 90, 99, 100};
        for(int i = 0;i<socore.length;i++){
            for(int j = 0 ;j<socore.length - i - 1;j++){
                if(socore[j] < socore[j+1]){
                    int temp = socore[j];
                    socore[j] = socore[j+1];
                    socore[j+1] = temp;
                }
            }
        }

    }
}
