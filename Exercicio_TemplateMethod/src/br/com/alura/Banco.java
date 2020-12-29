package br.com.alura;

public class Banco {

  private final String nome;
  private final String endereco;
  private final String email;
  private final String telefone;

  public Banco(String nome, String endereco, String email, String telefone) {
    this.nome = nome;
    this.endereco = endereco;
    this.email = email;
    this.telefone = telefone;
  }

  public String getEmail() {
    return email;
  }

  public String getNome() {
    return nome;
  }

  public String getEndereco() {
    return endereco;
  }

  public String getTelefone() {
    return telefone;
  }

}
