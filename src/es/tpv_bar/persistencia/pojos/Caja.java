package es.tpv_bar.persistencia.pojos;
// Generated 09-jun-2012 17:46:57 by Hibernate Tools 3.2.1.GA


import java.util.Date;
import java.util.HashSet;
import java.util.Set;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import static javax.persistence.GenerationType.IDENTITY;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 * Caja generated by hbm2java
 */
@Entity
@Table(name="caja"
    ,catalog="mydb"
)
public class Caja  implements java.io.Serializable {


     private Integer idCaja;
     private Camarero camarero;
     private Cabezera cabezera;
     private Date fecha;
     private double movimiento;
     private double saldo;
     private String descripcion;
     private int cajaPago;
     private Set<Arqueos> arqueoses = new HashSet<Arqueos>(0);

    public Caja() {
    }

	
    public Caja(Camarero camarero, Date fecha, double movimiento, double saldo, int cajaPago) {
        this.camarero = camarero;
        this.fecha = fecha;
        this.movimiento = movimiento;
        this.saldo = saldo;
        this.cajaPago = cajaPago;
    }
    public Caja(Camarero camarero, Cabezera cabezera, Date fecha, double movimiento, double saldo, String descripcion, int cajaPago, Set<Arqueos> arqueoses) {
       this.camarero = camarero;
       this.cabezera = cabezera;
       this.fecha = fecha;
       this.movimiento = movimiento;
       this.saldo = saldo;
       this.descripcion = descripcion;
       this.cajaPago = cajaPago;
       this.arqueoses = arqueoses;
    }
   
     @Id @GeneratedValue(strategy=IDENTITY)
    
    @Column(name="idCaja", unique=true, nullable=false)
    public Integer getIdCaja() {
        return this.idCaja;
    }
    
    public void setIdCaja(Integer idCaja) {
        this.idCaja = idCaja;
    }
@ManyToOne(fetch=FetchType.LAZY)
    @JoinColumn(name="IdCamarero", nullable=false)
    public Camarero getCamarero() {
        return this.camarero;
    }
    
    public void setCamarero(Camarero camarero) {
        this.camarero = camarero;
    }
@ManyToOne(fetch=FetchType.LAZY)
    @JoinColumn(name="IdCabezera")
    public Cabezera getCabezera() {
        return this.cabezera;
    }
    
    public void setCabezera(Cabezera cabezera) {
        this.cabezera = cabezera;
    }
    @Temporal(TemporalType.TIMESTAMP)
    @Column(name="fecha", nullable=false, length=19)
    public Date getFecha() {
        return this.fecha;
    }
    
    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }
    
    @Column(name="movimiento", nullable=false, precision=22, scale=0)
    public double getMovimiento() {
        return this.movimiento;
    }
    
    public void setMovimiento(double movimiento) {
        this.movimiento = movimiento;
    }
    
    @Column(name="saldo", nullable=false, precision=22, scale=0)
    public double getSaldo() {
        return this.saldo;
    }
    
    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }
    
    @Column(name="descripcion")
    public String getDescripcion() {
        return this.descripcion;
    }
    
    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }
    
    @Column(name="cajaPago", nullable=false)
    public int getCajaPago() {
        return this.cajaPago;
    }
    
    public void setCajaPago(int cajaPago) {
        this.cajaPago = cajaPago;
    }
@OneToMany(cascade=CascadeType.ALL, fetch=FetchType.LAZY, mappedBy="caja")
    public Set<Arqueos> getArqueoses() {
        return this.arqueoses;
    }
    
    public void setArqueoses(Set<Arqueos> arqueoses) {
        this.arqueoses = arqueoses;
    }




}

