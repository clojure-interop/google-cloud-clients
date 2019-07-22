(ns com.google.cloud.compute.deprecated.Compute$NetworkOption
  "Class for specifying network get options."
  (:refer-clojure :only [require comment defn ->])
  (:import [com.google.cloud.compute.deprecated Compute$NetworkOption]))

(defn *fields
  "Returns an option to specify the network's fields to be returned by the RPC call. If this
   option is not provided, all network's fields are returned. NetworkOption.fields can
   be used to specify only the fields of interest. NetworkInfo.getNetworkId() and NetworkInfo.getConfiguration() are always returned, even if not specified.

  fields - `com.google.cloud.compute.deprecated.Compute$NetworkField`

  returns: `com.google.cloud.compute.deprecated.Compute$NetworkOption`"
  (^com.google.cloud.compute.deprecated.Compute$NetworkOption [^com.google.cloud.compute.deprecated.Compute$NetworkField fields]
    (Compute$NetworkOption/fields fields)))

(defn equals
  "obj - `java.lang.Object`

  returns: `boolean`"
  (^Boolean [^Compute$NetworkOption this ^java.lang.Object obj]
    (-> this (.equals obj))))

(defn hash-code
  "returns: `int`"
  (^Integer [^Compute$NetworkOption this]
    (-> this (.hashCode))))

(defn to-string
  "returns: `java.lang.String`"
  (^java.lang.String [^Compute$NetworkOption this]
    (-> this (.toString))))

