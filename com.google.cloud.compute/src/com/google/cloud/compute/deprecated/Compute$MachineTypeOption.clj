(ns com.google.cloud.compute.deprecated.Compute$MachineTypeOption
  "Class for specifying machine type get options."
  (:refer-clojure :only [require comment defn ->])
  (:import [com.google.cloud.compute.deprecated Compute$MachineTypeOption]))

(defn *fields
  "Returns an option to specify the machine type's fields to be returned by the RPC call. If
   this option is not provided, all machine type's fields are returned. MachineTypeOption.fields can be used to specify only the fields of interest. MachineType.getMachineTypeId() is always returned, even if not specified.

  fields - `com.google.cloud.compute.deprecated.Compute$MachineTypeField`

  returns: `com.google.cloud.compute.deprecated.Compute$MachineTypeOption`"
  (^com.google.cloud.compute.deprecated.Compute$MachineTypeOption [^com.google.cloud.compute.deprecated.Compute$MachineTypeField fields]
    (Compute$MachineTypeOption/fields fields)))

(defn equals
  "obj - `java.lang.Object`

  returns: `boolean`"
  (^Boolean [^Compute$MachineTypeOption this ^java.lang.Object obj]
    (-> this (.equals obj))))

(defn hash-code
  "returns: `int`"
  (^Integer [^Compute$MachineTypeOption this]
    (-> this (.hashCode))))

(defn to-string
  "returns: `java.lang.String`"
  (^java.lang.String [^Compute$MachineTypeOption this]
    (-> this (.toString))))

