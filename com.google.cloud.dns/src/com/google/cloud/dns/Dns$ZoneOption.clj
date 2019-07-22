(ns com.google.cloud.dns.Dns$ZoneOption
  "Class for specifying zone field options."
  (:refer-clojure :only [require comment defn ->])
  (:import [com.google.cloud.dns Dns$ZoneOption]))

(defn *fields
  "Returns an option to specify the zones's fields to be returned by the RPC call.

   If this option is not provided all zone fields are returned. ZoneOption.fields can
   be used to specify only the fields of interest. Zone ID is always returned, even if not
   specified. Dns.ZoneField provides a list of fields that can be used.

  fields - `com.google.cloud.dns.Dns$ZoneField`

  returns: `com.google.cloud.dns.Dns$ZoneOption`"
  (^com.google.cloud.dns.Dns$ZoneOption [^com.google.cloud.dns.Dns$ZoneField fields]
    (Dns$ZoneOption/fields fields)))

(defn equals
  "obj - `java.lang.Object`

  returns: `boolean`"
  (^Boolean [^Dns$ZoneOption this ^java.lang.Object obj]
    (-> this (.equals obj))))

(defn hash-code
  "returns: `int`"
  (^Integer [^Dns$ZoneOption this]
    (-> this (.hashCode))))

(defn to-string
  "returns: `java.lang.String`"
  (^java.lang.String [^Dns$ZoneOption this]
    (-> this (.toString))))

