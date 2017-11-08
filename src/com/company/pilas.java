package com.company;

/**
 * Created by LCPA-05 on 08/11/2017.
 */
public class pilas {
    private  nodo top;

    public pilas() {
        top = null;
    }
    public boolean vacia(){
        return  (top==null);
    }
    public  void  push (int valor){//insertar
        nodo nuevoNodo;
        if (vacia()){
            top=new nodo (valor);
        }else{
            nuevoNodo= new nodo (valor);
            nuevoNodo.setProx(top);
            top= nuevoNodo;
        }
    }
    public void cima(){//buscar
        if (!vacia()){
            System.out.println("Cima: "+top.getValor());
        }else {
            System.out.println("La pila esta vacia");
        }
    }
    public  void pop(){//extraer
        if (!vacia()){
            System.out.println("Dato extraido: "+top.getValor());
            top = top.getProx();
        }else{
            System.out.println("La pila esta vacia");
        }
    }
    public void peek (){//mostrar
    nodo temp = top;
    if(temp!=null){
        System.out.println("La pila es: ");
        while(temp!=null){
            System.out.println(temp.getValor());
            temp=temp.getProx();
        }
    }else{
        System.out.println("Pila vacia.");
    }
    }
}
