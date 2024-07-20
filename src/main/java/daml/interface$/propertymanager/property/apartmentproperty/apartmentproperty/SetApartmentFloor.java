package daml.interface$.propertymanager.property.apartmentproperty.apartmentproperty;

import static com.daml.ledger.javaapi.data.codegen.json.JsonLfEncoders.apply;

import com.daml.ledger.javaapi.data.Int64;
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
import java.lang.Long;
import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;

public class SetApartmentFloor extends DamlRecord<SetApartmentFloor> {
  public static final String _packageId = "f0dcbf884b6b6c6225689dfc29d021f7054d825e7f59acb15e7d4ca03ecb808d";

  public final Long newApartmentFloor;

  public SetApartmentFloor(Long newApartmentFloor) {
    this.newApartmentFloor = newApartmentFloor;
  }

  /**
   * @deprecated since Daml 2.5.0; use {@code valueDecoder} instead
   */
  @Deprecated
  public static SetApartmentFloor fromValue(Value value$) throws IllegalArgumentException {
    return valueDecoder().decode(value$);
  }

  public static ValueDecoder<SetApartmentFloor> valueDecoder() throws IllegalArgumentException {
    return value$ -> {
      Value recordValue$ = value$;
      List<com.daml.ledger.javaapi.data.DamlRecord.Field> fields$ = PrimitiveValueDecoders.recordCheck(1,0,
          recordValue$);
      Long newApartmentFloor = PrimitiveValueDecoders.fromInt64.decode(fields$.get(0).getValue());
      return new SetApartmentFloor(newApartmentFloor);
    } ;
  }

  public com.daml.ledger.javaapi.data.DamlRecord toValue() {
    ArrayList<com.daml.ledger.javaapi.data.DamlRecord.Field> fields = new ArrayList<com.daml.ledger.javaapi.data.DamlRecord.Field>(1);
    fields.add(new com.daml.ledger.javaapi.data.DamlRecord.Field("newApartmentFloor", new Int64(this.newApartmentFloor)));
    return new com.daml.ledger.javaapi.data.DamlRecord(fields);
  }

  public static JsonLfDecoder<SetApartmentFloor> jsonDecoder() {
    return JsonLfDecoders.record(Arrays.asList("newApartmentFloor"), name -> {
          switch (name) {
            case "newApartmentFloor": return com.daml.ledger.javaapi.data.codegen.json.JsonLfDecoders.JavaArg.at(0, com.daml.ledger.javaapi.data.codegen.json.JsonLfDecoders.int64);
            default: return null;
          }
        }
        , (Object[] args) -> new SetApartmentFloor(JsonLfDecoders.cast(args[0])));
  }

  public static SetApartmentFloor fromJson(String json) throws JsonLfDecoder.Error {
    return jsonDecoder().decode(new JsonLfReader(json));
  }

  public JsonLfEncoder jsonEncoder() {
    return JsonLfEncoders.record(
        JsonLfEncoders.Field.of("newApartmentFloor", apply(JsonLfEncoders::int64, newApartmentFloor)));
  }

  @Override
  public boolean equals(Object object) {
    if (this == object) {
      return true;
    }
    if (object == null) {
      return false;
    }
    if (!(object instanceof SetApartmentFloor)) {
      return false;
    }
    SetApartmentFloor other = (SetApartmentFloor) object;
    return Objects.equals(this.newApartmentFloor, other.newApartmentFloor);
  }

  @Override
  public int hashCode() {
    return Objects.hash(this.newApartmentFloor);
  }

  @Override
  public String toString() {
    return String.format("daml.interface$.propertymanager.property.apartmentproperty.apartmentproperty.SetApartmentFloor(%s)",
        this.newApartmentFloor);
  }
}
