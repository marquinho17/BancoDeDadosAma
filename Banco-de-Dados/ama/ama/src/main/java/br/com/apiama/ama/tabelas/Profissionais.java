package br.com.apiama.ama.tabelas;

public abstract class Profissionais {
    //Atributos
  private int id;
  private String nome;
  private String profissão;
  private int telefone;
  private int cpf;
  private String rua;
  private String bairro;
  private String cidade;
  private String premium;
  private int numero;
  private float estrelas;
  private String imagem;

  //Construtor
  public Profissionais(int id, String nome, String profissão, int telefone, int cpf, String rua, String bairro, String cidade, String premium, int numero, float estrelas, String imagem){
    this.setId(id);
    this.setNome(nome);
    this.setProfissão(profissão);
    this.setTelefone(telefone);
    this.setCpf(cpf);
    this.setRua(rua);
    this.setBairro(bairro);
    this.setCidade(cidade);
    this.setPremium(premium);
    this.setNumero(numero);
    this.setEstrelas(estrelas);
    this.setImagem(imagem);
  }

  public Profissionais(){
    
  }

  //Metodos
  public int getId(){
    return id;
  }
  public void setId(int id){
    this.id = id;
  }

  public String getNome(){
    return nome;
  }
  public void setNome(String nome){
    this.nome = nome;
  }
  
  public String getProfissão(){
    return profissão;
  }
  public void setProfissão(String profissão){
    this.profissão = profissão;
  }

  public int getTelefone(){
    return telefone;
  }
  public void setTelefone(int telefone){
    this.telefone = telefone;
  }

  public int getCpf(){
    return cpf;
  }
  public void setCpf(int cpf){
    this.cpf = cpf;
  }

  public String getRua(){
    return rua;
  }
  public void setRua(String rua){
    this.rua = rua;
  }

  public String getBairro(){
    return bairro;
  }
  public void setBairro(String bairro){
    this.bairro = bairro;
  }

  public String getCidade(){
    return cidade;
  }
  public void setCidade(String cidade){
    this.cidade = cidade;
  }

    public String getPremium(){
      return premium;
    }
    public void setPremium(String premium){
      this.premium = premium;
    }

    public int getNumero(){
      return numero;
    }
    public void setNumero(int numero){
      this.numero = numero;
    }

    public float getEstrelas(){
      return estrelas;
    }
    public void setEstrelas(float estrelas){
      this.estrelas = estrelas;
    }

    public String getImagem(){
      return imagem;
    }
    public void setImagem(String imagem){
      this.imagem = imagem;
    }
}
