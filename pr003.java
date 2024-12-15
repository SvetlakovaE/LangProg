class Cars {
	int pass; // количества пассажиров
	int volume; // емкость бензобака
	double fuel; // расходж топлива на 100 км
	Cars(int p, int v, double f) { //констурктор класса
		pass = p;
		volume = v;
		fuel = f;
	}
	void range() {
		System.out.println("Растояние на полном баке: " + (volume/fuel*100));
	}

	double range2() {
		return volume/fuel*100;
	}

	double range3(int x) {
                return x/fuel*100;
        }
}
class pr003 {
	public static void main(String[] args) {
		Cars Honda = new Cars(2, 55, 20.0);
		//Honda.pass  = 2;
	       	//Honda.volume = 55;
		//Honda.fuel = 20.0;

		Cars BMW = new Cars(5, 40, 15.5);
		//BMW.pass = 5;
		//BMW.volume = 40;
		//BMW.fuel = 15.5;

		System.out.println("Параметры Хонды: ");
		System.out.println("Количество пассажиров: " + Honda.pass + " Объем бака: " + Honda.volume + " Расход топлива " + Honda.fuel);
	
		//double range;
		//range = Honda.volume/Honda.fuel*100;
		System.out.println("Хонда  проедет:");
		Honda.range();
		System.out.println("Для хонды: " + Honda.range2());
		
		System.out.println("БМВ ну такое себе, проедет: ");
		BMW.range();
		System.out.println("Для БМВ c 15 литрами: " + BMW.range3(15));
		
		
	}
}
