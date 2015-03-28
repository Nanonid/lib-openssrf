package us.gov.dod.standard.ssrf._3_1.receiver;

import us.gov.dod.standard.ssrf._3_1.adapter.*;
import us.gov.dod.standard.ssrf._3_1.adapter.types.*;
import us.gov.dod.standard.ssrf._3_1.metadata.domains.*;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;
import java.util.Calendar;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.XmlValue;

/**
Installation identifies the specific platforms on which an equipment is installed, whether it is mounted at a fixed site atop a mountain, in a shelter, in a vehicle, aboard a helicopter, etc.

Element of {@link Deployment}

Example: <pre>
* &lt;Installation cls="U"&gt;C-130 aircraft&lt;/Installation&gt;
* &lt;Installation cls="U"&gt;carried by military police&lt;/Installation&gt;
</pre>
@author Key Bridge LLC <developer@keybridge.ch>
@version 3.1.0, 03/27/2015
*/
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Installation", propOrder = {
    "value"
})
public class Installation {

    @XmlValue
      private  String value;
/**
cls - Classification (Required) 

The classification of the current data item. This attribute is REQUIRED on each data item, even if the classification is "U".

Format is L:CCL
@since 3.1.0
*/
    @XmlAttribute(name = "cls", required = true)
      private  ListCCL cls;
/**
remarks - Links to Data Item Remarks (Optional) 

A list of Common/Remarks idx values applicable to the current data item.

Format is List of UN6
@since 3.1.0
*/
    @XmlAttribute(name = "remarks")
      private  Set<BigInteger> remarks;
/**
extReferences - Links to External References (Optional) 

A list of Conmmon/ExtReferenceRef idx values applicable to the current data item.

Format is List of UN6
@since 3.1.0
*/
    @XmlAttribute(name = "extReferences")
      private  Set<BigInteger> extReferences;
/**
US:legacyReleasability - Legacy Releasability (Optional) 

One or more special handling instructions in sentence format, not code format. For example, "Approved for public release; distribution is unlimited". Multiple special handling instructions are separated by "|” (i.e., ASCII character #124).

Format is Memo
@since 3.1.0
*/
    @XmlAttribute(name = "legacyReleasability")
      private  String legacyReleasability;
/**
US:quality - Data Quality (Optional) 

One or more data quality indicator(s), separated by "|” (i.e., ASCII character #124), for the contents of the associated Data Item For example, "Outlier" | "Non-CodeList".

Format is S255
@since 3.1.0
*/
    @XmlAttribute(name = "quality")
      private  String quality;
/**
US:recommendedValue - Recommended Value (Optional) 

A value that is most probably correct.

Format is Memo
@since 3.1.0
*/
    @XmlAttribute(name = "recommendedValue")
      private  String recommendedValue;
/**
idref - Data Item ID (Optional) 

A unique identifier for each Data Item in the Dataset. Within each Dataset, the idref value must be unique for every occurrence. If a received Dataset uses idrefs and it is expected that the Dataset will be exchanged, the idrefs should be considered required. If the receiving system is the permanent end of the line for the Dataset, the idrefs may be considered optional. 

Format is S10
@since 3.1.0
*/
    @XmlAttribute(name = "idref")
      private  String idref;
/**
In attribute availability  (US),  enter data supporting legacy equipment certification business practice of entering "Unknown", "N/A", "Not Available" or "Not Applicable", when data is not available.
@since 3.1.0
*/
    @XmlAttribute(name = "availability")
      private  String availability;

/**
Get a value that is most probably correct.

@return  a {@link String} instance
@since 3.1.0
*/
public String getValue() {
        return value;
    }

/**
Set a value that is most probably correct.

@param value  a {@link String} instance
@since 3.1.0
*/
public void setValue(String value) {
        this.value = value;
    }

/**
Determine if the Value is configured.

@return TRUE if the field is set, FALSE if the field is null
*/
    public boolean isSetValue() {
        return (this.value!= null);
    }

/**
Get the classification of the current data item. This attribute is REQUIRED on each data item, even if the classification is "U".

@return  a {@link ListCCL} instance
@since 3.1.0
*/
public ListCCL getCls() {
        return cls;
    }

/**
Set the classification of the current data item. This attribute is REQUIRED on each data item, even if the classification is "U".

@param value  a {@link ListCCL} instance
@since 3.1.0
*/
public void setCls(ListCCL value) {
        this.cls = value;
    }

/**
Determine if the Cls is configured.

@return TRUE if the field is set, FALSE if the field is null
*/
    public boolean isSetCls() {
        return (this.cls!= null);
    }

/**
Get a list of Common/Remarks idx values applicable to the current data item.

@return  a {@link BigInteger} instance
@since 3.1.0
*/
    public Set<BigInteger> getRemarks() {
        if (remarks == null) {
            remarks = new HashSet<BigInteger>();
        }
        return this.remarks;
    }

/**
Determine if the Remarks is configured.

@return TRUE if the field is set, FALSE if the field is null
*/
    public boolean isSetRemarks() {
        return ((this.remarks!= null)&&(!this.remarks.isEmpty()));
    }

/**
  Clear the Remarks field. This sets the field to null.
 */
    public void unsetRemarks() {
        this.remarks = null;
    }

/**
Get a list of Conmmon/ExtReferenceRef idx values applicable to the current data item.

@return  a {@link BigInteger} instance
@since 3.1.0
*/
    public Set<BigInteger> getExtReferences() {
        if (extReferences == null) {
            extReferences = new HashSet<BigInteger>();
        }
        return this.extReferences;
    }

/**
Determine if the ExtReferences is configured.

@return TRUE if the field is set, FALSE if the field is null
*/
    public boolean isSetExtReferences() {
        return ((this.extReferences!= null)&&(!this.extReferences.isEmpty()));
    }

/**
  Clear the ExtReferences field. This sets the field to null.
 */
    public void unsetExtReferences() {
        this.extReferences = null;
    }

/**
Get one or more special handling instructions in sentence format, not code format. For example, "Approved for public release; distribution is unlimited". Multiple special handling instructions are separated by "|” (i.e., ASCII character #124).

@return  a {@link String} instance
@since 3.1.0
*/
public String getLegacyReleasability() {
        return legacyReleasability;
    }

/**
Set one or more special handling instructions in sentence format, not code format. For example, "Approved for public release; distribution is unlimited". Multiple special handling instructions are separated by "|” (i.e., ASCII character #124).

@param value  a {@link String} instance
@since 3.1.0
*/
public void setLegacyReleasability(String value) {
        this.legacyReleasability = value;
    }

/**
Determine if the LegacyReleasability is configured.

@return TRUE if the field is set, FALSE if the field is null
*/
    public boolean isSetLegacyReleasability() {
        return (this.legacyReleasability!= null);
    }

/**
Get one or more data quality indicator(s), separated by "|” (i.e., ASCII character #124), for the contents of the associated Data Item For example, "Outlier" | "Non-CodeList".

@return  a {@link String} instance
@since 3.1.0
*/
public String getQuality() {
        return quality;
    }

/**
Set one or more data quality indicator(s), separated by "|” (i.e., ASCII character #124), for the contents of the associated Data Item For example, "Outlier" | "Non-CodeList".

@param value  a {@link String} instance
@since 3.1.0
*/
public void setQuality(String value) {
        this.quality = value;
    }

/**
Determine if the Quality is configured.

@return TRUE if the field is set, FALSE if the field is null
*/
    public boolean isSetQuality() {
        return (this.quality!= null);
    }

/**
Get a value that is most probably correct.

@return  a {@link String} instance
@since 3.1.0
*/
public String getRecommendedValue() {
        return recommendedValue;
    }

/**
Set a value that is most probably correct.

@param value  a {@link String} instance
@since 3.1.0
*/
public void setRecommendedValue(String value) {
        this.recommendedValue = value;
    }

/**
Determine if the RecommendedValue is configured.

@return TRUE if the field is set, FALSE if the field is null
*/
    public boolean isSetRecommendedValue() {
        return (this.recommendedValue!= null);
    }

/**
Get a unique identifier for each Data Item in the Dataset. Within each Dataset, the idref value must be unique for every occurrence. If a received Dataset uses idrefs and it is expected that the Dataset will be exchanged, the idrefs should be considered required. If the receiving system is the permanent end of the line for the Dataset, the idrefs may be considered optional. 

@return  a {@link String} instance
@since 3.1.0
*/
public String getIdref() {
        return idref;
    }

/**
Set a unique identifier for each Data Item in the Dataset. Within each Dataset, the idref value must be unique for every occurrence. If a received Dataset uses idrefs and it is expected that the Dataset will be exchanged, the idrefs should be considered required. If the receiving system is the permanent end of the line for the Dataset, the idrefs may be considered optional. 

@param value  a {@link String} instance
@since 3.1.0
*/
public void setIdref(String value) {
        this.idref = value;
    }

/**
Determine if the Idref is configured.

@return TRUE if the field is set, FALSE if the field is null
*/
    public boolean isSetIdref() {
        return (this.idref!= null);
    }

/**
Get In attribute availability  (US),  enter data supporting legacy equipment certification business practice of entering "Unknown", "N/A", "Not Available" or "Not Applicable", when data is not available.

@return  a {@link String} instance
@since 3.1.0
*/
public String getAvailability() {
        return availability;
    }

/**
Set In attribute availability  (US),  enter data supporting legacy equipment certification business practice of entering "Unknown", "N/A", "Not Available" or "Not Applicable", when data is not available.

@param value  a {@link String} instance
@since 3.1.0
*/
public void setAvailability(String value) {
        this.availability = value;
    }

/**
Determine if the Availability is configured.

@return TRUE if the field is set, FALSE if the field is null
*/
    public boolean isSetAvailability() {
        return (this.availability!= null);
    }

/**
Set a value that is most probably correct.

@param value  An instances of type {@link String}
@return The current Installation object instance
@since 3.1.0
*/
    public Installation withValue(String value) {
        return this;
    }

/**
Set the classification of the current data item. This attribute is REQUIRED on each data item, even if the classification is "U".

@param value  An instances of type {@link ListCCL}
@return The current Installation object instance
@since 3.1.0
*/
    public Installation withCls(ListCCL value) {
        return this;
    }

/**
Set a list of Common/Remarks idx values applicable to the current data item.

@param values  One or more instances of type {@link BigInteger...}
@return The current Installation object instance
@since 3.1.0
*/
    public Installation withRemarks(BigInteger... values) {
        if (values!= null) {
            for (BigInteger value: values) {
                getRemarks().add(value);
            }
        }
        return this;
    }

/**
Set a list of Common/Remarks idx values applicable to the current data item.

@param values  A collection of {@link Remarks} instances
@return The current Installation object instance
@since 3.1.0
*/
    public Installation withRemarks(Collection<BigInteger> values) {
        if (values!= null) {
            getRemarks().addAll(values);
        }
        return this;
    }

/**
Set a list of Conmmon/ExtReferenceRef idx values applicable to the current data item.

@param values  One or more instances of type {@link BigInteger...}
@return The current Installation object instance
@since 3.1.0
*/
    public Installation withExtReferences(BigInteger... values) {
        if (values!= null) {
            for (BigInteger value: values) {
                getExtReferences().add(value);
            }
        }
        return this;
    }

/**
Set a list of Conmmon/ExtReferenceRef idx values applicable to the current data item.

@param values  A collection of {@link ExtReferences} instances
@return The current Installation object instance
@since 3.1.0
*/
    public Installation withExtReferences(Collection<BigInteger> values) {
        if (values!= null) {
            getExtReferences().addAll(values);
        }
        return this;
    }

/**
Set one or more special handling instructions in sentence format, not code format. For example, "Approved for public release; distribution is unlimited". Multiple special handling instructions are separated by "|” (i.e., ASCII character #124).

@param value  An instances of type {@link String}
@return The current Installation object instance
@since 3.1.0
*/
    public Installation withLegacyReleasability(String value) {
        return this;
    }

/**
Set one or more data quality indicator(s), separated by "|” (i.e., ASCII character #124), for the contents of the associated Data Item For example, "Outlier" | "Non-CodeList".

@param value  An instances of type {@link String}
@return The current Installation object instance
@since 3.1.0
*/
    public Installation withQuality(String value) {
        return this;
    }

/**
Set a value that is most probably correct.

@param value  An instances of type {@link String}
@return The current Installation object instance
@since 3.1.0
*/
    public Installation withRecommendedValue(String value) {
        return this;
    }

/**
Set a unique identifier for each Data Item in the Dataset. Within each Dataset, the idref value must be unique for every occurrence. If a received Dataset uses idrefs and it is expected that the Dataset will be exchanged, the idrefs should be considered required. If the receiving system is the permanent end of the line for the Dataset, the idrefs may be considered optional. 

@param value  An instances of type {@link String}
@return The current Installation object instance
@since 3.1.0
*/
    public Installation withIdref(String value) {
        return this;
    }

/**
Set In attribute availability  (US),  enter data supporting legacy equipment certification business practice of entering "Unknown", "N/A", "Not Available" or "Not Applicable", when data is not available.

@param value  An instances of type {@link String}
@return The current Installation object instance
@since 3.1.0
*/
    public Installation withAvailability(String value) {
        return this;
    }

/**
 Get a string representation of this Installation instance configuration.

@return The current object instance configuration as a non-null String
*/
@Override
 public String toString() {
 return "Installation {"
 + (availability !=null? " availability [" + availability +"]" : "") 
 + (cls !=null? " cls [" + cls +"]" : "") 
 + (extReferences !=null? " extReferences [" + extReferences +"]" : "") 
 + (idref !=null? " idref [" + idref +"]" : "") 
 + (legacyReleasability !=null? " legacyReleasability [" + legacyReleasability +"]" : "") 
 + (quality !=null? " quality [" + quality +"]" : "") 
 + (recommendedValue !=null? " recommendedValue [" + recommendedValue +"]" : "") 
 + (remarks !=null? " remarks [" + remarks +"]" : "") 
 + (value !=null? " value [" + value +"]" : "") +
"}";
  }

/**
Determine if the required fields in this SSRF data type instance are set.

{@link Installation} requires {@link ListCCL cls}.

Note that this method only checks for the presence of required information; this method does not validate the information format.
@return TRUE if required fields are set, otherwise FALSE
*/
public boolean isSet(){
return  isSetCls();
}

}
