package daml.interface$.profilemanager.userprofile.userprofile;

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

public class SetContactMail extends DamlRecord<SetContactMail> {
  public static final String _packageId = "f0dcbf884b6b6c6225689dfc29d021f7054d825e7f59acb15e7d4ca03ecb808d";

  public final String newContactMail;

  public SetContactMail(String newContactMail) {
    this.newContactMail = newContactMail;
  }

  /**
   * @deprecated since Daml 2.5.0; use {@code valueDecoder} instead
   */
  @Deprecated
  public static SetContactMail fromValue(Value value$) throws IllegalArgumentException {
    return valueDecoder().decode(value$);
  }

  public static ValueDecoder<SetContactMail> valueDecoder() throws IllegalArgumentException {
    return value$ -> {
      Value recordValue$ = value$;
      List<com.daml.ledger.javaapi.data.DamlRecord.Field> fields$ = PrimitiveValueDecoders.recordCheck(1,0,
          recordValue$);
      String newContactMail = PrimitiveValueDecoders.fromText.decode(fields$.get(0).getValue());
      return new SetContactMail(newContactMail);
    } ;
  }

  public com.daml.ledger.javaapi.data.DamlRecord toValue() {
    ArrayList<com.daml.ledger.javaapi.data.DamlRecord.Field> fields = new ArrayList<com.daml.ledger.javaapi.data.DamlRecord.Field>(1);
    fields.add(new com.daml.ledger.javaapi.data.DamlRecord.Field("newContactMail", new Text(this.newContactMail)));
    return new com.daml.ledger.javaapi.data.DamlRecord(fields);
  }

  public static JsonLfDecoder<SetContactMail> jsonDecoder() {
    return JsonLfDecoders.record(Arrays.asList("newContactMail"), name -> {
          switch (name) {
            case "newContactMail": return com.daml.ledger.javaapi.data.codegen.json.JsonLfDecoders.JavaArg.at(0, com.daml.ledger.javaapi.data.codegen.json.JsonLfDecoders.text);
            default: return null;
          }
        }
        , (Object[] args) -> new SetContactMail(JsonLfDecoders.cast(args[0])));
  }

  public static SetContactMail fromJson(String json) throws JsonLfDecoder.Error {
    return jsonDecoder().decode(new JsonLfReader(json));
  }

  public JsonLfEncoder jsonEncoder() {
    return JsonLfEncoders.record(
        JsonLfEncoders.Field.of("newContactMail", apply(JsonLfEncoders::text, newContactMail)));
  }

  @Override
  public boolean equals(Object object) {
    if (this == object) {
      return true;
    }
    if (object == null) {
      return false;
    }
    if (!(object instanceof SetContactMail)) {
      return false;
    }
    SetContactMail other = (SetContactMail) object;
    return Objects.equals(this.newContactMail, other.newContactMail);
  }

  @Override
  public int hashCode() {
    return Objects.hash(this.newContactMail);
  }

  @Override
  public String toString() {
    return String.format("daml.interface$.profilemanager.userprofile.userprofile.SetContactMail(%s)",
        this.newContactMail);
  }
}
