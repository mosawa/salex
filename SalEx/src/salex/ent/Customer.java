/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package salex.ent;

import java.io.Serializable;
import java.util.Collection;
import javax.persistence.Basic;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlTransient;

/**
 *
 * @author Thilina
 */
@Entity
@Table(name = "customer")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Customer.findAll", query = "SELECT c FROM Customer c"),
    @NamedQuery(name = "Customer.findByCode", query = "SELECT c FROM Customer c WHERE c.code = :code"),
    @NamedQuery(name = "Customer.findByName", query = "SELECT c FROM Customer c WHERE c.name = :name"),
    @NamedQuery(name = "Customer.findByAddressNumber", query = "SELECT c FROM Customer c WHERE c.addressNumber = :addressNumber"),
    @NamedQuery(name = "Customer.findByAddressStreet", query = "SELECT c FROM Customer c WHERE c.addressStreet = :addressStreet"),
    @NamedQuery(name = "Customer.findByCity", query = "SELECT c FROM Customer c WHERE c.city = :city"),
    @NamedQuery(name = "Customer.findByMobile", query = "SELECT c FROM Customer c WHERE c.mobile = :mobile"),
    @NamedQuery(name = "Customer.findByFixedLine", query = "SELECT c FROM Customer c WHERE c.fixedLine = :fixedLine"),
    @NamedQuery(name = "Customer.findByFax", query = "SELECT c FROM Customer c WHERE c.fax = :fax"),
    @NamedQuery(name = "Customer.findByNotes", query = "SELECT c FROM Customer c WHERE c.notes = :notes"),
    @NamedQuery(name = "Customer.findByOperator", query = "SELECT c FROM Customer c WHERE c.operator = :operator")})
public class Customer implements Serializable, Comparable<Customer> {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "code")
    private String code;
    @Column(name = "name")
    private String name;
    @Column(name = "addressNumber")
    private String addressNumber;
    @Column(name = "addressStreet")
    private String addressStreet;
    @Column(name = "city")
    private String city;
    @Column(name = "mobile")
    private String mobile;
    @Column(name = "fixedLine")
    private String fixedLine;
    @Column(name = "fax")
    private String fax;
    @Column(name = "notes")
    private String notes;
    @Column(name = "operator")
    private String operator;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "customer")
    private Collection<CanceledInvoice> canceledInvoiceCollection;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "customer")
    private Collection<SaleInvoice> saleInvoiceCollection;

    public Customer() {
    }

    public Customer(String code) {
        this.code = code;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddressNumber() {
        return addressNumber;
    }

    public void setAddressNumber(String addressNumber) {
        this.addressNumber = addressNumber;
    }

    public String getAddressStreet() {
        return addressStreet;
    }

    public void setAddressStreet(String addressStreet) {
        this.addressStreet = addressStreet;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getMobile() {
        return mobile;
    }

    public void setMobile(String mobile) {
        this.mobile = mobile;
    }

    public String getFixedLine() {
        return fixedLine;
    }

    public void setFixedLine(String fixedLine) {
        this.fixedLine = fixedLine;
    }

    public String getFax() {
        return fax;
    }

    public void setFax(String fax) {
        this.fax = fax;
    }

    public String getNotes() {
        return notes;
    }

    public void setNotes(String notes) {
        this.notes = notes;
    }

    public String getOperator() {
        return operator;
    }

    public void setOperator(String operator) {
        this.operator = operator;
    }

    @XmlTransient
    public Collection<CanceledInvoice> getCanceledInvoiceCollection() {
        return canceledInvoiceCollection;
    }

    public void setCanceledInvoiceCollection(Collection<CanceledInvoice> canceledInvoiceCollection) {
        this.canceledInvoiceCollection = canceledInvoiceCollection;
    }

    @XmlTransient
    public Collection<SaleInvoice> getSaleInvoiceCollection() {
        return saleInvoiceCollection;
    }

    public void setSaleInvoiceCollection(Collection<SaleInvoice> saleInvoiceCollection) {
        this.saleInvoiceCollection = saleInvoiceCollection;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (code != null ? code.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Customer)) {
            return false;
        }
        Customer other = (Customer) object;
        if ((this.code == null && other.code != null) || (this.code != null && !this.code.equals(other.code))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return code + " " + name;
    }

    @Override
    public int compareTo(Customer o) {
        return this.code.compareTo(o.code);
    }
}
