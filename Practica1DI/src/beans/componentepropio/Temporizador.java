/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package beans.componentepropio;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import java.util.TimerTask;
import javax.swing.JLabel;
import javax.swing.Timer;

/**
 *
 * @author adolfolaviana
 */
public class Temporizador extends JLabel implements Serializable{
    private int numSegundos;
    private int contador;
    
    //Eventos
    private List<TemporizadorListener> temporizadorListener;
    
    public Temporizador()
    {
        temporizadorListener = new ArrayList<>();
    }

    public int getNumSegundos()
    {
        return numSegundos;
    }

    public void setNumSegundos(int numSegundos)
    {
        this.numSegundos = numSegundos;
        setText(Integer.toString(numSegundos));
       // cuentaAtras();
    }
    
    public void addTemporizadorListener(TemporizadorListener l)
    {
        this.temporizadorListener.add(l);
    }
    
   /*private void cuentaAtras()
    {
        contador = numSegundos;
        Timer timer = new Timer();
        timer.schedule(new TimerTask() {
            @Override
            public void run()
            {
                if (contador>=0)
                {
                    setText(Integer.toString(contador--));
                }
                else
                {
                    //Llamada al evento
                    for (TemporizadorListener l : temporizadorListener)
                        l.finCuentaAtras();
                    
                    this.cancel();
                }
            }
        }, 0, 1000);
    }*/
    
    
}
