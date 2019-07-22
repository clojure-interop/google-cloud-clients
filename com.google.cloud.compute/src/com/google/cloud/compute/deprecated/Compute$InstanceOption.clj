(ns com.google.cloud.compute.deprecated.Compute$InstanceOption
  "Class for specifying instance get options."
  (:refer-clojure :only [require comment defn ->])
  (:import [com.google.cloud.compute.deprecated Compute$InstanceOption]))

(defn *fields
  "Returns an option to specify the instance's fields to be returned by the RPC call. If this
   option is not provided, all instance's fields are returned. InstanceOption.fields can
   be used to specify only the fields of interest. InstanceInfo.getInstanceId() is always
   returned, even if not specified.

  fields - `com.google.cloud.compute.deprecated.Compute$InstanceField`

  returns: `com.google.cloud.compute.deprecated.Compute$InstanceOption`"
  (^com.google.cloud.compute.deprecated.Compute$InstanceOption [^com.google.cloud.compute.deprecated.Compute$InstanceField fields]
    (Compute$InstanceOption/fields fields)))

(defn equals
  "obj - `java.lang.Object`

  returns: `boolean`"
  (^Boolean [^Compute$InstanceOption this ^java.lang.Object obj]
    (-> this (.equals obj))))

(defn hash-code
  "returns: `int`"
  (^Integer [^Compute$InstanceOption this]
    (-> this (.hashCode))))

(defn to-string
  "returns: `java.lang.String`"
  (^java.lang.String [^Compute$InstanceOption this]
    (-> this (.toString))))

