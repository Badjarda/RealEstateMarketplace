package daml.interface$.profilemanager.service;

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
import daml.interface$.common.types.UserProfileKey;
import java.lang.Deprecated;
import java.lang.IllegalArgumentException;
import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;

public class UpdateLastName extends DamlRecord<UpdateLastName> {
  public static final String _packageId = "63d617a230e28827582264ee3744a561fc8af088ff34f73d66177b7ef8e26382";

  public final String newLastName;

  public final UserProfileKey userProfileKey;

  public UpdateLastName(String newLastName, UserProfileKey userProfileKey) {
    this.newLastName = newLastName;
    this.userProfileKey = userProfileKey;
  }

  /**
   * @deprecated since Daml 2.5.0; use {@code valueDecoder} instead
   */
  @Deprecated
  public static UpdateLastName fromValue(Value value$) throws IllegalArgumentException {
    return valueDecoder().decode(value$);
  }

  public static ValueDecoder<UpdateLastName> valueDecoder() throws IllegalArgumentException {
    return value$ -> {
      Value recordValue$ = value$;
      List<com.daml.ledger.javaapi.data.DamlRecord.Field> fields$ = PrimitiveValueDecoders.recordCheck(2,0,
          recordValue$);
      String newLastName = PrimitiveValueDecoders.fromText.decode(fields$.get(0).getValue());
      UserProfileKey userProfileKey = UserProfileKey.valueDecoder()
          .decode(fields$.get(1).getValue());
      return new UpdateLastName(newLastName, userProfileKey);
    } ;
  }

  public com.daml.ledger.javaapi.data.DamlRecord toValue() {
    ArrayList<com.daml.ledger.javaapi.data.DamlRecord.Field> fields = new ArrayList<com.daml.ledger.javaapi.data.DamlRecord.Field>(2);
    fields.add(new com.daml.ledger.javaapi.data.DamlRecord.Field("newLastName", new Text(this.newLastName)));
    fields.add(new com.daml.ledger.javaapi.data.DamlRecord.Field("userProfileKey", this.userProfileKey.toValue()));
    return new com.daml.ledger.javaapi.data.DamlRecord(fields);
  }

  public static JsonLfDecoder<UpdateLastName> jsonDecoder() {
    return JsonLfDecoders.record(Arrays.asList("newLastName", "userProfileKey"), name -> {
          switch (name) {
            case "newLastName": return com.daml.ledger.javaapi.data.codegen.json.JsonLfDecoders.JavaArg.at(0, com.daml.ledger.javaapi.data.codegen.json.JsonLfDecoders.text);
            case "userProfileKey": return com.daml.ledger.javaapi.data.codegen.json.JsonLfDecoders.JavaArg.at(1, daml.interface$.common.types.UserProfileKey.jsonDecoder());
            default: return null;
          }
        }
        , (Object[] args) -> new UpdateLastName(JsonLfDecoders.cast(args[0]), JsonLfDecoders.cast(args[1])));
  }

  public static UpdateLastName fromJson(String json) throws JsonLfDecoder.Error {
    return jsonDecoder().decode(new JsonLfReader(json));
  }

  public JsonLfEncoder jsonEncoder() {
    return JsonLfEncoders.record(
        JsonLfEncoders.Field.of("newLastName", apply(JsonLfEncoders::text, newLastName)),
        JsonLfEncoders.Field.of("userProfileKey", apply(UserProfileKey::jsonEncoder, userProfileKey)));
  }

  @Override
  public boolean equals(Object object) {
    if (this == object) {
      return true;
    }
    if (object == null) {
      return false;
    }
    if (!(object instanceof UpdateLastName)) {
      return false;
    }
    UpdateLastName other = (UpdateLastName) object;
    return Objects.equals(this.newLastName, other.newLastName) &&
        Objects.equals(this.userProfileKey, other.userProfileKey);
  }

  @Override
  public int hashCode() {
    return Objects.hash(this.newLastName, this.userProfileKey);
  }

  @Override
  public String toString() {
    return String.format("daml.interface$.profilemanager.service.UpdateLastName(%s, %s)",
        this.newLastName, this.userProfileKey);
  }
}