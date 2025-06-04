package sdk.model;

import com.google.gson.*;

import java.lang.reflect.Type;
import java.math.BigDecimal;

public class BigDecimalAsStringTypeAdapter implements JsonSerializer<BigDecimal>, JsonDeserializer<BigDecimal> {

    @Override
    public JsonElement serialize(BigDecimal src, Type typeOfSrc, JsonSerializationContext context) {
        return new JsonPrimitive(src.toPlainString());
    }

    @Override
    public BigDecimal deserialize(JsonElement json, Type typeOfT, JsonDeserializationContext context) throws JsonParseException {
        return new BigDecimal(json.getAsString());
    }
}