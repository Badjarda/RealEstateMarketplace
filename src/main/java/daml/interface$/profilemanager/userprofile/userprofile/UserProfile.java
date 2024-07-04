package daml.interface$.profilemanager.userprofile.userprofile;

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
import daml.interface$.profilemanager.userprofile.common.Gender;
import daml.interface$.profilemanager.userprofile.common.Nationality;
import java.lang.Long;
import java.lang.Override;
import java.lang.String;
import java.time.LocalDate;
import java.util.List;
import java.util.Optional;

public final class UserProfile {
  public static final Identifier TEMPLATE_ID = new Identifier("63d617a230e28827582264ee3744a561fc8af088ff34f73d66177b7ef8e26382", "Interface.ProfileManager.UserProfile.UserProfile", "UserProfile");

  public static final Choice<UserProfile, GetBirthday, LocalDate> CHOICE_GetBirthday = 
      Choice.create("GetBirthday", value$ -> value$.toValue(), value$ -> GetBirthday.valueDecoder()
        .decode(value$), value$ -> PrimitiveValueDecoders.fromDate.decode(value$));

  public static final Choice<UserProfile, SetLastName, ContractId> CHOICE_SetLastName = 
      Choice.create("SetLastName", value$ -> value$.toValue(), value$ -> SetLastName.valueDecoder()
        .decode(value$), value$ ->
        new ContractId(value$.asContractId().orElseThrow(() -> new IllegalArgumentException("Expected value$ to be of type com.daml.ledger.javaapi.data.ContractId")).getValue()));

  public static final Choice<UserProfile, SetSocialSecurityId, ContractId> CHOICE_SetSocialSecurityId = 
      Choice.create("SetSocialSecurityId", value$ -> value$.toValue(), value$ ->
        SetSocialSecurityId.valueDecoder().decode(value$), value$ ->
        new ContractId(value$.asContractId().orElseThrow(() -> new IllegalArgumentException("Expected value$ to be of type com.daml.ledger.javaapi.data.ContractId")).getValue()));

  public static final Choice<UserProfile, GetView, View> CHOICE_GetView = 
      Choice.create("GetView", value$ -> value$.toValue(), value$ -> GetView.valueDecoder()
        .decode(value$), value$ -> View.valueDecoder().decode(value$));

  public static final Choice<UserProfile, GetSocialSecurityId, Long> CHOICE_GetSocialSecurityId = 
      Choice.create("GetSocialSecurityId", value$ -> value$.toValue(), value$ ->
        GetSocialSecurityId.valueDecoder().decode(value$), value$ ->
        PrimitiveValueDecoders.fromInt64.decode(value$));

  public static final Choice<UserProfile, Remove, Unit> CHOICE_Remove = 
      Choice.create("Remove", value$ -> value$.toValue(), value$ -> Remove.valueDecoder()
        .decode(value$), value$ -> PrimitiveValueDecoders.fromUnit.decode(value$));

  public static final Choice<UserProfile, GetNationality, Nationality> CHOICE_GetNationality = 
      Choice.create("GetNationality", value$ -> value$.toValue(), value$ ->
        GetNationality.valueDecoder().decode(value$), value$ -> Nationality.valueDecoder()
        .decode(value$));

  public static final Choice<UserProfile, GetFirstName, String> CHOICE_GetFirstName = 
      Choice.create("GetFirstName", value$ -> value$.toValue(), value$ ->
        GetFirstName.valueDecoder().decode(value$), value$ -> PrimitiveValueDecoders.fromText
        .decode(value$));

  public static final Choice<UserProfile, GetGender, Optional<Gender>> CHOICE_GetGender = 
      Choice.create("GetGender", value$ -> value$.toValue(), value$ -> GetGender.valueDecoder()
        .decode(value$), value$ -> PrimitiveValueDecoders.fromOptional(Gender.valueDecoder())
        .decode(value$));

  public static final Choice<UserProfile, SetTaxId, ContractId> CHOICE_SetTaxId = 
      Choice.create("SetTaxId", value$ -> value$.toValue(), value$ -> SetTaxId.valueDecoder()
        .decode(value$), value$ ->
        new ContractId(value$.asContractId().orElseThrow(() -> new IllegalArgumentException("Expected value$ to be of type com.daml.ledger.javaapi.data.ContractId")).getValue()));

  public static final Choice<UserProfile, SetUsername, ContractId> CHOICE_SetUsername = 
      Choice.create("SetUsername", value$ -> value$.toValue(), value$ -> SetUsername.valueDecoder()
        .decode(value$), value$ ->
        new ContractId(value$.asContractId().orElseThrow(() -> new IllegalArgumentException("Expected value$ to be of type com.daml.ledger.javaapi.data.ContractId")).getValue()));

  public static final Choice<UserProfile, SetCellphoneNumber, ContractId> CHOICE_SetCellphoneNumber = 
      Choice.create("SetCellphoneNumber", value$ -> value$.toValue(), value$ ->
        SetCellphoneNumber.valueDecoder().decode(value$), value$ ->
        new ContractId(value$.asContractId().orElseThrow(() -> new IllegalArgumentException("Expected value$ to be of type com.daml.ledger.javaapi.data.ContractId")).getValue()));

  public static final Choice<UserProfile, GetLastName, String> CHOICE_GetLastName = 
      Choice.create("GetLastName", value$ -> value$.toValue(), value$ -> GetLastName.valueDecoder()
        .decode(value$), value$ -> PrimitiveValueDecoders.fromText.decode(value$));

  public static final Choice<UserProfile, GetUsername, String> CHOICE_GetUsername = 
      Choice.create("GetUsername", value$ -> value$.toValue(), value$ -> GetUsername.valueDecoder()
        .decode(value$), value$ -> PrimitiveValueDecoders.fromText.decode(value$));

  public static final Choice<UserProfile, GetCellphoneNumber, Optional<Long>> CHOICE_GetCellphoneNumber = 
      Choice.create("GetCellphoneNumber", value$ -> value$.toValue(), value$ ->
        GetCellphoneNumber.valueDecoder().decode(value$), value$ ->
        PrimitiveValueDecoders.fromOptional(PrimitiveValueDecoders.fromInt64).decode(value$));

  public static final Choice<UserProfile, GetContactMail, String> CHOICE_GetContactMail = 
      Choice.create("GetContactMail", value$ -> value$.toValue(), value$ ->
        GetContactMail.valueDecoder().decode(value$), value$ -> PrimitiveValueDecoders.fromText
        .decode(value$));

  public static final Choice<UserProfile, SetFirstName, ContractId> CHOICE_SetFirstName = 
      Choice.create("SetFirstName", value$ -> value$.toValue(), value$ ->
        SetFirstName.valueDecoder().decode(value$), value$ ->
        new ContractId(value$.asContractId().orElseThrow(() -> new IllegalArgumentException("Expected value$ to be of type com.daml.ledger.javaapi.data.ContractId")).getValue()));

  public static final Choice<UserProfile, GetFullName, String> CHOICE_GetFullName = 
      Choice.create("GetFullName", value$ -> value$.toValue(), value$ -> GetFullName.valueDecoder()
        .decode(value$), value$ -> PrimitiveValueDecoders.fromText.decode(value$));

  public static final Choice<UserProfile, SetGender, ContractId> CHOICE_SetGender = 
      Choice.create("SetGender", value$ -> value$.toValue(), value$ -> SetGender.valueDecoder()
        .decode(value$), value$ ->
        new ContractId(value$.asContractId().orElseThrow(() -> new IllegalArgumentException("Expected value$ to be of type com.daml.ledger.javaapi.data.ContractId")).getValue()));

  public static final Choice<UserProfile, SetBirthday, ContractId> CHOICE_SetBirthday = 
      Choice.create("SetBirthday", value$ -> value$.toValue(), value$ -> SetBirthday.valueDecoder()
        .decode(value$), value$ ->
        new ContractId(value$.asContractId().orElseThrow(() -> new IllegalArgumentException("Expected value$ to be of type com.daml.ledger.javaapi.data.ContractId")).getValue()));

  public static final Choice<UserProfile, GetTaxId, Long> CHOICE_GetTaxId = 
      Choice.create("GetTaxId", value$ -> value$.toValue(), value$ -> GetTaxId.valueDecoder()
        .decode(value$), value$ -> PrimitiveValueDecoders.fromInt64.decode(value$));

  public static final Choice<UserProfile, daml.da.internal.template.Archive, Unit> CHOICE_Archive = 
      Choice.create("Archive", value$ -> value$.toValue(), value$ ->
        daml.da.internal.template.Archive.valueDecoder().decode(value$), value$ ->
        PrimitiveValueDecoders.fromUnit.decode(value$));

  public static final Choice<UserProfile, SetFullName, ContractId> CHOICE_SetFullName = 
      Choice.create("SetFullName", value$ -> value$.toValue(), value$ -> SetFullName.valueDecoder()
        .decode(value$), value$ ->
        new ContractId(value$.asContractId().orElseThrow(() -> new IllegalArgumentException("Expected value$ to be of type com.daml.ledger.javaapi.data.ContractId")).getValue()));

  public static final Choice<UserProfile, SetNationality, ContractId> CHOICE_SetNationality = 
      Choice.create("SetNationality", value$ -> value$.toValue(), value$ ->
        SetNationality.valueDecoder().decode(value$), value$ ->
        new ContractId(value$.asContractId().orElseThrow(() -> new IllegalArgumentException("Expected value$ to be of type com.daml.ledger.javaapi.data.ContractId")).getValue()));

  public static final Choice<UserProfile, SetContactMail, ContractId> CHOICE_SetContactMail = 
      Choice.create("SetContactMail", value$ -> value$.toValue(), value$ ->
        SetContactMail.valueDecoder().decode(value$), value$ ->
        new ContractId(value$.asContractId().orElseThrow(() -> new IllegalArgumentException("Expected value$ to be of type com.daml.ledger.javaapi.data.ContractId")).getValue()));

  public static final INTERFACE_ INTERFACE = new INTERFACE_();

  private UserProfile() {
  }

  public static ContractFilter<Contract<ContractId, View>> contractFilter() {
    return ContractFilter.of(INTERFACE);
  }

  public static final class ContractId extends com.daml.ledger.javaapi.data.codegen.ContractId<UserProfile> implements Exercises<ExerciseCommand> {
    public ContractId(String contractId) {
      super(contractId);
    }

    @Override
    protected ContractTypeCompanion<? extends Contract<ContractId, ?>, ContractId, UserProfile, ?> getCompanion(
        ) {
      return INTERFACE;
    }
  }

  public interface Exercises<Cmd> extends com.daml.ledger.javaapi.data.codegen.Exercises.Archive<Cmd> {
    default Update<Exercised<LocalDate>> exerciseGetBirthday(GetBirthday arg) {
      return makeExerciseCmd(CHOICE_GetBirthday, arg);
    }

    default Update<Exercised<LocalDate>> exerciseGetBirthday() {
      return exerciseGetBirthday(new GetBirthday());
    }

    default Update<Exercised<ContractId>> exerciseSetLastName(SetLastName arg) {
      return makeExerciseCmd(CHOICE_SetLastName, arg);
    }

    default Update<Exercised<ContractId>> exerciseSetLastName(String newLastName) {
      return exerciseSetLastName(new SetLastName(newLastName));
    }

    default Update<Exercised