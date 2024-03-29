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
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
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
@Table(name = "employee")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Employee.findAll", query = "SELECT e FROM Employee e"),
    @NamedQuery(name = "Employee.findByCode", query = "SELECT e FROM Employee e WHERE e.code = :code"),
    @NamedQuery(name = "Employee.findByFirstName", query = "SELECT e FROM Employee e WHERE e.firstName = :firstName"),
    @NamedQuery(name = "Employee.findByLastName", query = "SELECT e FROM Employee e WHERE e.lastName = :lastName"),
    @NamedQuery(name = "Employee.findByAddressNumber", query = "SELECT e FROM Employee e WHERE e.addressNumber = :addressNumber"),
    @NamedQuery(name = "Employee.findByAddressStreet", query = "SELECT e FROM Employee e WHERE e.addressStreet = :addressStreet"),
    @NamedQuery(name = "Employee.findByCity", query = "SELECT e FROM Employee e WHERE e.city = :city"),
    @NamedQuery(name = "Employee.findByMobile", query = "SELECT e FROM Employee e WHERE e.mobile = :mobile"),
    @NamedQuery(name = "Employee.findByFixedLine", query = "SELECT e FROM Employee e WHERE e.fixedLine = :fixedLine"),
    @NamedQuery(name = "Employee.findByNotes", query = "SELECT e FROM Employee e WHERE e.notes = :notes"),
    @NamedQuery(name = "Employee.findBySource", query = "SELECT e FROM Employee e WHERE e.source = :source")})
public class Employee implements Serializable, Comparable<Employee> {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "code")
    private String code;
    @Column(name = "first_Name")
    private String firstName;
    @Column(name = "last_Name")
    private String lastName;
    @Column(name = "address_Number")
    private String addressNumber;
    @Column(name = "address_Street")
    private String addressStreet;
    @Column(name = "city")
    private String city;
    @Column(name = "Mobile")
    private String mobile;
    @Column(name = "Fixed_Line")
    private String fixedLine;
    @Column(name = "notes")
    private String notes;
    @Column(name = "source")
    private Integer source;
    @JoinTable(name = "employee_has_root_area", joinColumns = {
        @JoinColumn(name = "employee_code", referencedColumnName = "code")}, inverseJoinColumns = {
        @JoinColumn(name = "root_area_code", referencedColumnName = "code")})
    @ManyToMany
    private Collection<RootArea> rootAreaCollection;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "employee")
    private Collection<RepStockChange> repStockChangeCollection;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "employee")
    private Collection<StockTransfer> stockTransferCollection;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "employee")
    private Collection<SaleInvoice> saleInvoiceCollection;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "employee")
    private Collection<OperatorDeleted> operatorDeletedCollection;
    @JoinColumn(name = "employee_position_code", referencedColumnName = "code")
    @ManyToOne(optional = false)
    private EmployeePosition employeePosition;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "employee")
    private Collection<DamageNotes> damageNotesCollection;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "employee")
    private Collection<RepSale> repSaleCollection;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "employee")
    private Collection<Operator> operatorCollection;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "employee")
    private Collection<SrStock> srStockCollection;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "employee")
    private Collection<RepSaleValue> repSaleValueCollection;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "employee")
    private Collection<SrSalesPayments> srSalesPaymentsCollection;

    public Employee() {
    }

    public Employee(String code) {
        this.code = code;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
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

    public String getNotes() {
        return notes;
    }

    public void setNotes(String notes) {
        this.notes = notes;
    }

    public Integer getSource() {
        return source;
    }

    public void setSource(Integer source) {
        this.source = source;
    }

    @XmlTransient
    public Collection<RootArea> getRootAreaCollection() {
        return rootAreaCollection;
    }

    public void setRootAreaCollection(Collection<RootArea> rootAreaCollection) {
        this.rootAreaCollection = rootAreaCollection;
    }

    @XmlTransient
    public Collection<RepStockChange> getRepStockChangeCollection() {
        return repStockChangeCollection;
    }

    public void setRepStockChangeCollection(Collection<RepStockChange> repStockChangeCollection) {
        this.repStockChangeCollection = repStockChangeCollection;
    }

    @XmlTransient
    public Collection<StockTransfer> getStockTransferCollection() {
        return stockTransferCollection;
    }

    public void setStockTransferCollection(Collection<StockTransfer> stockTransferCollection) {
        this.stockTransferCollection = stockTransferCollection;
    }

    @XmlTransient
    public Collection<SaleInvoice> getSaleInvoiceCollection() {
        return saleInvoiceCollection;
    }

    public void setSaleInvoiceCollection(Collection<SaleInvoice> saleInvoiceCollection) {
        this.saleInvoiceCollection = saleInvoiceCollection;
    }

    @XmlTransient
    public Collection<OperatorDeleted> getOperatorDeletedCollection() {
        return operatorDeletedCollection;
    }

    public void setOperatorDeletedCollection(Collection<OperatorDeleted> operatorDeletedCollection) {
        this.operatorDeletedCollection = operatorDeletedCollection;
    }

    public EmployeePosition getEmployeePosition() {
        return employeePosition;
    }

    public void setEmployeePosition(EmployeePosition employeePosition) {
        this.employeePosition = employeePosition;
    }

    @XmlTransient
    public Collection<DamageNotes> getDamageNotesCollection() {
        return damageNotesCollection;
    }

    public void setDamageNotesCollection(Collection<DamageNotes> damageNotesCollection) {
        this.damageNotesCollection = damageNotesCollection;
    }

    @XmlTransient
    public Collection<RepSale> getRepSaleCollection() {
        return repSaleCollection;
    }

    public void setRepSaleCollection(Collection<RepSale> repSaleCollection) {
        this.repSaleCollection = repSaleCollection;
    }

    @XmlTransient
    public Collection<Operator> getOperatorCollection() {
        return operatorCollection;
    }

    public void setOperatorCollection(Collection<Operator> operatorCollection) {
        this.operatorCollection = operatorCollection;
    }

    @XmlTransient
    public Collection<SrStock> getSrStockCollection() {
        return srStockCollection;
    }

    public void setSrStockCollection(Collection<SrStock> srStockCollection) {
        this.srStockCollection = srStockCollection;
    }

    @XmlTransient
    public Collection<RepSaleValue> getRepSaleValueCollection() {
        return repSaleValueCollection;
    }

    public void setRepSaleValueCollection(Collection<RepSaleValue> repSaleValueCollection) {
        this.repSaleValueCollection = repSaleValueCollection;
    }

    @XmlTransient
    public Collection<SrSalesPayments> getSrSalesPaymentsCollection() {
        return srSalesPaymentsCollection;
    }

    public void setSrSalesPaymentsCollection(Collection<SrSalesPayments> srSalesPaymentsCollection) {
        this.srSalesPaymentsCollection = srSalesPaymentsCollection;
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
        if (!(object instanceof Employee)) {
            return false;
        }
        Employee other = (Employee) object;
        if ((this.code == null && other.code != null) || (this.code != null && !this.code.equals(other.code))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return firstName + " " + lastName;
    }

    @Override
    public int compareTo(Employee o) {
        return firstName.compareTo(o.firstName);
    }
}
