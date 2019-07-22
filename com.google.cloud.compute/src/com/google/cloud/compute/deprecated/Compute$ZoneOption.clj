(ns com.google.cloud.compute.deprecated.Compute$ZoneOption
  "Class for specifying zone get options."
  (:refer-clojure :only [require comment defn ->])
  (:import [com.google.cloud.compute.deprecated Compute$ZoneOption]))

(defn *fields
  "Returns an option to specify the zone's fields to be returned by the RPC call. If this option
   is not provided, all zone's fields are returned. ZoneOption.fields can be used to
   specify only the fields of interest. Zone.getZoneId() is always returned, even if not
   specified.

  fields - `com.google.cloud.compute.deprecated.Compute$ZoneField`

  returns: `com.google.cloud.compute.deprecated.Compute$ZoneOption`"
  (^com.google.cloud.compute.deprecated.Compute$ZoneOption [^com.google.cloud.compute.deprecated.Compute$ZoneField fields]
    (Compute$ZoneOption/fields fields)))

(defn equals
  "obj - `java.lang.Object`

  returns: `boolean`"
  (^Boolean [^Compute$ZoneOption this ^java.lang.Object obj]
    (-> this (.equals obj))))

(defn hash-code
  "returns: `int`"
  (^Integer [^Compute$ZoneOption this]
    (-> this (.hashCode))))

(defn to-string
  "returns: `java.lang.String`"
  (^java.lang.String [^Compute$ZoneOption this]
    (-> this (.toString))))

