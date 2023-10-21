import Interfaces.NavegadorInternet;
import Interfaces.ReprodutorMusical;

public class Iphone implements ReprodutorMusical, NavegadorInternet{
	private int imei;
	private String modelo;
	private int anoFabricacao;
	
	
	public Iphone(int imei, String modelo, int anoFabricacao) {
		super();
		this.imei = imei;
		this.modelo = modelo;
		this.anoFabricacao = anoFabricacao;
	}
	
	public int getImei() {
		return imei;
	}
	
	public void setImei(int imei) {
		this.imei = imei;
	}

	public String getModelo() {
		return modelo;
	}

	public void setModelo(String modelo) {
		this.modelo = modelo;
	}

	public int getAnoFabricacao() {
		return anoFabricacao;
	}

	public void setAnoFabricacao(int anoFabricacao) {
		this.anoFabricacao = anoFabricacao;
	}

	
	@Override
	public void exibirPagina(String url) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void adicionarAba(String url) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void atualizarPagina() {
		System.out.println("Página Atualizada");
		
	}

	@Override
	public void tocar() {
		System.out.println("...");
		
	}

	@Override
	public void pausar() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void selecionarMusica() {
		// TODO Auto-generated method stub
		
	}

}
