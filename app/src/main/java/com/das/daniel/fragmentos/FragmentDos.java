package com.das.daniel.fragmentos;

import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;


public class FragmentDos extends Fragment {

    private OnFragmentInteractionListener mListener;
    Button _btnCalcular;
    EditText _et1, _et2;
    TextView _tvResultado;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View vista=inflater.inflate(R.layout.fragment_dos, container, false);
        Inicializar_Componentes(vista);
        return vista;
    }

    public interface OnFragmentInteractionListener {
        // TODO: Update argument type and name
        void onFragmentInteraction(Uri uri);
    }
    private void Inicializar_Componentes(View vista)
    {
        _btnCalcular=vista.findViewById(R.id.btnCalcular);
        _et1=vista.findViewById(R.id.etUno);
        _et2=vista.findViewById(R.id.etDos);
        _tvResultado=vista.findViewById(R.id.tvDos);

        _btnCalcular.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int resul= Integer.parseInt(_et1.getText().toString()) +  Integer.parseInt(_et2.getText().toString());
                _tvResultado.setText(resul+"");
            }
        });
    }
}
