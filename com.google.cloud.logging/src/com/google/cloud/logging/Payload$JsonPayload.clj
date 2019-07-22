(ns com.google.cloud.logging.Payload$JsonPayload
  "A log entry's JSON payload."
  (:refer-clojure :only [require comment defn ->])
  (:import [com.google.cloud.logging Payload$JsonPayload]))

(defn *of
  "Creates a log entry payload given its JSON data represented as a map. The provided map is
   copied into a Struct object.

   Notice that all numbers (int, long, float and double) are serialized as double values.
   Enums are serialized as strings.

   Example usage of JsonPayload:



   List<Long> listValue = Arrays.asList(1L, 2L);
   Map<String, Object> innerMap = new HashMap<String, Object>();
   innerMap.put(\"booleanValue\", true);
   innerMap.put(\"stringValue\", \"stringValue\");
   Map<String, Object> jsonContent = new HashMap<String, Object>();
   jsonContent.put(\"listValue\", listValue);
   jsonContent.put(\"integerValue\", 42);
   jsonContent.put(\"doubleValue\", 42.0);
   jsonContent.put(\"stringValue\", \"stringValue\");
   jsonContent.put(\"mapValue\", innerMap);
   JsonPayload payload = JsonPayload.of(jsonContent);

  data - `java.util.Map`

  returns: `com.google.cloud.logging.Payload$JsonPayload`"
  (^com.google.cloud.logging.Payload$JsonPayload [^java.util.Map data]
    (Payload$JsonPayload/of data)))

(defn get-data-as-map
  "Returns the log entry's JSON data as an unmodifiable map.

  returns: `java.util.Map<java.lang.String,java.lang.Object>`"
  (^java.util.Map [^Payload$JsonPayload this]
    (-> this (.getDataAsMap))))

