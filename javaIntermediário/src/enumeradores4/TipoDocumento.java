package enumeradores4;
//metodos abstratos
public enum TipoDocumento {
	CPF {
		@Override
		public String geraNumeroTeste() {
			return GeraCPFeCNPJ.cpf();
		}
	}, CNPFJ {
		@Override
		public String geraNumeroTeste() {
			return GeraCPFeCNPJ.cnpj();
		}
	};
	
	public abstract String geraNumeroTeste();
}