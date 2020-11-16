
public class barra {

    public static void main(String[] args) {
        
        presentacion pre = new presentacion();
        pre.setVisible(true);
        ventana1 iniciar = new ventana1();
        int p2=0, p3=0, p4=0, p5=0;
        
        try{
            for(int i=0; i<=100; i++){
                Thread.sleep(100);
                
                pre.porcentaje1.setText(Integer.toString(i)+"%");
                pre.barra.setValue(i);
                
                if(p2 <100){
                    pre.porcentaje2.setText(Integer.toString(p2+2)+"%");
                    pre.barra2.setValue(p2+2);
                    p2 = p2+2;
                }
                
                if(p3 <100){
                    pre.porcentaje3.setText(Integer.toString(p3+3)+"%");
                    pre.barra3.setValue(p3+3);
                    if(p3 == 99){
                        pre.porcentaje3.setText(Integer.toString(100)+"%");
                        pre.barra3.setValue(100);
                    }
                    p3 = p3+3;
                }
                
                if(p4 <100){
                    pre.porcentaje4.setText(Integer.toString(p4+4)+"%");
                    pre.barra4.setValue(p4+4);
                    p4 = p4+4;
                }
                
                if(p5 <100){
                    pre.porcentaje5.setText(Integer.toString(p5+5)+"%");
                    pre.barra5.setValue(p5+5);
                    p5 = p5+5;
                }
                
                /*if(i==100){
                    pre.setVisible(false);
                    iniciar.setVisible(true);
                }*/
            }
        }catch (Exception e){
        }
    }
}