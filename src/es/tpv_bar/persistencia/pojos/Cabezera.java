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
 * Cabezera generated by hbm2java
 */
@Entity
@Table(name="cabezera"
    ,catalog="mydb"
)
public class Cabezera  implements java.io.Serializable {


     private Integer idCabezera;
     private Camarero camarero;
     private Double total;
     private Integer estado;
     private Date fecha;
     private int cod;
     private Set<Caja> cajas = new HashSet<Caja>(0);
     private Set<Linea> lineas = new HashSet<Linea>(0);

    public Cabezera() {
    }

	
    public Cabezera(Camarero camarero, int cod) {
        this.camarero = camarero;
        this.cod = cod;
    }
    public Cabezera(Camarero camarero, Double total, Integer estado, Date fecha, int cod, Set<Caja> cajas, Set<Linea> lineas) {
       this.camarero = camarero;
       this.total = total;
       this.estado = estado;
       this.fecha = fecha;
       this.cod = cod;
       this.cajas = cajas;
       this.lineas = lineas;
    }
   
     @Id @GeneratedValue(strategy=IDENTITY)
    
    @Column(name="IdCabezera", unique=true, nullable=false)
    public Integer getIdCabezera() {
        return this.idCabezera;
    }
    
    public void setIdCabezera(Integer idCabezera) {
        this.idCabezera = idCabezera;
    }
@ManyToOne(fetch=FetchType.LAZY)
    @JoinColumn(name="IdCamarero", nullable=false)
    public Camarero getCamarero() {
        return this.camarero;
    }
    
    public void setCamarero(Camarero camarero) {
        this.camarero = camarero;
    }
    
    @Column(name="Total", precision=22, scale=0)
    public Double getTotal() {
        return this.total;
    }
    
    public void setTotal(Double total) {
        this.total = total;
    }
    
    @Column(name="Estado")
    public Integer getEstado() {
        return this.estado;
    }
    
    public void setEstado(Integer estado) {
        this.estado = estado;
    }
    @Temporal(TemporalType.TIMESTAMP)
    @Column(name="Fecha", length=19)
    public Date getFecha() {
        return this.fecha;
    }
    
    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }
    
    @Column(name="cod", nullable=false)
    public int getCod() {
        return this.cod;
    }
    
    public void setCod(int cod) {
        this.cod = cod;
    }
@OneToMany(cascade=CascadeType.ALL, fetch=FetchType.LAZY, mappedBy="cabezera")
    public Set<Caja> getCajas() {
        return this.cajas;
    }
    
    public void setCajas(Set<Caja> cajas) {
        this.cajas = cajas;
    }
@OneToMany(cascade=CascadeType.ALL, fetch=FetchType.LAZY, mappedBy="cabezera")
    public Set<Linea> getLineas() {
        return this.lineas;
    }
    
    public void setLineas(Set<Linea> lineas) {
        this.lineas = lineas;
    }




}

