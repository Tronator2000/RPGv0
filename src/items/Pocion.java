package items;

public class Pocion extends Consumible{
	
	private TipoEfecto efecto;
	private int cantidad;

	public Pocion(String name, String descripcion, TipoEfecto efecto) {
		super(name, descripcion);
		this.efecto = efecto;
		this.cantidad = cantidad;
	}
	
	public TipoEfecto getEffect() {
		return efecto;
	}
	
	public int 
}
