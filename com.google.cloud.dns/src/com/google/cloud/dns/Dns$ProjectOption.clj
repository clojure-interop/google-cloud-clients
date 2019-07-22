(ns com.google.cloud.dns.Dns$ProjectOption
  "Class for specifying project options."
  (:refer-clojure :only [require comment defn ->])
  (:import [com.google.cloud.dns Dns$ProjectOption]))

(defn *fields
  "Returns an option to specify the project's fields to be returned by the RPC call.

   If this option is not provided all project fields are returned. ProjectOption.fields can be used to specify only the fields of interest. Project ID is
   always returned, even if not specified. Dns.ProjectField provides a list of fields that
   can be used.

  fields - `com.google.cloud.dns.Dns$ProjectField`

  returns: `com.google.cloud.dns.Dns$ProjectOption`"
  (^com.google.cloud.dns.Dns$ProjectOption [^com.google.cloud.dns.Dns$ProjectField fields]
    (Dns$ProjectOption/fields fields)))

(defn equals
  "obj - `java.lang.Object`

  returns: `boolean`"
  (^Boolean [^Dns$ProjectOption this ^java.lang.Object obj]
    (-> this (.equals obj))))

(defn hash-code
  "returns: `int`"
  (^Integer [^Dns$ProjectOption this]
    (-> this (.hashCode))))

(defn to-string
  "returns: `java.lang.String`"
  (^java.lang.String [^Dns$ProjectOption this]
    (-> this (.toString))))

