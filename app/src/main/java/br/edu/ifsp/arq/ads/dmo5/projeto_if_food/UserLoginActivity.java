package br.edu.ifsp.arq.ads.dmo5.projeto_if_food;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import com.google.android.material.textfield.TextInputEditText;

public class UserLoginActivity extends AppCompatActivity {
    private Toolbar toolbar;
    private TextView txtTitle;

    private TextInputEditText txtEmail;
    private TextInputEditText txtSenha;
    private Button btnLogin;
    private Button btnNewUser;
    private TextView txtNewPassword;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_user_login);

        setToolBar();
        setComponentes();
        setBtnLogin();
        setBtnNewUser();

    }
    private void setToolBar() {
        toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        getSupportActionBar().setDisplayShowTitleEnabled(false);
        txtTitle = findViewById(R.id.toolbar_title);
        txtTitle.setText(getString(R.string.perfil_titulo));
    }

    private void setComponentes(){
        txtEmail =  findViewById(R.id.txt_inp_email);
        txtSenha =  findViewById(R.id.txt_inp_senha);
        btnLogin =  findViewById(R.id.btn_login);
        btnNewUser = findViewById(R.id.btn_new_user);
        txtNewPassword = findViewById(R.id.txt_new_password);
    }

    private void setBtnLogin() {
        btnLogin = findViewById(R.id.btn_login);
        btnLogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(UserLoginActivity.this,
                        MainActivity.class);
                startActivity(intent);
            }
        });
    }
    private void setBtnNewUser() {
        btnNewUser = findViewById(R.id.btn_new_user);
        btnNewUser.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(UserLoginActivity.this,
                        UserRegisterActivity.class);
                startActivity(intent);
            }
        });
    }



}