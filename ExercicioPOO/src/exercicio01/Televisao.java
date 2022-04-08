package exercicio01;

public class Televisao {

	private int volume = 10;
	private int canal = 1;

	public Televisao() {
	}

	public Televisao(int volume, int canal) {
		this.volume = volume;
		this.canal = canal;
	}

	public int getVolume() {
		return volume;
	}

	public void setVolume(int volume) {
		this.volume = volume;
	}

	public int getCanal() {
		return canal;
	}

	public void setCanal(int canal) {
		this.canal = canal;
	}

	public void aumentarVolume() {
		if (this.volume < 100)
			this.volume++;
		System.out.println("Volume " + this.volume);
	}

	public void diminuirVolume() {
		if (this.volume > 0)
			this.volume--;
		System.out.println("Volume " + this.volume);
	}

	public void aumentarCanal() {
		if (this.canal < 100)
			this.canal++;
		else
			this.canal = 1;
		System.out.println("Canal " + this.canal);
	}

	public void diminuirCanal() {
		if (this.canal > 1)
			this.canal--;
		System.out.println("Canal " + this.canal);
	}

	public void irParaCanal(int canal) {
		this.canal = canal;
		System.out.println("Canal " + this.canal);
	}

	@Override
	public String toString() {
		return "Televisao{" + "volume=" + volume + ", canal=" + canal + '}';
	}
}
