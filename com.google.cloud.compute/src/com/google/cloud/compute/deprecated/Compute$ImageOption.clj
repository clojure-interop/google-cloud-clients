(ns com.google.cloud.compute.deprecated.Compute$ImageOption
  "Class for specifying image get options."
  (:refer-clojure :only [require comment defn ->])
  (:import [com.google.cloud.compute.deprecated Compute$ImageOption]))

(defn *fields
  "Returns an option to specify the image's fields to be returned by the RPC call. If this
   option is not provided, all image's fields are returned. ImageOption.fields can be
   used to specify only the fields of interest. ImageInfo.getImageId() and ImageInfo.getConfiguration() are always returned, even if not specified.

  fields - `com.google.cloud.compute.deprecated.Compute$ImageField`

  returns: `com.google.cloud.compute.deprecated.Compute$ImageOption`"
  (^com.google.cloud.compute.deprecated.Compute$ImageOption [^com.google.cloud.compute.deprecated.Compute$ImageField fields]
    (Compute$ImageOption/fields fields)))

(defn equals
  "obj - `java.lang.Object`

  returns: `boolean`"
  (^Boolean [^Compute$ImageOption this ^java.lang.Object obj]
    (-> this (.equals obj))))

(defn hash-code
  "returns: `int`"
  (^Integer [^Compute$ImageOption this]
    (-> this (.hashCode))))

(defn to-string
  "returns: `java.lang.String`"
  (^java.lang.String [^Compute$ImageOption this]
    (-> this (.toString))))

