package com.example.sachinshrestha.depttraining_sept12;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.example.sachinshrestha.depttraining_sept12.R;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

//    Teacher teacher1, teacher2;
//    HOD hodElx, hodEle;
//    MeroContructor meroContructor, meroContructor2;
//    PrivatePublicTest test1, test2;
//    List<String> arrayStringNaya = new ArrayList<>();
//
//    final static String TAG = "TAG_MAIN";
//    String[] arrayString = {"1", "two", "teen"};


    Button btnSignin;
    EditText etUsername, etPassword;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        etUsername = findViewById(R.id.etUsername);
        etPassword = findViewById(R.id.etPassword);
        btnSignin = findViewById(R.id.btnSignin);



        btnSignin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String username = etUsername.getText().toString();
                String password = etPassword.getText().toString();

                if(username.equals("s") && password.equals("s")) {
                    Toast.makeText(MainActivity.this, "Signed In", Toast.LENGTH_LONG).show();
                }
            }
        });


//        teacher1 = new Teacher(25,"Amit Shah","M","Elx");
//        teacher2 = new Teacher(38, "Kailash Karki","M","Elx");
//        hodEle = new HOD();
//        hodElx = new HOD();
//        meroContructor =  new MeroContructor();
//        meroContructor2 =  new MeroContructor(2,3);
//        test1 = new PrivatePublicTest();
//        test2 = new PrivatePublicTest();
//
//        test1.testos1 = "k rakhaum";
//        test1.SetTestos2("j pani rakhna sakxu");
//        String nikaloKuro = test1.GetTestos2();
//        Log.d(TAG,nikaloKuro);
//
//        hodEle.name = "Narayan Pd Acharya";
//        hodElx.name = "Rupesh D Shrestha";
//
//        arrayStringNaya.add("one");
//        arrayStringNaya.add("dui");
//        arrayStringNaya.add("3");
//        arrayStringNaya.add("3");
//        arrayStringNaya.add("3");
//        arrayStringNaya.add("6");
//        SabtypeLaihune(arrayStringNaya);
//
//        List<Integer> arrayInteger = new ArrayList<>();
//        arrayInteger.add(1);
//        arrayInteger.add(2);
//        arrayInteger.add(3);
//        arrayInteger.add(4);
//        SabtypeLaihune(arrayInteger);

//        for (int i=0;i<arrayString.length;i++){
//            Log.d(TAG,arrayString[i]);
//        }

//        for (String jarakheNiHunchha:arrayStringNaya){
//            Log.d(TAG,jarakheNiHunchha);
//        }

//        teacher1.name = "Amit Shah";
//        teacher1.age = 25;
//        teacher1.faculty = "sangharsha";
//        teacher1.sex = "M";

//        Log.d(TAG,"Age of" + teacher1.name + " is " + teacher1.age +
//                " who does " + teacher1.faculty + " and has sex " + teacher1.sex);
//        Log.d(TAG,"Age of" + teacher2.name + " is " + teacher2.age +
//                " who does " + teacher2.faculty + " and has sex " + teacher2.sex);
//
//        Teacher.college = "Nepal Engineering college";
//        teacher1.teaching();
//
//        int areaSquare = teacher1.FindArea(5);
//        int areaRect = teacher1.FindArea(5, 7);
//
//        Log.d(TAG,"Area of square is " + areaSquare);
//        Log.d(TAG,"Area of Rectangle is " + areaRect);
//
//        teacher1.salary();
//        hodElx.salary();
    }

//    private void DisplayData(List<String> jArrayNameBhayePaniHunxa){
//        for (String jarakheNiHunchha : jArrayNameBhayePaniHunxa){
//            Log.d(TAG,jarakheNiHunchha);
//        }
//    }
//
//    private void DisplayDataInteger(List<Integer> jArrayNameBhayePaniHunxa){
//        for (Integer intr : jArrayNameBhayePaniHunxa){
//            Log.d(TAG,"" + intr);
//        }
//    }

//    private void SabtypeLaihune(List<?> arrayName){
//        for (Object obj:arrayName){
//            Log.d(TAG,"" + obj);
//        }
//    }


}
