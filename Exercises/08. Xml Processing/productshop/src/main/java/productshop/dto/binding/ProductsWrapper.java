package productshop.dto.binding;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import java.util.List;

@XmlRootElement(name = "products")
@XmlAccessorType(XmlAccessType.FIELD)
public class ProductsWrapper {

    @XmlElement(name = "product")
    private List<ProductCreateBindingModel> products;

    public ProductsWrapper() {
        //this.products = new ArrayList<>(); - needed?
    }

    public List<ProductCreateBindingModel> getProducts() {
        return products;
    }

    public void setProducts(List<ProductCreateBindingModel> products) {
        this.products = products;
    }
}
