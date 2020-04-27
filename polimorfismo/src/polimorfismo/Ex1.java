package polimorfismo;

/*
 * Crie uma agenda de contatos. Nessa agenda, contatos podem ser adicionados, removidos, ou pesquisados por nome ou por CPF/CNPJ.
 *  Deve ser possível, também, visualizar todos os contatos da agenda.Dois tipos de contatos podem fazer parte da agenda: pessoa física e 
 *  pessoa jurídica. A pessao física tem os seguintes atributos: CPF, nome, endereço, data de nascimento, email, estado civil, 
 *  outros quevocê achar necessários.
 *  A pessoa jurídica possui: CNPJ, nome, endereço, email, inscrição estadual, razão social, outros que você achar necessários.
 * */

public class Ex1 {
	public String Nome;
	public String Endereco;
	public String Email;
	
}


public class Pessoa extends Ex1{
	public int Cpf;
	public int DataNascimento;
	public String EstadoCivil;
	
}


public class Empresa extends Ex1{
	public int Cnpj;
	public int InscricaoEstadual;
	public int RazaoSocial;
		
}

