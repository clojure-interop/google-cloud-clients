(ns com.google.cloud.compute.deprecated.Compute$OperationListOption
  "Class for specifying operation list options."
  (:refer-clojure :only [require comment defn ->])
  (:import [com.google.cloud.compute.deprecated Compute$OperationListOption]))

(defn *filter
  "Returns an option to specify a filter on the operations being listed.

  filter - `com.google.cloud.compute.deprecated.Compute$OperationFilter`

  returns: `com.google.cloud.compute.deprecated.Compute$OperationListOption`"
  (^com.google.cloud.compute.deprecated.Compute$OperationListOption [^com.google.cloud.compute.deprecated.Compute$OperationFilter filter]
    (Compute$OperationListOption/filter filter)))

(defn *page-size
  "Returns an option to specify the maximum number of operations returned per page. pageSize must be between 0 and 500 (inclusive). If not specified 500 is used.

  page-size - `long`

  returns: `com.google.cloud.compute.deprecated.Compute$OperationListOption`"
  (^com.google.cloud.compute.deprecated.Compute$OperationListOption [^Long page-size]
    (Compute$OperationListOption/pageSize page-size)))

(defn *page-token
  "Returns an option to specify the page token from which to start listing operations.

  page-token - `java.lang.String`

  returns: `com.google.cloud.compute.deprecated.Compute$OperationListOption`"
  (^com.google.cloud.compute.deprecated.Compute$OperationListOption [^java.lang.String page-token]
    (Compute$OperationListOption/pageToken page-token)))

(defn *fields
  "Returns an option to specify the operation's fields to be returned by the RPC call. If this
   option is not provided, all operation's fields are returned. OperationListOption.fields can be used to specify only the fields of interest. Operation.getOperationId() is always returned, even if not specified.

  fields - `com.google.cloud.compute.deprecated.Compute$OperationField`

  returns: `com.google.cloud.compute.deprecated.Compute$OperationListOption`"
  (^com.google.cloud.compute.deprecated.Compute$OperationListOption [^com.google.cloud.compute.deprecated.Compute$OperationField fields]
    (Compute$OperationListOption/fields fields)))

(defn equals
  "obj - `java.lang.Object`

  returns: `boolean`"
  (^Boolean [^Compute$OperationListOption this ^java.lang.Object obj]
    (-> this (.equals obj))))

(defn hash-code
  "returns: `int`"
  (^Integer [^Compute$OperationListOption this]
    (-> this (.hashCode))))

(defn to-string
  "returns: `java.lang.String`"
  (^java.lang.String [^Compute$OperationListOption this]
    (-> this (.toString))))

