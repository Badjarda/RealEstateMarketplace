package daml.interface$.role.operator;

import static com.daml.ledger.javaapi.data.codegen.json.JsonLfEncoders.apply;

import com.daml.ledger.javaapi.data.Party;
import com.daml.ledger.javaapi.data.Value;
import com.daml.ledger.javaapi.data.codegen.DamlRecord;
import com.daml.ledger.javaapi.data.codegen.PrimitiveValueDecoders;
import com.daml.ledger.javaapi.data.codegen.ValueDecoder;
import com.daml.ledger.javaapi.data.codegen.json.JsonLfDecoder;
import com.daml.ledger.javaapi.data.codegen.json.JsonLfDecoders;
import com.daml.ledger.javaapi.data.codegen.json.JsonLfEncoder;
import com.daml.ledger.javaapi.data.codegen.json.JsonLfEncoders;
import com.daml.ledger.javaapi.data.codegen.json.JsonLfReader;
import daml.interface$.profilemanager.userprofile.factory.Factory;
import java.lang.Deprecated;
import java.lang.IllegalArgumentException;
import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;

public class OfferUserProfileManagerService extends DamlRecord<OfferUserProfileManagerService> {
  public static final String _packageId = "f0dcbf884b6b6c6225689dfc29d021f7054d825e7f59acb15e7d4ca03ecb808d";

  public final String user;

  public final Factory.ContractId userProfileFactoryCid;

  public OfferUserProfileManagerService(String user, Factory.ContractId userProfileFactoryCid) {
    this.user = user;
    this.userProfileFactoryCid = userProfileFactoryCid;
  }

  /**
   * @deprecated since Daml 2.5.0; use {@code valueDecoder} instead
   */
  @Deprecated
  public static OfferUserProfileManagerService fromValue(Value value$) throws
      IllegalArgumentException {
    return valueDecoder().decode(value$);
  }

  public static ValueDecoder<OfferUserProfileManagerService> valueDecoder() throws
      IllegalArgumentException {
    return value$ -> {
      Value recordValue$ = value$;
      List<com.daml.ledger.javaapi.data.DamlRecord.Field> fields$ = PrimitiveValueDecoders.recordCheck(2,0,
          recordValue$);
      String user = PrimitiveValueDecoders.fromParty.decode(fields$.get(0).getValue());
      Factory.ContractId userProfileFactoryCid =
          new Factory.ContractId(fields$.get(1).getValue().asContractId().orElseThrow(() -> new IllegalArgumentException("Expected userProfileFactoryCid to be of type com.daml.ledger.javaapi.data.ContractId")).getValue());
      return new OfferUserProfileManagerService(user, userProfileFactoryCid);
    } ;
  }

  public com.daml.ledger.javaapi.data.DamlRecord toValue() {
    ArrayList<com.daml.ledger.javaapi.data.DamlRecord.Field> fields = new ArrayList<com.daml.ledger.javaapi.data.DamlRecord.Field>(2);
    fields.add(new com.daml.ledger.javaapi.data.DamlRecord.Field("user", new Party(this.user)));
    fields.add(new com.daml.ledger.javaapi.data.DamlRecord.Field("userProfileFactoryCid", this.userProfileFactoryCid.toValue()));
    return new com.daml.ledger.javaapi.data.DamlRecord(fields);
  }

  public static JsonLfDecoder<OfferUserProfileManagerService> jsonDecoder() {
    return JsonLfDecoders.record(Arrays.asList("user", "userProfileFactoryCid"), name -> {
          switch (name) {
            case "user": return com.daml.ledger.javaapi.data.codegen.json.JsonLfDecoders.JavaArg.at(0, com.daml.ledger.javaapi.data.codegen.json.JsonLfDecoders.party);
            case "userProfileFactoryCid": return com.daml.ledger.javaapi.data.codegen.json.JsonLfDecoders.JavaArg.at(1, com.daml.ledger.javaapi.data.codegen.json.JsonLfDecoders.contractId(daml.interface$.profilemanager.userprofile.factory.Factory.ContractId::new));
            default: return null;
          }
        }
        , (Object[] args) -> new OfferUserProfileManagerService(JsonLfDecoders.cast(args[0]), JsonLfDecoders.cast(args[1])));
  }

  public static OfferUserProfileManagerService fromJson(String json) throws JsonLfDecoder.Error {
    return jsonDecoder().decode(new JsonLfReader(json));
  }

  public JsonLfEncoder jsonEncoder() {
    return JsonLfEncoders.record(
        JsonLfEncoders.Field.of("user", apply(JsonLfEncoders::party, user)),
        JsonLfEncoders.Field.of("userProfileFactoryCid", apply(JsonLfEncoders::contractId, userProfileFactoryCid)));
  }

  @Override
  public boolean equals(Object object) {
    if (this == object) {
      return true;
    }
    if (object == null) {
      return false;
    }
    if (!(object instanceof OfferUserProfileManagerService)) {
      return false;
    }
    OfferUserProfileManagerService other = (OfferUserProfileManagerService) object;
    return Objects.equals(this.user, other.user) &&
        Objects.equals(this.userProfileFactoryCid, other.userProfileFactoryCid);
  }

  @Override
  public int hashCode() {
    return Objects.hash(this.user, this.userProfileFactoryCid);
  }

  @Override
  public String toString() {
    return String.format("daml.interface$.role.operator.OfferUserProfileManagerService(%s, %s)",
        this.user, this.userProfileFactoryCid);
  }
}
