package util;

import java.util.ArrayList;
import tipos.Pessoa;

public class GerenciaPessoa {
    private ArrayList<Pessoa> pessoas;

    public GerenciaPessoa() {
        pessoas = new ArrayList<>();
    }

    public void adicionar(Pessoa p) {
        pessoas.add(p);
    }

    public String exibir(int codigo) {
        for (int i = 0; i < pessoas.size(); i++) {
            if (pessoas.get(i).getCodigo() == codigo) {
                return pessoas.get(i).toString();
            }
        }
        return "N�o encontrado";
    }

    public boolean alterarTelefone(int codigo, String novoTelefone) {
        for (int i = 0; i < pessoas.size(); i++) {
            if (pessoas.get(i).getCodigo() == codigo) {
                pessoas.get(i).setTelefone(novoTelefone);
                ;
                return true;
            }
        }
        return false;
    }

    private int posicao(int codigo) {
        for (int i = 0; i < pessoas.size(); i++) {
            if (pessoas.get(i).getCodigo() == codigo) {
                return i;
            }
        }
        return -1; // retorna -1 se n�o achou
    }

    public boolean remover(int codigo) {
        int posicao = posicao(codigo);
        if (posicao >= 0) { // se achou
            if (pessoas.remove(posicao) != null) {
                return true;
            }
        }
        return false;
    }
}
