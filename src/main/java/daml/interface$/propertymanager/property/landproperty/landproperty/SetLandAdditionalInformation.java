package daml.interface$.propertymanager.property.landproperty.landproperty;

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
import java.lang.Deprecated;
import java.lang.IllegalArgumentException;
import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;

public class SetLandAdditionalInformation extends DamlRecord<SetLandAdditionalInformation> {
  public static final String _packageId = "63d617a230e28827582264ee3744a561fc8af088ff34f73d66177b7ef8e26382";

  public final String newLandAdditionalInformation;

  public SetLandAdditionalInformation(String newLandAdditionalInformation) {
    this.newLandAdditionalInformation = newLandAdditionalInformation;
  }

  /**
   * @deprecated since Daml 2.5.0; use {@code valueDecoder} instead
   */
  @Deprecated
  public static SetLandAdditionalInformation fromValue(Value value$) throws
      IllegalArgumentException {
    return valueDecoder().decode(value$);
  }

  public static ValueDecoder<SetLandAdditionalInformation> valueDecoder() throws
      IllegalArgumentException {
    return value$ -> {
      Value recordValue$ = value$;
      List<com.daml.ledger.javaapi.data.DamlRecord.Field> fields$ = PrimitiveValueDecoders.recordCheck(1,0,
          recordValue$);
      String newLandAdditionalInformation = PrimitiveValueDecoders.fromText
          .decode(fields$.get(0).getValue());
      return new SetLandAdditionalInformation(newLandAdditionalInformation);
    } ;
  }

  public com.daml.ledger.javaapi.data.DamlRecord toValue() {
    ArrayList<com.daml.ledger.javaapi.data.DamlRecord.Field> fields = new ArrayList<com.daml.ledger.javaapi.data.DamlRecord.Field>(1);
    fields.add(new com.daml.ledger.javaapi.data.DamlRecord.Field("newLandAdditionalInformation", new Text(this.newLandAdditionalInformation)));
    return new com.daml.ledger.javaapi.data.DamlRecord(fields);
  }

  public static JsonLfDecoder<SetLandAdditionalInformation> jsonDecoder() {
    return JsonLfDecoders.record(Arrays.asList("newLandAdditionalInformation"), name -> {
          switch (name) {
            case "newLandAdditionalInformation": return com.daml.ledger.javaapi.data.codegen.json.JsonLfDecoders.JavaArg.at(0, com.daml.ledger.javaapi.data.codegen.json.JsonLfDecoders.text);
            default: return null;
          }
        }
        , (Object[] args) -> new SetLandAdditionalInformation(JsonLfDecoders.cast(args[0])));
  }

  public static SetLandAdditionalInformation fromJson(String json) throws JsonLfDecoder.Error {
    return jsonDecoder().decode(new JsonLfReader(json));
  }

  public JsonLfEncoder jsonEncoder() {
    return JsonLfEncoders.record(
        JsonLfEncoders.Field.of("newLandAdditionalInformation", apply(JsonLfEncoders::text, newLandAdditionalInformation)));
  }

  @Override
  public boolean equals(Object object) {
    if (this == object) {
      return true;
    }
    if (object == null) {
      return false;
    }
    if (!(object instanceof SetLandAdditionalInformation)) {
      return false;
    }
    SetLandAdditionalInformation other = (SetLandAdditionalInformation) object;
    return Objects.equals(this.newLandAdditionalInformation, other.newLandAdditionalInformation);
  }

  @Override
  public int hashCode() {
    return Objects.hash(this.newLandAdditionalInformation);
  }

  @Override
  public String toString() {
    return String.format("daml.interface$.propertymanager.property.landproperty.landproperty.SetLandAdditionalInformation(%s)",
        this.newLandAdditionalInformation);
  }
}