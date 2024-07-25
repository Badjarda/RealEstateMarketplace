package daml.interface$.propertymanager.service;

import static com.daml.ledger.javaapi.data.codegen.json.JsonLfEncoders.apply;

import com.daml.ledger.javaapi.data.DamlCollectors;
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

public class UpdateGaragePhotoReferences extends DamlRecord<UpdateGaragePhotoReferences> {
  public static final String _packageId = "8c6e592f5a33911df4c5cbfd683c840613ba80718b2d85f183257ac23495fc1f";

  public final List<String> newGaragePhotoReferences;

  public final PropertyKey propertyKey;

  public UpdateGaragePhotoReferences(List<String> newGaragePhotoReferences,
      PropertyKey propertyKey) {
    this.newGaragePhotoReferences = newGaragePhotoReferences;
    this.propertyKey = propertyKey;
  }

  /**
   * @deprecated since Daml 2.5.0; use {@code valueDecoder} instead
   */
  @Deprecated
  public static UpdateGaragePhotoReferences fromValue(Value value$) throws
      IllegalArgumentException {
    return valueDecoder().decode(value$);
  }

  public static ValueDecoder<UpdateGaragePhotoReferences> valueDecoder() throws
      IllegalArgumentException {
    return value$ -> {
      Value recordValue$ = value$;
      List<com.daml.ledger.javaapi.data.DamlRecord.Field> fields$ = PrimitiveValueDecoders.recordCheck(2,0,
          recordValue$);
      List<String> newGaragePhotoReferences = PrimitiveValueDecoders.fromList(
            PrimitiveValueDecoders.fromText).decode(fields$.get(0).getValue());
      PropertyKey propertyKey = PropertyKey.valueDecoder().decode(fields$.get(1).getValue());
      return new UpdateGaragePhotoReferences(newGaragePhotoReferences, propertyKey);
    } ;
  }

  public com.daml.ledger.javaapi.data.DamlRecord toValue() {
    ArrayList<com.daml.ledger.javaapi.data.DamlRecord.Field> fields = new ArrayList<com.daml.ledger.javaapi.data.DamlRecord.Field>(2);
    fields.add(new com.daml.ledger.javaapi.data.DamlRecord.Field("newGaragePhotoReferences", this.newGaragePhotoReferences.stream().collect(DamlCollectors.toDamlList(v$0 -> new Text(v$0)))));
    fields.add(new com.daml.ledger.javaapi.data.DamlRecord.Field("propertyKey", this.propertyKey.toValue()));
    return new com.daml.ledger.javaapi.data.DamlRecord(fields);
  }

  public static JsonLfDecoder<UpdateGaragePhotoReferences> jsonDecoder() {
    return JsonLfDecoders.record(Arrays.asList("newGaragePhotoReferences", "propertyKey"), name -> {
          switch (name) {
            case "newGaragePhotoReferences": return com.daml.ledger.javaapi.data.codegen.json.JsonLfDecoders.JavaArg.at(0, com.daml.ledger.javaapi.data.codegen.json.JsonLfDecoders.list(com.daml.ledger.javaapi.data.codegen.json.JsonLfDecoders.text));
            case "propertyKey": return com.daml.ledger.javaapi.data.codegen.json.JsonLfDecoders.JavaArg.at(1, daml.interface$.common.types.PropertyKey.jsonDecoder());
            default: return null;
          }
        }
        , (Object[] args) -> new UpdateGaragePhotoReferences(JsonLfDecoders.cast(args[0]), JsonLfDecoders.cast(args[1])));
  }

  public static UpdateGaragePhotoReferences fromJson(String json) throws JsonLfDecoder.Error {
    return jsonDecoder().decode(new JsonLfReader(json));
  }

  public JsonLfEncoder jsonEncoder() {
    return JsonLfEncoders.record(
        JsonLfEncoders.Field.of("newGaragePhotoReferences", apply(JsonLfEncoders.list(JsonLfEncoders::text), newGaragePhotoReferences)),
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
    if (!(object instanceof UpdateGaragePhotoReferences)) {
      return false;
    }
    UpdateGaragePhotoReferences other = (UpdateGaragePhotoReferences) object;
    return Objects.equals(this.newGaragePhotoReferences, other.newGaragePhotoReferences) &&
        Objects.equals(this.propertyKey, other.propertyKey);
  }

  @Override
  public int hashCode() {
    return Objects.hash(this.newGaragePhotoReferences, this.propertyKey);
  }

  @Override
  public String toString() {
    return String.format("daml.interface$.propertymanager.service.UpdateGaragePhotoReferences(%s, %s)",
        this.newGaragePhotoReferences, this.propertyKey);
  }
}