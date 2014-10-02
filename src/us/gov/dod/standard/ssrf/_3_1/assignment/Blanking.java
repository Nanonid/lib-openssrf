/* 
 * The MIT License
 *
 * Copyright 2014 Key Bridge Global LLC.
 *
 * Permission is hereby granted, free of charge, to any person obtaining a copy
 * of this software and associated documentation files (the "Software"), to deal
 * in the Software without restriction, including without limitation the rights
 * to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
 * copies of the Software, and to permit persons to whom the Software is
 * furnished to do so, subject to the following conditions:
 *
 * The above copyright notice and this permission notice shall be included in
 * all copies or substantial portions of the Software.
 *
 * THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
 * IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
 * FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
 * AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
 * LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
 * OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN
 * THE SOFTWARE.
 */
package us.gov.dod.standard.ssrf._3_1.assignment;

import javax.xml.bind.annotation.*;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;
import us.gov.dod.standard.ssrf._3_1.adapter.types.*;
import us.gov.dod.standard.ssrf._3_1.metadata.domains.*;

/**
 * Blanking contains the start and stop angles of a horizontal and/or vertical
 * sector that is blanked.
 * <p>
 * Element of {@link StationConfig}
 * <p>
 * Example:
 * <pre>
 * &lt;Blanking&gt;
 *   &lt;AzStart cls="U"&gt;25&lt;/AzStart&gt;
 *   &lt;AzStop cls="U"&gt;35&lt;/AzStop&gt;
 * &lt;/Blanking&gt;
 * </pre>
 * <p>
 * @author Key Bridge Global LLC <developer@keybridgeglobal.com>
 * @version 3.1.0, 09/30/2014
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Blanking", propOrder = {
  "azStart",
  "azStop",
  "elevStart",
  "elevStop"
})
public class Blanking {

  /**
   * AzStart - Start Azimuth (Optional)
   * <p>
   * The start azimuth angle for the blanked sector. Use "0" or "360" for true
   * north.
   * <p>
   * Format is UN(5,2) [0..360] (deg)
   */
  @XmlElement(name = "AzStart", required = false)
  @XmlJavaTypeAdapter(type = TDecimal.class, value = XmlAdapterAZ.class)
  private TDecimal azStart;
  /**
   * AzStop - Stop Azimuth (Optional)
   * <p>
   * The stop azimuth angle for the blanked sector. Use "0" or "360" for true
   * north.
   * <p>
   * Format is UN(5,2) [0..360] (deg)
   */
  @XmlElement(name = "AzStop", required = false)
  @XmlJavaTypeAdapter(type = TDecimal.class, value = XmlAdapterAZ.class)
  private TDecimal azStop;
  /**
   * ElevStart - Start Elevation (Optional)
   * <p>
   * The start elevation angle for the blanked sector. Use "-90" for straight
   * down and "90" for directly overhead.
   * <p>
   * Format is SN(4,2) [-90..90] (deg)
   */
  @XmlElement(name = "ElevStart", required = false)
  @XmlJavaTypeAdapter(type = TDecimal.class, value = XmlAdapterELEV.class)
  private TDecimal elevStart;
  /**
   * ElevStop - Stop Elevation (Optional)
   * <p>
   * The stop elevation angle for the blanked sector. Use "-90" for straight
   * down and "90" for directly overhead.
   * <p>
   * Format is SN(4,2) [-90..90] (deg)
   */
  @XmlElement(name = "ElevStop", required = false)
  @XmlJavaTypeAdapter(type = TDecimal.class, value = XmlAdapterELEV.class)
  private TDecimal elevStop;

  /**
   * Get the start azimuth angle for the blanked sector. Use "0" or "360" for
   * true north.
   * <p>
   * @return the AzStart value in a {@link TDecimal} data type
   */
  public TDecimal getAzStart() {
    return azStart;
  }

  /**
   * Set the start azimuth angle for the blanked sector. Use "0" or "360" for
   * true north.
   * <p>
   * @param value the AzStart value in a {@link TDecimal} data type
   */
  public void setAzStart(TDecimal value) {
    this.azStart = value;
  }

  /**
   * Determine if the AzStart is configured.
   * <p>
   * If configured this method also inspects the {@link TDecimal} wrapped value.
   * <p>
   * @return TRUE if the field is set, FALSE if the field is null
   */
  public boolean isSetAzStart() {
    return (this.azStart != null ? this.azStart.isSetValue() : false);
  }

  /**
   * Get the stop azimuth angle for the blanked sector. Use "0" or "360" for
   * true north.
   * <p>
   * @return the AzStop value in a {@link TDecimal} data type
   */
  public TDecimal getAzStop() {
    return azStop;
  }

  /**
   * Set the stop azimuth angle for the blanked sector. Use "0" or "360" for
   * true north.
   * <p>
   * @param value the AzStop value in a {@link TDecimal} data type
   */
  public void setAzStop(TDecimal value) {
    this.azStop = value;
  }

  /**
   * Determine if the AzStop is configured.
   * <p>
   * If configured this method also inspects the {@link TDecimal} wrapped value.
   * <p>
   * @return TRUE if the field is set, FALSE if the field is null
   */
  public boolean isSetAzStop() {
    return (this.azStop != null ? this.azStop.isSetValue() : false);
  }

  /**
   * Get the start elevation angle for the blanked sector. Use "-90" for
   * straight down and "90" for directly overhead.
   * <p>
   * @return the ElevStart value in a {@link TDecimal} data type
   */
  public TDecimal getElevStart() {
    return elevStart;
  }

  /**
   * Set the start elevation angle for the blanked sector. Use "-90" for
   * straight down and "90" for directly overhead.
   * <p>
   * @param value the ElevStart value in a {@link TDecimal} data type
   */
  public void setElevStart(TDecimal value) {
    this.elevStart = value;
  }

  /**
   * Determine if the ElevStart is configured.
   * <p>
   * If configured this method also inspects the {@link TDecimal} wrapped value.
   * <p>
   * @return TRUE if the field is set, FALSE if the field is null
   */
  public boolean isSetElevStart() {
    return (this.elevStart != null ? this.elevStart.isSetValue() : false);
  }

  /**
   * Get the stop elevation angle for the blanked sector. Use "-90" for straight
   * down and "90" for directly overhead.
   * <p>
   * @return the ElevStop value in a {@link TDecimal} data type
   */
  public TDecimal getElevStop() {
    return elevStop;
  }

  /**
   * Set the stop elevation angle for the blanked sector. Use "-90" for straight
   * down and "90" for directly overhead.
   * <p>
   * @param value the ElevStop value in a {@link TDecimal} data type
   */
  public void setElevStop(TDecimal value) {
    this.elevStop = value;
  }

  /**
   * Determine if the ElevStop is configured.
   * <p>
   * If configured this method also inspects the {@link TDecimal} wrapped value.
   * <p>
   * @return TRUE if the field is set, FALSE if the field is null
   */
  public boolean isSetElevStop() {
    return (this.elevStop != null ? this.elevStop.isSetValue() : false);
  }

  /**
   * Set the start azimuth angle for the blanked sector. Use "0" or "360" for
   * true north.
   * <p>
   * @param value An instances of type {@link Double}
   * @return The current Blanking object instance
   */
  public Blanking withAzStart(Double value) {
    setAzStart(new TDecimal(value));
    return this;
  }

  /**
   * Set the stop azimuth angle for the blanked sector. Use "0" or "360" for
   * true north.
   * <p>
   * @param value An instances of type {@link Double}
   * @return The current Blanking object instance
   */
  public Blanking withAzStop(Double value) {
    setAzStop(new TDecimal(value));
    return this;
  }

  /**
   * Set the start elevation angle for the blanked sector. Use "-90" for
   * straight down and "90" for directly overhead.
   * <p>
   * @param value An instances of type {@link Double}
   * @return The current Blanking object instance
   */
  public Blanking withElevStart(Double value) {
    setElevStart(new TDecimal(value));
    return this;
  }

  /**
   * Set the stop elevation angle for the blanked sector. Use "-90" for straight
   * down and "90" for directly overhead.
   * <p>
   * @param value An instances of type {@link Double}
   * @return The current Blanking object instance
   */
  public Blanking withElevStop(Double value) {
    setElevStop(new TDecimal(value));
    return this;
  }

  /**
   * Get a string representation of this Blanking instance configuration.
   * <p>
   * @return The current object instance configuration as a non-null String
   */
  @Override
  public String toString() {
    return "Blanking {"
      + " elevStart [" + elevStart + "]"
      + " azStart [" + azStart + "]"
      + " elevStop [" + elevStop + "]"
      + " azStop [" + azStop + "]"
      + "}";
  }

  /**
   * Determine if the required fields in this SSRF data type instance are set.
   * <p>
   * {@link Blanking} has no configuration requirement.
   * <p>
   * @return TRUE
   */
  public boolean isSet() {
    return true;
  }

}