public class supermarket {
	
		    public static void main(String[] args) {
		        String[] products = {"nuts", "oils", "soaps", "otherproducts"};
		        int totalDiscount = 0;

		        for (String product : products) {
		            int discount = calculateDiscount(product);
		            totalDiscount += discount;
		            System.out.println("Discount for " + product + ": " + discount + "%");
		        }

		        System.out.println("Total discount for all products: " + totalDiscount + "%");
		    }

		    public static int calculateDiscount(String product) {
		        int discount = 0;

		        switch (product) {
		            case "nuts":
		                discount = 10;
		                break;
		            case "oils":
		                discount = 5;
		                break;
		            case "soaps":
		                discount = 12;
		                break;
		            case "otherproducts":
		                discount = 2;
		                break;
		        }

		        return discount;
		    }
}