public class TestDescuento {

    public static void main(String[] args) {

        double valorCompra = 350.0;
        double totalCompra = 0;
        double descuento = 0;
        if (valorCompra>100 && valorCompra<199) {
        	totalCompra= valorCompra*10/100;
        	descuento = 10;
        	System.out.println("Tiene el 10% de descuento. " + totalCompra);
        	
        }
        if (valorCompra>200 && valorCompra<299) {
        	totalCompra= valorCompra*15/100;
        	descuento = 15;
        	System.out.println("Tiene el 15% de descuento. " + totalCompra);
        }
        if (valorCompra>300) {
        	totalCompra= valorCompra*20/100; 
        	descuento = 20;
        	System.out.println("Tiene el 20% de descuento. " + totalCompra);
        }
        double valorFinal = valorCompra - (valorCompra * ( descuento / 100));

        System.out.println("Valor de la compra: $" + valorCompra);
        System.out.println("Valor final: $" + valorFinal);

    }
}