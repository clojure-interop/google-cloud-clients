(ns com.google.cloud.compute.deprecated.Compute$OperationOption
  "Class for specifying operation get options."
  (:refer-clojure :only [require comment defn ->])
  (:import [com.google.cloud.compute.deprecated Compute$OperationOption]))

(defn *fields
  "Returns an option to specify the operation's fields to be returned by the RPC call. If this
   option is not provided, all operation's fields are returned. OperationOption.fields
   can be used to specify only the fields of interest. Operation.getOperationId() is
   always returned, even if not specified.

  fields - `com.google.cloud.compute.deprecated.Compute$OperationField`

  returns: `com.google.cloud.compute.deprecated.Compute$OperationOption`"
  (^com.google.cloud.compute.deprecated.Compute$OperationOption [^com.google.cloud.compute.deprecated.Compute$OperationField fields]
    (Compute$OperationOption/fields fields)))

(defn equals
  "obj - `java.lang.Object`

  returns: `boolean`"
  (^Boolean [^Compute$OperationOption this ^java.lang.Object obj]
    (-> this (.equals obj))))

(defn hash-code
  "returns: `int`"
  (^Integer [^Compute$OperationOption this]
    (-> this (.hashCode))))

(defn to-string
  "returns: `java.lang.String`"
  (^java.lang.String [^Compute$OperationOption this]
    (-> this (.toString))))

