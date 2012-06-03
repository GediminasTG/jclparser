package org.rlnieto.rutasCoruna.activities;

import org.rlnieto.rutasCoruna.R;
import org.rlnieto.rutasCoruna.R.id;
import org.rlnieto.rutasCoruna.R.layout;
import org.rlnieto.rutasCoruna.core.Updater;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.Toast;


public class ActividadPrincipal extends Activity{

	private Context contexto = null;
	private ImageButton btnRutas = null;
	private ImageButton btnConfiguracion = null;
	private ImageButton btnSalir = null;
	private ImageButton btnAcercaDe = null;
		
	@Override
	//-----------------------------------------------------------------------------------
	// Punto de entrada a la aplicación
	//-----------------------------------------------------------------------------------
	public void onCreate(Bundle savedInstanceState){
        
		// Comprobamos si hay que actualizar la bd
		Updater updater = new Updater(this);
		updater.actualizarBd();
		
		super.onCreate(savedInstanceState);
        setContentView(R.layout.pantalla_principal);

    	//Toast.makeText(getBaseContext(), "Thread activado", Toast.LENGTH_LONG).show();

        btnRutas = (ImageButton)findViewById(R.id.BtnRutas);
        btnConfiguracion = (ImageButton)findViewById(R.id.BtnConfiguracion);
        btnSalir = (ImageButton)findViewById(R.id.BtnSalir);
        btnAcercaDe = (ImageButton)findViewById(R.id.BtnAcercaDe);
        
        btnRutas.getBackground().setAlpha(185);
        btnConfiguracion.getBackground().setAlpha(185);
        btnSalir.getBackground().setAlpha(185);
        btnAcercaDe.getBackground().setAlpha(185);
        
        contexto = this;
       
        
        /**-------------------------------------------------------------------------
         * 
         * Listeners
         * 
         * 
         *---------------------------------------------------------------------------
         **/
        
        /**
         * Abre la actividad del mapa
         * 
         */
        btnRutas.setOnClickListener(new OnClickListener() {
			@Override
			public void onClick(View arg0) {

		    	Intent myIntent = new Intent(contexto, ActividadRutas.class);
				contexto.startActivity(myIntent);
			}
		});
        
        
        /**
         * Diálogo con datos de la empresa y accesos a facebook y twitter
         * 
         */
        btnAcercaDe.setOnClickListener(new OnClickListener() {
        	@Override
        	public void onClick(View arg0) {
        		Intent myIntent = new Intent(contexto, ActividadAcercaDe.class);
        		contexto.startActivity(myIntent);
        	
        	}
        	
        });
        
        /**
         * Cierra la aplicación
         *         
         */
        btnSalir.setOnClickListener(new OnClickListener(){
        	public void onClick(View arg0){
//        		finish();
        		Toast.makeText(getBaseContext(), "En construcción!!", Toast.LENGTH_SHORT).show();

        	}
        	
        });
        
        
        
        /**
         * Abre la pantalla de configuración
         * 
         */
        btnConfiguracion.setOnClickListener(new OnClickListener(){
        	
        	public void onClick(View arg0){
        		Toast.makeText(getBaseContext(), "En construcción!!", Toast.LENGTH_SHORT).show();
        		
        		//Intent myIntent = new Intent(contexto, ActividadRutas.class);
        		//contexto.startActivity(myIntent);
        	}
        });
        
        
	}        
}