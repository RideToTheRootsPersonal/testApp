/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package ejb;

import java.io.Serializable;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

/**
 *back
 * @author rchakrab
 */
@Entity
public class RecordsEntity implements Serializable {
    private static final long serialVersionUID = 1L; 
    private String recordName;
    private String recordArtist;
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    public String getRecordName() {
        return recordName;
    }

    public void setRecordName(String recordName) {
        this.recordName = recordName;
    }

    public String getRecordArtist() {
        return recordArtist;
    }

    public void setRecordArtist(String recordArtist) {
        this.recordArtist = recordArtist;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (id != null ? id.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof RecordsEntity)) {
            return false;
        }
        RecordsEntity other = (RecordsEntity) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "ejb.RecordsEntity[ id=" + id + " ]";
    }
    
}
