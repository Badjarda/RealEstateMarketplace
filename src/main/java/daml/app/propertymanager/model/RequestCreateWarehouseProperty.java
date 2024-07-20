package daml.app.propertymanager.model;

import static com.daml.ledger.javaapi.data.codegen.json.JsonLfEncoders.apply;

import com.daml.ledger.javaapi.data.ContractFilter;
import com.daml.ledger.javaapi.data.CreateAndExerciseCommand;
import com.daml.ledger.javaapi.data.CreateCommand;
import com.daml.ledger.javaapi.data.CreatedEvent;
import com.daml.ledger.javaapi.data.DamlCollectors;
import com.daml.ledger.javaapi.data.DamlRecord;
import com.daml.ledger.javaapi.data.Date;
import com.daml.ledger.javaapi.data.ExerciseByKeyCommand;
import com.daml.ledger.javaapi.data.ExerciseCommand;
import com.daml.ledger.javaapi.data.Identifier;
import com.daml.ledger.javaapi.data.Int64;
import com.daml.ledger.javaapi.data.Numeric;
import com.daml.ledger.javaapi.data.Party;
import com.daml.ledger.javaapi.data.Template;
import com.daml.ledger.javaapi.data.Text;
import com.daml.ledger.javaapi.data.Unit;
import com.daml.ledger.javaapi.data.Value;
import com.daml.ledger.javaapi.data.codegen.Choice;
import com.daml.ledger.javaapi.data.codegen.ContractCompanion;
import com.daml.ledger.javaapi.data.codegen.ContractTypeCompanion;
import com.daml.ledger.javaapi.data.codegen.ContractWithKey;
import com.daml.ledger.javaapi.data.codegen.Created;
import com.daml.ledger.javaapi.data.codegen.Exercised;
import com.daml.ledger.javaapi.data.codegen.PrimitiveValueDecoders;
import com.daml.ledger.javaapi.data.codegen.Update;
import com.daml.ledger.javaapi.data.codegen.ValueDecoder;
import com.daml.ledger.javaapi.data.codegen.json.JsonLfDecoder;
import com.daml.ledger.javaapi.data.codegen.json.JsonLfDecoders;
import com.daml.ledger.javaapi.data.codegen.json.JsonLfEncoder;
import com.daml.ledger.javaapi.data.codegen.json.JsonLfEncoders;
import com.daml.ledger.javaapi.data.codegen.json.JsonLfReader;
import daml.da.set.types.Set;
import daml.da.types.Tuple2;
import daml.daml.finance.interface$.types.common.types.Id;
import daml.daml.finance.interface$.types.common.types.InstrumentKey;
import daml.interface$.common.removable.Removable;
import daml.interface$.propertymanager.property.common.WarehouseType;
import java.lang.Deprecated;
import java.lang.IllegalArgumentException;
import java.lang.Long;
import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;

public final class RequestCreateWarehouseProperty extends Template {
  public static final Identifier TEMPLATE_ID = new Identifier("f0dcbf884b6b6c6225689dfc29d021f7054d825e7f59acb15e7d4ca03ecb808d", "App.PropertyManager.Model", "RequestCreateWarehouseProperty");

  public static final Choice<RequestCreateWarehouseProperty, daml.da.internal.template.Archive, Unit> CHOICE_Archive = 
      Choice.create("Archive", value$ -> value$.toValue(), value$ ->
        daml.da.internal.template.Archive.valueDecoder().decode(value$), value$ ->
        PrimitiveValueDecoders.fromUnit.decode(value$));

  public static final ContractCompanion.WithKey<Contract, ContractId, RequestCreateWarehouseProperty, Tuple2<String, Id>> COMPANION = 
      new ContractCompanion.WithKey<>(
        "daml.app.propertymanager.model.RequestCreateWarehouseProperty", TEMPLATE_ID,
        ContractId::new, v -> RequestCreateWarehouseProperty.templateValueDecoder().decode(v),
        RequestCreateWarehouseProperty::fromJson, Contract::new, List.of(CHOICE_Archive),
        e -> Tuple2.<java.lang.String,
        daml.daml.finance.interface$.types.common.types.Id>valueDecoder(PrimitiveValueDecoders.fromParty,
        Id.valueDecoder()).decode(e));

  public final String operator;

  public final String user;

  public final Id id;

  public final InstrumentKey warehouseInstrument;

  public final BigDecimal warehousePrice;

  public final String propertyAddress;

  public final String propertyPostalCode;

  public final String propertyDistrict;

  public final String propertyCounty;

  public final WarehouseType warehouseType;

  public final BigDecimal grossArea;

  public final BigDecimal usableArea;

  public final Long floors;

  public final LocalDate buildDate;

  public final String installedEquipment;

  public final String additionalInformation;

  public final String description;

  public final Map<String, Set<String>> observers;

  public RequestCreateWarehouseProperty(String operator, String user, Id id,
      InstrumentKey warehouseInstrument, BigDecimal warehousePrice, String propertyAddress,
      String propertyPostalCode, String propertyDistrict, String propertyCounty,
      WarehouseType warehouseType, BigDecimal grossArea, BigDecimal usableArea, Long floors,
      LocalDate buildDate, String installedEquipment, String additionalInformation,
      String description, Map<String, Set<String>> observers) {
    this.operator = operator;
    this.user = user;
    this.id = id;
    this.warehouseInstrument = warehouseInstrument;
    this.warehousePrice = warehousePrice;
    this.propertyAddress = propertyAddress;
    this.propertyPostalCode = propertyPostalCode;
    this.propertyDistrict = propertyDistrict;
    this.propertyCounty = propertyCounty;
    this.warehouseType = warehouseType;
    this.grossArea = grossArea;
    this.usableArea = usableArea;
    this.floors = floors;
    this.buildDate = buildDate;
    this.installedEquipment = installedEquipment;
    this.additionalInformation = additionalInformation;
    this.description = description;
    this.observers = observers;
  }

  @Override
  public Update<Created<ContractId>> create() {
    return new Update.CreateUpdate<ContractId, Created<ContractId>>(new CreateCommand(RequestCreateWarehouseProperty.TEMPLATE_ID, this.toValue()), x -> x, ContractId::new);
  }

  /**
   * @deprecated since Daml 2.3.0; use {@code byKey(key).exerciseArchive} instead
   */
  @Deprecated
  public static Update<Exercised<Unit>> exerciseByKeyArchive(Tuple2<String, Id> key,
      daml.da.internal.template.Archive arg) {
    return byKey(key).exerciseArchive(arg);
  }

  /**
   * @deprecated since Daml 2.3.0; use {@code byKey(key).exerciseArchive()} instead
   */
  @Deprecated
  public static Update<Exercised<Unit>> exerciseByKeyArchive(Tuple2<String, Id> key) {
    return byKey(key).exerciseArchive();
  }

  /**
   * @deprecated since Daml 2.3.0; use {@code createAnd().exerciseArchive} instead
   */
  @Deprecated
  public Update<Exercised<Unit>> createAndExerciseArchive(daml.da.internal.template.Archive arg) {
    return createAnd().exerciseArchive(arg);
  }

  /**
   * @deprecated since Daml 2.3.0; use {@code createAnd().exerciseArchive} instead
   */
  @Deprecated
  public Update<Exercised<Unit>> createAndExerciseArchive() {
    return createAndExerciseArchive(new daml.da.internal.template.Archive());
  }

  public static Update<Created<ContractId>> create(String operator, String user, Id id,
      InstrumentKey warehouseInstrument, BigDecimal warehousePrice, String propertyAddress,
      String propertyPostalCode, String propertyDistrict, String propertyCounty,
      WarehouseType warehouseType, BigDecimal grossArea, BigDecimal usableArea, Long floors,
      LocalDate buildDate, String installedEquipment, String additionalInformation,
      String description, Map<String, Set<String>> observers) {
    return new RequestCreateWarehouseProperty(operator, user, id, warehouseInstrument,
        warehousePrice, propertyAddress, propertyPostalCode, propertyDistrict, propertyCounty,
        warehouseType, grossArea, usableArea, floors, buildDate, installedEquipment,
        additionalInformation, description, observers).create();
  }

  @Override
  public CreateAnd createAnd() {
    return new CreateAnd(this);
  }

  @Override
  protected ContractCompanion.WithKey<Contract, ContractId, RequestCreateWarehouseProperty, Tuple2<String, Id>> getCompanion(
      ) {
    return COMPANION;
  }

  /**
   * @deprecated since Daml 2.5.0; use {@code valueDecoder} instead
   */
  @Deprecated
  public static RequestCreateWarehouseProperty fromValue(Value value$) throws
      IllegalArgumentException {
    return valueDecoder().decode(value$);
  }

  public static ValueDecoder<RequestCreateWarehouseProperty> valueDecoder() throws
      IllegalArgumentException {
    return ContractCompanion.valueDecoder(COMPANION);
  }

  public DamlRecord toValue() {
    ArrayList<DamlRecord.Field> fields = new ArrayList<DamlRecord.Field>(18);
    fields.add(new DamlRecord.Field("operator", new Party(this.operator)));
    fields.add(new DamlRecord.Field("user", new Party(this.user)));
    fields.add(new DamlRecord.Field("id", this.id.toValue()));
    fields.add(new DamlRecord.Field("warehouseInstrument", this.warehouseInstrument.toValue()));
    fields.add(new DamlRecord.Field("warehousePrice", new Numeric(this.warehousePrice)));
    fields.add(new DamlRecord.Field("propertyAddress", new Text(this.propertyAddress)));
    fields.add(new DamlRecord.Field("propertyPostalCode", new Text(this.propertyPostalCode)));
    fields.add(new DamlRecord.Field("propertyDistrict", new Text(this.propertyDistrict)));
    fields.add(new DamlRecord.Field("propertyCounty", new Text(this.propertyCounty)));
    fields.add(new DamlRecord.Field("warehouseType", this.warehouseType.toValue()));
    fields.add(new DamlRecord.Field("grossArea", new Numeric(this.grossArea)));
    fields.add(new DamlRecord.Field("usableArea", new Numeric(this.usableArea)));
    fields.add(new DamlRecord.Field("floors", new Int64(this.floors)));
    fields.add(new DamlRecord.Field("buildDate", new Date((int) this.buildDate.toEpochDay())));
    fields.add(new DamlRecord.Field("installedEquipment", new Text(this.installedEquipment)));
    fields.add(new DamlRecord.Field("additionalInformation", new Text(this.additionalInformation)));
    fields.add(new DamlRecord.Field("description", new Text(this.description)));
    fields.add(new DamlRecord.Field("observers", this.observers.entrySet().stream()
        .collect(DamlCollectors.toDamlGenMap(v$0 -> new Text(v$0.getKey()), v$0 -> v$0.getValue().toValue(v$1 -> new Party(v$1))))));
    return new DamlRecord(fields);
  }

  private static ValueDecoder<RequestCreateWarehouseProperty> templateValueDecoder() throws
      IllegalArgumentException {
    return value$ -> {
      Value recordValue$ = value$;
      List<DamlRecord.Field> fields$ = PrimitiveValueDecoders.recordCheck(18,0, recordValue$);
      String operator = PrimitiveValueDecoders.fromParty.decode(fields$.get(0).getValue());
      String user = PrimitiveValueDecoders.fromParty.decode(fields$.get(1).getValue());
      Id id = Id.valueDecoder().decode(fields$.get(2).getValue());
      InstrumentKey warehouseInstrument = InstrumentKey.valueDecoder()
          .decode(fields$.get(3).getValue());
      BigDecimal warehousePrice = PrimitiveValueDecoders.fromNumeric
          .decode(fields$.get(4).getValue());
      String propertyAddress = PrimitiveValueDecoders.fromText.decode(fields$.get(5).getValue());
      String propertyPostalCode = PrimitiveValueDecoders.fromText.decode(fields$.get(6).getValue());
      String propertyDistrict = PrimitiveValueDecoders.fromText.decode(fields$.get(7).getValue());
      String propertyCounty = PrimitiveValueDecoders.fromText.decode(fields$.get(8).getValue());
      WarehouseType warehouseType = WarehouseType.valueDecoder().decode(fields$.get(9).getValue());
      BigDecimal grossArea = PrimitiveValueDecoders.fromNumeric.decode(fields$.get(10).getValue());
      BigDecimal usableArea = PrimitiveValueDecoders.fromNumeric.decode(fields$.get(11).getValue());
      Long floors = PrimitiveValueDecoders.fromInt64.decode(fields$.get(12).getValue());
      LocalDate buildDate = PrimitiveValueDecoders.fromDate.decode(fields$.get(13).getValue());
      String installedEquipment = PrimitiveValueDecoders.fromText
          .decode(fields$.get(14).getValue());
      String additionalInformation = PrimitiveValueDecoders.fromText
          .decode(fields$.get(15).getValue());
      String description = PrimitiveValueDecoders.fromText.decode(fields$.get(16).getValue());
      Map<String, Set<String>> observers = PrimitiveValueDecoders.fromGenMap(
            PrimitiveValueDecoders.fromText,
            Set.<java.lang.String>valueDecoder(PrimitiveValueDecoders.fromParty))
          .decode(fields$.get(17).getValue());
      return new RequestCreateWarehouseProperty(operator, user, id, warehouseInstrument,
          warehousePrice, propertyAddress, propertyPostalCode, propertyDistrict, propertyCounty,
          warehouseType, grossArea, usableArea, floors, buildDate, installedEquipment,
          additionalInformation, description, observers);
    } ;
  }

  public static JsonLfDecoder<RequestCreateWarehouseProperty> jsonDecoder() {
    return JsonLfDecoders.record(Arrays.asList("operator", "user", "id", "warehouseInstrument", "warehousePrice", "propertyAddress", "propertyPostalCode", "propertyDistrict", "propertyCounty", "warehouseType", "grossArea", "usableArea", "floors", "buildDate", "installedEquipment", "additionalInformation", "description", "observers"), name -> {
          switch (name) {
            case "operator": return com.daml.ledger.javaapi.data.codegen.json.JsonLfDecoders.JavaArg.at(0, com.daml.ledger.javaapi.data.codegen.json.JsonLfDecoders.party);
            case "user": return com.daml.ledger.javaapi.data.codegen.json.JsonLfDecoders.JavaArg.at(1, com.daml.ledger.javaapi.data.codegen.json.JsonLfDecoders.party);
            case "id": return com.daml.ledger.javaapi.data.codegen.json.JsonLfDecoders.JavaArg.at(2, daml.daml.finance.interface$.types.common.types.Id.jsonDecoder());
            case "warehouseInstrument": return com.daml.ledger.javaapi.data.codegen.json.JsonLfDecoders.JavaArg.at(3, daml.daml.finance.interface$.types.common.types.InstrumentKey.jsonDecoder());
            case "warehousePrice": return com.daml.ledger.javaapi.data.codegen.json.JsonLfDecoders.JavaArg.at(4, com.daml.ledger.javaapi.data.codegen.json.JsonLfDecoders.numeric(10));
            case "propertyAddress": return com.daml.ledger.javaapi.data.codegen.json.JsonLfDecoders.JavaArg.at(5, com.daml.ledger.javaapi.data.codegen.json.JsonLfDecoders.text);
            case "propertyPostalCode": return com.daml.ledger.javaapi.data.codegen.json.JsonLfDecoders.JavaArg.at(6, com.daml.ledger.javaapi.data.codegen.json.JsonLfDecoders.text);
            case "propertyDistrict": return com.daml.ledger.javaapi.data.codegen.json.JsonLfDecoders.JavaArg.at(7, com.daml.ledger.javaapi.data.codegen.json.JsonLfDecoders.text);
            case "propertyCounty": return com.daml.ledger.javaapi.data.codegen.json.JsonLfDecoders.JavaArg.at(8, com.daml.ledger.javaapi.data.codegen.json.JsonLfDecoders.text);
            case "warehouseType": return com.daml.ledger.javaapi.data.codegen.json.JsonLfDecoders.JavaArg.at(9, daml.interface$.propertymanager.property.common.WarehouseType.jsonDecoder());
            case "grossArea": return com.daml.ledger.javaapi.data.codegen.json.JsonLfDecoders.JavaArg.at(10, com.daml.ledger.javaapi.data.codegen.json.JsonLfDecoders.numeric(10));
            case "usableArea": return com.daml.ledger.javaapi.data.codegen.json.JsonLfDecoders.JavaArg.at(11, com.daml.ledger.javaapi.data.codegen.json.JsonLfDecoders.numeric(10));
            case "floors": return com.daml.ledger.javaapi.data.codegen.json.JsonLfDecoders.JavaArg.at(12, com.daml.ledger.javaapi.data.codegen.json.JsonLfDecoders.int64);
            case "buildDate": return com.daml.ledger.javaapi.data.codegen.json.JsonLfDecoders.JavaArg.at(13, com.daml.ledger.javaapi.data.codegen.json.JsonLfDecoders.date);
            case "installedEquipment": return com.daml.ledger.javaapi.data.codegen.json.JsonLfDecoders.JavaArg.at(14, com.daml.ledger.javaapi.data.codegen.json.JsonLfDecoders.text);
            case "additionalInformation": return com.daml.ledger.javaapi.data.codegen.json.JsonLfDecoders.JavaArg.at(15, com.daml.ledger.javaapi.data.codegen.json.JsonLfDecoders.text);
            case "description": return com.daml.ledger.javaapi.data.codegen.json.JsonLfDecoders.JavaArg.at(16, com.daml.ledger.javaapi.data.codegen.json.JsonLfDecoders.text);
            case "observers": return com.daml.ledger.javaapi.data.codegen.json.JsonLfDecoders.JavaArg.at(17, com.daml.ledger.javaapi.data.codegen.json.JsonLfDecoders.genMap(com.daml.ledger.javaapi.data.codegen.json.JsonLfDecoders.text, daml.da.set.types.Set.jsonDecoder(com.daml.ledger.javaapi.data.codegen.json.JsonLfDecoders.party)));
            default: return null;
          }
        }
        , (Object[] args) -> new RequestCreateWarehouseProperty(JsonLfDecoders.cast(args[0]), JsonLfDecoders.cast(args[1]), JsonLfDecoders.cast(args[2]), JsonLfDecoders.cast(args[3]), JsonLfDecoders.cast(args[4]), JsonLfDecoders.cast(args[5]), JsonLfDecoders.cast(args[6]), JsonLfDecoders.cast(args[7]), JsonLfDecoders.cast(args[8]), JsonLfDecoders.cast(args[9]), JsonLfDecoders.cast(args[10]), JsonLfDecoders.cast(args[11]), JsonLfDecoders.cast(args[12]), JsonLfDecoders.cast(args[13]), JsonLfDecoders.cast(args[14]), JsonLfDecoders.cast(args[15]), JsonLfDecoders.cast(args[16]), JsonLfDecoders.cast(args[17])));
  }

  public static RequestCreateWarehouseProperty fromJson(String json) throws JsonLfDecoder.Error {
    return jsonDecoder().decode(new JsonLfReader(json));
  }

  public JsonLfEncoder jsonEncoder() {
    return JsonLfEncoders.record(
        JsonLfEncoders.Field.of("operator", apply(JsonLfEncoders::party, operator)),
        JsonLfEncoders.Field.of("user", apply(JsonLfEncoders::party, user)),
        JsonLfEncoders.Field.of("id", apply(Id::jsonEncoder, id)),
        JsonLfEncoders.Field.of("warehouseInstrument", apply(InstrumentKey::jsonEncoder, warehouseInstrument)),
        JsonLfEncoders.Field.of("warehousePrice", apply(JsonLfEncoders::numeric, warehousePrice)),
        JsonLfEncoders.Field.of("propertyAddress", apply(JsonLfEncoders::text, propertyAddress)),
        JsonLfEncoders.Field.of("propertyPostalCode", apply(JsonLfEncoders::text, propertyPostalCode)),
        JsonLfEncoders.Field.of("propertyDistrict", apply(JsonLfEncoders::text, propertyDistrict)),
        JsonLfEncoders.Field.of("propertyCounty", apply(JsonLfEncoders::text, propertyCounty)),
        JsonLfEncoders.Field.of("warehouseType", apply(WarehouseType::jsonEncoder, warehouseType)),
        JsonLfEncoders.Field.of("grossArea", apply(JsonLfEncoders::numeric, grossArea)),
        JsonLfEncoders.Field.of("usableArea", apply(JsonLfEncoders::numeric, usableArea)),
        JsonLfEncoders.Field.of("floors", apply(JsonLfEncoders::int64, floors)),
        JsonLfEncoders.Field.of("buildDate", apply(JsonLfEncoders::date, buildDate)),
        JsonLfEncoders.Field.of("installedEquipment", apply(JsonLfEncoders::text, installedEquipment)),
        JsonLfEncoders.Field.of("additionalInformation", apply(JsonLfEncoders::text, additionalInformation)),
        JsonLfEncoders.Field.of("description", apply(JsonLfEncoders::text, description)),
        JsonLfEncoders.Field.of("observers", apply(JsonLfEncoders.genMap(JsonLfEncoders::text, _x1 -> _x1.jsonEncoder(JsonLfEncoders::party)), observers)));
  }

  public static ContractFilter<Contract> contractFilter() {
    return ContractFilter.of(COMPANION);
  }

  @Override
  public boolean equals(Object object) {
    if (this == object) {
      return true;
    }
    if (object == null) {
      return false;
    }
    if (!(object instanceof RequestCreateWarehouseProperty)) {
      return false;
    }
    RequestCreateWarehouseProperty other = (RequestCreateWarehouseProperty) object;
    return Objects.equals(this.operator, other.operator) && Objects.equals(this.user, other.user) &&
        Objects.equals(this.id, other.id) &&
        Objects.equals(this.warehouseInstrument, other.warehouseInstrument) &&
        Objects.equals(this.warehousePrice, other.warehousePrice) &&
        Objects.equals(this.propertyAddress, other.propertyAddress) &&
        Objects.equals(this.propertyPostalCode, other.propertyPostalCode) &&
        Objects.equals(this.propertyDistrict, other.propertyDistrict) &&
        Objects.equals(this.propertyCounty, other.propertyCounty) &&
        Objects.equals(this.warehouseType, other.warehouseType) &&
        Objects.equals(this.grossArea, other.grossArea) &&
        Objects.equals(this.usableArea, other.usableArea) &&
        Objects.equals(this.floors, other.floors) &&
        Objects.equals(this.buildDate, other.buildDate) &&
        Objects.equals(this.installedEquipment, other.installedEquipment) &&
        Objects.equals(this.additionalInformation, other.additionalInformation) &&
        Objects.equals(this.description, other.description) &&
        Objects.equals(this.observers, other.observers);
  }

  @Override
  public int hashCode() {
    return Objects.hash(this.operator, this.user, this.id, this.warehouseInstrument,
        this.warehousePrice, this.propertyAddress, this.propertyPostalCode, this.propertyDistrict,
        this.propertyCounty, this.warehouseType, this.grossArea, this.usableArea, this.floors,
        this.buildDate, this.installedEquipment, this.additionalInformation, this.description,
        this.observers);
  }

  @Override
  public String toString() {
    return String.format("daml.app.propertymanager.model.RequestCreateWarehouseProperty(%s, %s, %s, %s, %s, %s, %s, %s, %s, %s, %s, %s, %s, %s, %s, %s, %s, %s)",
        this.operator, this.user, this.id, this.warehouseInstrument, this.warehousePrice,
        this.propertyAddress, this.propertyPostalCode, this.propertyDistrict, this.propertyCounty,
        this.warehouseType, this.grossArea, this.usableArea, this.floors, this.buildDate,
        this.installedEquipment, this.additionalInformation, this.description, this.observers);
  }

  /**
   * Set up an {@link ExerciseByKeyCommand}; invoke an {@code exercise} method on the result of
      this to finish creating the command, or convert to an interface first with {@code toInterface}
      to invoke an interface {@code exercise} method.
   */
  public static ByKey byKey(Tuple2<String, Id> key) {
    return new ByKey(key.toValue(v$0 -> new Party(v$0), v$1 -> v$1.toValue()));
  }

  public static final class ContractId extends com.daml.ledger.javaapi.data.codegen.ContractId<RequestCreateWarehouseProperty> implements Exercises<ExerciseCommand> {
    public ContractId(String contractId) {
      super(contractId);
    }

    @Override
    protected ContractTypeCompanion<? extends com.daml.ledger.javaapi.data.codegen.Contract<ContractId, ?>, ContractId, RequestCreateWarehouseProperty, ?> getCompanion(
        ) {
      return COMPANION;
    }

    public daml.interface$.propertymanager.choices.requestcreatewarehouseproperty.RequestCreateWarehouseProperty.ContractId toInterface(
        daml.interface$.propertymanager.choices.requestcreatewarehouseproperty.RequestCreateWarehouseProperty.INTERFACE_ interfaceCompanion) {
      return new daml.interface$.propertymanager.choices.requestcreatewarehouseproperty.RequestCreateWarehouseProperty.ContractId(this.contractId);
    }

    public Removable.ContractId toInterface(Removable.INTERFACE_ interfaceCompanion) {
      return new Removable.ContractId(this.contractId);
    }

    public static ContractId unsafeFromInterface(
        daml.interface$.propertymanager.choices.requestcreatewarehouseproperty.RequestCreateWarehouseProperty.ContractId interfaceContractId) {
      return new ContractId(interfaceContractId.contractId);
    }

    public static ContractId unsafeFromInterface(Removable.ContractId interfaceContractId) {
      return new ContractId(interfaceContractId.contractId);
    }

    public static ContractId fromContractId(
        com.daml.ledger.javaapi.data.codegen.ContractId<RequestCreateWarehouseProperty> contractId) {
      return COMPANION.toContractId(contractId);
    }
  }

  public static class Contract extends ContractWithKey<ContractId, RequestCreateWarehouseProperty, Tuple2<String, Id>> {
    public Contract(ContractId id, RequestCreateWarehouseProperty data,
        Optional<String> agreementText, Optional<Tuple2<String, Id>> key,
        java.util.Set<String> signatories, java.util.Set<String> observers) {
      super(id, data, agreementText, key, signatories, observers);
    }

    @Override
    protected ContractCompanion<Contract, ContractId, RequestCreateWarehouseProperty> getCompanion(
        ) {
      return COMPANION;
    }

    public static Contract fromIdAndRecord(String contractId, DamlRecord record$,
        Optional<String> agreementText, Optional<Tuple2<String, Id>> key,
        java.util.Set<String> signatories, java.util.Set<String> observers) {
      return COMPANION.fromIdAndRecord(contractId, record$, agreementText, key, signatories,
          observers);
    }

    public static Contract fromCreatedEvent(CreatedEvent event) {
      return COMPANION.fromCreatedEvent(event);
    }
  }

  public interface Exercises<Cmd> extends com.daml.ledger.javaapi.data.codegen.Exercises.Archive<Cmd> {
    default Update<Exercised<Unit>> exerciseArchive(daml.da.internal.template.Archive arg) {
      return makeExerciseCmd(CHOICE_Archive, arg);
    }

    default Update<Exercised<Unit>> exerciseArchive() {
      return exerciseArchive(new daml.da.internal.template.Archive());
    }
  }

  public static final class CreateAnd extends com.daml.ledger.javaapi.data.codegen.CreateAnd implements Exercises<CreateAndExerciseCommand> {
    CreateAnd(Template createArguments) {
      super(createArguments);
    }

    @Override
    protected ContractTypeCompanion<? extends com.daml.ledger.javaapi.data.codegen.Contract<ContractId, ?>, ContractId, RequestCreateWarehouseProperty, ?> getCompanion(
        ) {
      return COMPANION;
    }

    public daml.interface$.propertymanager.choices.requestcreatewarehouseproperty.RequestCreateWarehouseProperty.CreateAnd toInterface(
        daml.interface$.propertymanager.choices.requestcreatewarehouseproperty.RequestCreateWarehouseProperty.INTERFACE_ interfaceCompanion) {
      return new daml.interface$.propertymanager.choices.requestcreatewarehouseproperty.RequestCreateWarehouseProperty.CreateAnd(COMPANION, this.createArguments);
    }

    public Removable.CreateAnd toInterface(Removable.INTERFACE_ interfaceCompanion) {
      return new Removable.CreateAnd(COMPANION, this.createArguments);
    }
  }

  public static final class ByKey extends com.daml.ledger.javaapi.data.codegen.ByKey implements Exercises<ExerciseByKeyCommand> {
    ByKey(Value key) {
      super(key);
    }

    @Override
    protected ContractTypeCompanion<? extends com.daml.ledger.javaapi.data.codegen.Contract<ContractId, ?>, ContractId, RequestCreateWarehouseProperty, ?> getCompanion(
        ) {
      return COMPANION;
    }

    public daml.interface$.propertymanager.choices.requestcreatewarehouseproperty.RequestCreateWarehouseProperty.ByKey toInterface(
        daml.interface$.propertymanager.choices.requestcreatewarehouseproperty.RequestCreateWarehouseProperty.INTERFACE_ interfaceCompanion) {
      return new daml.interface$.propertymanager.choices.requestcreatewarehouseproperty.RequestCreateWarehouseProperty.ByKey(COMPANION, this.contractKey);
    }

    public Removable.ByKey toInterface(Removable.INTERFACE_ interfaceCompanion) {
      return new Removable.ByKey(COMPANION, this.contractKey);
    }
  }
}
