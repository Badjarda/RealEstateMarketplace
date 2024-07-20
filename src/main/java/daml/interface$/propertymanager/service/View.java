package daml.interface$.propertymanager.service;

import static com.daml.ledger.javaapi.data.codegen.json.JsonLfEncoders.apply;

import com.daml.ledger.javaapi.data.Value;
import com.daml.ledger.javaapi.data.codegen.DamlRecord;
import com.daml.ledger.javaapi.data.codegen.PrimitiveValueDecoders;
import com.daml.ledger.javaapi.data.codegen.ValueDecoder;
import com.daml.ledger.javaapi.data.codegen.json.JsonLfDecoder;
import com.daml.ledger.javaapi.data.codegen.json.JsonLfDecoders;
import com.daml.ledger.javaapi.data.codegen.json.JsonLfEncoder;
import com.daml.ledger.javaapi.data.codegen.json.JsonLfEncoders;
import com.daml.ledger.javaapi.data.codegen.json.JsonLfReader;
import daml.interface$.propertymanager.property.apartmentproperty.factory.Factory;
import java.lang.Deprecated;
import java.lang.IllegalArgumentException;
import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;

public class View extends DamlRecord<View> {
  public static final String _packageId = "f0dcbf884b6b6c6225689dfc29d021f7054d825e7f59acb15e7d4ca03ecb808d";

  public final Factory.ContractId apartmentPropertyFactoryCid;

  public final daml.interface$.propertymanager.property.landproperty.factory.Factory.ContractId landPropertyFactoryCid;

  public final daml.interface$.propertymanager.property.residenceproperty.factory.Factory.ContractId residencePropertyFactoryCid;

  public final daml.interface$.propertymanager.property.garageproperty.factory.Factory.ContractId garagePropertyFactoryCid;

  public final daml.interface$.propertymanager.property.warehouseproperty.factory.Factory.ContractId warehousePropertyFactoryCid;

  public View(Factory.ContractId apartmentPropertyFactoryCid,
      daml.interface$.propertymanager.property.landproperty.factory.Factory.ContractId landPropertyFactoryCid,
      daml.interface$.propertymanager.property.residenceproperty.factory.Factory.ContractId residencePropertyFactoryCid,
      daml.interface$.propertymanager.property.garageproperty.factory.Factory.ContractId garagePropertyFactoryCid,
      daml.interface$.propertymanager.property.warehouseproperty.factory.Factory.ContractId warehousePropertyFactoryCid) {
    this.apartmentPropertyFactoryCid = apartmentPropertyFactoryCid;
    this.landPropertyFactoryCid = landPropertyFactoryCid;
    this.residencePropertyFactoryCid = residencePropertyFactoryCid;
    this.garagePropertyFactoryCid = garagePropertyFactoryCid;
    this.warehousePropertyFactoryCid = warehousePropertyFactoryCid;
  }

  /**
   * @deprecated since Daml 2.5.0; use {@code valueDecoder} instead
   */
  @Deprecated
  public static View fromValue(Value value$) throws IllegalArgumentException {
    return valueDecoder().decode(value$);
  }

  public static ValueDecoder<View> valueDecoder() throws IllegalArgumentException {
    return value$ -> {
      Value recordValue$ = value$;
      List<com.daml.ledger.javaapi.data.DamlRecord.Field> fields$ = PrimitiveValueDecoders.recordCheck(5,0,
          recordValue$);
      Factory.ContractId apartmentPropertyFactoryCid =
          new Factory.ContractId(fields$.get(0).getValue().asContractId().orElseThrow(() -> new IllegalArgumentException("Expected apartmentPropertyFactoryCid to be of type com.daml.ledger.javaapi.data.ContractId")).getValue());
      daml.interface$.propertymanager.property.landproperty.factory.Factory.ContractId landPropertyFactoryCid =
          new daml.interface$.propertymanager.property.landproperty.factory.Factory.ContractId(fields$.get(1).getValue().asContractId().orElseThrow(() -> new IllegalArgumentException("Expected landPropertyFactoryCid to be of type com.daml.ledger.javaapi.data.ContractId")).getValue());
      daml.interface$.propertymanager.property.residenceproperty.factory.Factory.ContractId residencePropertyFactoryCid =
          new daml.interface$.propertymanager.property.residenceproperty.factory.Factory.ContractId(fields$.get(2).getValue().asContractId().orElseThrow(() -> new IllegalArgumentException("Expected residencePropertyFactoryCid to be of type com.daml.ledger.javaapi.data.ContractId")).getValue());
      daml.interface$.propertymanager.property.garageproperty.factory.Factory.ContractId garagePropertyFactoryCid =
          new daml.interface$.propertymanager.property.garageproperty.factory.Factory.ContractId(fields$.get(3).getValue().asContractId().orElseThrow(() -> new IllegalArgumentException("Expected garagePropertyFactoryCid to be of type com.daml.ledger.javaapi.data.ContractId")).getValue());
      daml.interface$.propertymanager.property.warehouseproperty.factory.Factory.ContractId warehousePropertyFactoryCid =
          new daml.interface$.propertymanager.property.warehouseproperty.factory.Factory.ContractId(fields$.get(4).getValue().asContractId().orElseThrow(() -> new IllegalArgumentException("Expected warehousePropertyFactoryCid to be of type com.daml.ledger.javaapi.data.ContractId")).getValue());
      return new View(apartmentPropertyFactoryCid, landPropertyFactoryCid,
          residencePropertyFactoryCid, garagePropertyFactoryCid, warehousePropertyFactoryCid);
    } ;
  }

  public com.daml.ledger.javaapi.data.DamlRecord toValue() {
    ArrayList<com.daml.ledger.javaapi.data.DamlRecord.Field> fields = new ArrayList<com.daml.ledger.javaapi.data.DamlRecord.Field>(5);
    fields.add(new com.daml.ledger.javaapi.data.DamlRecord.Field("apartmentPropertyFactoryCid", this.apartmentPropertyFactoryCid.toValue()));
    fields.add(new com.daml.ledger.javaapi.data.DamlRecord.Field("landPropertyFactoryCid", this.landPropertyFactoryCid.toValue()));
    fields.add(new com.daml.ledger.javaapi.data.DamlRecord.Field("residencePropertyFactoryCid", this.residencePropertyFactoryCid.toValue()));
    fields.add(new com.daml.ledger.javaapi.data.DamlRecord.Field("garagePropertyFactoryCid", this.garagePropertyFactoryCid.toValue()));
    fields.add(new com.daml.ledger.javaapi.data.DamlRecord.Field("warehousePropertyFactoryCid", this.warehousePropertyFactoryCid.toValue()));
    return new com.daml.ledger.javaapi.data.DamlRecord(fields);
  }

  public static JsonLfDecoder<View> jsonDecoder() {
    return JsonLfDecoders.record(Arrays.asList("apartmentPropertyFactoryCid", "landPropertyFactoryCid", "residencePropertyFactoryCid", "garagePropertyFactoryCid", "warehousePropertyFactoryCid"), name -> {
          switch (name) {
            case "apartmentPropertyFactoryCid": return com.daml.ledger.javaapi.data.codegen.json.JsonLfDecoders.JavaArg.at(0, com.daml.ledger.javaapi.data.codegen.json.JsonLfDecoders.contractId(daml.interface$.propertymanager.property.apartmentproperty.factory.Factory.ContractId::new));
            case "landPropertyFactoryCid": return com.daml.ledger.javaapi.data.codegen.json.JsonLfDecoders.JavaArg.at(1, com.daml.ledger.javaapi.data.codegen.json.JsonLfDecoders.contractId(daml.interface$.propertymanager.property.landproperty.factory.Factory.ContractId::new));
            case "residencePropertyFactoryCid": return com.daml.ledger.javaapi.data.codegen.json.JsonLfDecoders.JavaArg.at(2, com.daml.ledger.javaapi.data.codegen.json.JsonLfDecoders.contractId(daml.interface$.propertymanager.property.residenceproperty.factory.Factory.ContractId::new));
            case "garagePropertyFactoryCid": return com.daml.ledger.javaapi.data.codegen.json.JsonLfDecoders.JavaArg.at(3, com.daml.ledger.javaapi.data.codegen.json.JsonLfDecoders.contractId(daml.interface$.propertymanager.property.garageproperty.factory.Factory.ContractId::new));
            case "warehousePropertyFactoryCid": return com.daml.ledger.javaapi.data.codegen.json.JsonLfDecoders.JavaArg.at(4, com.daml.ledger.javaapi.data.codegen.json.JsonLfDecoders.contractId(daml.interface$.propertymanager.property.warehouseproperty.factory.Factory.ContractId::new));
            default: return null;
          }
        }
        , (Object[] args) -> new View(JsonLfDecoders.cast(args[0]), JsonLfDecoders.cast(args[1]), JsonLfDecoders.cast(args[2]), JsonLfDecoders.cast(args[3]), JsonLfDecoders.cast(args[4])));
  }

  public static View fromJson(String json) throws JsonLfDecoder.Error {
    return jsonDecoder().decode(new JsonLfReader(json));
  }

  public JsonLfEncoder jsonEncoder() {
    return JsonLfEncoders.record(
        JsonLfEncoders.Field.of("apartmentPropertyFactoryCid", apply(JsonLfEncoders::contractId, apartmentPropertyFactoryCid)),
        JsonLfEncoders.Field.of("landPropertyFactoryCid", apply(JsonLfEncoders::contractId, landPropertyFactoryCid)),
        JsonLfEncoders.Field.of("residencePropertyFactoryCid", apply(JsonLfEncoders::contractId, residencePropertyFactoryCid)),
        JsonLfEncoders.Field.of("garagePropertyFactoryCid", apply(JsonLfEncoders::contractId, garagePropertyFactoryCid)),
        JsonLfEncoders.Field.of("warehousePropertyFactoryCid", apply(JsonLfEncoders::contractId, warehousePropertyFactoryCid)));
  }

  @Override
  public boolean equals(Object object) {
    if (this == object) {
      return true;
    }
    if (object == null) {
      return false;
    }
    if (!(object instanceof View)) {
      return false;
    }
    View other = (View) object;
    return Objects.equals(this.apartmentPropertyFactoryCid, other.apartmentPropertyFactoryCid) &&
        Objects.equals(this.landPropertyFactoryCid, other.landPropertyFactoryCid) &&
        Objects.equals(this.residencePropertyFactoryCid, other.residencePropertyFactoryCid) &&
        Objects.equals(this.garagePropertyFactoryCid, other.garagePropertyFactoryCid) &&
        Objects.equals(this.warehousePropertyFactoryCid, other.warehousePropertyFactoryCid);
  }

  @Override
  public int hashCode() {
    return Objects.hash(this.apartmentPropertyFactoryCid, this.landPropertyFactoryCid,
        this.residencePropertyFactoryCid, this.garagePropertyFactoryCid,
        this.warehousePropertyFactoryCid);
  }

  @Override
  public String toString() {
    return String.format("daml.interface$.propertymanager.service.View(%s, %s, %s, %s, %s)",
        this.apartmentPropertyFactoryCid, this.landPropertyFactoryCid,
        this.residencePropertyFactoryCid, this.garagePropertyFactoryCid,
        this.warehousePropertyFactoryCid);
  }
}
