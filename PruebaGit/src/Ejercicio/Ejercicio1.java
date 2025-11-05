package Ejercicio;

public class Ejercicio1 {
	public static void main(String[] args) {
		Worker worker1 = new Worker("Sofia", 19, "practicas");
        Worker worker2 = new Worker("Rodrigo", 21, "gerente");
        Worker worker3 = new Worker("Juan Carlos", 20, "tecnico");
        
        System.out.println("El trabajador " + worker1.getName() + " de edad " + worker1.getAge() + " con el puesto de " + 
                worker1.getJob());
        System.out.println("El trabajador " + worker2.getName() + " de edad " + worker2.getAge() + " con el puesto de " + 
                worker2.getJob());
        System.out.println("El trabajador " + worker3.getName() + " de edad " + worker3.getAge() + " con el puesto de " + 
                worker3.getJob());
	}
}
