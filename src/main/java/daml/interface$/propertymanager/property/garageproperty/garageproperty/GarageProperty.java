package daml.interface$.propertymanager.property.garageproperty.garageproperty;

import com.daml.ledger.javaapi.data.ContractFilter;
import com.daml.ledger.javaapi.data.CreateAndExerciseCommand;
import com.daml.ledger.javaapi.data.ExerciseByKeyCommand;
import com.daml.ledger.javaapi.data.ExerciseCommand;
import com.daml.ledger.javaapi.data.Identifier;
import com.daml.ledger.javaapi.data.Template;
import com.daml.ledger.javaapi.data.Unit;
import com.daml.ledger.javaapi.data.Value;
import com.daml.ledger.javaapi.data.codegen.Choice;
import com.daml.ledger.javaapi.data.codegen.Contract;
import com.daml.ledger.javaapi.data.codegen.ContractCompanion;
import com.daml.ledger.javaapi.data.codegen.ContractTypeCompanion;
import com.daml.ledger.javaapi.data.codegen.Exercised;
import com.daml.ledger.javaapi.data.codegen.InterfaceCompanion;
import com.daml.ledger.javaapi.data.codegen.PrimitiveValueDecoders;
import com.daml.ledger.javaapi.data.codegen.Update;
import daml.daml.finance.interface$.types.common.types.InstrumentKey;
import daml.interface$.propertymanager.property.common.GarageType;
import java.lang.Long;
import java.lang.Override;
import java.lang.String;
import java.math.BigDecimal;
import java.util.List;

public final class GarageProperty {
  public static final Identifier TEMPLATE_ID = new Identifier("63d617a230e28827582264ee3744a561fc8af088ff34f73d66177b7ef8e26382", "Interface.PropertyManager.Property.GarageProperty.GarageProperty", "GarageProperty");

  public static final Choice<GarageProperty, GetGaragePropertyAddress, String> CHOICE_GetGaragePropertyAddress = 
      Choice.create("GetGaragePropertyAddress", value$ -> value$.toValue(), value$ ->
        GetGaragePropertyAddress.valueDecoder().decode(value$), value$ ->
        PrimitiveValueDecoders.fromText.decode(value$));

  public static final Choice<GarageProperty, GetGaragePropertyDistrict, String> CHOICE_GetGaragePropertyDistrict = 
      Choice.create("GetGaragePropertyDistrict", value$ -> value$.toValue(), value$ ->
        GetGaragePropertyDistrict.valueDecoder().decode(value$), value$ ->
        PrimitiveValueDecoders.fromText.decode(value$));

  public static final Choice<GarageProperty, SetGarageDescription, ContractId> CHOICE_SetGarageDescription = 
      Choice.create("SetGarageDescription", value$ -> value$.toValue(), value$ ->
        SetGarageDescription.valueDecoder().decode(value$), value$ ->
        new ContractId(value$.asContractId().orElseThrow(() -> new IllegalArgumentException("Expected value$ to be of type com.daml.ledger.javaapi.data.ContractId")).getValue()));

  public static final Choice<GarageProperty, GetGaragePropertyCounty, String> CHOICE_GetGaragePropertyCounty = 
      Choice.create("GetGaragePropertyCounty", value$ -> value$.toValue(), value$ ->
        GetGaragePropertyCounty.valueDecoder().decode(value$), value$ ->
        PrimitiveValueDecoders.fromText.decode(value$));

  public static final Choice<GarageProperty, SetVehicleCapacity, ContractId> CHOICE_SetVehicleCapacity = 
      Choice.create("SetVehicleCapacity", value$ -> value$.toValue(), value$ ->
        SetVehicleCapacity.valueDecoder().decode(value$), value$ ->
        new ContractId(value$.asContractId().orElseThrow(() -> new IllegalArgumentException("Expected value$ to be of type com.daml.ledger.javaapi.data.ContractId")).getValue()));

  public static final Choice<GarageProperty, GetGarageAdditionalInformation, String> CHOICE_GetGarageAdditionalInformation = 
      Choice.create("GetGarageAdditionalInformation", value$ -> value$.toValue(), value$ ->
        GetGarageAdditionalInformation.valueDecoder().decode(value$), value$ ->
        PrimitiveValueDecoders.fromText.decode(value$));

  public static final Choice<GarageProperty, SetGaragePropertyAddress, ContractId> CHOICE_SetGaragePropertyAddress = 
      Choice.create("SetGaragePropertyAddress", value$ -> value$.toValue(), value$ ->
        SetGaragePropertyAddress.valueDecoder().decode(value$), value$ ->
        new ContractId(value$.asContractId().orElseThrow(() -> new IllegalArgumentException("Expected value$ to be of type com.daml.ledger.javaapi.data.ContractId")).getValue()));

  public static final Choice<GarageProperty, daml.da.internal.template.Archive, Unit> CHOICE_Archive = 
      Choice.create("Archive", value$ -> value$.toValue(), value$ ->
        daml.da.internal.template.Archive.valueDecoder().decode(value$), value$ ->
        PrimitiveValueDecoders.fromUnit.decode(value$));

  public static final Choice<GarageProperty, GetGarageInstalledEquipment, String> CHOICE_GetGarageInstalledEquipment = 
      Choice.create("GetGarageInstalledEquipment", value$ -> value$.toValue(), value$ ->
        GetGarageInstalledEquipment.valueDecoder().decode(value$), value$ ->
        PrimitiveValueDecoders.fromText.decode(value$));

  public static final Choice<GarageProperty, GetGarageType, GarageType> CHOICE_GetGarageType = 
      Choice.create("GetGarageType", value$ -> value$.toValue(), value$ ->
        GetGarageType.valueDecoder().decode(value$), value$ -> GarageType.valueDecoder()
        .decode(value$));

  public static final Choice<GarageProperty, SetGarageType, ContractId> CHOICE_SetGarageType = 
      Choice.create("SetGarageType", value$ -> value$.toValue(), value$ ->
        SetGarageType.valueDecoder().decode(value$), value$ ->
        new ContractId(value$.asContractId().orElseThrow(() -> new IllegalArgumentException("Expected value$ to be of type com.daml.ledger.javaapi.data.ContractId")).getValue()));

  public static final Choice<GarageProperty, SetGarageInstalledEquipment, ContractId> CHOICE_SetGarageInstalledEquipment = 
      Choice.create("SetGarageInstalledEquipment", value$ -> value$.toValue(), value$ ->
        SetGarageInstalledEquipment.valueDecoder().decode(value$), value$ ->
        new ContractId(value$.asContractId().orElseThrow(() -> new IllegalArgumentException("Expected value$ to be of type com.daml.ledger.javaapi.data.ContractId")).getValue()));

  public static final Choice<GarageProperty, SetGaragePropertyPostalCode, ContractId> CHOICE_SetGaragePropertyPostalCode = 
      Choice.create("SetGaragePropertyPostalCode", value$ -> value$.toValue(), value$ ->
        SetGaragePropertyPostalCode.valueDecoder().decode(value$), value$ ->
        new ContractId(value$.asContractId().orElseThrow(() -> new IllegalArgumentException("Expected value$ to be of type com.daml.ledger.javaapi.data.ContractId")).getValue()));

  public static final Choice<GarageProperty, GetGaragePropertyPostalCode, String> CHOICE_GetGaragePropertyPostalCode = 
      Choice.create("GetGaragePropertyPostalCode", value$ -> value$.toValue(), value$ ->
        GetGaragePropertyPostalCode.valueDecoder().decode(value$), value$ ->
        PrimitiveValueDecoders.fromText.decode(value$));

  public static final Choice<GarageProperty, GetView, View> CHOICE_GetView = 
      Choice.create("GetView", value$ -> value$.toValue(), value$ -> GetView.valueDecoder()
        .decode(value$), value$ -> View.valueDecoder().decode(value$));

  public static final Choice<GarageProperty, SetGaragePropertyDistrict, ContractId> CHOICE_SetGaragePropertyDistrict = 
      Choice.create("SetGaragePropertyDistrict", value$ -> value$.toValue(), value$ ->
        SetGaragePropertyDistrict.valueDecoder().decode(value$), value$ ->
        new ContractId(value$.asContractId().orElseThrow(() -> new IllegalArgumentException("Expected value$ to be of type com.daml.ledger.javaapi.data.ContractId")).getValue()));

  public static final Choice<GarageProperty, GetGarageDescription, String> CHOICE_GetGarageDescription = 
      Choice.create("GetGarageDescription", value$ -> value$.toValue(), value$ ->
        GetGarageDescription.valueDecoder().decode(value$), value$ ->
        PrimitiveValueDecoders.fromText.decode(value$));

  public static final Choice<GarageProperty, GetGarageArea, BigDecimal> CHOICE_GetGarageArea = 
      Choice.create("GetGarageArea", value$ -> value$.toValue(), value$ ->
        GetGarageArea.valueDecoder().decode(value$), value$ -> PrimitiveValueDecoders.fromNumeric
        .decode(value$));

  public static final Choice<GarageProperty, Remove, Unit> CHOICE_Remove = 
      Choice.create("Remove", value$ -> value$.toValue(), value$ -> Remove.valueDecoder()
        .decode(value$), value$ -> PrimitiveValueDecoders.fromUnit.decode(value$));

  public static final Choice<GarageProperty, SetGarageAdditionalInformation, ContractId> CHOICE_SetGarageAdditionalInformation = 
      Choice.create("SetGarageAdditionalInformation", value$ -> value$.toValue(), value$ ->
        SetGarageAdditionalInformation.valueDecoder().decode(value$), value$ ->
        new ContractId(value$.asContractId().orElseThrow(() -> new IllegalArgumentException("Expected value$ to be of type com.daml.ledger.javaapi.data.ContractId")).getValue()));

  public static final Choice<GarageProperty, SetGaragePropertyCounty, ContractId> CHOICE_SetGaragePropertyCounty = 
      Choice.create("SetGaragePropertyCounty", value$ -> value$.toValue(), value$ ->
        SetGaragePropertyCounty.valueDecoder().decode(value$), value$ ->
        new ContractId(value$.asContractId().orElseThrow(() -> new IllegalArgumentException("Expected value$ to be of type com.daml.ledger.javaapi.data.ContractId")).getValue()));

  public static final Choice<GarageProperty, GetVehicleCapacity, Long> CHOICE_GetVehicleCapacity = 
      Choice.create("GetVehicleCapacity", value$ -> value$.toValue(), value$ ->
        GetVehicleCapacity.valueDecoder().decode(value$), value$ -> PrimitiveValueDecoders.fromInt64
        .decode(value$));

  public static final Choice<GarageProperty, SetGarageInstrumentKey, ContractId> CHOICE_SetGarageInstrumentKey = 
      Choice.create("SetGarageInstrumentKey", value$ -> value$.toValue(), value$ ->
        SetGarageInstrumentKey.valueDecoder().decode(value$), value$ ->
        new ContractId(value$.asContractId().orElseThrow(() -> new IllegalArgumentException("Expected value$ to be of type com.daml.ledger.javaapi.data.ContractId")).getValue()));

  public static final Choice<GarageProperty, GetGarageInstrumentKey, InstrumentKey> CHOICE_GetGarageInstrumentKey = 
      Choice.create("GetGarageInstrumentKey", value$ -> value$.toValue(), value$ ->
        GetGarageInstrumentKey.valueDecoder().decode(value$), value$ -> InstrumentKey.valueDecoder()
        .decode(value$));

  public static final Choice<GarageProperty, SetGarageArea, ContractId> CHOICE_SetGarageArea = 
      Choice.create("SetGarageArea", value$ -> value$.toValue(), value$ ->
        SetGarageArea.valueDecoder().decode(value$), value$ ->
        new ContractId(value$.asContractId().orElseThrow(() -> new IllegalArgumentException("Expected value$ to be of type com.daml.ledger.javaapi.data.ContractId")).getValue()));

  public static final INTERFACE_ INTERFACE = new INTERFACE_();

  private GarageProperty() {
  }

  public static ContractFilter<Contract<ContractId, View>> contractFilter() {
    return ContractFilter.of(INTERFACE);
  }

  public static final class ContractId extends com.daml.ledger.javaapi.data.codegen.ContractId<GarageProperty> implements Exercises<ExerciseCommand> {
    public ContractId(String contractId) {
      super(contractId);
    }

    @Override
    protected ContractTypeCompanion<? extends Contract<ContractId, ?>, ContractId, GarageProperty, ?> getCompanion(
        ) {
      return INTERFACE;
    }
  }

  public interface Exercises<Cmd> extends com.daml.ledger.javaapi.data.codegen.Exercises.Archive<Cmd> {
    default Update<Exercised<String>> exerciseGetGaragePropertyAddress(
        GetGaragePropertyAddress arg) {
      return makeExerciseCmd(CHOICE_GetGaragePropertyAddress, arg);
    }

    default Update<Exercised<String>> exerciseGetGaragePropertyAddress() {
      return exerciseGetGaragePropertyAddress(new GetGaragePropertyAddress());
    }

    default Update<Exercised<String>> exerciseGetGaragePropertyDistrict(
        GetGaragePropertyDistrict arg) {
      return makeExerciseCmd(CHOICE_GetGaragePropertyDistrict, arg);
    }

    default Update<Exercised<String>> exerciseGetGaragePropertyDistrict() {
      return exerciseGetGaragePropertyDistrict(new GetGaragePropertyDistrict());
    }

    default Update<Exercised<ContractId>> exerciseSetGarageDescription(SetGarageDescription arg) {
      return makeExerciseCmd(CHOICE_SetGarageDescription, arg);
    }

    default Update<Exercised<ContractId>> exerciseSetGarageDescription(
        String newGarageDescription) {
      return exerciseSetGarageDescription(new SetGarageDescription(newGarageDescription));
    }

    default Update<Exercised<String>> exerciseGetGaragePropertyCounty(GetGaragePropertyCounty arg) {
      return makeExerciseCmd(CHOICE_GetGaragePropertyCounty, arg);
    }

    default Update<Exercised<String>> exerciseGetGaragePropertyCounty() {
      return exerciseGetGaragePropertyCounty(new GetGaragePropertyCounty());
    }

    default Update<Exercised<ContractId>> exerciseSetVehicleCapacity(SetVehicleCapacity arg) {
      return makeExerciseCmd(CHOICE_SetVehicleCapacity, arg);
    }

    default Update<Exercised<ContractId>> exerciseSetVehicleCapacity(Long newVehicleCapacity) {
      return exerciseSetVehicleCapacity(new SetVehicleCapacity(newVehicleCapacity));
