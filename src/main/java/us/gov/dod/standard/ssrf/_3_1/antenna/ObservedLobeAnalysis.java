/* 
 * Copyright 2014 Key Bridge Global LLC.
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
package us.gov.dod.standard.ssrf._3_1.antenna;

import java.util.Arrays;
import java.util.Set;
import java.util.HashSet;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;
import us.gov.dod.standard.ssrf._3_1.adapter.types.*;
import us.gov.dod.standard.ssrf._3_1.metadata.domains.*;
import us.gov.dod.standard.ssrf._3_1.metadata.lists.ListCBD;
import us.gov.dod.standard.ssrf._3_1.metadata.lists.ListCBO;

/**
 * ObservedLobeAnalysis (US) contains general data associated with observed
 * Antenna sidelobes and backlobes.
 * <p>
 * Element of {@link AntMode}
 * <p>
 * Sub-Element is {@link ObservedLobeValues}
 * <p>
 * Example:
 * <pre>
 * &lt;ObservedLobeAnalysis&gt;
 *   &lt;BeamType&gt;
 *     &lt;LobeID cls="U"&gt;213&lt;/LobeID&gt;
 *     &lt;LobeName cls="U"&gt;1st Backlobe&lt;/LobeName&gt;
 *     &lt;LobeSymmetric cls="U"&gt;Yes&lt;/LobeSymmetric&gt;
 *     &lt;ObservedLobeValues&gt;
 *       &lt;HorBwMax cls="U"&gt;58.89&lt;/HorBwMax&gt;
 *       &lt;HorzBwMin cls="U"&gt;45.23&lt;/HorzBwMin&gt;
 *       &lt;LobeValueAngleAccuracy cls="U"&gt;0.01&lt;/LobeValueAngleAccuracy&gt;
 *       &lt;LobeValueAngleHorz cls="U"&gt;179&lt;/LobeValueAngleHorz&gt;
 *       &lt;LobeValueAngleVert cls="U"&gt;178.23&lt;/LobeValueAngleVert&gt;
 *       &lt;LobeValueID cls="U"&gt;213&lt;/LobeValueID&gt;
 *       &lt;LobeValueLevel cls="U"&gt;47&lt;/LobeValueLevel&gt;
 *       &lt;LobeValueLevelAccuracy cls="U"&gt;12&lt;/LobeValueLevelAccuracy&gt;
 *       &lt;LobeValueName cls="U"&gt;1st Backlobe left&lt;/LobeValueName&gt;
 *       &lt;VertBwMax cls="U"&gt;82.34&lt;/VertBwMax&gt;
 *       &lt;VertBwMin cls="U"&gt;67.8&lt;/VertBwMin&gt;
 *     &lt;/ObservedLobeValues&gt;
 *   &lt;/ObservedLobeAnalysis&gt;
 * </pre>
 * <p>
 * @author Jesse Caulfield
 * @version SSRF 3.1.0, 09/30/2014
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ObservedLobeAnalysis", propOrder = {
  "beamType",
  "lobeID",
  "lobeName",
  "lobeSymmetric",
  "observedLobeValues"
})
public class ObservedLobeAnalysis {

  /**
   * BeamType (US), indicate the pattern beam type that best represents the
   * general shape of the beam as it radiates from the antenna. The beam shape
   * is a direct function of the radiating antenna shape and the beams are
   * characterized by their shape (volume) in space so as to help determine how
   * and where to measure mainbeam and sidelobe levels. Additionally. radar beam
   * shapes are generally characteristic of the function of a particular radar.
   */
  @XmlElement(name = "BeamType", required = false)
  private TString beamType;
  /**
   * US:LobeID - Lobe Identifier (Required)
   * <p>
   * A unique (within the AntMode) identifier for the Antenna lobe.
   * <p>
   * Format is S10
   */
  @XmlElement(name = "LobeID", required = true)
  @XmlJavaTypeAdapter(type = TString.class, value = XmlAdapterS10.class)
  private TString lobeID;
  /**
   * US:LobeName - Lobe Name (Optional)
   * <p>
   * A name for the Antenna lobe. Examples: 1st Backlobe, 5th SideLobe, etc.
   * <p>
   * Format is S25
   */
  @XmlElement(name = "LobeName", required = false)
  @XmlJavaTypeAdapter(type = TString.class, value = XmlAdapterS25.class)
  private TString lobeName;
  /**
   * LobeSymmetric (US), indicate whether the sidelobe is symmetric.
   */
  @XmlElement(name = "LobeSymmetric", required = false)
  private TString lobeSymmetric;
  /**
   * US:ObservedLobeValues (Optional)
   * <p>
   * ObservedLobeValues (US) contains azimuth and elevation angles, as well as
   * power density levels associated with observed Antenna sidelobes or
   * backlobes. Used to its full potential, a precise 3D picture of an Antenna
   * sidelobe can be represented.
   */
  @XmlElement(name = "ObservedLobeValues")
  private Set<ObservedLobeValues> observedLobeValues;

  /**
   * Get BeamType (US), indicate the pattern beam type that best represents the
   * general shape of the beam as it radiates from the antenna. The beam shape
   * is a direct function of the radiating antenna shape and the beams are
   * characterized by their shape (volume) in space so as to help determine how
   * and where to measure mainbeam and sidelobe levels. Additionally. radar beam
   * shapes are generally characteristic of the function of a particular radar.
   * <p>
   * @return the BeamType value in a {@link TString} data type
   */
  public TString getBeamType() {
    return beamType;
  }

  /**
   * Set BeamType (US), indicate the pattern beam type that best represents the
   * general shape of the beam as it radiates from the antenna. The beam shape
   * is a direct function of the radiating antenna shape and the beams are
   * characterized by their shape (volume) in space so as to help determine how
   * and where to measure mainbeam and sidelobe levels. Additionally. radar beam
   * shapes are generally characteristic of the function of a particular radar.
   * <p>
   * @param value the BeamType value in a {@link TString} data type
   */
  public void setBeamType(TString value) {
    this.beamType = value;
  }

  /**
   * Determine if the BeamType is configured.
   * <p>
   * If configured this method also inspects the {@link TString} wrapped value.
   * <p>
   * @return TRUE if the field is set, FALSE if the field is null
   */
  public boolean isSetBeamType() {
    return (this.beamType != null ? this.beamType.isSetValue() : false);
  }

  /**
   * Get a unique (within the AntMode) identifier for the Antenna lobe.
   * <p>
   * @return the LobeID value in a {@link TString} data type
   */
  public TString getLobeID() {
    return lobeID;
  }

  /**
   * Set a unique (within the AntMode) identifier for the Antenna lobe.
   * <p>
   * @param value the LobeID value in a {@link TString} data type
   */
  public void setLobeID(TString value) {
    this.lobeID = value;
  }

  /**
   * Determine if the LobeID is configured.
   * <p>
   * If configured this method also inspects the {@link TString} wrapped value.
   * <p>
   * @return TRUE if the field is set, FALSE if the field is null
   */
  public boolean isSetLobeID() {
    return (this.lobeID != null ? this.lobeID.isSetValue() : false);
  }

  /**
   * Get a name for the Antenna lobe. Examples: 1st Backlobe, 5th SideLobe, etc.
   * <p>
   * @return the LobeName value in a {@link TString} data type
   */
  public TString getLobeName() {
    return lobeName;
  }

  /**
   * Set a name for the Antenna lobe. Examples: 1st Backlobe, 5th SideLobe, etc.
   * <p>
   * @param value the LobeName value in a {@link TString} data type
   */
  public void setLobeName(TString value) {
    this.lobeName = value;
  }

  /**
   * Determine if the LobeName is configured.
   * <p>
   * If configured this method also inspects the {@link TString} wrapped value.
   * <p>
   * @return TRUE if the field is set, FALSE if the field is null
   */
  public boolean isSetLobeName() {
    return (this.lobeName != null ? this.lobeName.isSetValue() : false);
  }

  /**
   * Get LobeSymmetric (US), indicate whether the sidelobe is symmetric.
   * <p>
   * @return the LobeSymmetric value in a {@link TString} data type
   */
  public TString getLobeSymmetric() {
    return lobeSymmetric;
  }

  /**
   * Set LobeSymmetric (US), indicate whether the sidelobe is symmetric.
   * <p>
   * @param value the LobeSymmetric value in a {@link TString} data type
   */
  public void setLobeSymmetric(TString value) {
    this.lobeSymmetric = value;
  }

  /**
   * Determine if the LobeSymmetric is configured.
   * <p>
   * If configured this method also inspects the {@link TString} wrapped value.
   * <p>
   * @return TRUE if the field is set, FALSE if the field is null
   */
  public boolean isSetLobeSymmetric() {
    return (this.lobeSymmetric != null ? this.lobeSymmetric.isSetValue() : false);
  }

  /**
   * Get the US:ObservedLobeValues
   * <p>
   * Complex element ObservedLobeValues (US) contains azimuth and elevation
   * angles, as well as power density levels associated with observed Antenna
   * sidelobes or backlobes. Used to its full potential, a precise 3D picture of
   * an Antenna sidelobe can be represented.
   * <p>
   * @return a non-null but possibly empty list of {@link ObservedLobeValues}
   *         instances
   */
  public Set<ObservedLobeValues> getObservedLobeValues() {
    if (observedLobeValues == null) {
      observedLobeValues = new HashSet<>();
    }
    return this.observedLobeValues;
  }

  /**
   * Determine if the ObservedLobeValues is configured.
   * <p>
   * @return TRUE if the field is set, FALSE if the field is null
   */
  public boolean isSetObservedLobeValues() {
    return ((this.observedLobeValues != null) && (!this.observedLobeValues.isEmpty()));
  }

  /**
   * Clear the ObservedLobeValues field. This sets the field to null.
   */
  public void unsetObservedLobeValues() {
    this.observedLobeValues = null;
  }

  /**
   * Set BeamType (US), indicate the pattern beam type that best represents the
   * general shape of the beam as it radiates from the antenna. The beam shape
   * is a direct function of the radiating antenna shape and the beams are
   * characterized by their shape (volume) in space so as to help determine how
   * and where to measure mainbeam and sidelobe levels. Additionally. radar beam
   * shapes are generally characteristic of the function of a particular radar.
   * <p>
   * @param value An instances of type {@link ListCBD}
   * @return The current ObservedLobeAnalysis object instance
   */
  public ObservedLobeAnalysis withBeamType(ListCBD value) {
    setBeamType(new TString(value.value()));
    return this;
  }

  /**
   * Set a unique (within the AntMode) identifier for the Antenna lobe.
   * <p>
   * @param value An instances of type {@link String}
   * @return The current ObservedLobeAnalysis object instance
   */
  public ObservedLobeAnalysis withLobeID(String value) {
    setLobeID(new TString(value));
    return this;
  }

  /**
   * Set a name for the Antenna lobe. Examples: 1st Backlobe, 5th SideLobe, etc.
   * <p>
   * @param value An instances of type {@link String}
   * @return The current ObservedLobeAnalysis object instance
   */
  public ObservedLobeAnalysis withLobeName(String value) {
    setLobeName(new TString(value));
    return this;
  }

  /**
   * Set LobeSymmetric (US), indicate whether the sidelobe is symmetric.
   * <p>
   * @param value An instances of type {@link ListCBO}
   * @return The current ObservedLobeAnalysis object instance
   */
  public ObservedLobeAnalysis withLobeSymmetric(ListCBO value) {
    setLobeSymmetric(new TString(value.value()));
    return this;
  }

  /**
   * Set the US:ObservedLobeValues
   * <p>
   * Complex element ObservedLobeValues (US) contains azimuth and elevation
   * angles, as well as power density levels associated with observed Antenna
   * sidelobes or backlobes. Used to its full potential, a precise 3D picture of
   * an Antenna sidelobe can be represented.
   * <p>
   * @param values One or more instances of type {@link ObservedLobeValues}
   * @return The current ObservedLobeAnalysis object instance
   */
  public ObservedLobeAnalysis withObservedLobeValues(ObservedLobeValues... values) {
    if (values != null) {
      getObservedLobeValues().addAll(new HashSet<>(Arrays.asList(values)));
    }
    return this;
  }

  /**
   * Set the US:ObservedLobeValues
   * <p>
   * Complex element ObservedLobeValues (US) contains azimuth and elevation
   * angles, as well as power density levels associated with observed Antenna
   * sidelobes or backlobes. Used to its full potential, a precise 3D picture of
   * an Antenna sidelobe can be represented.
   * <p>
   * @param values A collection of {@link ObservedLobeValues} instances
   * @return The current ObservedLobeAnalysis object instance
   */
  public ObservedLobeAnalysis withObservedLobeValues(Set<ObservedLobeValues> values) {
    if (values != null) {
      getObservedLobeValues().addAll(values);
    }
    return this;
  }

  /**
   * Get a string representation of this ObservedLobeAnalysis instance
   * configuration.
   * <p>
   * @return The current object instance configuration as a non-null String
   */
  @Override
  public String toString() {
    return "ObservedLobeAnalysis {"
      + (lobeName != null ? " lobeName [" + lobeName + "]" : "")
      + (observedLobeValues != null ? " observedLobeValues [" + observedLobeValues + "]" : "")
      + (beamType != null ? " beamType [" + beamType + "]" : "")
      + (lobeSymmetric != null ? " lobeSymmetric [" + lobeSymmetric + "]" : "")
      + (lobeID != null ? " lobeID [" + lobeID + "]" : "")
      + "}";
  }

  /**
   * Determine if the required fields in this SSRF data type instance are set.
   * <p>
   * {@link ObservedLobeAnalysis} requires {@link TString LobeID}.
   * <p>
   * Note that this method only checks for the presence of required information;
   * this method does not validate the information format.
   * <p>
   * @return TRUE if required fields are set, otherwise FALSE
   */
  public boolean isSet() {
    return isSetLobeID();
  }

}