package com.how2java.action;

import com.how2java.bean.Category;
import com.how2java.bean.Product;
import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;
import org.apache.struts2.ServletActionContext;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class ProductAction extends ActionSupport {
    String name;
    String date;
    Product product;
    List<Product> products;
    List<Integer> selectedProducts;
    List<Category> categories;

//    @Override
//    public void validate() {
//        if(product.getName().length()==0){
//            addFieldError("product.name","name can't be empty.");
//        }
//    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String addPage() {
        name = "tang gao liang";
        return "addPage";
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public List<Category> getCategories() {
        return categories;
    }

    public void setCategories(List<Category> categories) {
        this.categories = categories;
    }

    public List<Integer> getSelectedProducts() {
        return selectedProducts;
    }

    public void setSelectedProducts(List<Integer> selectedProducts) {
        this.selectedProducts = selectedProducts;
    }

    public List<Product> getProducts() {
        return products;
    }


    public void setProducts(List<Product> products) {
        this.products = products;
    }

    public String add() {
        Map m = ActionContext.getContext().getSession();
        m.put("name", product.getName());
        return "show";
    }

    public String show() {
        HttpServletRequest request = ServletActionContext.getRequest();
        HttpServletResponse response = ServletActionContext.getResponse();

        System.out.println(request + "    " + response);
        product = new Product();
        product.setName("show 方法");
        return "show";
    }

    public Product getProduct() {
        return product;
    }

    public void setProduct(Product product) {
        this.product = product;
    }

    public String list() {
        Category category1 = new Category();
        category1.setId(1);
        category1.setName("category1");
        Category category2 = new Category();
        category2.setId(2);
        category2.setName("category2");
        categories = new ArrayList<>();
        categories.add(category1);
        categories.add(category2);
        products = new ArrayList<>();
        selectedProducts = new ArrayList<>();
        Product product1 = new Product();
        product1.setId(1);
        product1.setName("product 1");
        Product product2 = new Product();
        product2.setId(2);
        product2.setName("product 2");
        Product product3 = new Product();
        product3.setId(3);
        product3.setName("product 3");

        products.add(product1);
        products.add(product2);
        products.add(product3);

        category1.setProducts(products);
        category2.setProducts(products);

        selectedProducts.add(2);
        selectedProducts.add(3);
        return "list";
    }
}
