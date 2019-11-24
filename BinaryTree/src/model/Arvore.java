package model;

import java.util.ArrayList;

public class Arvore {

    private String[] vetor1 = {"", "", ""};
    private String[] vetor2 = {"", "", ""};
    private String[] vetor3 = {"", "", ""};
    private String[] vetor4 = {"", "", ""};
    private String[] vetor5 = {"", "", ""};
    private String[] vetor6 = {"", "", ""};
    private String[] vetor7 = {"", "", ""};
    private String raiz;
    private ArrayList<String> vetorCompleto;
    private ArrayList<String> vetorCompletoOrganizado;

    public Arvore() {
        raiz = vetor1[1];
        vetorCompleto = new ArrayList<>();
    }

    private void definirReferenciasVetor1() {
        vetor1[0] = vetor2[1];
        vetor1[2] = vetor3[1];
    }
    
    public ArrayList<String> getVetorCompletoOrganizado(){
        vetorCompletoOrganizado = new ArrayList<>();      
            vetorCompletoOrganizado.add(vetor1[1]);
            vetorCompletoOrganizado.add(vetor2[1]);
            vetorCompletoOrganizado.add(vetor3[1]);
            vetorCompletoOrganizado.add(vetor4[1]);
            vetorCompletoOrganizado.add(vetor5[1]);
            vetorCompletoOrganizado.add(vetor6[1]);
            vetorCompletoOrganizado.add(vetor7[1]);
            vetorCompletoOrganizado.add(vetor4[0]);
            vetorCompletoOrganizado.add(vetor4[2]);
            vetorCompletoOrganizado.add(vetor5[0]);
            vetorCompletoOrganizado.add(vetor5[2]);
            vetorCompletoOrganizado.add(vetor6[0]);
            vetorCompletoOrganizado.add(vetor6[2]);
            vetorCompletoOrganizado.add(vetor7[0]);
            vetorCompletoOrganizado.add(vetor7[2]);
        return vetorCompletoOrganizado;
    }

    private void definirReferenciasVetor2() {
        vetor2[0] = vetor4[1];
        vetor2[2] = vetor5[1];
    }

    private void definirReferenciasVetor3() {
        vetor3[0] = vetor6[1];
        vetor3[2] = vetor7[1];
    }

    private String converterParaString(double valor) {
        return String.valueOf(valor);
    }

    private double converterParaDouble(String vetor) {
        return Double.parseDouble(vetor);
    }

    public String inserirValor(double valor) {
        if (raiz.equals("")) {
            vetor1[1] = converterParaString(valor);
            raiz = vetor1[1];
            vetorCompleto.add(raiz);
            return valor + " Inserido com sucesso!";
        } else {
            if (guardarValorChamada1(valor)) {
                return valor + " Inserido com sucesso!";
            } else {
                return "Erro! " + valor + " Não Inserido.";
            }
        }
    }

    private boolean guardarValorChamada1(double valor) {
        if (valor < converterParaDouble(raiz)) {
            if (vetor1[0].equals("")) {
                vetor2[1] = converterParaString(valor);
                vetorCompleto.add(vetor2[1]);
                definirReferenciasVetor1();
                return true;
            } else {
                return guardarValorChamada2(valor);
            }

        } else {
            if (vetor1[2].equals("")) {
                vetor3[1] = converterParaString(valor);
                vetorCompleto.add(vetor3[1]);
                definirReferenciasVetor1();
                return true;
            } else {
                return guardarValorChamada2(valor);
            }
        }
    }

    private boolean guardarValorChamada2(double valor) {
        if (valor < converterParaDouble(raiz) && valor < converterParaDouble(vetor1[0]) && vetor2[0].equals("")) {
            vetor4[1] = converterParaString(valor);
            vetorCompleto.add(vetor4[1]);
            definirReferenciasVetor2();
            return true;
        }
        if (valor < converterParaDouble(raiz) && valor >= converterParaDouble(vetor1[0]) && vetor2[2].equals("")) {
            vetor5[1] = converterParaString(valor);
            vetorCompleto.add(vetor5[1]);
            definirReferenciasVetor2();
            return true;
        }

        if (valor > converterParaDouble(raiz) && valor < converterParaDouble(vetor1[2]) && vetor3[0].equals("")) {
            vetor6[1] = converterParaString(valor);
            vetorCompleto.add(vetor6[1]);
            definirReferenciasVetor3();
            return true;
        }
        if (valor > converterParaDouble(raiz) && valor >= converterParaDouble(vetor1[2]) && vetor3[2].equals("")) {
            vetor7[1] = converterParaString(valor);
            vetorCompleto.add(vetor7[1]);
            definirReferenciasVetor3();
            return true;
        } else {
            return guardarValorChamada3(valor);
        }
    }

    private boolean guardarValorChamada3(double valor) {
        if (!vetor2[0].equals("")) {
            if (valor < converterParaDouble(raiz) && valor < converterParaDouble(vetor1[0]) && valor < converterParaDouble(vetor2[0]) && vetor4[0].equals("")) {
                vetor4[0] = converterParaString(valor);
                vetorCompleto.add(vetor4[0]);
                definirReferenciasVetor2();
                return true;
            }
            if (valor < converterParaDouble(raiz) && valor < converterParaDouble(vetor1[0]) && valor >= converterParaDouble(vetor2[0]) && vetor4[2].equals("")) {
                vetor4[2] = converterParaString(valor);
                vetorCompleto.add(vetor4[2]);
                definirReferenciasVetor2();
                return true;
            }
        }
        if (!vetor2[2].equals("")) {
            if (valor < converterParaDouble(raiz) && valor > converterParaDouble(vetor1[0]) && valor < converterParaDouble(vetor2[2]) && vetor5[0].equals("")) {
                vetor5[0] = converterParaString(valor);
                vetorCompleto.add(vetor5[0]);
                definirReferenciasVetor2();
                return true;
            }
            if (valor < converterParaDouble(raiz) && valor > converterParaDouble(vetor1[0]) && valor >= converterParaDouble(vetor2[2]) && vetor5[2].equals("")) {
                vetor5[2] = converterParaString(valor);
                vetorCompleto.add(vetor5[2]);
                definirReferenciasVetor2();
                return true;
            }
        }
        if (!vetor3[0].equals("")) {
            if (valor > converterParaDouble(raiz) && valor < converterParaDouble(vetor1[2]) && valor < converterParaDouble(vetor3[0]) && vetor6[0].equals("")) {
                vetor6[0] = converterParaString(valor);
                vetorCompleto.add(vetor6[0]);
                return true;
            }
            if (valor > converterParaDouble(raiz) && valor < converterParaDouble(vetor1[2]) && valor >= converterParaDouble(vetor3[0]) && vetor6[2].equals("")) {
                vetor6[2] = converterParaString(valor);
                vetorCompleto.add(vetor6[2]);
                return true;
            }
        }
        if (!vetor3[2].equals("")) {
            if (valor > converterParaDouble(raiz) && valor > converterParaDouble(vetor1[2]) && valor < converterParaDouble(vetor3[2]) && vetor7[0].equals("")) {
                vetor7[0] = converterParaString(valor);
                vetorCompleto.add(vetor7[0]);
                return true;
            }
            if (valor > converterParaDouble(raiz) && valor > converterParaDouble(vetor1[2]) && valor >= converterParaDouble(vetor3[2]) && vetor7[2].equals("")) {
                vetor7[2] = converterParaString(valor);
                vetorCompleto.add(vetor7[2]);
                return true;
            }
        }
        return false;
    }

    private void limparVetores() {
        raiz = "";
        ///////////////
        vetor1[0] = "";
        vetor1[1] = "";
        vetor1[2] = "";
        ///////////////
        vetor2[0] = "";
        vetor2[1] = "";
        vetor2[2] = "";
        ///////////////
        vetor3[0] = "";
        vetor3[1] = "";
        vetor3[2] = "";
        ///////////////
        vetor4[0] = "";
        vetor4[1] = "";
        vetor4[2] = "";
        ///////////////
        vetor5[0] = "";
        vetor5[1] = "";
        vetor5[2] = "";
        ///////////////
        vetor6[0] = "";
        vetor6[1] = "";
        vetor6[2] = "";
        ///////////////
        vetor7[0] = "";
        vetor7[1] = "";
        vetor7[2] = "";
        ///////////////
    }

    private void limparVetorCompleto() {
        vetorCompleto = new ArrayList<>();
    }

    public boolean deletarValor(double valor) {
        ArrayList<String> listaSecundaria = new ArrayList<>();
        boolean removeu = false;
        if (!vetorCompleto.isEmpty()) {
            for (int i = 0; i < vetorCompleto.size(); i++) {
                if (vetorCompleto.get(i).equals(converterParaString(valor))) {
                    vetorCompleto.remove(i);
                    removeu = true;
                    break;
                }
            }

            for (int i = 0; i < vetorCompleto.size(); i++) {
                listaSecundaria.add(vetorCompleto.get(i));
            }

            limparVetorCompleto();
            limparVetores();

            for (int i = 0; i < listaSecundaria.size(); i++) {
                inserirValor(converterParaDouble(listaSecundaria.get(i)));
            }
            if (removeu) {
                return true;
            }
            return false;
        } else {
            return false;
        }
    }
}
