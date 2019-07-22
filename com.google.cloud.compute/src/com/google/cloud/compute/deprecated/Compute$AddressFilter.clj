(ns com.google.cloud.compute.deprecated.Compute$AddressFilter
  "Class for filtering address lists."
  (:refer-clojure :only [require comment defn ->])
  (:import [com.google.cloud.compute.deprecated Compute$AddressFilter]))

(defn *equals
  "Returns an equals filter for the given field and string value. For string fields, value is interpreted as a regular expression using RE2 syntax. value must match the
   entire field.

  field - `com.google.cloud.compute.deprecated.Compute$AddressField`
  value - `java.lang.String`

  returns: `com.google.cloud.compute.deprecated.Compute$AddressFilter`"
  (^com.google.cloud.compute.deprecated.Compute$AddressFilter [^com.google.cloud.compute.deprecated.Compute$AddressField field ^java.lang.String value]
    (Compute$AddressFilter/equals field value)))

(defn *not-equals
  "Returns a not-equals filter for the given field and string value. For string fields, value is interpreted as a regular expression using RE2 syntax. value must match the
   entire field.

  field - `com.google.cloud.compute.deprecated.Compute$AddressField`
  value - `java.lang.String`

  returns: `com.google.cloud.compute.deprecated.Compute$AddressFilter`"
  (^com.google.cloud.compute.deprecated.Compute$AddressFilter [^com.google.cloud.compute.deprecated.Compute$AddressField field ^java.lang.String value]
    (Compute$AddressFilter/notEquals field value)))

