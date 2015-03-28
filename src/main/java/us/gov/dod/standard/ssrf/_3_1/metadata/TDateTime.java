/*
 * Copyright 2014 Key Bridge LLC.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package us.gov.dod.standard.ssrf._3_1.metadata;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Objects;
import java.util.TimeZone;
import javax.xml.bind.annotation.*;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;
import us.gov.dod.standard.ssrf._3_1.adapter.XmlAdapterDATETIME;
import us.gov.dod.standard.ssrf._3_1.metadata.lists.ListCCL;

/**
 * A Calendar instance with SSRF Standard Metadata Attributes. This corresponds
 * to the "xs:date" and "xs:dateTime" types.
 * <p>
 * @author Jesse Caulfield
 * @version SSRF 3.1.0, 09/29/2014
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TDateTime", propOrder = {"value"})
public class TDateTime extends AMetadata<TDateTime> implements IMetadataType, Comparable<TDateTime> {

  /**
   * UTC. The default time zone.
   */
  private static final TimeZone TIMEZONE = TimeZone.getTimeZone("UTC");
  /**
   * "yyyy-MM-dd'T'HH:mm:ss.SSSZ". The DateTime pattern.
   * <p>
   * DT is a date / time value formatted in 20 to 24 characters as
   * YYYY-MM-DDThh:mm:ss[.ddd]Z (year-
   * month-day"T"hours:minutes:seconds.milliseconds"Z"), where the milliseconds
   * part is optional. This format is compliant with the W3C Recommendation on
   * XML Schema.
   */
  private static final String PATTERN = "yyyy-MM-dd'T'HH:mm:ss.SSS'Z'";

  /**
   * The value to which the metadata attributes are associated.
   */
  @XmlValue
  @XmlJavaTypeAdapter(type = Calendar.class, value = XmlAdapterDATETIME.class)
  protected Calendar value;

  public TDateTime(Calendar value) {
    setValue(value);
  }

  public TDateTime(Date value) {
    setValue(value);
  }

  /**
   * Zero argument constructor.
   */
  public TDateTime() {
  }

  /**
   * Gets the value of the value property.
   * <p>
   * @return the value of the value property.
   */
  @Override
  public Calendar getValue() {
    return (value != null ? (Calendar) value.clone() : null);
  }

  /**
   * Sets the value of the value property.
   * <p>
   * @param value
   */
  public final void setValue(Calendar value) {
    this.value = (value != null ? (Calendar) value.clone() : null);
    this.value.setTimeZone(TIMEZONE);
  }

  /**
   * Sets the value of the value property.
   * <p>
   * @param value
   */
  public final void setValue(Date value) {
    if (value != null) {
      this.value = Calendar.getInstance(TIMEZONE);
      this.value.setTime(value);
    } else {
      this.value = null;
    }
  }

  /**
   * Determine if the Value is configured.
   * <p>
   * @return TRUE if the field is set, FALSE if the field is null
   */
  public boolean isSetValue() {
    return (this.value != null);
  }

  /**
   * Determine if the required fields in this SSRF data type instance are set.
   * <p>
   * {@link TCalendar} requires {@link ListCCL cls} and {@link Calendar value}
   * <p>
   * Note that this method only checks for the presence of required information;
   * this method does not validate the information format.
   * <p>
   * @return TRUE if required fields are set, otherwise FALSE
   */
  @Override
  public boolean isSet() {
    return super.isSet() && isSetValue();
  }

  /**
   * Get the configured value.
   * <p>
   * @return the value.
   */
  @Override
  public String toString() {
    if (value != null) {
      SimpleDateFormat sdf = new SimpleDateFormat(PATTERN);
      sdf.setCalendar(value);
      return sdf.format(value.getTime());
    }
    return null;
  }

  //<editor-fold defaultstate="collapsed" desc="Hashcode Equals and Comparable">
  /**
   * Hash code is based upon the value.
   * <p>
   * @return a unique hash code from the value
   */
  @Override
  public int hashCode() {
    int hash = 7;
    hash = 97 * hash + Objects.hashCode(this.value);
    return hash;
  }

  /**
   * Equality is based upon the value.
   * <p>
   * @param obj the other object to compare
   * @return TRUE if the values match exactly
   */
  @Override
  public boolean equals(Object obj) {
    if (obj == null) {
      return false;
    }
    if (getClass() != obj.getClass()) {
      return false;
    }
    final TDateTime other = (TDateTime) obj;
    if (!Objects.equals(this.value, other.value)) {
      return false;
    }
    return true;
  }

  /**
   * Comparison and sorting is in REVERSE chronological order (Newest to Oldest)
   * <p>
   * @param obj the other object to compare
   * @return the reverse chronological order
   */
  @Override
  public int compareTo(TDateTime obj) {
    if (obj == null) {
      return 1;
    }
    if (this.value == null) {
      return -1;
    }
    return -1 * this.value.compareTo(obj.getValue());
  }
//</editor-fold>
}
