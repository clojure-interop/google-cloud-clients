(ns com.google.cloud.compute.deprecated.Compute$MachineTypeListOption
  "Class for specifying machine type list options."
  (:refer-clojure :only [require comment defn ->])
  (:import [com.google.cloud.compute.deprecated Compute$MachineTypeListOption]))

(defn *filter
  "Returns an option to specify a filter on the machine types being listed.

  filter - `com.google.cloud.compute.deprecated.Compute$MachineTypeFilter`

  returns: `com.google.cloud.compute.deprecated.Compute$MachineTypeListOption`"
  (^com.google.cloud.compute.deprecated.Compute$MachineTypeListOption [^com.google.cloud.compute.deprecated.Compute$MachineTypeFilter filter]
    (Compute$MachineTypeListOption/filter filter)))

(defn *page-size
  "Returns an option to specify the maximum number of machine types returned per page. pageSize must be between 0 and 500 (inclusive). If not specified 500 is used.

  page-size - `long`

  returns: `com.google.cloud.compute.deprecated.Compute$MachineTypeListOption`"
  (^com.google.cloud.compute.deprecated.Compute$MachineTypeListOption [^Long page-size]
    (Compute$MachineTypeListOption/pageSize page-size)))

(defn *page-token
  "Returns an option to specify the page token from which to start listing machine types.

  page-token - `java.lang.String`

  returns: `com.google.cloud.compute.deprecated.Compute$MachineTypeListOption`"
  (^com.google.cloud.compute.deprecated.Compute$MachineTypeListOption [^java.lang.String page-token]
    (Compute$MachineTypeListOption/pageToken page-token)))

(defn *fields
  "Returns an option to specify the machine type's fields to be returned by the RPC call. If
   this option is not provided, all machine type's fields are returned. MachineTypeListOption.fields can be used to specify only the fields of interest. MachineType.getMachineTypeId() is always returned, even if not specified.

  fields - `com.google.cloud.compute.deprecated.Compute$MachineTypeField`

  returns: `com.google.cloud.compute.deprecated.Compute$MachineTypeListOption`"
  (^com.google.cloud.compute.deprecated.Compute$MachineTypeListOption [^com.google.cloud.compute.deprecated.Compute$MachineTypeField fields]
    (Compute$MachineTypeListOption/fields fields)))

(defn equals
  "obj - `java.lang.Object`

  returns: `boolean`"
  (^Boolean [^Compute$MachineTypeListOption this ^java.lang.Object obj]
    (-> this (.equals obj))))

(defn hash-code
  "returns: `int`"
  (^Integer [^Compute$MachineTypeListOption this]
    (-> this (.hashCode))))

(defn to-string
  "returns: `java.lang.String`"
  (^java.lang.String [^Compute$MachineTypeListOption this]
    (-> this (.toString))))

