(ns com.google.cloud.compute.deprecated.Compute$RegionOption
  "Class for specifying region get options."
  (:refer-clojure :only [require comment defn ->])
  (:import [com.google.cloud.compute.deprecated Compute$RegionOption]))

(defn *fields
  "Returns an option to specify the region's fields to be returned by the RPC call. If this
   option is not provided, all region's fields are returned. RegionOption.fields can be
   used to specify only the fields of interest. Region.getRegionId() is always returned,
   even if not specified.

  fields - `com.google.cloud.compute.deprecated.Compute$RegionField`

  returns: `com.google.cloud.compute.deprecated.Compute$RegionOption`"
  (^com.google.cloud.compute.deprecated.Compute$RegionOption [^com.google.cloud.compute.deprecated.Compute$RegionField fields]
    (Compute$RegionOption/fields fields)))

(defn equals
  "obj - `java.lang.Object`

  returns: `boolean`"
  (^Boolean [^Compute$RegionOption this ^java.lang.Object obj]
    (-> this (.equals obj))))

(defn hash-code
  "returns: `int`"
  (^Integer [^Compute$RegionOption this]
    (-> this (.hashCode))))

(defn to-string
  "returns: `java.lang.String`"
  (^java.lang.String [^Compute$RegionOption this]
    (-> this (.toString))))

