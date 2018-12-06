package com.how2java.action;

import com.how2java.bean.Product;
import org.apache.struts2.convention.annotation.*;

@Namespace("/")
@ParentPackage("struts-default")
@Results({
        @Result(name = "show", location = "/show.jsp"),
        @Result(name = "home", location = "/index.jsp")
})
public class GoodsAction {
    private Product product;

    @Action("showGoods")
    public String show() {
        product = new Product();
        product.setName("goods iphone7");
        return "show";
    }

    public Product getProduct() {
        return product;
    }

    public void setProduct(Product product) {
        this.product = product;
    }

    @Action("home")
    public String home() {
        return "home";
    }
}
