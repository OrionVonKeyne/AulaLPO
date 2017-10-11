package lp1_p1_gabarito;

import java.util.ArrayList;

public class Pessoa {
    // Questão 1, letra a) -------------------------
    String nome, endereco, telefone, dataNascimento;
    Pessoa pai, mae;
    ArrayList<Pessoa> filhos = new ArrayList<>();
    // FIM Questão 1, letra a) ---------------------
    
    // Questão 1, letra b) -------------------------
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public String getDataNascimento() {
        return dataNascimento;
    }

    public void setDataNascimento(String dataNascimento) {
        this.dataNascimento = dataNascimento;
    }

    public Pessoa getPai() {
        return pai;
    }

    public void setPai(Pessoa pai) {
        this.pai = pai;
    }

    public Pessoa getMae() {
        return mae;
    }

    public void setMae(Pessoa mae) {
        this.mae = mae;
    }

    public ArrayList<Pessoa> getFilhos() {
        return filhos;
    }

    public void setFilhos(ArrayList<Pessoa> filhos) {
        this.filhos = filhos;
    }
    // FIM Questão 1, letra b) ---------------------
    
    
    // Questão 1, letra c) -------------------------
    public void adicionarFilho(Pessoa f){
        filhos.add(f);
    }
    // FIM Questão 1, letra c) ---------------------
    
    
    // Questão 1, letra d) -------------------------
    @Override
    public String toString(){
        String saida;
        
        saida = "Nome: "+this.getNome()+"\n";
        saida += "Endereço: "+this.getEndereco()+"\n";
        saida += "Telefone: "+this.getTelefone()+"\n";
        saida += "Data de Nascimento: "+this.getDataNascimento()+"\n";
        saida += "Nome do Pai: "+this.pai.getNome()+"\n";
        saida += "Nome da Mãe: "+this.mae.getNome()+"\n";
        
        for (int i = 0; i < filhos.size(); i++) {
            saida += "Nome do Filho "+(i+1)+": "+filhos.get(i).getNome()+"\n";
        }
        
        return saida;
    }
    // FIM Questão 1, letra d) ---------------------
    
    
    
}
