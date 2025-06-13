package SpringFrameWork.Ex1;

import java.util.List;
import java.util.Map;

public class Book {
    
    int code;
    String name;
    double price;
    List<String> cityList;
    Map<String, Double> sales;

    public Map<String, Double> getSales() {
		return sales;
	}

	public void setSales(Map<String, Double> sales) {
		this.sales = sales;
	}

	public Book() {}

    

    public Book(int code, String name, double price, List<String> cityList, Map<String, Double> sales) {
		super();
		this.code = code;
		this.name = name;
		this.price = price;
		this.cityList = cityList;
		this.sales = sales;
	}

	public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public List<String> getCityList() {
        return cityList;
    }

    public void setCityList(List<String> cityList) {
        this.cityList = cityList;
    }

	@Override
	public String toString() {
		return "Book [code=" + code + ", name=" + name + ", price=" + price + ", cityList=" + cityList + ", sales="
				+ sales + "]";
	}

   
}
