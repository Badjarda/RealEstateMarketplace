package daml.interface$.propertymanager.service;

import static com.daml.ledger.javaapi.data.codegen.json.JsonLfEncoders.apply;

import com.daml.ledger.javaapi.data.Text;
import com.daml.ledger.javaapi.data.Value;
import com.daml.ledger.javaapi.data.codegen.DamlRecord;
import com.daml.ledger.javaapi.data.codegen.PrimitiveValueDecoders;
import com.daml.ledger.javaapi.data.codegen.ValueDecoder;
import com.daml.ledger.javaapi.data.codegen.json.JsonLfDecoder;
import com.daml.ledger.javaapi.data.codegen.json.JsonLfDecoders;
import com.daml.ledger.javaapi.data.codegen.json.JsonLfEncoder;
import com.daml.ledger.javaapi.data.codegen.json.JsonLfEncoders;
import com.daml.ledger.javaapi.data.codegen.json.JsonLfReader;
import daml.interface$.common.types.PropertyKey;
import java.lang.Deprecated;
import java.lang.IllegalArgumentException;
import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;

public class UpdateResidencePropertyAddress extends DamlRecord<UpdateResidencePropertyAddress> {
  public static final String _packageId = "f0dcbf884b6b6c6225689dfc29d021f7054d825e7f59acb15e7d4ca03ecb808d";

  public final String newResidencePropertyAddress;

  public final PropertyKey propertyKey;

  public UpdateResidencePropertyAddress(String newResidencePropertyAddress,
      PropertyKey propertyKey) {
    this.newResidencePropertyAddress = newResidencePropertyAddress;
    this.propertyKey = propertyKey;
  }

  /**
   * @deprecated since Daml 2.5.0; use {@code valueDecoder} instead
   */
  @Deprecated
  public static UpdateResidencePropertyAddress fromValue(Value value$) throws
      IllegalArgumentException {
    return valueDecoder().decode(value$);
  }

  public static ValueDecoder<UpdateResidencePropertyAddress> valueDecoder() throws
      IllegalArgumentException {
    return value$ -> {
      Value recordValue$ = value$;
      List<com.daml.ledger.javaapi.data.DamlRecord.Field> fields$ = PrimitiveValueDecoders.recordCheck(2,0,
          recordValue$);
      String newResidencePropertyAddress = PrimitiveValueDecoders.fromText
          .decode(fields$.get(0).getValue());
      PropertyKey propertyKey = PropertyKey.valueDecoder().decode(fields$.get(1).getValue());
      return new UpdateResidencePropertyAddress(newResidencePropertyAddress, propertyKey);
    } ;
  }

  public com.daml.ledger.javaapi.data.DamlRecord toValue() {
    ArrayList<com.daml.ledger.javaapi.data.DamlRecord.Field> fields = new ArrayList<com.daml.ledger.javaapi.data.DamlRecord.Field>(2);
    fields.add(new com.daml.ledger.javaapi.data.DamlRecord.Field("newResidencePropertyAddress", new Text(this.newResidencePropertyAddress)));
    fields.add(new com.daml.ledger.javaapi.data.DamlRecord.Field("propertyKey", this.propertyKey.toValue()));
    return new com.daml.ledger.javaapi.data.DamlRecord(fields);
  }

  public static JsonLfDecoder<UpdateResidencePropertyAddress> jsonDecoder() {
    return JsonLfDecoders.record(Arrays.asList("newResidencePropertyAddress", "propertyKey"), name -> {
          switch (name) {
            case "newResidencePropertyAddress": return com.daml.ledger.javaapi.data.codegen.json.JsonLfDecoders.JavaArg.at(0, com.daml.ledger.javaapi.data.codegen.json.JsonLfDecoders.text);
            case "propertyKey": return com.daml.ledger.javaapi.data.codegen.json.JsonLfDecoders.JavaArg.at(1, daml.interface$.common.types.PropertyKey.jsonDecoder());
            default: return null;
          }
        }
        , (Object[] args) -> new UpdateResidencePropertyAddress(JsonLfDecoders.cast(args[0]), JsonLfDecoders.cast(args[1])));
  }

  public static UpdateResidencePropertyAddress fromJson(String json) throws JsonLfDecoder.Error {
    return jsonDecoder().decode(new JsonLfReader(json));
  }

  public JsonLfEncoder jsonEncoder() {
    return JsonLfEncoders.record(
        JsonLfEncoders.Field.of("newResidencePropertyAddress", apply(JsonLfEncoders::text, newResidencePropertyAddress)),
        JsonLfEncoders.Field.of("propertyKey", apply(PropertyKey::jsonEncoder, propertyKey)));
  }

  @Override
  public boolean equals(Object object) {
    if (this == object) {
      return true;
    }
    if (object == null) {
      return false;
    }
    if (!(object instanceof UpdateResidencePropertyAddress)) {
      return false;
    }
    UpdateResidencePropertyAddress other = (UpdateResidencePropertyAddress) object;
    return Objects.equals(this.newResidencePropertyAddress, other.newResidencePropertyAddress) &&
        Objects.equals(this.propertyKey, other.propertyKey);
  }

  @Override
  public int hashCode() {
    return Objects.hash(this.newResidencePropertyAddress, this.propertyKey);
  }

  @Override
  public String toString() {
    return String.format("daml.interface$.propertymanager.service.UpdateResidencePropertyAddress(%s, %s)",
        this.newResidencePropertyAddress, this.propertyKey);
  }
}