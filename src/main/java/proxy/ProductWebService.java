
package proxy;

import java.util.List;
import jakarta.jws.WebMethod;
import jakarta.jws.WebParam;
import jakarta.jws.WebResult;
import jakarta.jws.WebService;
import jakarta.xml.bind.annotation.XmlSeeAlso;
import jakarta.xml.ws.Action;
import jakarta.xml.ws.RequestWrapper;
import jakarta.xml.ws.ResponseWrapper;


/**
 * This class was generated by the XML-WS Tools.
 * XML-WS Tools 4.0.3
 * Generated source version: 3.0
 * 
 */
@WebService(name = "ProductWebService", targetNamespace = "http://webservice.demo.example.com/")
@XmlSeeAlso({
    ObjectFactory.class
})
public interface ProductWebService {


    /**
     * 
     * @param arg0
     * @return
     *     returns proxy.Product
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "getProduct", targetNamespace = "http://webservice.demo.example.com/", className = "proxy.GetProduct")
    @ResponseWrapper(localName = "getProductResponse", targetNamespace = "http://webservice.demo.example.com/", className = "proxy.GetProductResponse")
    @Action(input = "http://webservice.demo.example.com/ProductWebService/getProductRequest", output = "http://webservice.demo.example.com/ProductWebService/getProductResponse")
    public Product getProduct(
        @WebParam(name = "arg0", targetNamespace = "")
        Integer arg0);

    /**
     * 
     * @return
     *     returns java.util.List<proxy.Product>
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "getAllProducts", targetNamespace = "http://webservice.demo.example.com/", className = "proxy.GetAllProducts")
    @ResponseWrapper(localName = "getAllProductsResponse", targetNamespace = "http://webservice.demo.example.com/", className = "proxy.GetAllProductsResponse")
    @Action(input = "http://webservice.demo.example.com/ProductWebService/getAllProductsRequest", output = "http://webservice.demo.example.com/ProductWebService/getAllProductsResponse")
    public List<Product> getAllProducts();

    /**
     * 
     * @param price
     * @return
     *     returns java.lang.Double
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "sellingPrice", targetNamespace = "http://webservice.demo.example.com/", className = "proxy.SellingPrice")
    @ResponseWrapper(localName = "sellingPriceResponse", targetNamespace = "http://webservice.demo.example.com/", className = "proxy.SellingPriceResponse")
    @Action(input = "http://webservice.demo.example.com/ProductWebService/sellingPriceRequest", output = "http://webservice.demo.example.com/ProductWebService/sellingPriceResponse")
    public Double sellingPrice(
        @WebParam(name = "Price", targetNamespace = "")
        Double price);

}