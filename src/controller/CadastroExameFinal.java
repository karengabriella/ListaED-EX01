package controller;
import javax.swing.JOptionPane;

public class CadastroExameFinal {
	
	private int tamanho;
	private String removido;
	private String nome;
	private String rg;
	private String telefone;
	private String datadenascimento;
    private String filadepessoas[];
    private String pilharemovidos[];
    private int topo;
	
	public CadastroExameFinal() {
		
		filadepessoas = new String [10];  //Criação de endereço para a Lista de Pessoas
		pilharemovidos = new String [10]; //Criação de endereço para a Lista de Pessoas
		topo = 0;
		tamanho = 0;
	}
	

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getRg() {
		return rg;
	}

	public void setRg(String rg) {
		this.rg = rg;
	}

	public String getTelefone() {
		return telefone;
	}

	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}

	public String getDatadenascimento() {
		return datadenascimento;
	}

	public void setDatadenascimento(String datadenascimento) {
		this.datadenascimento = datadenascimento;
	}
	
	
	   public void filaPessoas() {
	      
			 filadepessoas[tamanho] = inscricao(); 
		     tamanho += 1;
	
	   }			   
			   
	    public String inscricao() {
	    
	    	StringBuffer pessoa = new StringBuffer();
	    	
	    	pessoa.append("ID: " + Integer.toString(tamanho));
	    	pessoa.append("\n Nome: " + getNome());
	    	pessoa.append("\n RG: " + getRg());
	    	pessoa.append("\n Tel: " + getTelefone());
	    	pessoa.append("\n Nasc: " + getDatadenascimento());
	    	
	        return pessoa.toString();
	   
	    }
	    
	    public String removerpessoas() {
		      removido = filadepessoas[0];      
		      for(int i = 1; i<tamanho; i++) {
		    	filadepessoas[i-1] = filadepessoas[i]; 
		      }
		       filadepessoas[tamanho-1] = " ";
		       tamanho = tamanho-1;
		       
		     JOptionPane.showMessageDialog(null, removido);
			 return removido;
		 }
	    
	    public void ordemespera() {
	     JOptionPane.showMessageDialog(null, tamanho);
	    }
	    
	    public void pilharemovidos(String removido) {
	    	
	    	pilharemovidos[topo] = removido;
	    	topo += 1;
	    }
	  
	    public void exibirfiladepessoas() {
	    	
	    	for(int i = 0; i<tamanho; i++) {
	    	  System.out.println(filadepessoas[i]);
	    	}
	    }
	    
	    public boolean verificafilacheia() {
	      
	      if(tamanho == filadepessoas.length){
	    	return true;
	      }
	      else {
	    	  return false;
	      }
	    	
	    }
	    
	    public boolean verificafilavazia() {
	
	    	if(tamanho == 0){
		    	return true;
		      }
		      else {
		    	  return false;
		      }
	    }
	    
	    
 }    
	    	    
	  
	   
	

	
		


