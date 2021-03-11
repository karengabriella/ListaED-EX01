package view;
import controller.CadastroExameFinal;
import javax.swing.JOptionPane;

public class Principal {
 public static void main(String[] args) {
	
    //Inst�ncia - Rela��o de Classe
	CadastroExameFinal cadastro = new CadastroExameFinal();

	int opc = 0;
	while(opc != 5) {
	   opc = Integer.parseInt(JOptionPane.showInputDialog("1 - Realizar Nova Inscri��o \n 2 - Verificar Posi��o na Fila \n 3 - Remover Incri��o \n 4 - Visualizar Fila \n 5 - Sair"));
	  switch (opc) {
	  case 1:
	    if(cadastro.verificafilacheia()) {
		   JOptionPane.showMessageDialog(null, "N�o � poss�vel realizar Inscri��o, Fila Cheia!");
	     }
	     else {
	       cadastro.setNome(JOptionPane.showInputDialog("Nome: "));
	       cadastro.setRg(JOptionPane.showInputDialog("RG: "));
           cadastro.setTelefone(JOptionPane.showInputDialog("Telefone: "));
	       cadastro.setDatadenascimento(JOptionPane.showInputDialog("Data de Nascimento: "));
	       cadastro.filaPessoas();	
	    }
	    break;
	  case 2:
		  cadastro.ordemespera();
		  break;
	  case 3:
		  if(cadastro.verificafilavazia()) {
			  JOptionPane.showMessageDialog(null, "N�o � poss�vel remover pessoas, Fila Vazia!");  
		  }
		  else {
		  cadastro.pilharemovidos(cadastro.removerpessoas());
		  }
		  break;
	  case 4:
		  cadastro.exibirfiladepessoas();
		  break;
	  case 5:
		 JOptionPane.showMessageDialog(null, "Saindo");
		 break;
	  default:
		  JOptionPane.showMessageDialog(null, "Op��o Invalida!");
		  break;
	        
	 }		
	}

 }	
}
