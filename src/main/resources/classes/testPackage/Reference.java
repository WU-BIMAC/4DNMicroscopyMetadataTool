
package testPackage;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;
import edu.umassmed.microscopyMetadataTool.data.MicroscopeComponent;


/**
 * 
 *         Reference is an empty complex type that is contained and extended by all the *Ref elements and also the Settings Complex Type
 *         Each *Ref element defines an attribute named ID of simple type *ID and no other information
 *         Each simple type *ID is restricted to the base type LSID with an appropriate pattern
 *       
 * 
 * <p>Java class for Reference complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Reference">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Reference")
@XmlSeeAlso({
    FilterRef.class,
    MirrorRef.class,
    LensRef.class,
    PrismRef.class,
    PolarizationOpticsRef.class,
    testPackage.Screen.PlateRef.class,
    testPackage.Calibration.FlatFieldImageRef.class,
    testPackage.Calibration.DetectorDarkMapRef.class,
    testPackage.Calibration.DetectorReadMapRef.class,
    testPackage.Calibration.MultiColorBeadsImageRef.class,
    testPackage.Calibration.PSFJReportRef.class,
    ProjectRef.class,
    ChannelRef.class,
    Pump.class,
    LightSourceCouplingRef.class,
    SampleHolderRef.class,
    AutoFocusRef.class,
    FocusingRef.class,
    ExperimentRef.class,
    TIRFSettingsRef.class,
    MicrobeamManipulationRef.class,
    InstrumentRef.class,
    DichroicRef.class,
    Leader.class,
    WellSampleRef.class,
    ReagentRef.class,
    FilterSetRef.class,
    Settings.class,
    ROIRef.class,
    FolderRef.class,
    ImageRef.class,
    AnnotationRef.class,
    DatasetRef.class,
    ExperimenterGroupRef.class,
    ExperimenterRef.class
})
public class Reference
    extends MicroscopeComponent
{


}
