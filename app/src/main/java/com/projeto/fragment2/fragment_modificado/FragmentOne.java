package com.projeto.fragment2.fragment_modificado;

import android.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import com.github.rtoshiro.util.format.SimpleMaskFormatter;
import com.github.rtoshiro.util.format.text.MaskTextWatcher;

public class FragmentOne extends Fragment{

    private EditText notas;
    private Button botao;
    private TextView texto;

    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        // código abaixo faz com que possamos pegar os elementos da tela.
        View view = inflater.inflate(R.layout.fragment_one, container, false);

        notas = (EditText) view.findViewById(R.id.edit_nota);
        botao = (Button) view.findViewById(R.id.bt_cal);
        texto = (TextView) view.findViewById(R.id.text_nota_cal);



        SimpleMaskFormatter smf = new SimpleMaskFormatter("N.N");
        MaskTextWatcher mtw = new MaskTextWatcher(notas,smf);
        notas.addTextChangedListener(mtw);



/*

        botao.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                // Irá verificar
                if (notas.getText().toString().isEmpty()) {
                    Toast.makeText(getContext(), "Campo vazio!", Toast.LENGTH_SHORT).show();
                } else {

                    texto.setBackground(null);
                    texto.setText("teste");

                }


            }
        });


*/
        return view;



    }

}

