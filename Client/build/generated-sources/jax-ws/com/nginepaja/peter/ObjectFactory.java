
package com.nginepaja.peter;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the com.nginepaja.peter package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {

    private final static QName _CekLogin_QNAME = new QName("http://peter.nginepaja.com/", "cekLogin");
    private final static QName _RegisterResponse_QNAME = new QName("http://peter.nginepaja.com/", "registerResponse");
    private final static QName _CekLoginResponse_QNAME = new QName("http://peter.nginepaja.com/", "cekLoginResponse");
    private final static QName _CekPinResponse_QNAME = new QName("http://peter.nginepaja.com/", "cekPinResponse");
    private final static QName _Register_QNAME = new QName("http://peter.nginepaja.com/", "register");
    private final static QName _CekPin_QNAME = new QName("http://peter.nginepaja.com/", "cekPin");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: com.nginepaja.peter
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link CekLogin }
     * 
     */
    public CekLogin createCekLogin() {
        return new CekLogin();
    }

    /**
     * Create an instance of {@link RegisterResponse }
     * 
     */
    public RegisterResponse createRegisterResponse() {
        return new RegisterResponse();
    }

    /**
     * Create an instance of {@link CekLoginResponse }
     * 
     */
    public CekLoginResponse createCekLoginResponse() {
        return new CekLoginResponse();
    }

    /**
     * Create an instance of {@link CekPinResponse }
     * 
     */
    public CekPinResponse createCekPinResponse() {
        return new CekPinResponse();
    }

    /**
     * Create an instance of {@link CekPin }
     * 
     */
    public CekPin createCekPin() {
        return new CekPin();
    }

    /**
     * Create an instance of {@link Register }
     * 
     */
    public Register createRegister() {
        return new Register();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CekLogin }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://peter.nginepaja.com/", name = "cekLogin")
    public JAXBElement<CekLogin> createCekLogin(CekLogin value) {
        return new JAXBElement<CekLogin>(_CekLogin_QNAME, CekLogin.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RegisterResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://peter.nginepaja.com/", name = "registerResponse")
    public JAXBElement<RegisterResponse> createRegisterResponse(RegisterResponse value) {
        return new JAXBElement<RegisterResponse>(_RegisterResponse_QNAME, RegisterResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CekLoginResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://peter.nginepaja.com/", name = "cekLoginResponse")
    public JAXBElement<CekLoginResponse> createCekLoginResponse(CekLoginResponse value) {
        return new JAXBElement<CekLoginResponse>(_CekLoginResponse_QNAME, CekLoginResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CekPinResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://peter.nginepaja.com/", name = "cekPinResponse")
    public JAXBElement<CekPinResponse> createCekPinResponse(CekPinResponse value) {
        return new JAXBElement<CekPinResponse>(_CekPinResponse_QNAME, CekPinResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Register }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://peter.nginepaja.com/", name = "register")
    public JAXBElement<Register> createRegister(Register value) {
        return new JAXBElement<Register>(_Register_QNAME, Register.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CekPin }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://peter.nginepaja.com/", name = "cekPin")
    public JAXBElement<CekPin> createCekPin(CekPin value) {
        return new JAXBElement<CekPin>(_CekPin_QNAME, CekPin.class, null, value);
    }

}
