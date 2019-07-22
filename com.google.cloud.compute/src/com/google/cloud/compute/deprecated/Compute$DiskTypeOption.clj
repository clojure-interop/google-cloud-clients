(ns com.google.cloud.compute.deprecated.Compute$DiskTypeOption
  "Class for specifying disk type get options."
  (:refer-clojure :only [require comment defn ->])
  (:import [com.google.cloud.compute.deprecated Compute$DiskTypeOption]))

(defn *fields
  "Returns an option to specify the disk type's fields to be returned by the RPC call. If this
   option is not provided, all disk type's fields are returned. DiskTypeOption.fields
   can be used to specify only the fields of interest. DiskType.getDiskTypeId() is
   always returned, even if not specified.

  fields - `com.google.cloud.compute.deprecated.Compute$DiskTypeField`

  returns: `com.google.cloud.compute.deprecated.Compute$DiskTypeOption`"
  (^com.google.cloud.compute.deprecated.Compute$DiskTypeOption [^com.google.cloud.compute.deprecated.Compute$DiskTypeField fields]
    (Compute$DiskTypeOption/fields fields)))

(defn equals
  "obj - `java.lang.Object`

  returns: `boolean`"
  (^Boolean [^Compute$DiskTypeOption this ^java.lang.Object obj]
    (-> this (.equals obj))))

(defn hash-code
  "returns: `int`"
  (^Integer [^Compute$DiskTypeOption this]
    (-> this (.hashCode))))

(defn to-string
  "returns: `java.lang.String`"
  (^java.lang.String [^Compute$DiskTypeOption this]
    (-> this (.toString))))

