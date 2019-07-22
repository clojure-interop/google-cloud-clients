(ns com.google.cloud.compute.deprecated.Compute$ImageFilter
  "Class for filtering image lists."
  (:refer-clojure :only [require comment defn ->])
  (:import [com.google.cloud.compute.deprecated Compute$ImageFilter]))

(defn *equals
  "Returns an equals filter for the given field and string value. For string fields, value is interpreted as a regular expression using RE2 syntax. value must match the
   entire field.

  field - `com.google.cloud.compute.deprecated.Compute$ImageField`
  value - `java.lang.String`

  returns: `com.google.cloud.compute.deprecated.Compute$ImageFilter`"
  (^com.google.cloud.compute.deprecated.Compute$ImageFilter [^com.google.cloud.compute.deprecated.Compute$ImageField field ^java.lang.String value]
    (Compute$ImageFilter/equals field value)))

(defn *not-equals
  "Returns a not-equals filter for the given field and string value. For string fields, value is interpreted as a regular expression using RE2 syntax. value must match the
   entire field.

  field - `com.google.cloud.compute.deprecated.Compute$ImageField`
  value - `java.lang.String`

  returns: `com.google.cloud.compute.deprecated.Compute$ImageFilter`"
  (^com.google.cloud.compute.deprecated.Compute$ImageFilter [^com.google.cloud.compute.deprecated.Compute$ImageField field ^java.lang.String value]
    (Compute$ImageFilter/notEquals field value)))

