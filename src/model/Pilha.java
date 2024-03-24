package model;

public class Pilha {

    No topo;
    public Pilha(){
        topo = null;
    }

    public boolean isEmpty(){
        if (topo == null){
            return true;
        }
        return false;
    }

    public void push(String e){
        No elemento= new No();
        elemento.dado = e;
        if (!isEmpty()) {
            elemento.proximo = topo;
        }
        topo = elemento;

    }
    public String pop() throws Exception {
        if (isEmpty()){
            throw new Exception("Não ha elementos para desempilhar");
        }
        String valor = topo.dado;
        topo = topo.proximo;
        return valor;
    }

    public String top() throws Exception {
        if (isEmpty()){
            throw new Exception("Não há elementos na pilha");
        }
        return topo.dado;
    }
    public int size(){
        int cont =0;
        if (!isEmpty()){
            No aux = topo;
            cont=1;
            while (aux.proximo != null){
                aux = aux.proximo;
                cont++;
            }
        }
        return cont;
    }

}
