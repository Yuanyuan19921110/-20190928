package lesson20;

import java.sql.Date;

public class ProductBean {
			private  int id;
			private String Product_name;
			private double Price;
			private Date onboard_date;
			public int getId() {
				return id;
			}
			public void setId(int id) {
				this.id = id;
			}
			public String getProduct_name() {
				return Product_name;
			}
			public void setProduct_name(String product_name) {
				Product_name = product_name;
			}
			
			public double getPrice() {
				return Price;
			}
			public void setPrice(double price) {
				Price = price;
			}
			public Date getOnboard_date() {
				return onboard_date;
			}
			public void setOnboard_date(Date onboard_date) {
				this.onboard_date = onboard_date;
			}
			

	}


