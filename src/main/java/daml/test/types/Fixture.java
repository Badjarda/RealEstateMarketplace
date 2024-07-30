package daml.test.types;

import static com.daml.ledger.javaapi.data.codegen.json.JsonLfEncoders.apply;

import com.daml.ledger.javaapi.data.DamlCollectors;
import com.daml.ledger.javaapi.data.Value;
import com.daml.ledger.javaapi.data.codegen.DamlRecord;
import com.daml.ledger.javaapi.data.codegen.PrimitiveValueDecoders;
import com.daml.ledger.javaapi.data.codegen.ValueDecoder;
import com.daml.ledger.javaapi.data.codegen.json.JsonLfDecoder;
import com.daml.ledger.javaapi.data.codegen.json.JsonLfDecoders;
import com.daml.ledger.javaapi.data.codegen.json.JsonLfEncoder;
import com.daml.ledger.javaapi.data.codegen.json.JsonLfEncoders;
import com.daml.ledger.javaapi.data.codegen.json.JsonLfReader;
import daml.daml.finance.interface$.holding.holding.Holding;
import daml.daml.finance.interface$.types.common.types.AccountKey;
import daml.daml.finance.interface$.types.common.types.InstrumentKey;
import daml.interface$.base.service.Service;
import daml.interface$.common.types.UserRoleKey;
import java.lang.Deprecated;
import java.lang.IllegalArgumentException;
import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;

public class Fixture extends DamlRecord<Fixture> {
  public static final String _packageId = "f8883c36e16696951f0e9312ee45dacca92b05226daf215a5159b95d1b1c4079";

  public final List<InstrumentKey> instruments;

  public final List<AccountKey> accounts;

  public final List<Holding.ContractId> holdings;

  public final List<Service.ContractId> services;

  public final List<UserRoleKey> roles;

  public Fixture(List<InstrumentKey> instruments, List<AccountKey> accounts,
      List<Holding.ContractId> holdings, List<Service.ContractId> services,
      List<UserRoleKey> roles) {
    this.instruments = instruments;
    this.accounts = accounts;
    this.holdings = holdings;
    this.services = services;
    this.roles = roles;
  }

  /**
   * @deprecated since Daml 2.5.0; use {@code valueDecoder} instead
   */
  @Deprecated
  public static Fixture fromValue(Value value$) throws IllegalArgumentException {
    return valueDecoder().decode(value$);
  }

  public static ValueDecoder<Fixture> valueDecoder() throws IllegalArgumentException {
    return value$ -> {
      Value recordValue$ = value$;
      List<com.daml.ledger.javaapi.data.DamlRecord.Field> fields$ = PrimitiveValueDecoders.recordCheck(5,0,
          recordValue$);
      List<InstrumentKey> instruments = PrimitiveValueDecoders.fromList(
            InstrumentKey.valueDecoder()).decode(fields$.get(0).getValue());
      List<AccountKey> accounts = PrimitiveValueDecoders.fromList(AccountKey.valueDecoder())
          .decode(fields$.get(1).getValue());
      List<Holding.ContractId> holdings = PrimitiveValueDecoders.fromList(v$0 ->
              new Holding.ContractId(v$0.asContractId().orElseThrow(() -> new IllegalArgumentException("Expected holdings to be of type com.daml.ledger.javaapi.data.ContractId")).getValue()))
          .decode(fields$.get(2).getValue());
      List<Service.ContractId> services = PrimitiveValueDecoders.fromList(v$0 ->
              new Service.ContractId(v$0.asContractId().orElseThrow(() -> new IllegalArgumentException("Expected services to be of type com.daml.ledger.javaapi.data.ContractId")).getValue()))
          .decode(fields$.get(3).getValue());
      List<UserRoleKey> roles = PrimitiveValueDecoders.fromList(UserRoleKey.valueDecoder())
          .decode(fields$.get(4).getValue());
      return new Fixture(instruments, accounts, holdings, services, roles);
    } ;
  }

  public com.daml.ledger.javaapi.data.DamlRecord toValue() {
    ArrayList<com.daml.ledger.javaapi.data.DamlRecord.Field> fields = new ArrayList<com.daml.ledger.javaapi.data.DamlRecord.Field>(5);
    fields.add(new com.daml.ledger.javaapi.data.DamlRecord.Field("instruments", this.instruments.stream().collect(DamlCollectors.toDamlList(v$0 -> v$0.toValue()))));
    fields.add(new com.daml.ledger.javaapi.data.DamlRecord.Field("accounts", this.accounts.stream().collect(DamlCollectors.toDamlList(v$0 -> v$0.toValue()))));
    fields.add(new com.daml.ledger.javaapi.data.DamlRecord.Field("holdings", this.holdings.stream().collect(DamlCollectors.toDamlList(v$0 -> v$0.toValue()))));
    fields.add(new com.daml.ledger.javaapi.data.DamlRecord.Field("services", this.services.stream().collect(DamlCollectors.toDamlList(v$0 -> v$0.toValue()))));
    fields.add(new com.daml.ledger.javaapi.data.DamlRecord.Field("roles", this.roles.stream().collect(DamlCollectors.toDamlList(v$0 -> v$0.toValue()))));
    return new com.daml.ledger.javaapi.data.DamlRecord(fields);
  }

  public static JsonLfDecoder<Fixture> jsonDecoder() {
    return JsonLfDecoders.record(Arrays.asList("instruments", "accounts", "holdings", "services", "roles"), name -> {
          switch (name) {
            case "instruments": return com.daml.ledger.javaapi.data.codegen.json.JsonLfDecoders.JavaArg.at(0, com.daml.ledger.javaapi.data.codegen.json.JsonLfDecoders.list(daml.daml.finance.interface$.types.common.types.InstrumentKey.jsonDecoder()));
            case "accounts": return com.daml.ledger.javaapi.data.codegen.json.JsonLfDecoders.JavaArg.at(1, com.daml.ledger.javaapi.data.codegen.json.JsonLfDecoders.list(daml.daml.finance.interface$.types.common.types.AccountKey.jsonDecoder()));
            case "holdings": return com.daml.ledger.javaapi.data.codegen.json.JsonLfDecoders.JavaArg.at(2, com.daml.ledger.javaapi.data.codegen.json.JsonLfDecoders.list(com.daml.ledger.javaapi.data.codegen.json.JsonLfDecoders.contractId(daml.daml.finance.interface$.holding.holding.Holding.ContractId::new)));
            case "services": return com.daml.ledger.javaapi.data.codegen.json.JsonLfDecoders.JavaArg.at(3, com.daml.ledger.javaapi.data.codegen.json.JsonLfDecoders.list(com.daml.ledger.javaapi.data.codegen.json.JsonLfDecoders.contractId(daml.interface$.base.service.Service.ContractId::new)));
            case "roles": return com.daml.ledger.javaapi.data.codegen.json.JsonLfDecoders.JavaArg.at(4, com.daml.ledger.javaapi.data.codegen.json.JsonLfDecoders.list(daml.interface$.common.types.UserRoleKey.jsonDecoder()));
            default: return null;
          }
        }
        , (Object[] args) -> new Fixture(JsonLfDecoders.cast(args[0]), JsonLfDecoders.cast(args[1]), JsonLfDecoders.cast(args[2]), JsonLfDecoders.cast(args[3]), JsonLfDecoders.cast(args[4])));
  }

  public static Fixture fromJson(String json) throws JsonLfDecoder.Error {
    return jsonDecoder().decode(new JsonLfReader(json));
  }

  public JsonLfEncoder jsonEncoder() {
    return JsonLfEncoders.record(
        JsonLfEncoders.Field.of("instruments", apply(JsonLfEncoders.list(InstrumentKey::jsonEncoder), instruments)),
        JsonLfEncoders.Field.of("accounts", apply(JsonLfEncoders.list(AccountKey::jsonEncoder), accounts)),
        JsonLfEncoders.Field.of("holdings", apply(JsonLfEncoders.list(JsonLfEncoders::contractId), holdings)),
        JsonLfEncoders.Field.of("services", apply(JsonLfEncoders.list(JsonLfEncoders::contractId), services)),
        JsonLfEncoders.Field.of("roles", apply(JsonLfEncoders.list(UserRoleKey::jsonEncoder), roles)));
  }

  @Override
  public boolean equals(Object object) {
    if (this == object) {
      return true;
    }
    if (object == null) {
      return false;
    }
    if (!(object instanceof Fixture)) {
      return false;
    }
    Fixture other = (Fixture) object;
    return Objects.equals(this.instruments, other.instruments) &&
        Objects.equals(this.accounts, other.accounts) &&
        Objects.equals(this.holdings, other.holdings) &&
        Objects.equals(this.services, other.services) && Objects.equals(this.roles, other.roles);
  }

  @Override
  public int hashCode() {
    return Objects.hash(this.instruments, this.accounts, this.holdings, this.services, this.roles);
  }

  @Override
  public String toString() {
    return String.format("daml.test.types.Fixture(%s, %s, %s, %s, %s)", this.instruments,
        this.accounts, this.holdings, this.services, this.roles);
  }
}
