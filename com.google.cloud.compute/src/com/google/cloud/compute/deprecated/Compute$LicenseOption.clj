(ns com.google.cloud.compute.deprecated.Compute$LicenseOption
  "Class for specifying license get options."
  (:refer-clojure :only [require comment defn ->])
  (:import [com.google.cloud.compute.deprecated Compute$LicenseOption]))

(defn *fields
  "Returns an option to specify the license's fields to be returned by the RPC call. If this
   option is not provided, all license's fields are returned. LicenseOption.fields can
   be used to specify only the fields of interest. License.getLicenseId() is always
   returned, even if not specified.

  fields - `com.google.cloud.compute.deprecated.Compute$LicenseField`

  returns: `com.google.cloud.compute.deprecated.Compute$LicenseOption`"
  (^com.google.cloud.compute.deprecated.Compute$LicenseOption [^com.google.cloud.compute.deprecated.Compute$LicenseField fields]
    (Compute$LicenseOption/fields fields)))

(defn equals
  "obj - `java.lang.Object`

  returns: `boolean`"
  (^Boolean [^Compute$LicenseOption this ^java.lang.Object obj]
    (-> this (.equals obj))))

(defn hash-code
  "returns: `int`"
  (^Integer [^Compute$LicenseOption this]
    (-> this (.hashCode))))

(defn to-string
  "returns: `java.lang.String`"
  (^java.lang.String [^Compute$LicenseOption this]
    (-> this (.toString))))

