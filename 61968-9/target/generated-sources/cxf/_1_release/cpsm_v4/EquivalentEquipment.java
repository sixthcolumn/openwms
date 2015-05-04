
package _1_release.cpsm_v4;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for EquivalentEquipment complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="EquivalentEquipment">
 *   &lt;complexContent>
 *     &lt;extension base="{cpsm_V4.1_Release}ConductingEquipment">
 *       &lt;anyAttribute/>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "EquivalentEquipment")
@XmlSeeAlso({
    EquivalentShunt.class,
    EquivalentBranch.class
})
public abstract class EquivalentEquipment
    extends ConductingEquipment
{


}
