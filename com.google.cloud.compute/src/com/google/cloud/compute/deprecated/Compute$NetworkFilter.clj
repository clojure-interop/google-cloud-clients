(ns com.google.cloud.compute.deprecated.Compute$NetworkFilter
  "Class for filtering network lists."
  (:refer-clojure :only [require comment defn ->])
  (:import [com.google.cloud.compute.deprecated Compute$NetworkFilter]))

(defn *equals
  "Returns an equals filter for the given field and string value. For string fields, value is interpreted as a regular expression using RE2 syntax. value must match the
   entire field.

  field - `com.google.cloud.compute.deprecated.Compute$NetworkField`
  value - `java.lang.String`

  returns: `com.google.cloud.compute.deprecated.Compute$NetworkFilter`"
  (^com.google.cloud.compute.deprecated.Compute$NetworkFilter [^com.google.cloud.compute.deprecated.Compute$NetworkField field ^java.lang.String value]
    (Compute$NetworkFilter/equals field value)))

(defn *not-equals
  "Returns a not-equals filter for the given field and string value. For string fields, value is interpreted as a regular expression using RE2 syntax. value must match the
   entire field.

  field - `com.google.cloud.compute.deprecated.Compute$NetworkField`
  value - `java.lang.String`

  returns: `com.google.cloud.compute.deprecated.Compute$NetworkFilter`"
  (^com.google.cloud.compute.deprecated.Compute$NetworkFilter [^com.google.cloud.compute.deprecated.Compute$NetworkField field ^java.lang.String value]
    (Compute$NetworkFilter/notEquals field value)))

